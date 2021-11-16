import java.util.ArrayList;

public class playList{
  private String nombre;
  private ArrayList<Cancion> canciones;

  public playList(String n, ArrayList<Cancion> cs){
    //Asignación de nombre.
    nombre = n;

    //Proceso para llenado del arreglo dinámico de las canciones.
    for (int i = 0; i < cs.size(); i++)
      canciones.add(cs.get(i));
  }

  public String getNombre(){
    return nombre;
  }

  public Cancion getCancion(int i){
    return canciones.get(i);
  }
}