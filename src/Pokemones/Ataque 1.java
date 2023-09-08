/**
 * 
 */
package Pokemones;

/**
 * @author Brad Lopez
 *
 */
public enum Ataque {
	//Ataque Tipo Fuego
	Lanzallamas("Lanzallamas",35, "TipoFuego"),
	FuegoFatuo("Fuego Fatuo",30, "TipoFuego"),
	NitroCarga("Nitrocarga",20, "TipoFuego"),
	LLamarada("Llamarada",15, "TipoFuego"),
	//Ataque Tipo Agua
	Hidropulso("Hidropulso",35, "TipoAgua"),
	PistolaAgua("Pistola Agua",25, "TipoAgua"),
	RayoBurbuja("Rayo Burbuja",20, "TipoAgua"),
	AcuaJet("AcuaJet",30, "TipoAgua"),
	//Ataque Tipo Planta
	rayoSolar("Rayo Solar",35, "TipoPlanta"),
	LatigoCepa("Latigo Cepa",15, "TipoPlanta"),
	DanzaPetalo("Danza Petalo",20, "TipoPlanta"),
	Gigadrenado("Gigadrenado",25, "TipoPlanta"),
	//Ataque Tipo Electrico
	Rayo("Rayo",35, "TipoElectrico"),
	BolaVoltio("Bola Voltio",25, "TipoElectrico"),
	PuñoTrueno("Puño Trueno",20, "TipoElectrico"),
	Chispazo("Chispazo",20, "TipoElectrico");

	private String nombre;
	private int daño;
	private String tipo;

	/**
	 * constructor que declara las instancias en variables para poder usarlas en otras clases
	 * @param nombre
	 * @param daño
	 * @param tipo
	 */
	Ataque(String nombre, int daño, String tipo) {
		this.nombre=nombre;
		this.daño=daño;
		this.tipo=tipo;
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the daño
	 */
	public int getDaño() {
		return daño;
	}

	/**
	 * @param daño the daño to set
	 */
	public void setDaño(int daño) {
		this.daño = daño;
	}


	
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
