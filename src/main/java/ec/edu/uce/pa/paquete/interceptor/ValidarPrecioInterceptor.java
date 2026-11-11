package ec.edu.uce.pa.paquete.interceptor;

import ec.edu.uce.pa.paquete.Envio;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@ValidarPrecio 
@Priority(Interceptor.Priority.APPLICATION +10)
public class ValidarPrecioInterceptor {

    @Inject 
    private Envio envio;

    @AroundInvoke 
    public Object Interceptar(InvocationContext context) throws Exception{

        Object resultado = context.proceed();

        if(envio.getPrecio() <= 0){

            System.out.println("[ValidarPrecio] El precio no debe ser menor a cero.");

        }

        return resultado;

    }

}
