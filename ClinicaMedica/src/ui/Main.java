package ui;

import java.util.Date;

import dominio.Especialidade;
import dominio.Especialista;
import dominio.Paciente;
import dominio.TipoAtendimento;

public class Main {

	public static void main(String[] args) {
		/* Instanciando as CLASS */
		UIAgendamento uiagendamento = new UIAgendamento();
		
		/*Gerando date*/
		Date data = new Date();
		
		
		/* Gerando um Paciente */
		Paciente novoPaciente = new Paciente();
		novoPaciente.setNome("VICTOR");
		novoPaciente.setId(01);
		
		/*Gerando uam Especialidade*/
		Especialidade especialidadeCirurgiao = new Especialidade();
		especialidadeCirurgiao.setDescricao("Sou um Cirurgiao");
		especialidadeCirurgiao.setId(0202);
		
		Especialidade especialidadeClinicoGeral = new Especialidade();
		especialidadeClinicoGeral.setDescricao("Sou um Clinico Geral");
		especialidadeClinicoGeral.setId(0201);
		
		
		/*Gerando um Especialista*/
		Especialista novoEspecialista = new Especialista();
		novoEspecialista.setNome("DR.JOAOZINHO");
		novoEspecialista.setCPF("99999");
		novoEspecialista.setId(02);
		novoEspecialista.setEspecialidade(especialidadeCirurgiao);
		
		/*Gerando um TipoAtendimento*/
		TipoAtendimento tipoAtendimento = new  TipoAtendimento();
		tipoAtendimento.setDescricao("Marcando Cirurgia");
		tipoAtendimento.setId(020202);
		tipoAtendimento.setAtendimento(atendimento);
		
		
		
		
		
		uiagendamento.agendarAtendimento();  //Chama agendarAtendimento = UIAgendamento
		

	}

}
