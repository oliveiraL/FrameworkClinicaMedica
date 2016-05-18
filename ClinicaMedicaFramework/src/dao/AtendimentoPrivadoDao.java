package dao;

import controller.AtendimentoController;
import dominio.AtendimentoPrivado;
import dominio.Paciente;
import java.util.ArrayList;
import java.util.List;

public class AtendimentoPrivadoDao extends GenericDao<AtendimentoPrivado>{


    public AtendimentoPrivadoDao() {
        super(System.getProperty("user.dir") + "/src/xmlVeterinaria/atendimento.xml");
    }
    public ArrayList<AtendimentoPrivado> listarAtendimentoNaoPago() {
        ArrayList<AtendimentoPrivado> atendimentos = new ArrayList<>();
        for (AtendimentoPrivado aux : listagem) {
            if (!aux.isProcedimentoPago()) {
                atendimentos.add(aux);
                
            }
        }
        return atendimentos;
    }

    public void salvar(AtendimentoPrivado atendimento) {
        System.err.println("oi");
        atendimento.setId(listagem.size()+1);
        System.err.println("oi");
        listagem.add(atendimento);
        super.salvar();
    }

    public void atualizar(AtendimentoPrivado atendimento) {
        int i = 0;
        AtendimentoPrivado alterar = null;
        for (AtendimentoPrivado aux : listagem) {
            if (aux.getId() == atendimento.getId()) {
                alterar = atendimento;
                break;
            }
            i++;
        }
        listagem.remove(alterar);
        listagem.add(i,atendimento);
        super.atualizar();
    }

    public void remover(AtendimentoPrivado atendimento) {
        AtendimentoPrivado remover = null;
        for (AtendimentoPrivado aux : listagem) {
            if (aux.getId() == atendimento.getId()) {
                remover = aux;
            }
        }
        listagem.remove(remover);
        super.remover();
    }

    public AtendimentoPrivado buscarID(int id) {
        AtendimentoPrivado atendimento = null;
        for (AtendimentoPrivado aux : listagem) {
            if (aux.getId() == id) {
                atendimento = aux;
            }
        }
        return atendimento;
    }

}
