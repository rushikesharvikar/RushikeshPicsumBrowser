package com.rvarvikar.picsumbrowser.viewmodel;

import com.rvarvikar.picsumbrowser.model.PicsumModel;
import com.rvarvikar.picsumbrowser.network.ApiService;
import com.rvarvikar.picsumbrowser.network.RetrofitInstance;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

    public class PicsumViewModel extends ViewModel {

    private MutableLiveData <List<PicsumModel>> picsumList;

    public PicsumViewModel(){
        picsumList = new MutableLiveData<>();
    }

        public MutableLiveData<List<PicsumModel>> getPicsumListObserver() {
            return picsumList;
        }

        public void makeApiCall(){
        ApiService apiService = RetrofitInstance.getRetrofitClient().create(ApiService.class);
        Call<List<PicsumModel>> call = apiService.getPicumList();
        call.enqueue(new Callback<List<PicsumModel>>() {
            @Override
            public void onResponse(Call<List<PicsumModel>> call, Response<List<PicsumModel>> response) {
                picsumList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<PicsumModel>> call, Throwable t) {
                picsumList.postValue(null);
            }
        });
    }
}
