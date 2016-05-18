/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.dominio;

import dominio.AtendimentoPrivado;
import validacoes.ValidacaoException;

/**
 *
 * @author lucio
 */
public class ConsultaVeterinario extends AtendimentoPrivado{

    @Override
    public Double valorAtendimento() {
        return 100.0;
    }

    @Override
    public void validarAtendimento() throws ValidacaoException{
        System.err.println("oi");
        if(getDiagnosticoAtendimentos() == null && getTratamentos() ==null )
            throw new ValidacaoException("Atendimento tem que ter um diagnostico ou um tratamento.");
        System.out.println("clinicaVeterinaria.dominio.ConsultaVeterinario.validarAtendimento()");
    }
    
    
}
