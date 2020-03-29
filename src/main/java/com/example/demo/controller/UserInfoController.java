package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:39
 */
@RestController
@RequestMapping("userInfo")
@CrossOrigin
public class UserInfoController {

    @PostMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/selectById")
    public String selectById(String id){
        UserInfo userInfo = userInfoService.selectById(id);
        return userInfo.getPasswd();
    }
}