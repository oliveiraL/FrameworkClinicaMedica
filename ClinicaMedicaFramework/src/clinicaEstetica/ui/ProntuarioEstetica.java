/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaEstetica.ui;

import dominio.Atendimento;
import dominio.Prontuario;
import java.util.Date;

/**
 *
 * @author Monster
 */
public class ProntuarioEstetica extends Prontuario{
    private Date dataCriacao;
    
    public ProntuarioEstetica() {
        super();
        dataCriacao = new Date();
    }
    @Override
    public void addAtendimento(Atendimento atendimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    
}
