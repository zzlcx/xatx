package com.xddt.xatx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.xddt.xatx"})
@ComponentScan(value="com.xddt.xatx.dao")
public class XatxApplication {

    public static void main(String[] args) {
        SpringApplication.run(XatxApplication.class, args);
    }

}

