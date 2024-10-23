
public class Persona {
	String nombre;
	String telefono;
	String email;
	String dir;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String telefono, String email, String dir) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.dir = dir;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDir() {
		return dir;
	}
	
	public void setDir(String dir) {
		this.dir = dir;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", dir="
				+ dir + "]";
	}
	
	
}
