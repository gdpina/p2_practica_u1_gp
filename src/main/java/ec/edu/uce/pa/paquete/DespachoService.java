package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.extension.NotificacionExtension;
import ec.edu.uce.pa.paquete.interceptor.MedirTiempo;
import ec.edu.uce.pa.paquete.interceptor.ValidarPrecio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("despacho")
public class DespachoService {

    @Inject 
    @Named("auditoria")
    private AuditoriaService auditoriaService;

    @ValidarPrecio
    @MedirTiempo  
    public void procesarEnvio(Envio envio, NotificacionExtension notificacionExtension){

        System.out.println("Realizando Despacho...");
        System.out.println("Cliente: " + envio.getCliente());
        System.out.println("Paquete: " + envio.getPaquete());
        System.out.println("Telefono: " + envio.getTelefono());
        System.out.println("Total: " + envio.getPrecio());

        notificacionExtension.enviar("Despacho realizado", envio.getCliente());
        this.auditoriaService.guardarEnlaBase(envio.getCliente(), envio.getPrecio(), envio.getCorreo());

        System.out.println("Pedido Realizado con exito...");
        

    }
    
}
