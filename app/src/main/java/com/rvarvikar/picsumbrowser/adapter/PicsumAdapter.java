package com.rvarvikar.picsumbrowser.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rvarvikar.picsumbrowser.R;
import com.rvarvikar.picsumbrowser.model.PicsumModel;
import com.rvarvikar.picsumbrowser.utils.Constants;
import com.rvarvikar.picsumbrowser.utils.CustomImageView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PicsumAdapter extends RecyclerView.Adapter<PicsumAdapter.MyViewHolder> {
    private Context context;
    private List<PicsumModel> picsumModelList;

    public PicsumAdapter(Context context,List<PicsumModel> picsumModelList){
    this.context=context;
    this.picsumModelList=picsumModelList;
    }

    public void setPicsumModelList(List<PicsumModel> picsumModelList){
        this.picsumModelList=picsumModelList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public PicsumAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PicsumAdapter.MyViewHolder holder, int position) {
    holder.textView.setText(picsumModelList.get(position).getAuthor());
        Glide.with(context)
                .load(Constants.IMAGE_URL+picsumModelList.get(position).getId())
                .thumbnail(Glide.with(context).load(R.drawable.loading))
                .into(holder.customImageView);
    }

    @Override
    public int getItemCount() {
        if(picsumModelList!=null) {
            return picsumModelList.size();
        }
        return 0;
    }

    public  class  MyViewHolder extends RecyclerView.ViewHolder{
    TextView textView;
    CustomImageView customImageView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        customImageView = itemView.findViewById(R.id.customImageView);


    }
}
}
