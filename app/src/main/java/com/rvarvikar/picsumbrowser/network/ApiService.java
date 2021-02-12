package com.rvarvikar.picsumbrowser.network;

import com.rvarvikar.picsumbrowser.model.PicsumModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("list")
    Call<List<PicsumModel>> getPicumList();
}
