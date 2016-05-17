/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.dominio;

import dominio.Responsavel;

/**
 *
 * @author lucio
 */
public class DonoAnimal extends Responsavel{

    private String telefone;
    private String email;
    
    public DonoAnimal(String nome, String CPF, String telefone, String email) {
        super(nome, CPF);
        this.email = email;
        this.telefone = telefone;
    }

    public DonoAnimal() {
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
