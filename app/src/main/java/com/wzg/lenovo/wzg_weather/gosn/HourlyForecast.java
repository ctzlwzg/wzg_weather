package com.wzg.lenovo.wzg_weather.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/4/24.
 */

public class HourlyForecast {


    public String date;

    public String tmp;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
