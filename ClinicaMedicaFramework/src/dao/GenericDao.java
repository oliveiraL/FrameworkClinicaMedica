package dao;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GenericDao<T> {

    protected String caminho;
    protected ArrayList<T> listagem;

    public GenericDao(String caminho) {
        this.caminho = caminho;
        listagem = listar();
    }
    

    public void salvar() {
        XStream xml = new XStream();
        String arquivoXMl = xml.toXML(listagem);
        File arquivo = new File(caminho);
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(arquivoXMl.getBytes());
            gravar.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Arquivo.","Erro",2);
        }
    }

    public void atualizar(){
        salvar();
    }

    public void remover(){
        salvar();
    }

    public <T> ArrayList<T> listar(){ 
        try {
            XStream xStream = new XStream();
            try (FileInputStream fis = new FileInputStream(new File(caminho))) {
                Object arquivoXML = xStream.fromXML(fis);
                return (ArrayList<T>)arquivoXML;
            }
        } catch (IOException ex) {
            System.out.println("erro");
            
        }
        return null;
    }

    private <T> T buscar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


/**
 * System.getProperty("user.dir").replace("\\dist", "") + "\\src\\XML\\valores.xml"
 */