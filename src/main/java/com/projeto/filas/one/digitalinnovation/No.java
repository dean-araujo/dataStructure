package com.projeto.filas.one.digitalinnovation;

public class No {

    private Object obj;
    private No refNo;

    public No (Object obj) {
        this.refNo = null;
        this.obj = obj;
    }

    public No() {
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "obj=" + obj +
                '}';
    }
}
