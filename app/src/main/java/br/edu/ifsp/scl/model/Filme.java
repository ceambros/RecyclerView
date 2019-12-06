package br.edu.ifsp.scl.model;

import br.edu.ifsp.scl.atividade2.R;

public class Filme {

    private int id;
    private String nome;
    private String genero;
    private int imagem;

    public Filme(int id, String nome, String genero, int imagem) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getImageView() {
        switch (this.getImagem()) {
            case 1:
                return R.drawable.filme1;
            case 2:
                return R.drawable.filme2;
            case 3:
                return R.drawable.download;
            case 4:
                return R.drawable.download;
            case 5:
                return R.drawable.filme5;
            case 6:
                return R.drawable.download;
            case 7:
                return R.drawable.download;
            case 8:
                return R.drawable.download;
            case 9:
                return R.drawable.download;
            case 10:
                return R.drawable.download;
            case 11:
                return R.drawable.filme11;
            case 12:
                return R.drawable.download;
            case 13:
                return R.drawable.download;
        }

        return R.drawable.download;
    }
}
