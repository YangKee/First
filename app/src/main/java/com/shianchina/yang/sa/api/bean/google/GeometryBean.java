package com.shianchina.yang.sa.api.bean.google;

/**
 * Created by Yang on 2017/3/16.
 */

public  class GeometryBean {
    /**
     * lat : 22.531063
     * lng : 114.1133202
     */

    private LocationBean location;
    /**
     * northeast : {"lat":22.5324119802915,"lng":114.1146691802915}
     * southwest : {"lat":22.52971401970849,"lng":114.1119712197085}
     */

    private ViewportBean viewport;

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public ViewportBean getViewport() {
        return viewport;
    }

    public void setViewport(ViewportBean viewport) {
        this.viewport = viewport;
    }


    @Override
    public String toString() {
        return "GeometryBean{" +
                "location=" + location +
                ", viewport=" + viewport +
                '}';
    }
}