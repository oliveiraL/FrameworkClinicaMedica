package dominio;

public abstract class PlanoDeSaude {

	private int id;

	private String nome;

	private String registro;

	public abstract void regrasPagamento(Double valor);

}
