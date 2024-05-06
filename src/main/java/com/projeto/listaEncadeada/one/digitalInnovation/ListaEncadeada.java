package com.projeto.listaEncadeada.one.digitalInnovation;

public class ListaEncadeada<T> {

    private No<T> refNoEntradaFila;

    public ListaEncadeada() {
        this.refNoEntradaFila = null;
    }

    private boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    private Integer size() {
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

    private void add(T conteudo) {
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

}
