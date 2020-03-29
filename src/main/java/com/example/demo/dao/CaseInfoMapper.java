package com.example.demo.dao;

import com.example.demo.model.CaseInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaseInfoMapper {

    CaseInfo selectByCid(@Param("cid") String cid);

    List<CaseInfo> queryCase(@Param("did")int did, @Param("type")String type);
}
