package com.shianchina.yang.sa.api.bean.google;

import java.util.List;

/**
 * Created by Yang on 2017/3/16.
 */

public  class PhotosBean {
    private int height;
    private String photo_reference;
    private int width;
    private List<String> html_attributions;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPhoto_reference() {
        return photo_reference;
    }

    public void setPhoto_reference(String photo_reference) {
        this.photo_reference = photo_reference;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public List<String> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<String> html_attributions) {
        this.html_attributions = html_attributions;
    }

    @Override
    public String toString() {
        return "PhotosBean{" +
                "height=" + height +
                ", photo_reference='" + photo_reference + '\'' +
                ", width=" + width +
                ", html_attributions=" + html_attributions +
                '}';
    }
}