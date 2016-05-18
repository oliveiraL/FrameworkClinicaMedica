package dominio;

import validacoes.ValidacaoException;

public abstract class AtendimentoPrivado extends Atendimento {

    protected boolean procedimentoPago;

    protected PlanoDeSaude planoDeSaude;

    public AtendimentoPrivado() {
    }

    /**
     *
     * @return
     */
    public abstract Double valorAtendimento();

    public boolean isProcedimentoPago() {
        return procedimentoPago;
    }

    public void setProcedimentoPago(boolean procedimentoPago) {
        this.procedimentoPago = procedimentoPago;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }


    
}
