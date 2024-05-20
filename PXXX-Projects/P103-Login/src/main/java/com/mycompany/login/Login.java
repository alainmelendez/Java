package com.mycompany.login;

import com.mycompany.login.igu.LoginInicial;

public class Login {
    public static void main(String[] args) {
        
        //llamamos y hacemos visible a nuestra IGU
        LoginInicial principal = new LoginInicial();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

        
    }
}
