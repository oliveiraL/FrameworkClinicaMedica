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
    
    private boolean insonia; 
    private boolean bebida;
    private boolean estresse;
    private boolean etc;
    private boolean sedentarismo;
    private boolean tabagismo;

    private boolean linha;
    private boolean seque;
    private boolean manc;
    private boolean enve;
    private boolean desi;
    private boolean flaci;

    public ConsultaEsteticaPrivado() {
    }
    
    

    public ConsultaEsteticaPrivado(boolean insonia, boolean bebida, boolean estresse, boolean etc, boolean sedentarismo, boolean tabagismo, boolean linha, boolean seque, boolean manc, boolean enve, boolean desi, boolean flaci) {
        super();
        this.insonia = insonia;
        this.bebida = bebida;
        this.estresse = estresse;
        this.etc = etc;
        this.sedentarismo = sedentarismo;
        this.tabagismo = tabagismo;
        this.linha = linha;
        this.seque = seque;
        this.manc = manc;
        this.enve = enve;
        this.desi = desi;
        this.flaci = flaci;
    }

    
    

    public boolean isInsonia() {
        return insonia;
    }

    public void setInsonia(boolean insonia) {
        this.insonia = insonia;
    }

    public boolean isBebida() {
        return bebida;
    }

    public void setBebida(boolean bebida) {
        this.bebida = bebida;
    }

    public boolean isEstresse() {
        return estresse;
    }

    public void setEstresse(boolean estresse) {
        this.estresse = estresse;
    }

    public boolean isEtc() {
        return etc;
    }

    public void setEtc(boolean etc) {
        this.etc = etc;
    }

    public boolean isSedentarismo() {
        return sedentarismo;
    }

    public void setSedentarismo(boolean sedentarismo) {
        this.sedentarismo = sedentarismo;
    }

    public boolean isTabagismo() {
        return tabagismo;
    }

    public void setTabagismo(boolean tabagismo) {
        this.tabagismo = tabagismo;
    }

    public boolean isLinha() {
        return linha;
    }

    public void setLinha(boolean linha) {
        this.linha = linha;
    }

    public boolean isSeque() {
        return seque;
    }

    public void setSeque(boolean seque) {
        this.seque = seque;
    }

    public boolean isManc() {
        return manc;
    }

    public void setManc(boolean manc) {
        this.manc = manc;
    }

    public boolean isEnve() {
        return enve;
    }

    public void setEnve(boolean enve) {
        this.enve = enve;
    }

    public boolean isDesi() {
        return desi;
    }

    public void setDesi(boolean desi) {
        this.desi = desi;
    }

    public boolean isFlaci() {
        return flaci;
    }

    public void setFlaci(boolean flaci) {
        this.flaci = flaci;
    }
    
   

    @Override
    public Double valorAtendimento() {
        return 50.0;
    }

    @Override
    public void validarAtendimento() throws ValidacaoException {
        if(!bebida && !insonia && !tabagismo && !sedentarismo && !estresse && !etc){
            throw  new ValidacaoException("Nessesario preencher historico social.");
        }
        if(!linha && !enve && !manc && !flaci && !desi && !seque){
            throw new ValidacaoException("Nessesario preencher queixa principal.");
        }
        if(getDiagnosticoAtendimentos() == null && getTratamentos() ==null )
            throw new ValidacaoException("Atendimento tem que ter um diagnostico ou um tratamento.");
        //System.out.println("clinicaVeterinaria.dominio.ConsultaVeterinario.validarAtendimento()");
    }
    


    
    

  
    
}
