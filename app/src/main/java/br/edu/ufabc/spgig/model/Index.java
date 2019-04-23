package br.edu.ufabc.spgig.model;

public class Index {

    private String tipo;
    private int img;

    public Index() {

    }

    public Index(String tipo, int img) {
        this.tipo = tipo;
        this.img = img;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImg() {
        return this.img;
    }

}
