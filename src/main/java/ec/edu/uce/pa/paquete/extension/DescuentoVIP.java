package ec.edu.uce.pa.paquete.extension;

import ec.edu.uce.pa.paquete.Pedido;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("VIP")
public class DescuentoVIP implements Descuentos {

    @Override
    public double calcular(Pedido pedido) {
        
        double vip = pedido.getValorOriginal() * 0.10;
        
        return pedido.getValorOriginal() - vip;

}

}
