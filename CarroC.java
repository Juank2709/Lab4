import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class CarroC extends RadioGeneral implements RadioC{
	private Random rand = new Random();
  private String fecha;
	private String t;
	private int x;

  //Constructor de la clase.
  public CarroC(){
    super();
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    fecha = formato.format(LocalDateTime.now());
  }

  
  public String cambiarAEspera(){
		if (estadoLlamada == 1)
		{
			estadoLlamada = 2;
			t = "Se colocó la llamada en espera.";
		}
		else t = "No hay llamada en curso";

		return t;
  }

  public String pronostico(){

		x = (rand.nextInt(3));
		if (x==0) t = "Nublado con alta probabilidad de lluvia. ]";
		else if (x==1) t = "Soleado con baja probabilidad de lluvia. ]";
		else t = "Despejado con guerra alienigena. ]";
		
    return "[Pronostico del día " + fecha + "... " + t;
  }

	public String toString(){
    String s = "";

    int cont1 = 0;

    for (int i = 0; i < getEmisoras("AM").length; i++)
      if (getEmisoras("AM")[i] != 0.0) cont1++;
    
    int cont2 = 0;

    for (int j = 0; j < getEmisoras("FM").length; j++)
      if (getEmisoras("FM")[j] != 0.0) cont2++;

    if (getEncendido()) s += "Radio del auto tipo C:\nEstado: encendido\n" + cont1 + " emisoras de radio en AM guardadas\n" + cont2 + " emisoras de radio en FM guardadas\nPlaylists: " + getLista(1).getNombre() + ", " + getLista(2).getNombre() + ", " + getLista(3).getNombre() + "\nNúmero de contactos: " + getContactos().size() + "Volumen actual: " + getVolumen() + "\nEmisora actual: " + getEmisora() + "\nModo " + getModulacion();
    else s += "Radio del auto tipo C:\nEstado: apagado";

    if (getTelefono()) s += "\nEl teléfono está conectado.";
    else s += "\nEl teléfono no está conectado";

    return s;
  }
}