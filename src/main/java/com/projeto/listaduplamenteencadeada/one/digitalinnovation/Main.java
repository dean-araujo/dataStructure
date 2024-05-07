package com.projeto.listaduplamenteencadeada.one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("teste 1");
        lista.add("teste 2");
        lista.add("teste 3");
        System.out.println(lista.toString());

        lista.add(0, "teste 0");
        System.out.println(lista.toString());

        lista.remove(1);
        System.out.println(lista.toString());

        System.out.println(lista.get(2));
    }
}
