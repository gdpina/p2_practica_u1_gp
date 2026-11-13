package ec.edu.uce.pa.paquete.extension;

import ec.edu.uce.pa.paquete.Pedido;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("NORMAL") 
public class DescuentoNomal implements Descuentos{

    @Override
    public double calcular(Pedido pedido) {
        
        double normal = pedido.getValorOriginal();
        
        return normal;

    }
    

}
