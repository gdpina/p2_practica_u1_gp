package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.extension.DescuentoNomal;
import ec.edu.uce.pa.paquete.extension.DescuentoVIP;
import ec.edu.uce.pa.paquete.extension.NotificacionEmailInterceptor;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;

    @Inject 
    private DescuentoVIP descuentoVIP;

    @Inject 
    private DescuentoNomal descuentoNomal;

    @Inject 
    private NotificacionEmailInterceptor notificacionEmailInterceptor;


    public static void main (String[] arg){
        Quarkus.run(Main.class,arg);
    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("INICIO_EVALUACION");
        
        Pedido pedido = new Pedido("P001", "Laptop", 1000.00, "VIP");
        pedidoService.procesar(pedido, notificacionEmailInterceptor);

        Pedido pedido1 = new Pedido("P002", "Mouse", 100.00, "NORMAL");
        pedidoService.procesar(pedido1, notificacionEmailInterceptor);

        Pedido pedido2 = new Pedido("P003", "Teclado", 200.00, "VIP");
        pedidoService.procesar(pedido2, notificacionEmailInterceptor);

        System.out.println("FIN_EVALUACION");
        return 0;
    }

    


}
