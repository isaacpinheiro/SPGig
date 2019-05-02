package br.edu.ufabc.spgig;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GigAdapter extends RecyclerView.Adapter<GigAdapter.ViewHolder> {

    public GigAdapter() {

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView gigRvNomeTv;
        public TextView gigRvCidadeTv;
        public TextView gigRvDataTv;
        public View gigRvLayout;
        public Context context;

        public ViewHolder(View view) {
            super(view);
            gigRvNomeTv = (TextView) view.findViewById(R.id.gig_rv_nome_tv);
            gigRvCidadeTv = (TextView) view.findViewById(R.id.gig_rv_cidade_tv);
            gigRvDataTv = (TextView) view.findViewById(R.id.gig_rv_data_tv);
            gigRvLayout = view.findViewById(R.id.gig_rv_layout);
            context = view.getContext();
        }

    }

    @NonNull
    @Override
    public GigAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gig_rv_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull GigAdapter.ViewHolder holder, int position) {

        holder.gigRvLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
