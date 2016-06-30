package com.potatolabs.herenciaclases;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.potatolabs.herenciaclases.objetos.Usuarios;
import com.potatolabs.herenciaclases.objetos.Validador;

import java.util.ArrayList;

/**
 * Created by Leonardo on 15-06-2016.
 */
public class Login extends Activity{

    ArrayList<Usuarios> users = new ArrayList<Usuarios>();
    Validador valida;
    EditText edt_usuario,edt_password;
    Button btn_enter;
    String password,usuario;
    TextView txt_texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        txt_texto= (TextView)findViewById(R.id.textView);
        edt_usuario = (EditText)findViewById(R.id.editText);
        edt_password =(EditText)findViewById(R.id.editText2);
        btn_enter= (Button)findViewById(R.id.btn_entrar);


        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = edt_usuario.getText().toString();
                password = edt_password.getText().toString();

                valida = new Validador(usuario,password);

                if(valida.validaUserPass()){
                    llenarArrayList(usuario,password);
                }else{

                    txt_texto.setText("error a lo messi");
                }



            }
        });


    }



    private void llenarArrayList(String user,String pass){

        Usuarios usuario= new Usuarios();

        usuario.setUsuario(user);
        usuario.setPassword(pass);
        usuario.setLargoPass(pass.length());
        usuario.setLargoUser(user.length());
        users.add(usuario);
        txt_texto.setText("agrego un objeto al arraylist"+user.length());
    }

}
