package com.example.ProjetoIntermediario;

public class Ajuda {

    private String estudante = "João Vitor Rodrigues Rocha";
    private String projeto = "MMORPG";

    public Ajuda(String estudante, String projeto) {
        this.estudante = estudante;
        this.projeto = projeto;
    }

    public String getEstudante() {
        return estudante;
    }

    public void setEstudante(String estudante) {
        this.estudante = estudante;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}
