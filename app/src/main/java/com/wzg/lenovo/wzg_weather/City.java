package com.wzg.lenovo.wzg_weather;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2017/4/20.
 * 城市的实体类
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;

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
