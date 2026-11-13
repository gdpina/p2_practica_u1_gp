package ec.edu.uce.pa.paquete.extension;

import ec.edu.uce.pa.paquete.Pedido;

public interface NotificacionInterceptor {

    void enviar(Pedido pedido);

}
