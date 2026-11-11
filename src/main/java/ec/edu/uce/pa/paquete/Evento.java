package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class Evento {

   private String evento;


   public Evento() {
    }

   public Evento(String evento) {
    this.evento = evento;
   }

   public String getEvento() {
    return evento;
   }

   public void setEvento(String evento) {
    this.evento = evento;
   }

   


}
