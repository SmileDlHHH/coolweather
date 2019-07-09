package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int id;
    private String countName;
    //县所对应天气的id
    private String weatherId;
    //当前县所属市
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
