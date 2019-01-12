package com.xddt.xatx.bean;

import java.util.Date;

public class User {
    private Integer userId;

    private Integer userType;

    private String userName;

    private String password;

    private String hwUsername;

    private String hwPassword;

    private String jmUsername;

    private String jmPassword;

    private String nickName;

    private String realName;

    private String userIcon;

    private String idNumber;

    private String frontPhoto;

    private String backPhoto;

    private String birthday;

    private String gender;

    private String sign;

    private Double balance;

    private String refereeName;

    private String refereeContact;

    private String refereeIdnumber;

    private String refereeRelationship;

    private String refereeLetter;

    private String certificateName;

    private String certificateFrontPhoto;

    private String certificateBackPhoto;

    private String work;

    private String articleUrl;

    private String city;

    private Integer registerScore;

    private Integer reviewScore;

    private Integer homeRecommend;

    private Integer state;

    private Integer acceptStatus;

    private String invitationCode;

    private String inviterInvitationCode;

    private Integer activated;

    private Boolean deleted;

    private Date updatedDate;

    private Date createdDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHwUsername() {
        return hwUsername;
    }

    public void setHwUsername(String hwUsername) {
        this.hwUsername = hwUsername == null ? null : hwUsername.trim();
    }

    public String getHwPassword() {
        return hwPassword;
    }

    public void setHwPassword(String hwPassword) {
        this.hwPassword = hwPassword == null ? null : hwPassword.trim();
    }

    public String getJmUsername() {
        return jmUsername;
    }

    public void setJmUsername(String jmUsername) {
        this.jmUsername = jmUsername == null ? null : jmUsername.trim();
    }

    public String getJmPassword() {
        return jmPassword;
    }

    public void setJmPassword(String jmPassword) {
        this.jmPassword = jmPassword == null ? null : jmPassword.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon == null ? null : userIcon.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getFrontPhoto() {
        return frontPhoto;
    }

    public void setFrontPhoto(String frontPhoto) {
        this.frontPhoto = frontPhoto == null ? null : frontPhoto.trim();
    }

    public String getBackPhoto() {
        return backPhoto;
    }

    public void setBackPhoto(String backPhoto) {
        this.backPhoto = backPhoto == null ? null : backPhoto.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getRefereeName() {
        return refereeName;
    }

    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName == null ? null : refereeName.trim();
    }

    public String getRefereeContact() {
        return refereeContact;
    }

    public void setRefereeContact(String refereeContact) {
        this.refereeContact = refereeContact == null ? null : refereeContact.trim();
    }

    public String getRefereeIdnumber() {
        return refereeIdnumber;
    }

    public void setRefereeIdnumber(String refereeIdnumber) {
        this.refereeIdnumber = refereeIdnumber == null ? null : refereeIdnumber.trim();
    }

    public String getRefereeRelationship() {
        return refereeRelationship;
    }

    public void setRefereeRelationship(String refereeRelationship) {
        this.refereeRelationship = refereeRelationship == null ? null : refereeRelationship.trim();
    }

    public String getRefereeLetter() {
        return refereeLetter;
    }

    public void setRefereeLetter(String refereeLetter) {
        this.refereeLetter = refereeLetter == null ? null : refereeLetter.trim();
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName == null ? null : certificateName.trim();
    }

    public String getCertificateFrontPhoto() {
        return certificateFrontPhoto;
    }

    public void setCertificateFrontPhoto(String certificateFrontPhoto) {
        this.certificateFrontPhoto = certificateFrontPhoto == null ? null : certificateFrontPhoto.trim();
    }

    public String getCertificateBackPhoto() {
        return certificateBackPhoto;
    }

    public void setCertificateBackPhoto(String certificateBackPhoto) {
        this.certificateBackPhoto = certificateBackPhoto == null ? null : certificateBackPhoto.trim();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getRegisterScore() {
        return registerScore;
    }

    public void setRegisterScore(Integer registerScore) {
        this.registerScore = registerScore;
    }

    public Integer getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(Integer reviewScore) {
        this.reviewScore = reviewScore;
    }

    public Integer getHomeRecommend() {
        return homeRecommend;
    }

    public void setHomeRecommend(Integer homeRecommend) {
        this.homeRecommend = homeRecommend;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(Integer acceptStatus) {
        this.acceptStatus = acceptStatus;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public String getInviterInvitationCode() {
        return inviterInvitationCode;
    }

    public void setInviterInvitationCode(String inviterInvitationCode) {
        this.inviterInvitationCode = inviterInvitationCode == null ? null : inviterInvitationCode.trim();
    }

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}