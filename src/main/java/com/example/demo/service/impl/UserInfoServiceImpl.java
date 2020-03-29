package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.UserInfoMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author phubing
 * @Description:
 * @time 2019/4/18 11:55
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(String id){
        UserInfo userInfo = userInfoMapper.selectById(id);
        if(userInfo == null){
            throw new ServiceException("暂无该用户");
        }
        return userInfo;
    }
}
