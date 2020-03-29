package com.example.demo.service;

import com.example.demo.model.UserInfo;

/**
 * @author phubing
 * @Description:
 * @time 2019/4/18 11:55
 */
public interface UserInfoService {
    UserInfo selectById(String id);
}
