import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarroC extends RadioGeneral implements RadioC{
  private String fecha;

  public CarroC(){
    super();
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    fecha = formato.format(LocalDateTime.now());
  }

  public String cambiarAEspera(){

  }

  public String pronostico(){
    return "[Pronistico del día " + fecha + "]";
  }

  public String toString(){
    String s = "";

    return s;
  }
}