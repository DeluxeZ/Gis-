package com.example.demo.service;

import com.example.demo.model.CaseInfo;

import java.util.List;

public interface CaseInfoService {

    CaseInfo selectByCid(String Cid);

    List<CaseInfo> queryCase(int did, String type);
}
