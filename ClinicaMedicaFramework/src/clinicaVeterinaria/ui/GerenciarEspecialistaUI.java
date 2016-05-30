/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.ui;

import clinicaVeterinaria.dominio.Veterinario;
import controller.GerenciarEspecialidadeController;
import controller.GerenciarEspecialistaController;
import dominio.Especialidade;
import dominio.Especialista;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.UIGerenciarEspecialista;
import validacoes.ValidacaoException;

/**
 *
 * @author lucio
 */
public class GerenciarEspecialistaUI extends javax.swing.JFrame implements UIGerenciarEspecialista {

    private GerenciarEspecialistaController gerenciarEspecialista;
    private GerenciarEspecialidadeController gerenciarEspecialidade;
    private int clickMouse = 0;
    private Veterinario veterinarioAtual;

    /**
     * Creates new form GerenciarEspecialistaUI
     */
    public GerenciarEspecialistaUI() {
        initComponents();
        gerenciarEspecialidade = new GerenciarEspecialidadeController("xmlVeterinaria");
        gerenciarEspecialista = new GerenciarEspecialistaController("xmlVeterinaria");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbEspecialidade = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        txtCRMV = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buscarNome = new javax.swing.JButton();
        listarEspecialistas = new javax.swing.JButton();
        txtNomeBusca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        removerEspecialista = new javax.swing.JButton();
        atualizarEspecialista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Especialista"));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("CRMV:");

        jLabel4.setText("Especialidade:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        buscarNome.setText("Buscar nome");
        buscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNomeActionPerformed(evt);
            }
        });

        listarEspecialistas.setLabel("Listar especialistas");
        listarEspecialistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarEspecialistasActionPerformed(evt);
            }
        });

        txtNomeBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeBuscaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buscarNome)
                        .addGap(89, 89, 89)
                        .addComponent(listarEspecialistas))
                    .addComponent(txtNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarNome)
                    .addComponent(listarEspecialistas))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "CRMV", "Especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        removerEspecialista.setLabel("Remover especialista");
        removerEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerEspecialistaActionPerformed(evt);
            }
        });

        atualizarEspecialista.setLabel("Atualizar");
        atualizarEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarEspecialistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(txtCPF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCRMV))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(atualizarEspecialista))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cmbEspecialidade, 0, 267, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(removerEspecialista)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCRMV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(atualizarEspecialista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerEspecialista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ArrayList<Especialidade> especialidades = gerenciarEspecialidade.listagem();
        for (Especialidade e : especialidades) {
            cmbEspecialidade.addItem(e.getDesignacao());
        }

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cadastrarEspecialista();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNomeBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeBuscaActionPerformed

    private void buscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNomeActionPerformed
        buscarNome();
    }//GEN-LAST:event_buscarNomeActionPerformed

    private void listarEspecialistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarEspecialistasActionPerformed
        listarEspecialista();
    }//GEN-LAST:event_listarEspecialistasActionPerformed

    private void removerEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerEspecialistaActionPerformed
        removerEspecialista();
    }//GEN-LAST:event_removerEspecialistaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        clickMouse++;
        if (clickMouse == 2) {
            clickMouse = 0;
            int index = jTable1.getSelectedRow();
            Especialista especialista = gerenciarEspecialista.listarEspecialista().get(index);
            Veterinario veterinario = (Veterinario) especialista;
            veterinarioAtual = veterinario;

            txtNome.setText(veterinario.getNome());
            txtCPF.setText(veterinario.getCPF());
            txtCRMV.setText(veterinario.getCrmv());
            if (veterinario.getEspecialidade().getDesignacao().equalsIgnoreCase("Clinico Geral")) {
                cmbEspecialidade.setSelectedIndex(0);
            } else {
                cmbEspecialidade.setSelectedIndex(1);
            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void atualizarEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarEspecialistaActionPerformed
        atualizar();
    }//GEN-LAST:event_atualizarEspecialistaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarEspecialistaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarEspecialistaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarEspecialistaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarEspecialistaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarEspecialistaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarEspecialista;
    private javax.swing.JButton buscarNome;
    private javax.swing.JComboBox<String> cmbEspecialidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton listarEspecialistas;
    private javax.swing.JButton removerEspecialista;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCRMV;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeBusca;
    // End of variables declaration//GEN-END:variables

    /*
    Limpar a tabela, antes de realizar uma busca
     */
    public void limparTabela() {
        while (jTable1.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
            dm.getDataVector().removeAllElements();
        }
    }

    public void buscarNome() {
        limparTabela();

        String nomeEspecialista = txtNomeBusca.getText();
        Veterinario veterinario;
        int linhas = 0;

        for (Especialista especialista : gerenciarEspecialista.listarEspecialista()) {
            veterinario = (Veterinario) especialista;
            ((DefaultTableModel) jTable1.getModel()).addRow(new Vector());

            if (nomeEspecialista.equalsIgnoreCase(veterinario.getNome())) {
                jTable1.getModel().setValueAt(veterinario.getNome(), linhas, 0);
                jTable1.getModel().setValueAt(veterinario.getCPF(), linhas, 1);
                jTable1.getModel().setValueAt(veterinario.getCrmv(), linhas, 2);
                jTable1.getModel().setValueAt(veterinario.getEspecialidade().getDesignacao(), linhas, 3);
                linhas++;
            }
        }
    }

    public void listarEspecialista() {
        limparTabela();
        int linhas = 0;
        Veterinario veterinario;

        for (Especialista especialista : gerenciarEspecialista.listarEspecialista()) {
            ((DefaultTableModel) jTable1.getModel()).addRow(new Vector());
            veterinario = (Veterinario) especialista;

            jTable1.getModel().setValueAt(veterinario.getNome(), linhas, 0);
            jTable1.getModel().setValueAt(veterinario.getCPF(), linhas, 1);
            jTable1.getModel().setValueAt(veterinario.getCrmv(), linhas, 2);
            jTable1.getModel().setValueAt(veterinario.getEspecialidade().getDesignacao(), linhas, 3);
            linhas++;
        }
    }

    public void removerEspecialista() {
        int index = jTable1.getSelectedRow();
        Especialista especialista = gerenciarEspecialista.listarEspecialista().get(index);
        gerenciarEspecialista.removerEspecialista(especialista);
    }

    public void atualizar() {
        String nomeVeterinario = txtNome.getText();
        String CPF = txtCPF.getText();
        String CRMV = txtCRMV.getText();
        int index = cmbEspecialidade.getSelectedIndex();
        Especialidade especialidade = gerenciarEspecialidade.listagem().get(index);

        veterinarioAtual.setNome(nomeVeterinario);
        veterinarioAtual.setCPF(CPF);
        veterinarioAtual.setCrmv(CRMV);
        veterinarioAtual.setEspecialidade(especialidade);

        try {
            gerenciarEspecialista.cadastrarEspecialista(veterinarioAtual);
        } catch (ValidacaoException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }

    @Override
    public void cadastrarEspecialista() {
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String crmv = txtCRMV.getText();
        int index = cmbEspecialidade.getSelectedIndex();
        Especialista veterinario = new Veterinario(crmv, gerenciarEspecialidade.listagem().get(index), nome, cpf);
        try {
            gerenciarEspecialista.cadastrarEspecialista(veterinario);
            JOptionPane.showMessageDialog(rootPane, "Especialista cadastrado com sucesso.");
        } catch (ValidacaoException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

}
