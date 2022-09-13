package cabral.ignacio;

public class Candidato {
	private String nombre;
	private String apellido;
	private String email;
	private String direccion;
	private String codigoPostal;
	private String localidad;
	private String provincia;
	private Boolean esCliente;
	private Boolean llamarNuevamente;
	private String observaciones;
	
	
	
	
	public Candidato(String nombre, String apellido, String email, String direccion, String codigoPostal,
			String localidad, String provincia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.setLocalidad(localidad);
		this.provincia = provincia;
		this.esCliente = Boolean.FALSE;
		this.llamarNuevamente = Boolean.TRUE;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public Boolean getEsCliente() {
		return esCliente;
	}
	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}
	public Boolean getLlamarNuevamente() {
		return llamarNuevamente;
	}
	public void setLlamarNuevamente(Boolean llamarNuevamente) {
		this.llamarNuevamente = llamarNuevamente;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void llamadaExitosa(Boolean true1) {
		this.setEsCliente(true1);
		
	}

	public void noLlamarNuevamente(Boolean false1) {
		this.setLlamarNuevamente(false1);
	}

	public void anotaObservaciones(String observacion) {
		this.setObservaciones(observacion);
	}
	
}
