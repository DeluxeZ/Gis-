package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.PoliceInfo;
import com.example.demo.service.PoliceInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("policeInfo")
public class PoliceInfoController {

    @Resource
    private PoliceInfoService policeInfoService;

    @PostMapping("/hello")
    public String hi() { return "hello"; }

    @PostMapping("/selectByEmail")
    public RetResult<PoliceInfo> selectByPid(String email, String password){
        PoliceInfo policeInfo = policeInfoService.selectByEmail(email);
        return RetResponse.makeOKRsp(policeInfo);
    }
}
