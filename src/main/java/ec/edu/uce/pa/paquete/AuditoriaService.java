package ec.edu.uce.pa.paquete;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton 
@Named("auditoria")
public class AuditoriaService {

    public void guardarEnlaBase(String cliente, double total, String correo){
        System.out.println("Guardando en la base de datos...");
        System.out.println("Cliente: " + cliente);
        System.out.println("Total: " + total);
        System.out.println("Correo: " + correo);
        System.out.println("Informacion guardada en la base de datos...");
    }
}
