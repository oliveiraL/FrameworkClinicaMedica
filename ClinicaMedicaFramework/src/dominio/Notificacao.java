package dominio;

import controller.NotificarAtendimento;

public abstract class Notificacao {

	private String mensagem;

	private NotificarAtendimento notificarAtendimento;

	public abstract void enviar();

}
