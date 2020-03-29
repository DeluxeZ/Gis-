package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.DistrictInfoMapper;
import com.example.demo.model.DistrictInfo;
import com.example.demo.service.DistrictInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DistrictInfoServiceImpl implements DistrictInfoService{

    @Resource
    private DistrictInfoMapper districtInfoMapper;

    @Override
    public DistrictInfo selectByDid(Integer did){
        DistrictInfo districtInfo = districtInfoMapper.selectByDid(did);
        if(districtInfo == null){
            throw new ServiceException("暂无该用户");
        }
        return districtInfo;
    }
}
