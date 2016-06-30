package com.potatolabs.herenciaclases.objetos;

/**
 * Created by Leonardo on 29-06-2016.
 */
public class Validador {

    private String usuario;
    private String password;
    final static int MINIMO=5;
    final static int MAXIMO=10;


    public Validador(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

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


    public boolean validaUserPass() {

        boolean validuser = false;
        boolean validpass = false;

        if(this.usuario.length()>MINIMO && this.usuario.length()<=MAXIMO){

            validuser=true;
        }

        if(this.password.length()>MINIMO && this.password.length()<=MAXIMO){
            validpass=true;
        }

        if(validpass && validuser){

            return true;
        }else{
            return false;
        }

    }

}
