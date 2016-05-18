package dao;


import dominio.Atendimento;
import dominio.Prontuario;



public class ProntuarioDao extends GenericDao<Prontuario>{

    public ProntuarioDao() {
        super(System.getProperty("user.dir")+ "/src/xmlVeterinaria/prontuario.xml");
    }
    
    public void salvar(Prontuario prontuario) {
        prontuario.setId(listagem.size()+1);
        listagem.add(prontuario);
        super.salvar();
    }
    
 

    public void atualizar(Prontuario prontuario) {
         int i = 0;
        Prontuario alterar = null;
        for (Prontuario aux : listagem) {
            if (aux.getId() == prontuario.getId()) {
                alterar = prontuario;                
            }
            i++;
        }
        listagem.remove(alterar);
        listagem.add(i,prontuario);
        super.atualizar();
    }

    public void remover(Prontuario prontuario) {
       Prontuario remover = null;
        for (Prontuario aux : listagem) {
            if (aux.getId() == prontuario.getId()) {
                remover = aux;
                break;
            }
        }
        listagem.remove(remover);
        super.remover();
    }
    
    public void addAtendimento(Prontuario prontuario, Atendimento atendimento){
        prontuario.getAtendimento().add(atendimento);
        super.atualizar();
    }

}
