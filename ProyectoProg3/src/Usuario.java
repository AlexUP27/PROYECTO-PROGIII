
public class Usuario extends Persona{
	String tipoDeMenbresia;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, String telefono, String email, String dir) {
		super(nombre, telefono, email, dir);
		// TODO Auto-generated constructor stub
	}

	public Usuario(String tipoDeMenbresia) {
		super();
		this.tipoDeMenbresia = tipoDeMenbresia;
	}

	public String getTipoDeMenbresia() {
		return tipoDeMenbresia;
	}

	public void setTipoDeMenbresia(String tipoDeMenbresia) {
		this.tipoDeMenbresia = tipoDeMenbresia;
	}

	@Override
	public String toString() {
		return "Usuario [tipoDeMenbresia=" + tipoDeMenbresia + "]";
	}
	
}
