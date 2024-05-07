package com.projeto.listaEncadeada.one.digitalInnovation;

public class ListaEncadeada<T> {

    private No<T> refNoEntrada;

    public ListaEncadeada() {
        this.refNoEntrada = null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null;
    }

    public Integer size() {
        Integer tamanhoLista = 0;
        No<T> referenciaAux = refNoEntrada;
        while(true) {
            if(referenciaAux != null) {
                tamanhoLista++;
                if (refNoEntrada.getProximoNo() != null) {
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
            refNoEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = refNoEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(Integer indice){
        validaIndice(indice);
        No<T> noAuxiliar = refNoEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i < indice; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(Integer indice) {
        No<T> noPivor = this.getNo(indice);
        if (indice == 0) {
            refNoEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(indice - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public T get(int indice) {
        return getNo(indice).getConteudo();
    }

    public void validaIndice(Integer indice) {
        if(indice >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + indice
                    + "dessa lista. Esta lista só vai até o índice " + ultimoIndice + ".");
        }
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refNoEntrada;
        for (int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo= " + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
