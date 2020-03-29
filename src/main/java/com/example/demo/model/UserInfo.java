package com.example.demo.model;


import org.apache.ibatis.annotations.Param;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author phubing
 * @Description:
 * @time 2019/4/18 11:55
 */
public class UserInfo {

    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 用户名
     */
    @Column(name = "passwd")
    private String passwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}
