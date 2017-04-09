package com.shianchina.yang.sa.api.bean.google;

import java.util.List;

/**
 * Created by Yang on 2017/3/16.
 */

public class ResultBean {

    /**
     * formatted_address : 中国广东省深圳市罗湖区
     * geometry : {"location":{"lat":22.531063,"lng":114.1133202},"viewport":{"northeast":{"lat":22.5324119802915,"lng":114.1146691802915},"southwest":{"lat":22.52971401970849,"lng":114.1119712197085}}}
     * icon : https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png
     * id : d9b095ff972c8233bfdb1fe8b1865c31388e54eb
     * name : 罗湖口岸
     * opening_hours : {"exceptional_date":[],"open_now":true,"weekday_text":[]}
     * photos : [{"height":3366,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/112072339975576790353/photos\">kwok leung Tsang<\/a>"],"photo_reference":"CoQBdwAAAMqqnQoiyRP2lmEwXkzl1hL1CqniKRj8yfQEfxPIGslZrRYt0QbBSQC7aljeEQKWYZyschionWXuze-5Lpt2UiZFGlY6CzO6on71nITmIHWEXPh5KtV2BOgrI5yr6m6pFJb4qTQe4I_LFq2qikbFPpWpIuBFJTY7AdUN76n7TN52EhC8dTlk1ZTNFpjaQCojBYe3GhS5KFa8u8Jr5iUrKA_13xnzYw9QGQ","width":5984}]
     * place_id : ChIJ7_0aNN31AzQRGHGaUyks73A
     * rating : 3.6
     * reference : CmRRAAAAJQ5qRPoYYMlMda1NeN0zLQ2qABYlxysWIoJycpiaXLzfg3ZigoXhuZHrJMVi07MrDrlCHZ-z6Jjn8wZi2aP8GZyz20BAs7aOvyDlt5WrePgOlVCGj9-coSV3hP-SewsJEhDxEx48gh3DxguWnu8v8hzFGhT3uaWcxcO27asNjQ0j8qX-8AOBSA
     * types : ["point_of_interest","establishment"]
     */

    private String formatted_address;
    /**
     * location : {"lat":22.531063,"lng":114.1133202}
     * viewport : {"northeast":{"lat":22.5324119802915,"lng":114.1146691802915},"southwest":{"lat":22.52971401970849,"lng":114.1119712197085}}
     */

    private GeometryBean geometry;
    private String icon;
    private String id;
    private String name;
    /**
     * exceptional_date : []
     * open_now : true
     * weekday_text : []
     */

    private OpeningHoursBean opening_hours;
    private String place_id;
    private double rating;
    private String reference;
    /**
     * height : 3366
     * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/112072339975576790353/photos\">kwok leung Tsang<\/a>"]
     * photo_reference : CoQBdwAAAMqqnQoiyRP2lmEwXkzl1hL1CqniKRj8yfQEfxPIGslZrRYt0QbBSQC7aljeEQKWYZyschionWXuze-5Lpt2UiZFGlY6CzO6on71nITmIHWEXPh5KtV2BOgrI5yr6m6pFJb4qTQe4I_LFq2qikbFPpWpIuBFJTY7AdUN76n7TN52EhC8dTlk1ZTNFpjaQCojBYe3GhS5KFa8u8Jr5iUrKA_13xnzYw9QGQ
     * width : 5984
     */

    private List<PhotosBean> photos;
    private List<String> types;

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public GeometryBean getGeometry() {
        return geometry;
    }

    public void setGeometry(GeometryBean geometry) {
        this.geometry = geometry;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpeningHoursBean getOpening_hours() {
        return opening_hours;
    }

    public void setOpening_hours(OpeningHoursBean opening_hours) {
        this.opening_hours = opening_hours;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }


    @Override
    public String toString() {
        return "ResultBean{" +
                "formatted_address='" + formatted_address + '\'' +
                ", geometry=" + geometry +
                ", icon='" + icon + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", opening_hours=" + opening_hours +
                ", place_id='" + place_id + '\'' +
                ", rating=" + rating +
                ", reference='" + reference + '\'' +
                ", photos=" + photos +
                ", types=" + types +
                '}';
    }
}
