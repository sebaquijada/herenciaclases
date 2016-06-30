package com.potatolabs.herenciaclases.objetos;

/**
 * Created by Leonardo on 29-06-2016.
 */
public class Usuarios {


    private String usuario;
    private String password;
    private int largoUser;
    private int largoPass;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLargoUser() {
        return largoUser;
    }

    public void setLargoUser(int largoUser) {
        this.largoUser = largoUser;
    }

    public int getLargoPass() {
        return largoPass;
    }

    public void setLargoPass(int largoPass) {
        this.largoPass = largoPass;
    }
}
