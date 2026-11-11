package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.extension.AuditoriaMailExtension;
import ec.edu.uce.pa.paquete.interceptor.Auditoria;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped 
public class RegistroService {

    @Inject 
    private AuditoriaMailExtension auditoriaMailExtension; 

    @Auditoria 
    public void imprimir(Usuario usuario, String evento){

        System.out.println("Registrando evento: " + evento);
        auditoriaMailExtension.imprimir(usuario);
    }
}
