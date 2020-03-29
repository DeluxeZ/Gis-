package com.example.demo.service;

import com.example.demo.model.PoliceInfo;

public interface PoliceInfoService {

    PoliceInfo selectByEmail(String email);
}
