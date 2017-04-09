package com.shianchina.yang.sa.api;

import com.shianchina.yang.sa.api.bean.google.PlaceSearchResult;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

import static com.shianchina.yang.sa.api.RetrofitService.CACHE_CONTROL_NETWORK;

/**
 * Created by Yang on 2017/3/16.
 */

public interface GoogleApi {


    /**
     *
     * @param query keyword
     * @param key google key
     * @return
     */
    @Headers(CACHE_CONTROL_NETWORK)
    @GET("maps/api/place/textsearch/json")
    Observable<PlaceSearchResult> queryPlace(@Query("query") String query, @Query("key") String key);
}
