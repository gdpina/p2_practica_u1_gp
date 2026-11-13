package ec.edu.uce.pa.paquete.extension;

import ec.edu.uce.pa.paquete.Pedido;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("MES")
public class DescuentoMes implements Descuentos {

    @Override
    public double calcular(Pedido pedido) {
        
        double mes = pedido.getValorOriginal() * 0.20;
        
        return pedido.getValorOriginal() - mes;
    }

}
