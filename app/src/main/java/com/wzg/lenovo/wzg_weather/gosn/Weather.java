package com.wzg.lenovo.wzg_weather.gosn;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 2017/4/21.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;


    //日天气数组
    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;

    //小时天气数组
    @SerializedName("hourly_forecast")
    public List<HourlyForecast>hourlyForecastList;
}
