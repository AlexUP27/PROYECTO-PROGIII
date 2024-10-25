
public class Monitor extends Persona{
	TipoEspecialidad especialidad;

	public Monitor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Monitor(String nombre, String telefono, String email, String dir) {
		super(nombre, telefono, email, dir);
		// TODO Auto-generated constructor stub
	}

	public Monitor(TipoEspecialidad especialidad) {
		super();
		this.especialidad = especialidad;
	}

	public TipoEspecialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(TipoEspecialidad especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Monitor [especialidad=" + especialidad + "]";
	}
	
}
