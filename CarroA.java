public class CarroA extends RadioGeneral implements RadioA{
  private String fecha;

  //Constructor de la clase.
  public CarroA(){
    super();
    
  }

	public String targetaPresentacion()
	{
		return "Mostrando la targeta de presentacion...";

	}

  public String llamaUltimoC(){
    return "Llamando al último registro: " + ultCont.getNombre() + " al numero " + ultCont.getNum();
  }

	public String toString(){
    String s = "";

    int cont1 = 0;

    for (int i = 0; i < getEmisoras("AM").length; i++)
      if (getEmisoras("AM")[i] != 0.0) cont1++;
    
    int cont2 = 0;

    for (int j = 0; j < getEmisoras("FM").length; j++)
      if (getEmisoras("FM")[j] != 0.0) cont2++;

    if (getEncendido()) s += "Radio del auto tipo A:\nEstado: encendido" + "\n" + cont1 + " emisoras de radio en AM guardadas\n" + cont2 + " emisoras de radio en FM guardadas\nPlaylists: " + getLista(1).getNombre() + ", " + getLista(2).getNombre() + ", " + getLista(3).getNombre() + "\nNúmero de contactos: " + getContactos().size() + "Volumen actual: " + getVolumen() + "\nEmisora actual: " + getEmisora() + "\nModo " + getModulacion();
    else s += "Radio del auto tipo A:\nEstado: apagado";

    if (getTelefono()) s += "\nEl teléfono está conectado.";
    else s += "\nEl teléfono no está conectado";

    return s;
  }
}