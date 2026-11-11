package ec.edu.uce.pa.paquete.extension;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionExtensionEmail implements NotificacionExtension{

    @Override
    public void enviar(String mensaje, String destinatario) {
        
        System.out.println("Enviando Correo a : " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo enviado con exito. ");
    }

}
