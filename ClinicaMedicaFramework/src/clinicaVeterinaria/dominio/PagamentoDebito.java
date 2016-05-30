/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.dominio;

import dominio.Prontuario;
import dominio.TipoPagamento;
import javax.swing.JOptionPane;

/**
 *
 * @author lucio
 */
public class PagamentoDebito extends TipoPagamento{

    @Override
    public void operacaoPagamento(Double valor) {
        JOptionPane.showMessageDialog(null, "Verificando Cartão");
        JOptionPane.showMessageDialog(null, "Verificando Pagamento");
        JOptionPane.showMessageDialog(null, "Realizando Pagamento Debito");
        JOptionPane.showMessageDialog(null, "Pagamento Realizado, Valor: "+valor);
    }
    
}
