package dao;


import dominio.Atendimento;
import dominio.Paciente;
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
        listagem.add(prontuario);
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

    
    public Prontuario buscarProntuario(Paciente paciente){
         for (Prontuario aux : listagem) {
             System.err.println(aux.getPaciente().getId()+" = "+paciente.getId());
            if (aux.getPaciente().getId() == paciente.getId()) {
                return aux;                
            }
        }
        return null;
    }

    
    public Prontuario buscarProntuarioID(int ID){
        for(Prontuario aux : listagem){
            System.err.println(aux.getPaciente().getId()+" = "+ID);
            if(aux.getPaciente().getId() == ID){
                return aux;
            }
        }
        return null;
    }
}
