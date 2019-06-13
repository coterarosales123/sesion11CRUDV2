package pe.autonoma.Entity;

public class User {
	private int alumno_id;
	private String nombre;
	private String apellidos;
	private int edad;
	private int ciclo;
	private int Aingreso;
	public User(int alumno_id, String nombre, String apellidos, int edad, int ciclo,int Aingreso) {
		super();
		this.alumno_id = alumno_id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.ciclo= ciclo;
		this.Aingreso= Aingreso;
	}
	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public void setAingreso(int aingreso) {
		Aingreso = aingreso;
	}
	
	
	
}
