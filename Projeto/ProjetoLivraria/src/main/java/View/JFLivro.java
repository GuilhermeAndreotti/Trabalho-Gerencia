/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LivroDAO;
import java.awt.event.KeyEvent;

/**
 *
 * @author EDUARDO
 */
public class JFLivro extends javax.swing.JFrame {

    protected LivroDAO controle = new LivroDAO();
    protected boolean selec = false;

    public JFLivro() {
        initComponents();
        controle.conectar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBackground = new javax.swing.JPanel();
        JPTitulo = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLNomeAba = new javax.swing.JLabel();
        jPBarrinhaAba = new javax.swing.JPanel();
        jTNome = new javax.swing.JTextField();
        jTQntPgs = new javax.swing.JTextField();
        jTEditor = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jTTitulo = new javax.swing.JTextField();
        jTGenero = new javax.swing.JTextField();
        jLTituloCad = new javax.swing.JLabel();
        jLEditor = new javax.swing.JLabel();
        jLGenero = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLQntPgs = new javax.swing.JLabel();
        jBEnviar = new javax.swing.JButton();
        jLCidade = new javax.swing.JLabel();
        jTSobrenome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPBarrinha = new javax.swing.JPanel();
        jBClientes = new javax.swing.JButton();
        jBAluguel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(628, 429));

        JBackground.setBackground(new java.awt.Color(245, 244, 244));
        JBackground.setRequestFocusEnabled(false);

        JPTitulo.setBackground(new java.awt.Color(202, 228, 219));

        jLNomeAba.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNomeAba.setText("LIVROS");

        jPBarrinhaAba.setBackground(new java.awt.Color(0, 0, 0));
        jPBarrinhaAba.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPBarrinhaAbaLayout = new javax.swing.GroupLayout(jPBarrinhaAba);
        jPBarrinhaAba.setLayout(jPBarrinhaAbaLayout);
        jPBarrinhaAbaLayout.setHorizontalGroup(
            jPBarrinhaAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPBarrinhaAbaLayout.setVerticalGroup(
            jPBarrinhaAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(jLNomeAba, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPBarrinhaAba, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPBarrinhaAba, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jLNomeAba, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNomeAba)
                .addGap(3, 3, 3)
                .addComponent(jPBarrinhaAba, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JPTituloLayout = new javax.swing.GroupLayout(JPTitulo);
        JPTitulo.setLayout(JPTituloLayout);
        JPTituloLayout.setHorizontalGroup(
            JPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        JPTituloLayout.setVerticalGroup(
            JPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTituloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTQntPgs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTQntPgs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTQntPgsKeyTyped(evt);
            }
        });

        jTEditor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNome.setText("Nome do autor:");

        jTTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTGenero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLTituloCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTituloCad.setText("CADASTRO");

        jLEditor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLEditor.setText("Editor:");

        jLGenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLGenero.setText("Genero:");

        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLTitulo.setText("Titulo:");

        jLQntPgs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLQntPgs.setText("Quantidade de páginas:");

        jBEnviar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBEnviar.setText("Enviar");
        jBEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEnviarMouseClicked(evt);
            }
        });

        jLCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCidade.setText("Sobrenome do autor:");

        jTSobrenome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 48, 63));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROGRAMA LIVRARIA");

        JPBarrinha.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout JPBarrinhaLayout = new javax.swing.GroupLayout(JPBarrinha);
        JPBarrinha.setLayout(JPBarrinhaLayout);
        JPBarrinhaLayout.setHorizontalGroup(
            JPBarrinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        JPBarrinhaLayout.setVerticalGroup(
            JPBarrinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jBClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBClientes.setText("CLIENTES");
        jBClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBClientesMouseClicked(evt);
            }
        });

        jBAluguel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBAluguel.setText("ALUGUEL");
        jBAluguel.setPreferredSize(new java.awt.Dimension(87, 23));
        jBAluguel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAluguelMouseClicked(evt);
            }
        });
        jBAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAluguelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(JPBarrinha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(JPBarrinha, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBClientes)
                .addGap(18, 18, 18)
                .addComponent(jBAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JBackgroundLayout = new javax.swing.GroupLayout(JBackground);
        JBackground.setLayout(JBackgroundLayout);
        JBackgroundLayout.setHorizontalGroup(
            JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JBackgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLTituloCad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTTitulo)
                                .addComponent(jLGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTGenero)
                                .addComponent(jLEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBEnviar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTQntPgs, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JBackgroundLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 157, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JBackgroundLayout.createSequentialGroup()
                                .addComponent(jLCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                .addComponent(jLQntPgs, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(JPTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JBackgroundLayout.setVerticalGroup(
            JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JBackgroundLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(JPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTituloCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JBackgroundLayout.createSequentialGroup()
                        .addComponent(jLTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JBackgroundLayout.createSequentialGroup()
                        .addComponent(jLNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JBackgroundLayout.createSequentialGroup()
                        .addComponent(jLGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JBackgroundLayout.createSequentialGroup()
                        .addComponent(jLCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JBackgroundLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTQntPgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jBEnviar))
                    .addGroup(JBackgroundLayout.createSequentialGroup()
                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEditor)
                            .addComponent(jLQntPgs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEnviarMouseClicked
     
            enviarLivro();
            if(controle.inserir()){
                limparCampos();
            }
        
    }//GEN-LAST:event_jBEnviarMouseClicked

    private void jBClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClientesMouseClicked
        controle.desconectar();
        JFCliente jfc = new JFCliente();
        jfc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBClientesMouseClicked

    private void jTQntPgsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTQntPgsKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c == (KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE) ){
           evt.consume();
        }
    }//GEN-LAST:event_jTQntPgsKeyTyped

    private void jBAluguelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAluguelMouseClicked
        controle.desconectar();
        JFAluguel jfa = new JFAluguel();
        jfa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBAluguelMouseClicked

    private void jBAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAluguelActionPerformed

    public void limparCampos(){
        jTQntPgs.setText("");
        jTEditor.setText("");
        jTSobrenome.setText("");
        jTNome.setText("");
        jTTitulo.setText("");
        jTGenero.setText("");
    }
    
    public void setCampos(String qnt, String editor, String sobrenome, String nome, String titulo, String genero){
        jTQntPgs.setText(qnt);
        jTEditor.setText(editor);
        jTSobrenome.setText(sobrenome);
        jTNome.setText(nome);
        jTTitulo.setText(titulo);
        jTGenero.setText(genero);
    }
    
    public void enviarLivro(){
        controle.getLivro().setTitulo(jTTitulo.getText());
        controle.getLivro().setGenero(jTGenero.getText());
        controle.getLivro().setEditora(jTEditor.getText());
        controle.getLivro().setNomeAutor(jTNome.getText());
        controle.getLivro().setSobrenomeAutor(jTSobrenome.getText());
        if(jTQntPgs.getText().isBlank()){
            controle.getLivro().setQntPgns(0);
        }else{
            controle.getLivro().setQntPgns(Integer.parseInt(jTQntPgs.getText()));
        }
    }
    
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
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLivro().setVisible(true);
            }
        });
    }

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JBackground;
    private javax.swing.JPanel JPBarrinha;
    private javax.swing.JPanel JPTitulo;
    private javax.swing.JButton jBAluguel;
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLEditor;
    private javax.swing.JLabel jLGenero;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNomeAba;
    private javax.swing.JLabel jLQntPgs;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLTituloCad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPBarrinhaAba;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTEditor;
    private javax.swing.JTextField jTGenero;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTQntPgs;
    private javax.swing.JTextField jTSobrenome;
    private javax.swing.JTextField jTTitulo;
    // End of variables declaration//GEN-END:variables
}
