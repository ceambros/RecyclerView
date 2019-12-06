package br.edu.ifsp.scl.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.edu.ifsp.scl.atividade2.R;
import br.edu.ifsp.scl.model.Filme;

public class AdapterListaFilmes extends RecyclerView.Adapter<AdapterListaFilmes.GuardadorItemLista> {

    private ArrayList<Filme> listaFilmes;

    public AdapterListaFilmes(ArrayList<Filme> nomeFilmes) {
        this.listaFilmes = nomeFilmes;
    }

    @NonNull
    @Override
    public GuardadorItemLista onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(parent.getContext());
        View itemLista = li.inflate(R.layout.list_layout, parent, false);
        return new GuardadorItemLista(itemLista);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull GuardadorItemLista guardadorItemLista, int position) {
        // Recuperando o objeto produto na posição desejada da lista:
        Filme filme = listaFilmes.get(position);
        guardadorItemLista.nomeFilme.setText(listaFilmes.get(position).getNome());
        guardadorItemLista.generoFilme.setText(listaFilmes.get(position).getGenero());
        guardadorItemLista.imagemFilme.setImageResource(listaFilmes.get(position).getImageView());
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class GuardadorItemLista extends RecyclerView.ViewHolder {

        // Nós vamos usar o desenho de item de lista que já
        // é fornecido com o Android Studio.
        // Este item de lista só tem um TextView dentro dele,
        // com ID text1.
        private TextView nomeFilme;
        private TextView generoFilme;
        private ImageView imagemFilme;

        // O construtor recebe o objeto que representa o item da lista:
        public GuardadorItemLista(View itemView) {
            super(itemView);
            // Vamos ligar o atributo com o elemento, através do ID.
            // Acessamos o ID dentro de itemView:
            nomeFilme = itemView.findViewById(R.id.textNomeFilme);
            generoFilme = itemView.findViewById(R.id.textGeneroFilme);
            imagemFilme = itemView.findViewById(R.id.imgFilme);
        }
    }
}
