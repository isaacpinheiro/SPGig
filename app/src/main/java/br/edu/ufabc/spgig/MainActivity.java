package br.edu.ufabc.spgig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView indexRv;
    private RecyclerView.LayoutManager indexRvLayoutManager;
    private RecyclerView.Adapter indexRvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
    }

    public void inicializarComponentes() {

        this.indexRv = (RecyclerView) findViewById(R.id.index_rv);
        this.indexRv.setHasFixedSize(true);
        this.indexRvLayoutManager = new LinearLayoutManager(this);
        this.indexRv.setLayoutManager(this.indexRvLayoutManager);
        this.indexRvAdapter = new IndexAdapter();
        this.indexRv.setAdapter(this.indexRvAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_menu_sobre:
                abrirSobreActivity();
                return true;
            case R.id.main_menu_ajuda:
                abrirAjudaActivity();
                return true;
            case R.id.main_menu_area_produtor:
                abrirAreaProdutorActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void abrirSobreActivity() {
        Intent intent = new Intent(getBaseContext(), SobreActivity.class);
        startActivity(intent);
    }

    public void abrirAjudaActivity() {
        Intent intent = new Intent(getBaseContext(), AjudaActivity.class);
        startActivity(intent);
    }

    public void abrirAreaProdutorActivity() {
        Intent intent = new Intent(getBaseContext(), AreaProdutorActivity.class);
        startActivity(intent);
    }

}
