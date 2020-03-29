package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "case_info")
public class CaseInfo {
    @Id
    private String cid;

    private BigDecimal lng;

    private BigDecimal lat;

    private String address;

    private String details;

    private String type;

    private Integer did;

    private String dateTime;

    /**
     * @return cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * @return longitude
     */
    public BigDecimal getLng() {
        return lng;
    }

    /**
     * @param lng
     */
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    /**
     * @return latitude
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    /**
     * @return position
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details
     */
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    /**
     * @return classname
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return did
     */
    public Integer getDid() {
        return did;
    }

    /**
     * @param did
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * @return datetime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}