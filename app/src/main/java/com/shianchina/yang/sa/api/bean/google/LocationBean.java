package com.shianchina.yang.sa.api.bean.google;

/**
 * Created by Yang on 2017/3/16.
 */
public  class LocationBean {
    private double lat;
    private double lng;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "LocationBean{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}