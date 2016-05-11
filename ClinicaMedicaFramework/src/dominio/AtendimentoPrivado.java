package dominio;

public abstract class AtendimentoPrivado extends Atendimento {

	private boolean procedimentoPago;

	private PlanoDeSaude planoDeSaude;

	/**
	 *  
         * @return 
	 */
	public abstract Double valorAtendimento();

}
