package com.rafavilchez.model.impl;

import com.rafavilchez.model.ProfesorBase;
import org.springframework.util.ReflectionUtils;

/**
 * Created by Ezequiel J. on 21/08/16.
 */
public class Profesor extends ProfesorBase {

    public Profesor(ProfesorBase user) {
        ReflectionUtils.shallowCopyFieldState(user, this);
    }

    public Profesor() {}
}
