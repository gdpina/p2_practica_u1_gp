package ec.edu.uce.pa.paquete.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@MedirTiempo 
@Priority(Interceptor.Priority.APPLICATION + 20)
public class MedirTiempoInterceptor {

    @AroundInvoke 
    public Object Interceptor(InvocationContext context) throws Exception{

        long init = System.currentTimeMillis();
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis();
        System.out.println("[Tiempo Medido]: " + (fin-init));

        return resultado;
    }
}
