package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.DistrictInfo;
import com.example.demo.service.DistrictInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("districtInfo")
public class DistrictInfoController {

    @Resource
    private DistrictInfoService districtInfoService;

    @PostMapping("/aloha")
    public String aloha(){
        return "Aloha Tokisaki Kurumi";
    }

    @PostMapping("/selectByDid")
    public RetResult<DistrictInfo> selectByDid(Integer did){
        DistrictInfo districtInfo = districtInfoService.selectByDid(did);
        return RetResponse.makeOKRsp(districtInfo);
    }
}
