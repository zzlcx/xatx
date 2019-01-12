package com.xddt.xatx.controller;

import com.xddt.xatx.bean.User;
import com.xddt.xatx.service.UserService;
import com.xddt.xatx.util.ResultErrorInfo;
import com.xddt.xatx.util.ResultSuccessInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     *  用户登录
     * @param request
     * @param response
     * @param session
     * @return
     */
    @RequestMapping(value = "/user/login")
    public @ResponseBody
    Object login(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String userName;
        String password;
        response.addHeader("Access-Control-Allow-Origin", "*");
        userName = request.getParameter("userName");
        password = request.getParameter("password");
        ResultSuccessInfo rsInfo = new ResultSuccessInfo();
        ResultErrorInfo reInfo = new ResultErrorInfo();


        if (userName == null || userName.equals("")) {
            reInfo.setErrorMessage("用户名不能为空！");
            reInfo.setErrorCode("11110");
            return reInfo;

        }
        if (password == null || password.equals("")) {
            reInfo.setErrorMessage("密码不能为空！");
            reInfo.setErrorCode("11111");
            return reInfo;
        }
        User user = null;
        try {
            user = userService.getUserByUserName(userName);
        } catch (Exception e) {
            e.printStackTrace();
            reInfo.setErrorMessage("获取用户信息出错！");
            reInfo.setErrorCode("11210");
            return reInfo;
        }
        if (user != null){
            if(user.getActivated()==1){
                if (password.equals(user.getPassword())){
                    rsInfo.setResult(user);
                    rsInfo.setSuccessMessage("登录成功！");

                }else {
                    reInfo.setErrorMessage("密码不正确！");
                    reInfo.setErrorCode("11310");
                    return reInfo;
                }
            }else if(user.getActivated()==0){
                if(!password.equals(user.getPassword())){
                    reInfo.setErrorMessage("密码不正确！");
                    reInfo.setErrorCode("11311");
                    return reInfo;
                }
                reInfo.setErrorMessage("账号审核中！");
                reInfo.setErrorCode("11312");
                return reInfo;
            }else{
                int count = 0;
                try {
                    count = userService.deleteUserById(user.getUserId());
                } catch (Exception e) {
                    reInfo.setErrorMessage("删除未通过审核用户失败！");
                    reInfo.setErrorCode("11313");
                    return reInfo;
                }
                if (count > 0) {
                    reInfo.setErrorMessage("账号未通过审核,请重新注册！");
                    reInfo.setErrorCode("11315");
                    return reInfo;
                }
            }
        } else {
            reInfo.setErrorMessage("用户不存在,请先注册！");
            reInfo.setErrorCode("11316");
            return reInfo;
        }
        request.getSession().setAttribute("token", ""+userName + "test");
        //session.setAttribute("user", user);
        return rsInfo;
    }
}
