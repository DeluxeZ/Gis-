package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.PoliceInfoMapper;
import com.example.demo.model.PoliceInfo;
import com.example.demo.service.PoliceInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PoliceInfoServiceImpl implements PoliceInfoService {

    @Resource
    private PoliceInfoMapper policeInfoMapper;

    @Override
    public PoliceInfo selectByEmail(String email){
        PoliceInfo policeInfo = policeInfoMapper.selectByEmail(email);
        if(policeInfo == null){
            throw new ServiceException("error");
        }
        return policeInfo;
    }
}
