package br.edu.ifsp.scl.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

import br.edu.ifsp.scl.adapter.AdapterListaFilmes;
import br.edu.ifsp.scl.atividade2.R;
import br.edu.ifsp.scl.model.Filme;

// CARLOS EDUARDO AMBROSIO(SC3009301) E GUSTAVO ROBERTO SILVA(SC300919X)


public class MainActivity extends AppCompatActivity {

    private RecyclerView listaFilmes;
    private ArrayList<Filme> litaFilmes = new ArrayList<>();
    private AdapterListaFilmes adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        litaFilmes.add(new Filme(1,"Star Wars","Ficção",1));
        litaFilmes.add(new Filme(1,"Sete Vidas","Drama",2));
        litaFilmes.add(new Filme(1,"Um Sonho de Liberdade","Drama",3));
        litaFilmes.add(new Filme(1,"Zumbilandia","Comédia",4));
        litaFilmes.add(new Filme(1,"Harry Potter","Ficção",5));
        litaFilmes.add(new Filme(1,"Rambo","Aventura",6));
        litaFilmes.add(new Filme(1,"Logoa Azul","Drama",7));
        litaFilmes.add(new Filme(1,"E.T","Drama",8));
        litaFilmes.add(new Filme(1,"Coração Valente","Drama",9));
        litaFilmes.add(new Filme(1,"Máquina Mortifera","Drama",10));
        litaFilmes.add(new Filme(1,"Aquaman","Aventura",11));
        litaFilmes.add(new Filme(1,"Titanic","Drama",12));

        listaFilmes = findViewById( R.id.listaFilmes );
        adapter = new AdapterListaFilmes(litaFilmes);
        RecyclerView.LayoutManager lm = new LinearLayoutManager( getApplicationContext() );

        listaFilmes.setLayoutManager( lm );

        AdapterListaFilmes adapter = new AdapterListaFilmes( litaFilmes );

        listaFilmes.setAdapter( adapter );
        listaFilmes.setHasFixedSize( true );

        DividerItemDecoration linha =
                new DividerItemDecoration( this, LinearLayout.VERTICAL );

        listaFilmes.addItemDecoration( linha );
    }
}
