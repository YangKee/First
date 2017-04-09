package com.shianchina.yang.sa.api.bean.google;

/**
 * Created by Yang on 2017/3/16.
 */
public  class ViewportBean {
    /**
     * lat : 22.5324119802915
     * lng : 114.1146691802915
     */

    private NortheastBean northeast;
    /**
     * lat : 22.52971401970849
     * lng : 114.1119712197085
     */

    private SouthwestBean southwest;

    public NortheastBean getNortheast() {
        return northeast;
    }

    public void setNortheast(NortheastBean northeast) {
        this.northeast = northeast;
    }

    public SouthwestBean getSouthwest() {
        return southwest;
    }

    public void setSouthwest(SouthwestBean southwest) {
        this.southwest = southwest;
    }

    public static class NortheastBean {
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
    }

    public static class SouthwestBean {
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
    }

    @Override
    public String toString() {
        return "ViewportBean{" +
                "northeast=" + northeast +
                ", southwest=" + southwest +
                '}';
    }
}