/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaEstetica.dominio;

import dominio.Especialidade;
import dominio.Especialista;
import validacoes.ValidacaoException;

/**
 *
 * @author Victor
 */
public class DoctorEstetica extends Especialista{
     private String crm;
     private int tempoProfissao;
     
     public DoctorEstetica(String crm, Especialidade especialidade, String nome, String CPF){
         super(especialidade, nome, CPF);
        this.crm = crm;
     }
     
    @Override
    public void validarEspecialista() throws ValidacaoException {
        if(getCrm() == null || getCPF() == null || getCPF().isEmpty() || getCrm().isEmpty())
            throw new ValidacaoException("Erro ao validar Veterinario.");
    }
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crmv) {
        this.crm = crm;
    }
    
}
