/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaEstetica.dominio;

import com.sun.org.apache.xerces.internal.util.FeatureState;
import validacoes.ValidacaoException;

import dominio.Paciente;
import dominio.PlanoDeSaude;
import dominio.Responsavel;
import javax.swing.JOptionPane;
import validacoes.ValidacaoException;

/**
 *
 * @author Monster
 */
public class PacienteEstetica extends Paciente {

    private String email;
    private String telefone;
    private int idade;
    private String CPF;

    public PacienteEstetica() {
    }

    public PacienteEstetica(String nome, String telefone, int idade, String CPF, Responsavel responsavel, PlanoDeSaude plano) {
        super(nome, responsavel, plano);
        this.telefone = telefone;
        this.idade = idade;
        this.CPF = CPF;

    }

    @Override
    public void validarPaciente() throws ValidacaoException {
        
        if (getCPF() != null && !getCPF().equals("   .   .   -  ")) {
            if (getIdade() < 18 && (getResponsavel().getNome().isEmpty() || getResponsavel().getCPF().equals("   .   .   -  "))) {
                throw new ValidacaoException("Paciente Menor de idade, Precisa de Responsavel.");
            }
        }else{
            throw new ValidacaoException("CPF Paciente invalido.");
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
