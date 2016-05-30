/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaEstetica.dominio;

import validacoes.ValidacaoException;

import dominio.Paciente;
import dominio.Responsavel;
import validacoes.ValidacaoException;

/**
 *
 * @author Monster
 */
public class PacienteEstetica extends Paciente{
    private String email;
    private String telefone;
    private int idade;
    private String CPF;
    
    public PacienteEstetica() {
    }

    public PacienteEstetica(String nome,String telefone, int idade,String CPF, Responsavel responsavel) {
        super(nome, responsavel);
        this.telefone = telefone;
        this.idade = idade;
        this.CPF = CPF;
        
    }
    
   
    
    
    
    @Override
    public void validarPaciente() throws ValidacaoException {
       if(getIdade() < 18  && getCPF() != null){
           throw new ValidacaoException("Erro ao validar paciente.");
       }
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
}
