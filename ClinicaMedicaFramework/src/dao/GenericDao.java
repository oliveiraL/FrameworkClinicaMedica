package dao;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class GenericDao {

    private String caminho;

    public GenericDao(String caminho) {
        this.caminho = caminho;
    }
    

    public void salvar(Object object) {
        XStream xml = new XStream(new Dom4JDriver());
        String arquivoXMl = xml.toXML(object);
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

    public void atualizar(Object object){
        salvar(object);
    }

    public void remover(Object object){
        salvar(object);
    }

    public Object listar(){ 
        try {
            XStream xStream = new XStream(new Dom4JDriver());
            try (FileInputStream fis = new FileInputStream(new File(caminho))) {
                Object arquivoXML = xStream.fromXML(fis);
                return arquivoXML;
            }
        } catch (IOException ex) {
            System.out.println("erro");
            
        }
        return null;
    }

    public Object buscar(Object objeto){
        throw new ExceptionInInitializerError("Metodo não implementado.");
    }

}


/**
 * System.getProperty("user.dir").replace("\\dist", "") + "\\src\\XML\\valores.xml"
 */