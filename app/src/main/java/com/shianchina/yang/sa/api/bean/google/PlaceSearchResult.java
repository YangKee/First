package com.shianchina.yang.sa.api.bean.google;

import java.util.List;

/**
 * Created by Yang on 2017/3/16.
 */

public class PlaceSearchResult {


    private String status;
    private List<?> html_attributions;
    private List<ResultBean> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<?> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public List<ResultBean> getResults() {
        return results;
    }

    public void setResults(List<ResultBean> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "PlaceSearchResult{" +
                "status='" + status + '\'' +
                ", html_attributions=" + html_attributions +
                ", results=" + results +
                '}';
    }
}
