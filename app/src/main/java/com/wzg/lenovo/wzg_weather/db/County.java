package com.wzg.lenovo.wzg_weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2017/4/20.
 * 县市的实体类
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private String weatherId;

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {

        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    private int cityId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }


}
