package com.rvarvikar.picsumbrowser.network;

import com.rvarvikar.picsumbrowser.utils.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofitInstance;

    public static  Retrofit getRetrofitClient(){
        if(retrofitInstance ==null){
            retrofitInstance = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitInstance;
    }
}
