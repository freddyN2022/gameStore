package com.persistencia.prueba.dto;

public class MensajeDTO {
    private final String mensaje;

    public MensajeDTO(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
