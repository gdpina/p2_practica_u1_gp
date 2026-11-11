package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.extension.NotificacionExtensionEmail;
import ec.edu.uce.pa.paquete.extension.NotificacionExtensionSMS;
import ec.edu.uce.pa.paquete.extension.NotificacionExtensionWhatsApp;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@QuarkusMain 
public class Main implements QuarkusApplication {

    @Inject 
    @Named("despacho")
    private DespachoService despachoService;

    @Inject 
    private NotificacionExtensionEmail notificacionExtensionEmail;

    @Inject 
    private NotificacionExtensionSMS notificacionExtensionSMS;

    @Inject 
    private NotificacionExtensionWhatsApp notificacionExtensionWhatsApp;


    public static void main(String[] arg){
        Quarkus.run(Main.class, arg);
    }

    @Override
    public int run(String... args) throws Exception {
       
        Envio envio = new Envio("Gabriel Piña", "Dragon Ball", 700.00, "gdpina@uce.edu.ec", "0999920011");
        despachoService.procesarEnvio(envio, notificacionExtensionEmail);
       

        return 0;
    }

    

}
