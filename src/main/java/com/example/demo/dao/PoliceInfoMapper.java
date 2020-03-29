package com.example.demo.dao;

import com.example.demo.model.PoliceInfo;
import org.apache.ibatis.annotations.Param;

public interface PoliceInfoMapper {
    PoliceInfo selectByEmail(@Param("email") String email);
}
