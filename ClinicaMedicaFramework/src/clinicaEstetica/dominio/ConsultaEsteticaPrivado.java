/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaEstetica.dominio;

import dominio.AtendimentoPrivado;
import validacoes.ValidacaoException;

/**
 *
 * @author Monster
 */
public class ConsultaEsteticaPrivado extends AtendimentoPrivado{
    private String queixaPrincipal;
    private String historicoSocial;
    
    
    public ConsultaEsteticaPrivado(String queixaPrincipal, String historString){
    super();
    this.historicoSocial =  historString;
    this.queixaPrincipal = queixaPrincipal;
    
    }
    
    @Override
    public Double valorAtendimento() {
        return 50.0;
    }

    @Override
    public void validarAtendimento() throws ValidacaoException {
        if(getDiagnosticoAtendimentos() == null && getTratamentos() ==null )
            throw new ValidacaoException("Atendimento tem que ter um diagnostico ou um tratamento.");
        System.out.println("clinicaVeterinaria.dominio.ConsultaVeterinario.validarAtendimento()");
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getHistoricoSocial() {
        return historicoSocial;
    }

    public void setHistoricoSocial(String historicoSocial) {
        this.historicoSocial = historicoSocial;
    }
    
}
