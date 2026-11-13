package ec.edu.uce.pa.paquete.extension;

import ec.edu.uce.pa.paquete.Pedido;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionEmailInterceptor implements NotificacionInterceptor {

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("NOTIFICACION: " + pedido.getCodigo());
        
    }

}
