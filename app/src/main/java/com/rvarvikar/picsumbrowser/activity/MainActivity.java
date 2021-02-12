package com.rvarvikar.picsumbrowser.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rvarvikar.picsumbrowser.R;
import com.rvarvikar.picsumbrowser.adapter.PicsumAdapter;
import com.rvarvikar.picsumbrowser.model.PicsumModel;
import com.rvarvikar.picsumbrowser.viewmodel.PicsumViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<PicsumModel> picsumModel;
private PicsumAdapter picsumAdapter;
private PicsumViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView  recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager  = new GridLayoutManager(MainActivity.this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        picsumAdapter = new PicsumAdapter(MainActivity.this,picsumModel);
        recyclerView.setAdapter(picsumAdapter);

        viewModel = new ViewModelProvider(MainActivity.this).get(PicsumViewModel.class);
        viewModel.getPicsumListObserver().observe(this, new Observer<List<PicsumModel>>() {
            @Override
            public void onChanged(List<PicsumModel> picsumModels) {
                if(picsumModels != null){
                    picsumModel = picsumModels;
                    picsumAdapter.setPicsumModelList(picsumModel);
                }
            }
        });
        viewModel.makeApiCall();
    }
}