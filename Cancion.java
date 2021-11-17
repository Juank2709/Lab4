public class Cancion{
  //Propiedades.
  private String nombreC;
  private String autor;
  private double duracion;
  private String genero;

  public Cancion(String n, String a, double dura, String g){
    //Asignación a las propiedades.
    nombreC = n;
    autor = a;
    duracion = dura;
    genero = g;
  }

  //Para regresar el nombre de la canción.
  public String getNombre(){
    return nombreC;
  }

  //Override del método toString.
  public String toString(){
    return nombreC + ", de " + autor + ", duración: " + duracion + " género: " + genero;
  }
}