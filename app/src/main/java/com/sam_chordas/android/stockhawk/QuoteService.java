package com.sam_chordas.android.stockhawk;

import com.sam_chordas.android.stockhawk.model.QuoteInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Otunba on 9/21/2016.
 */
public interface QuoteService {

    @GET("public/yql")
    Call<QuoteInfo> getObjectWithNestedArraysAndObject(@Query("q") String q, @Query("diagnostics") String diagnostics,
                                                       @Query("env") String env, @Query("format") String format);
}
