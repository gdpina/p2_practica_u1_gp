    package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.extension.DescuentoMes;
import ec.edu.uce.pa.paquete.extension.DescuentoNomal;
import ec.edu.uce.pa.paquete.extension.DescuentoVIP;
import ec.edu.uce.pa.paquete.extension.NotificacionInterceptor;
import ec.edu.uce.pa.paquete.interceptor.MedirTiempo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("pedido") 
public class PedidoService {

    @Inject 
    private DescuentoVIP descuentoVIP;

    @Inject 
    private DescuentoNomal descuentoNomal;

    @Inject 
    private DescuentoMes descuentoMes;

    @MedirTiempo 
    public void procesar(Pedido pedido, NotificacionInterceptor notificacionInterceptor){
    
        if (pedido.getTipoCliente().equalsIgnoreCase("NORMAL")) {

            System.out.println("PEDIDO: " + pedido.getCodigo() + " | TOTAL: " + descuentoNomal.calcular(pedido));

        }

        if (pedido.getTipoCliente().equalsIgnoreCase("VIP")) {

            System.out.println("PEDIDO: " + pedido.getCodigo() + " | TOTAL: " + descuentoVIP.calcular(pedido));

        }

        if (pedido.getTipoCliente().equalsIgnoreCase("MES")) {

            System.out.println("PEDIDO: " + pedido.getCodigo() + " | TOTAL: " + descuentoMes.calcular(pedido));

        }
        
        notificacionInterceptor.enviar(pedido);
    }
    

}
