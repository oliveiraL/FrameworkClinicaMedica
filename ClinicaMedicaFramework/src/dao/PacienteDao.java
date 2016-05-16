package dao;

import dominio.Paciente;

public class PacienteDao extends GenericDao<Paciente>{

    
    public PacienteDao() {
        super(System.getProperty("user.dir")+ "/src/xmlVeterinaria/paciente.xml");   
        System.out.println(listagem.size());
    }

    public boolean existe(Paciente paciente) {
        return false;
    }
    
    public void salvar(Paciente paciente) {
        paciente.setId(listagem.size()+1);
        listagem.add(paciente);
        super.salvar();
        System.err.println(listagem.size());
    }

    public void atualizar(Paciente paciente) {
        listagem.stream().filter((aux) -> (aux.getId() == paciente.getId())).forEach((aux) -> {
            aux = paciente;
        });
       super.atualizar();
    }

    public void remover(Paciente paciente) {
        System.err.println(paciente.getId());
        listagem.stream().filter((aux) -> (aux.getId() == paciente.getId())).forEach((aux) -> {
            System.err.println(paciente.getId()+" = "+aux.getId());
            listagem.remove(aux);
        });
        super.remover();
    }

    
    public Paciente buscarID(int id){
        Paciente paciente = null;
        for(Paciente aux : listagem){
            if(aux.getId() == id)
                paciente = aux;
        }
        return paciente;
    }
    
    public Paciente buscarNome(String nome){
       Paciente paciente = null;
       for(Paciente aux : listagem){
           if(aux.getNome() == nome)
               paciente = aux;
       }
           return paciente;
    }
       
      
      
    
    

    
    

}
