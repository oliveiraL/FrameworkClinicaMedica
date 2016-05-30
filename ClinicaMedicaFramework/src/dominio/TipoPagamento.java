/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author lucio
 */
public abstract class TipoPagamento {
    public String descricao;
    public abstract void operacaoPagamento(Double valor);
}
