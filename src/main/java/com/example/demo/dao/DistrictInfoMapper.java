package com.example.demo.dao;

import com.example.demo.model.DistrictInfo;
import org.apache.ibatis.annotations.Param;

public interface DistrictInfoMapper {

    DistrictInfo selectByDid(@Param("did") Integer did);
}
