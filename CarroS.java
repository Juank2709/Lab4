public class CarroS extends RadioGeneral implements RadioS{
  private String bocinasOA;

  public CarroS(){
    super();
    bocinasOA = "bocinas";
  }

  public String cambiarSalida(String salida){
    if (salida == "bocinas")
    {
      setSalida("auriculares");
      return "Se ha cambiado la salida a auriculares.";
    }
    else
    {
      setSalida("bocinas");
      return "Se ha cambiado la salida a bocinas";
    }
  }

  public void setSalida(String nueva){
    bocinasOA = nueva;
  }

  public String planificarV(){
    return "Se planificará un viaje: ";
  }

  //Override del método toString.
  public String toString(){
    String s = "";

    int cont1 = 0;

    for (int i = 0; i < getEmisoras("AM").length; i++)
      if (getEmisoras("AM")[i] != 0.0) cont1++;
    
    int cont2 = 0;

    for (int j = 0; j < getEmisoras("FM").length; j++)
      if (getEmisoras("FM")[j] != 0.0) cont2++;

    if (getEncendido()) s += "Radio del auto tipo S:\nEstado: encendido\nSalida actual en " + bocinasOA + "\n" + cont1 + " emisoras de radio en AM guardadas\n" + cont2 + " emisoras de radio en FM guardadas\nPlaylists: " + getLista(1).getNombre() + ", " + getLista(2).getNombre() + ", " + getLista(3).getNombre() + "\nNúmero de contactos: " + getContactos().size() + "Volumen actual: " + getVolumen() + "\nEmisora actual: " + getEmisora() + "\nModo " + getModulacion();
    else s += "Radio del auto tipo S:\nEstado: apagado";

    if (getTelefono()) s += "\nEl teléfono está conectado.";
    else s += "\nEl teléfono no está conectado";

    return s;
  }
}