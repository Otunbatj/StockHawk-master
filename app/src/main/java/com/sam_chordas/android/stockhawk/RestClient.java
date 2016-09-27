package com.sam_chordas.android.stockhawk;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Otunba on 9/21/2016.
 */
public class RestClient {
    //You need to change the IP if you testing environment is not local machine
    //or you may have different URL than we have here
//    private static final String URL = "http://instinctcoder.com/wp-content/uploads/2015/08/";
    private static final String URL = "https://query.yahooapis.com/v1/";

    private QuoteService quoteService;

    public RestClient()
    {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        quoteService = retrofit.create(QuoteService.class);
    }

    public QuoteService getService()
    {
        return quoteService;
    }
}
