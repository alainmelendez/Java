package com.mycompany.concesionariaautos;

import com.mycompany.concesionariaautos.igu.Principal;

public class ConcesionariaAutos {
    public static void main(String[] args) {
        
        //llamamos y hacemos visible a nuestra IGU
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

        
    }
}
