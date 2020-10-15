package com.hegazy.alsakinuh;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AlsakinuhAdapter extends RecyclerView.Adapter<AlsakinuhAdapter.ProductViewHolder> {



    private Context context;
    private List<Alsakinuhitem> alsakinuhitems = new ArrayList<>();
    MainActivity activity;


    public AlsakinuhAdapter(List<Alsakinuhitem> alsakinuhitems, Context context, MainActivity activity) {
        this.alsakinuhitems = alsakinuhitems;
        this.context = context;
        this.activity = activity;

    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.alsakinuh_item, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.tvAuthorName.setText(alsakinuhitems.get(position).getAuthor_name());
        holder.btnRoqia.setText(alsakinuhitems.get(position).getType());

        holder.btnRoqia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, PlayerActivity.class);
                i.putExtra("url", alsakinuhitems.get(position).getRoqia_url());
                i.putExtra("type", holder.btnRoqia.getText().toString());
                i.putExtra("name", alsakinuhitems.get(position).getAuthor_name());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return alsakinuhitems.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.iv_author_image)
        ImageView ivAuthorImage;
        @BindView(R.id.tv_author_name)
        TextView tvAuthorName;
        @BindView(R.id.btn_roqia)
        TextView btnRoqia;


        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}
