/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.dominio;

import dominio.AgendamentoAtendimento;
import dominio.Especialidade;
import dominio.Especialista;
import dominio.Paciente;
import java.util.Date;
import validacoes.ValidacaoException;

/**
 *
 * @author lucio
 */
public class Agendamento extends AgendamentoAtendimento{
    

    @Override
    public void validarAgendamento() throws ValidacaoException{
        System.err.println(getDataHora().getHours() );
        if(getDataHora().getHours() > 18 || getDataHora().getHours() < 8){
           throw new ValidacaoException("Agendamento invalido.");
        }
    }

    public Agendamento(Date dataHora, Especialista especialista, Paciente paciente, Especialidade especialidade) {
        super(dataHora, especialista, paciente, especialidade);
    }

    public Agendamento() {
    }
    
    
    
    
}
