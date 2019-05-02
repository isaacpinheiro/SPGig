package br.edu.ufabc.spgig;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.edu.ufabc.spgig.model.Gig;

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

    private String formatarData(Gig gig) {
        return gig.getDataInicio().toLocaleString();
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
    public void onBindViewHolder(@NonNull final GigAdapter.ViewHolder holder, final int position) {

        holder.gigRvNomeTv.setText(GigActivity.gigs.get(position).getNome());
        holder.gigRvCidadeTv.setText("Cidade: " + GigActivity.gigs.get(position).getCidade());
        holder.gigRvDataTv.setText("Data: " + formatarData(GigActivity.gigs.get(position)));

        holder.gigRvLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, DetalhesActivity.class);
                intent.putExtra("position", position);
                holder.context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return GigActivity.gigs.size();
    }

}
