/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.dominio;

import dominio.Especialidade;
import dominio.Especialista;
import validacoes.ValidacaoException;

/**
 *
 * @author lucio
 */
public class Veterinario extends Especialista{
    private String crmv;

    public Veterinario() {
    }

    public Veterinario(String crmv, Especialidade especialidade, String nome, String CPF) {
        super(especialidade, nome, CPF);
        this.crmv = crmv;
    }
    
    
    
    @Override
    public void validarEspecialista() throws ValidacaoException{
        if(getCrmv() == null || getCPF() == null || getCPF().isEmpty() || getCrmv().isEmpty())
            throw new ValidacaoException("Erro ao validar Veterinario.");
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
    
}
