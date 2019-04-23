package br.edu.ufabc.spgig;

import java.util.List;
import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.edu.ufabc.spgig.model.Index;

public class IndexAdapter extends RecyclerView.Adapter<IndexAdapter.ViewHolder> {

    private List<Index> index;

    public IndexAdapter() {
        this.index = new ArrayList<Index>();
        this.index.add(new Index("Shows", R.drawable.shows));
        this.index.add(new Index("Teatro", R.drawable.teatro));
        this.index.add(new Index("Cinema", R.drawable.cinema));
        this.index.add(new Index("Festas e Baladas", R.drawable.festas));
        this.index.add(new Index("Festival de Música", R.drawable.festival));
        this.index.add(new Index("Gourmet", R.drawable.gourmet));
        this.index.add(new Index("Museus e Exposições", R.drawable.museu));
        this.index.add(new Index("Eventos Culturais", R.drawable.cultural));
        this.index.add(new Index("Eventos Esportivos", R.drawable.esportes));
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

        Glide.with(holder.context).load(index.get(position).getImg()).into(holder.indexRvImage);
        holder.indexRvTextView.setText(index.get(position).getTipo());

        holder.indexRvLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, GigActivity.class);
                intent.putExtra("tipo", index.get(position).getTipo());
                holder.context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.index.size();
    }

}
