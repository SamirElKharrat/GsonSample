package dad.gson;


public class Persona {
	private String Nombre;
	private String Apellidos;
	private Integer Edad;
	

	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	
	public String getApellidos() {
		return Apellidos;
	}
	
	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}
	
	public Integer getEdad() {
		return Edad;
	}
	public void setEdad(Integer edad) {
		this.Edad = edad;
	}
	
	@Override
	public String toString() {
		return " nombre = " + Nombre + "; apellido = " + Apellidos + "; edad = " + Edad;
	}
}




