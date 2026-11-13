package ec.edu.uce.pa.paquete.interceptor;

import ec.edu.uce.pa.paquete.Pedido;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@MedirTiempo 
public class MedirTiempoInterceptor {

    @AroundInvoke 
    public Object Interceptor(InvocationContext context) throws Exception{

        Pedido pedido = (Pedido) context.getParameters()[0];
        long init = System.currentTimeMillis();
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis();
        System.out.println("DURACION: " + pedido.getCodigo() + "|MS: " + (fin-init));
        System.out.println("TIEMPO: " + pedido.getCodigo() + "|OK");
        return resultado;
    }

}
