package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication {

    @Inject 
      private RegistroService registroService;

    public static void main(String[] arg){
        Quarkus.run(Main.class,arg);
    }

    @Override
    public int run(String... args) throws Exception {
        
        Usuario usuario = new Usuario("Gabriel Piña", 1);
        System.out.println("Auditoria 1: ");
        registroService.imprimir(usuario, "C");
        return 0;
    }

    

}
