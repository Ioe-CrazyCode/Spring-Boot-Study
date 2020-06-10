package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LucyController {

    @Autowired
    ConfigBean configBean;
    @Autowired
    User user;

    @RequestMapping(value = "/lucy")
    public String miya() {
        return configBean.getGreeting() + "-" + configBean.getName() + "-" + configBean.getUuid() + "-" + configBean.getMax();
    }

    @RequestMapping(value = "/user")
    public String user() {
        return user.getName() + "," + user.getAge();
    }

}
