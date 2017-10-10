package com.rafavilchez.model.impl;

import com.rafavilchez.model.DescuentoBase;
import org.springframework.util.ReflectionUtils;

public class Descuento extends DescuentoBase {

    public static final int DESCUENTO_AMIGO         = 1;
    public static final int DESCUENTO_VULEBU        = 2;
    public static final int DESCUENTO_ASIGNATURAS   = 3;
    public static final int DESCUENTO_EXTRA         = 4;

    public static final String TIPO_DESCUENTO_CANTIDAD = "cantidad";
    public static final String TIPO_DESCUENTO_PORCENTUAL = "porcentual";

    public Descuento (DescuentoBase descuento) { ReflectionUtils.shallowCopyFieldState(descuento, this); }

    public Descuento () {}
}
