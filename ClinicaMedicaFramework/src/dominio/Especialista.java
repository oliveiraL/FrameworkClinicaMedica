package dominio;

public abstract class Especialista{

	private String registro;

	private Especialidade especialidade;

	private int id;

	private String nome;

	private String CPF;

	/**
	 *  
	 */
	public abstract void validarEspecialista();

}
