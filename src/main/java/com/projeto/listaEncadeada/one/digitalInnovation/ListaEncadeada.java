package com.projeto.listaEncadeada.one.digitalInnovation;

public class ListaEncadeada<T> {

    private No<T> refNoEntradaFila;

    public ListaEncadeada(){
        this.refNoEntradaFila = null;
    }

    private boolean isEmpty(){
        return refNoEntradaFila == null;
    }

    private Integer size(){
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
}
