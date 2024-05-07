package com.projeto.listaduplamenteencadeada.one.digitalinnovation;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo noPrevio;

    public void noDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public NoDuplo getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
