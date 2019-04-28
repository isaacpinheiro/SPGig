package br.edu.ufabc.spgig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AreaProdutorActivity extends AppCompatActivity {

    private Button entrarBtn;
    private Button cadastreSeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_produtor);
        inicializarComponentes();
        inicializarEventos();
    }

    private void inicializarComponentes() {
        this.entrarBtn = (Button) findViewById(R.id.area_produtor_entrar_btn);
        this.cadastreSeBtn = (Button) findViewById(R.id.area_produtor_cadastrese_btn);
    }

    private void inicializarEventos() {

        this.entrarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), EntrarActivity.class);
                startActivity(intent);
            }
        });

        this.cadastreSeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), CadastrarActivity.class);
                startActivity(intent);
            }
        });

    }

}
