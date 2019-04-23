package br.edu.ufabc.spgig;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class IndexAdapter extends RecyclerView.Adapter<IndexAdapter.ViewHolder> {

    public IndexAdapter() {

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView indexRvTextView;
        public ImageView indexRvImage;
        public View indexRvLayout;
        public Context context;

        public ViewHolder(View view) {
            super(view);
            indexRvTextView = (TextView) view.findViewById(R.id.index_rv_textview);
            indexRvImage = (ImageView) view.findViewById(R.id.index_rv_image);
            indexRvLayout = view.findViewById(R.id.index_rv_layout);
            context = view.getContext();
        }

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.index_rv_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        // TODO

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
