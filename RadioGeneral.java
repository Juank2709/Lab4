import java.util.ArrayList;

public abstract class RadioGeneral{
  private boolean encendido;
  private double[] emisorasAM;
  private double[] emisorasFM;
  private playList lista1;
  private playList lista2;
  private playList lista3;
  private ArrayList<String> contactos;
  private double volumen;
  private double emisoraActual;
  private String modulacion;
  private boolean telefono;

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
  }

  //Método abstracto
  abstract public String toString();
}