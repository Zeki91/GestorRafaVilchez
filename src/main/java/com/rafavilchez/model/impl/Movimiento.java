package com.rafavilchez.model.impl;

import com.rafavilchez.model.MovimientoBase;
import org.springframework.util.ReflectionUtils;

public class Movimiento extends MovimientoBase {

    public static final String GASTO = "G";
    public static final String INGRESO = "I";

    public Movimiento(MovimientoBase mov) { ReflectionUtils.shallowCopyFieldState(mov, this); }

    public Movimiento() {}

}
