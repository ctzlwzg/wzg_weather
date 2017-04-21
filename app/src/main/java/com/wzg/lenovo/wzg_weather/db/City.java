package com.wzg.lenovo.wzg_weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2017/4/20.
 * 城市的实体类
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinedId;

    public void setProvinedId(int provinedId) {
        this.provinedId = provinedId;
    }

    public int getProvinedId() {

        return provinedId;
    }

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
