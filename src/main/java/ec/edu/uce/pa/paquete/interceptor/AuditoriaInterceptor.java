package ec.edu.uce.pa.paquete.interceptor;

import ec.edu.uce.pa.paquete.Usuario;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@Auditoria 
@Priority(Interceptor.Priority.APPLICATION + 20)
public class AuditoriaInterceptor {

    @AroundInvoke 
    public Object Interceptor(InvocationContext context) throws Exception{

        Usuario usuario = (Usuario) context.getParameters()[0];

        System.out.println("[Auditando] a: " + usuario.getNombre() + ", ID: " + usuario.getId());

        Object resultado = context.proceed();

        return resultado;

    }
}
