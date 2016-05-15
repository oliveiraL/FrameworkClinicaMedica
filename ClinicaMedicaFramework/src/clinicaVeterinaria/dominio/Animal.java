/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.dominio;

import dominio.Paciente;
import dominio.Responsavel;
import validacoes.ValidacaoException;
/**
 *
 * @author lucio
 */
public class Animal extends Paciente{

    private String raca;
    private String especie;
    private String idade;

    public Animal() {
    }

    public Animal(String nome,String raca, String especie, String idade, Responsavel responsavel) {
        super(nome, responsavel);
        this.raca = raca;
        this.especie = especie;
        this.idade = idade;
    }
        
    
    @Override
    public void validarPaciente() throws ValidacaoException{
        if(getResponsavel() == null)
            throw new ValidacaoException("Erro ao validar animal.");
        
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
}
