import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarroC extends RadioGeneral implements RadioC{
  private String fecha;

  //Constructor de la clase.
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

	public String toString(){
    String s = "";

    int cont1 = 0;

    for (int i = 0; i < getEmisoras("AM").length; i++)
      if (getEmisoras("AM")[i] != 0.0) cont1++;
    
    int cont2 = 0;

    for (int j = 0; j < getEmisoras("FM").length; j++)
      if (getEmisoras("FM")[j] != 0.0) cont2++;

    if (getEncendido()) s += "Radio del auto tipo C:\nEstado: encendido\nSalida actual en " + bocinasOA + "\n" + cont1 + " emisoras de radio en AM guardadas\n" + cont2 + " emisoras de radio en FM guardadas\nPlaylists: " + getLista(1).getNombre() + ", " + getLista(2).getNombre() + ", " + getLista(3).getNombre() + "\nNúmero de contactos: " + getContactos().size() + "Volumen actual: " + getVolumen() + "\nEmisora actual: " + getEmisora() + "\nModo " + getModulacion();
    else s += "Radio del auto tipo C:\nEstado: apagado";

    if (getTelefono()) s += "\nEl teléfono está conectado.";
    else s += "\nEl teléfono no está conectado";

    return s;
  }
}