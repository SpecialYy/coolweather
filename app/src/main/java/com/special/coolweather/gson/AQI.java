package com.special.coolweather.gson;

/**
 * Created by Special on 2017/10/26.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
