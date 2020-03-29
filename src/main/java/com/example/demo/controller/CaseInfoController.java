package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.CaseInfo;
import com.example.demo.service.CaseInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("caseInfo")
public class CaseInfoController {

    @Resource
    private CaseInfoService caseInfoService;

    @PostMapping("/hello")
    public String hello() { return "hello"; }

    @PostMapping("/selectByCid")
    public RetResult<CaseInfo> selectByCid(String cid){
        CaseInfo caseInfo = caseInfoService.selectByCid(cid);
        return RetResponse.makeOKRsp(caseInfo);
    }

    @PostMapping("/queryCase")
    public List<CaseInfo> queryCase(Date starting, Date ending, Integer[] did, String type){
        List<CaseInfo> caseinfos = null;
        for ( int i = 0; i < did.length; i ++ ){
            List<CaseInfo> caseinfo = caseInfoService.queryCase(did[i], type);
            for ( int j = 0; j < caseinfo.size(); j ++ ){
                caseinfos.add(caseinfo.get(j));
            }
        }
        return caseinfos;
    }
}
