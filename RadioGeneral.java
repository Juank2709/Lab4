import java.util.ArrayList;

public abstract class RadioGeneral{
  private boolean encendido;
  private double[] emisorasAM;
  private double[] emisorasFM;
  private playList lista1;
  private playList lista2;
  private playList lista3;
  private ArrayList<String> contactos;
  private int volumen;
  private double emisoraActual;
  private String modulacion;
  private boolean telefono;
  private int cancionActual;

  public RadioGeneral(){
    encendido = false;
    emisorasAM = new double[50];
    emisorasFM = new double[50];
    
    //---------Lista 1 (elaborada por Juan Carlos Marroquín)---------
    ArrayList<Cancion> canciones1 = new ArrayList<Cancion>();
    Cancion cancion1 = new Cancion("Como Abeja al Panal", "Juan Luis Guerra", 4.13, "Bachata");
    canciones1.add(cancion1);

    Cancion cancion2 = new Cancion("Pégame Tu Vicio", "Eddy Herrera", 5.07, "Merengue");
    canciones1.add(cancion2);

    Cancion cancion3 = new Cancion("Arráncame la Vida", "FM De Zacapa", 4.45, "Merengue");
    canciones1.add(cancion3);

    Cancion cancion4 = new Cancion("La Venia Bendita", "Marco Antonio Solís", 3.25, "Ranchera");
    canciones1.add(cancion4);

    Cancion cancion5 = new Cancion("Aunque Mal Paguen Ellas", "Vicente Fernández y Roberto Carlos", 3.45, "Ranchera");
    canciones1.add(cancion5);

    //Instancia de lista "Latino Bailable"
    lista1 = new playList("Latino Bailable", canciones1);


    //---------Lista 2 (elaborada por )---------


    //---------Lista 3 (elaborada por )---------


    //Valores iniciales (e instancia) para el resto de propiedades.
    contactos = new ArrayList<String>();

    volumen = 10;

    emisoraActual =50.0;

    modulacion = "AM";

    telefono = false;

    cancionActual = 0;
  }

  public double[] getEmisoras(String m){
    return m == "AM" ? emisorasAM : emisorasFM;
  }

  public playList getLista(int n){
    if (n == 1) return lista1;
    else if (n == 2) return lista2;
    else return lista3;
  }

  public int getVolumen(){
    return volumen;
  }

  public double getEmisora(){
    return emisoraActual;
  }

  public String getModulacion(){
    return modulacion;
  }

  public ArrayList<String> getContactos(){
    return contactos;
  }

  public void setCancionA(boolean direccion){
    if (direccion) cancionActual++;
    else cancionActual--;
  }

  public void setEncendido(boolean e){
    if (e) encendido = false;
    else encendido = true;
  }

  public boolean getEncendido(){
    return encendido;
  }

  public void setTelefono(){
    if (telefono) telefono = false;
    else telefono = true;
  }

  public boolean getTelefono(){
    return telefono;
  }

  public int cambiarV(boolean direccion){
    return direccion ? ++volumen : --volumen;
  }
  
  //---------Inician métodos del modo radio---------
  public void setModulacion(String estado){
    if (estado=="AM") modulacion = "FM";
    else modulacion = "AM";
  }

  public double cambiarEmisora(boolean direccion){
    if (direccion)
    {
      emisoraActual +=0.5;
      return emisoraActual;
    }
    else
    {
      emisoraActual -= 0.5;
      return emisoraActual;
    }
  }

  public void guardarEmisora(double emi){
    boolean bandera = false;
    
    //if para definir en qué arreglo se guardará la emisora.
    if (modulacion=="AM")
    {
      for (int i = 0; (i < 50) && !bandera; i++)
        if (emisorasAM[i] == 0.0)
        {
          emisorasAM[i] = emi;
          bandera = true;
        }
    }
    else for (int j = 0; (j < 50) && !bandera; j++)
        if (emisorasFM[j] == 0.0)
        {
          emisorasAM[j] = emi;
          bandera = true;
        }
  }
  //---------Finalizan métodos del modo radio---------

  //---------Inician métodos del modo reproducción---------
  public String selecLista(int indice){
    if (indice == 1) return lista1.getNombre();
    else if (indice == 2) return lista2.getNombre();
    else return lista3.getNombre();
  }
  
  public String escucharCancion(Cancion cancion, int indice){
    cancionActual = indice;
    return cancion.toString();
  }

  public String cambiarCancion(boolean direccion, int indice1, int indice2){
    if (indice1 == 1)
    {
      if (direccion) return "Siguiente cancion: " + escucharCancion(lista1.getCancion(indice2+1), indice2+1);
      else return "Cancion anterior:" + escucharCancion(lista1.getCancion(indice2-1), indice2-1);
    }
    else if (indice1 == 2){
      if (direccion) return "Siguiente cancion: " + escucharCancion(lista2.getCancion(indice2+1), indice2+1);
      else return "Cancion anterior:" + escucharCancion(lista2.getCancion(indice2-1), indice2-1);
    }
    else
    {
      if (direccion) return "Siguiente cancion: " + escucharCancion(lista3.getCancion(indice2+1), indice2+1);
      else return "Cancion anterior:" + escucharCancion(lista3.getCancion(indice2-1), indice2-1);
    }
  }
  //---------Finalizan métodos del modo reproducción---------

  //Método abstracto
  abstract public String toString();
}