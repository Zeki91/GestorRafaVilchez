package com.rafavilchez.model.impl;

import com.rafavilchez.model.EntradaReciboBase;
import org.springframework.util.ReflectionUtils;

public class EntradaRecibo extends EntradaReciboBase {

    public static final int TIPO_ASIGNATURA  = 1;
    public static final int TIPO_DESCUENTO   = 2;
    public static final int TIPO_HORAS_EXTRA = 3;
    public static final int TIPO_ENTRADA_EDITADA = 4;

    public EntradaRecibo (EntradaReciboBase er) {
        ReflectionUtils.shallowCopyFieldState(er, this);
    }

    public EntradaRecibo() {}
}
