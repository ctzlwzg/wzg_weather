package com.wzg.lenovo.wzg_weather.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/4/21.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    @SerializedName("uv")
    public UltravioletIndex uv;
    @SerializedName("drsg")
    public Drsg drsg;

    public Sport sport;
    //舒适度
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    //洗车指数
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    //运动指数
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
    //紫外线指数
    public class UltravioletIndex{
        @SerializedName("txt")
        public String info;
    }
    //穿衣指数
    public class Drsg{
        @SerializedName("txt")
        public String info;
    }
}
