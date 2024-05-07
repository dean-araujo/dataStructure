package com.projeto.listaEncadeada.one.digitalInnovation;

public class ListaEncadeada<T> {

    private No<T> refNoEntradaFila;

    public ListaEncadeada() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    public Integer size() {
        Integer tamanhoLista = 0;
        No<T> referenciaAux = refNoEntradaFila;
        while(true) {
            if(referenciaAux != null) {
                tamanhoLista++;
                if (refNoEntradaFila.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            refNoEntradaFila = novoNo;
            return;
        }

        No<T> noAuxiliar = refNoEntradaFila;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(Integer indice){
        validaIndice(indice);
        No<T> noAuxiliar = refNoEntradaFila;
        No<T> noRetorno = null;
        for (int i = 0; i < indice; i++) {
            noRetorno = noAuxiliar
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public void validaIndice(Integer indice) {
        if(indice >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + indice
                    + "dessa lista. Esta lista só vai até o índice " + ultimoIndice + ".");
        }
    }
}
