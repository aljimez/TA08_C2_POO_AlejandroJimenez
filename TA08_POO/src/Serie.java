public class Serie {
	
	private	String titulo ="";
	private int NTemporada = 3;
	private String genero = "";
	private String creador = "";
    private boolean entregado = false;
	
	
	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Serie(String titulo , String genero,int NTemporada,String creador,boolean entregado) {
		super();
		this.titulo = titulo;
        this.NTemporada= NTemporada;
        this.genero=genero;
        this.creador=creador;
        this.entregado=entregado;
	}

    public Serie(Strng titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }
public Serie(String titulo, String genero,int NTemporada,String creador) {
		super();
		this.titulo = titulo;
        this.NTemporada= NTemporada;
        this.genero=genero;
        this.creador=creador;
	}

}