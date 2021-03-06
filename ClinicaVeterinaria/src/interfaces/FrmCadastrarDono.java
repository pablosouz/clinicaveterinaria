/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Dono;
import javax.swing.JOptionPane;

/**
 *
 * @author PABLO
 */
public class FrmCadastrarDono extends javax.swing.JFrame {

        /**
         * Creates new form dono
         */
        public FrmCadastrarDono() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                btnCadastrar = new javax.swing.JButton();
                btnLimpar = new javax.swing.JButton();
                txtNomeResponsavel = new javax.swing.JTextField();
                txtCpf = new javax.swing.JFormattedTextField();
                txtTelefone = new javax.swing.JFormattedTextField();
                txtEndereco = new javax.swing.JTextField();
                jLabel14 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Cadastro de Dono");

                jLabel11.setText("Endereço:");

                jLabel12.setText("Telefone para contato:");

                btnCadastrar.setText("Cadastrar");
                btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCadastrarActionPerformed(evt);
                        }
                });

                btnLimpar.setText("Limpar Campos");
                btnLimpar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLimparActionPerformed(evt);
                        }
                });

                try {
                        txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
                } catch (java.text.ParseException ex) {
                        ex.printStackTrace();
                }

                try {
                        txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
                } catch (java.text.ParseException ex) {
                        ex.printStackTrace();
                }

                jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(0, 51, 255));
                jLabel14.setText("Cadastro de Dono");

                jLabel9.setText("Nome do responsável:");

                jLabel10.setText("CPF:");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCadastrar)
                                .addGap(135, 135, 135)
                                .addComponent(btnLimpar)
                                .addGap(172, 172, 172))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel9)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtNomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(38, 38, 38)
                                                                .addComponent(jLabel10)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel12)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(71, 71, 71)
                                                                .addComponent(jLabel11)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(202, 202, 202)
                                                .addComponent(jLabel14)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(txtNomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCadastrar)
                                        .addComponent(btnLimpar))
                                .addContainerGap(78, Short.MAX_VALUE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
                // TODO add your handling code here:
        try{
                Dono dono = new Dono();
                
                if(!"".equals(txtNomeResponsavel.getText()) && !"".equals(txtCpf.getText()) && !"".equals(txtTelefone.getText()) && !"".equals(txtEndereco.getText())){
                        
                dono.cadastrarDono(txtNomeResponsavel.getText(),txtCpf.getText(), txtTelefone.getText(), txtEndereco.getText());

                txtCpf.setText("");
                txtEndereco.setText("");
                txtNomeResponsavel.setText("");
                txtTelefone.setText("");               
                        
                FrmCadastrarAnimal cadastroAnimal = new FrmCadastrarAnimal();
                cadastroAnimal.setVisible(true);
                this.dispose();
                }else {
                        JOptionPane.showMessageDialog(rootPane,"Preencha todos os campos da tabela");
                }
                
        }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane,"Erro ao Cadastrar! \n ERROR: " + ex.getMessage());
        }
        }//GEN-LAST:event_btnCadastrarActionPerformed

        private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
                // TODO add your handling code here:
                txtCpf.setText("");
                txtEndereco.setText("");
                txtNomeResponsavel.setText("");
                txtTelefone.setText("");
        }//GEN-LAST:event_btnLimparActionPerformed

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
                        java.util.logging.Logger.getLogger(FrmCadastrarDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FrmCadastrarDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FrmCadastrarDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(FrmCadastrarDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
        //</editor-fold>
        //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new FrmCadastrarDono().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCadastrar;
        private javax.swing.JButton btnLimpar;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JFormattedTextField txtCpf;
        private javax.swing.JTextField txtEndereco;
        private javax.swing.JTextField txtNomeResponsavel;
        private javax.swing.JFormattedTextField txtTelefone;
        // End of variables declaration//GEN-END:variables
}
