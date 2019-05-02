package br.edu.ufabc.spgig;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Spinner;

import br.edu.ufabc.spgig.model.Gig;

public class GigActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TextView gigTipoTv;
    private Spinner gigCidadeSpinner;
    private String tipo;
    private String cidade;

    public static List<Gig> gigs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gig);
        inicializarComponentes();
        preencherCidadeSpinner();

        Intent intent = getIntent();
        tipo = intent.getStringExtra("tipo");
        this.gigTipoTv.setText(tipo);

    }

    private void inicializarComponentes() {
        this.gigTipoTv = (TextView) findViewById(R.id.gig_tipo_tv);
        this.gigCidadeSpinner = (Spinner) findViewById(R.id.gig_cidade_spinner);
    }

    private void preencherCidadeSpinner() {

        ArrayAdapter<CharSequence> adapter = ArrayAdapter
                .createFromResource(this, R.array.gig_cidade_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.gigCidadeSpinner.setAdapter(adapter);
        this.gigCidadeSpinner.setOnItemSelectedListener(this);

    }

    private void buscarGigs() {

        if (this.cidade.equals("Todas")) {
            // TODO
        } else {
            // TODO
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        this.cidade = parent.getItemAtPosition(position).toString();
        buscarGigs();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
