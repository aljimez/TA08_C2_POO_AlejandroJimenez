
public class Password {

	private	String contraseña ="";
	private int longitud = 8;
	
	
	
	/**
	 * @param contraseña
	 * @param longitud
	 */
	
	public Password(String contraseña, int longitud) {
		super();
		this.contraseña = contraseña;
		this.longitud = longitud;
		
	}



	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}



	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}



	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}



	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		for(int i=0;i < longitud;i++) {
		int pass = (int)(Math.random()*10+1);
		}
	}
	
	
	
	
}
