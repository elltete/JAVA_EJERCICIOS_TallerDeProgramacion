package ejercicio_parcial_veterinaria;

public enum Estado {
	
	ENFERMO("Muy enfermo"), HAMBRIENTO("Tengo Hambre"), FELIZ("Mas feliz que una lombriz");
	
	private String descripcion;

	private Estado(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

}
