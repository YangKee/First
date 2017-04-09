package com.shianchina.yang.sa.api.bean.google;

import java.util.List;

/**
 * Created by Yang on 2017/3/16.
 */

public  class OpeningHoursBean {
    private boolean open_now;
    private List<?> exceptional_date;
    private List<?> weekday_text;

    public boolean isOpen_now() {
        return open_now;
    }

    public void setOpen_now(boolean open_now) {
        this.open_now = open_now;
    }

    public List<?> getExceptional_date() {
        return exceptional_date;
    }

    public void setExceptional_date(List<?> exceptional_date) {
        this.exceptional_date = exceptional_date;
    }

    public List<?> getWeekday_text() {
        return weekday_text;
    }

    public void setWeekday_text(List<?> weekday_text) {
        this.weekday_text = weekday_text;
    }

    @Override
    public String toString() {
        return "OpeningHoursBean{" +
                "open_now=" + open_now +
                ", exceptional_date=" + exceptional_date +
                ", weekday_text=" + weekday_text +
                '}';
    }
}