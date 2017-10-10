package com.rafavilchez.utils;

import java.io.Serializable;

public class SystemMessage implements Serializable {

    public enum Type { success, danger, warning, info }

    private Type type;
    private String title;
    private String message;

    public SystemMessage(Type type, String title, String message) {
        setType(type);
        setTitle(title);
        setMessage(message);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title.replace('"', '\'');
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (message != null) {
            this.message = message.replace('"', '\'');
        }
    }
}
