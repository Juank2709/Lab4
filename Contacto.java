public class Contacto
{
  //Declaración de las propiedades.
  private String nombre;
  private String numero;

  /********************************
     * @param: El nombre, correo, número y número del curso que da el tutor.
     * @return: -
     */
  //Constructor de la clase.
	public Contacto(String nombre, String numero)
	{
		this.nombre = nombre;
		this.numero = numero;
	}

	public String getNombre()
	{
		return nombre;
	}

	public String getNum()
	{
		return numero;
	}



  /********************************
     * @param: -
     * @return: La descripción del contacto. 
     */
  //Override del método toString para que se muestre el nombre y número del contacto.
  public String toString(){
    return "\nNombre: " + nombre + "\nNúmero de teléfono: " + numero;
  }