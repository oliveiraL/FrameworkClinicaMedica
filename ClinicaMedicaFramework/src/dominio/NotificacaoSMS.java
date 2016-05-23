package dominio;

import javax.swing.JOptionPane;

public class NotificacaoSMS extends Notificacao {

    public NotificacaoSMS(String mensagem) {
        super(mensagem);
    }

    @Override
    public void enviar() {
        JOptionPane.showMessageDialog(null, this.getMensagem());
    }

}
