package ec.edu.uce.pa.paquete.extension;

import ec.edu.uce.pa.paquete.Usuario;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class AuditoriaMailExtension implements Auditoria {

    @Override
    public void imprimir(Usuario usuario) {
        System.out.println("Auditando: " + usuario.getNombre() + " por Email");
    }


}
