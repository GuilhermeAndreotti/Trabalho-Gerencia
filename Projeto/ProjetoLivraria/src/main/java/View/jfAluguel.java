/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AluguelDAO;
import java.awt.Color;
import javax.swing.UIManager;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
/**
 *
 * @author EDUARDO
 */
public final class JFAluguel extends javax.swing.JFrame {

    protected AluguelDAO controle = new AluguelDAO();
    protected boolean selec = false;

    public JFAluguel() {
        initComponents();
        controle.conectar();
        atualizarTabelaTudo();
        getAtualData();
        jTClientes.setModel(controle.getClienteModel("%%"));
        jTLivros.setModel(controle.getLivroModel("%%"));
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
        jLTituloCad = new javax.swing.JLabel();
        jBEnviar = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPBarrinha = new javax.swing.JPanel();
        jBLivros = new javax.swing.JButton();
        jBClientes = new javax.swing.JButton();
        jTDataAluguel = new javax.swing.JFormattedTextField();
        jTDataDev = new javax.swing.JFormattedTextField();
        jLDataDev = new javax.swing.JLabel();
        jLDataAluguel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResult = new javax.swing.JTable();
        jLBusca = new javax.swing.JLabel();
        jTBusca = new javax.swing.JTextField();
        jBBusca = new javax.swing.JButton();
        jBResetar = new javax.swing.JButton();
        jLTituloCad1 = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTLivros = new javax.swing.JTable();
        jLLivro = new javax.swing.JLabel();
        jLBuscaClientes = new javax.swing.JLabel();
        jTBuscaClientes = new javax.swing.JTextField();
        jBBuscaClientes = new javax.swing.JButton();
        jBResetarClientes = new javax.swing.JButton();
        jLBuscaLivros = new javax.swing.JLabel();
        jTBuscaLivros = new javax.swing.JTextField();
        jBBuscaLivros = new javax.swing.JButton();
        jBResetarLivros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(528, 529));

        JBackground.setBackground(new java.awt.Color(245, 244, 244));
        JBackground.setPreferredSize(new java.awt.Dimension(528, 529));
        JBackground.setRequestFocusEnabled(false);

        JPTitulo.setBackground(new java.awt.Color(202, 228, 219));

        jLNomeAba.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNomeAba.setText("Aluguel");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPTituloLayout.setVerticalGroup(
            JPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTituloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jLTituloCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTituloCad.setText("ALUGAR");

        jBEnviar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBEnviar.setText("Enviar");
        jBEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEnviarMouseClicked(evt);
            }
        });
        jBEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarActionPerformed(evt);
            }
        });

        jPanel.setBackground(new java.awt.Color(0, 48, 63));

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

        jBLivros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBLivros.setText("LIVROS");
        jBLivros.setPreferredSize(new java.awt.Dimension(87, 23));
        jBLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLivrosMouseClicked(evt);
            }
        });

        jBClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBClientes.setText("CLIENTES");
        jBClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBClientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(JPBarrinha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(JPBarrinha, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            jTDataAluguel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTDataAluguel.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        jTDataAluguel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTDataAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDataAluguelActionPerformed(evt);
            }
        });

        try {
            jTDataDev.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTDataDev.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        jTDataDev.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTDataDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDataDevActionPerformed(evt);
            }
        });

        jLDataDev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLDataDev.setText("Data de devolução:");

        jLDataAluguel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLDataAluguel.setText("Data de Aluguel:");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTResult);

        jLBusca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLBusca.setText("Nome do cliente");

        jTBusca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jBBusca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBBusca.setText("Buscar");
        jBBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBBuscaMouseClicked(evt);
            }
        });
        jBBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaActionPerformed(evt);
            }
        });

        jBResetar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBResetar.setText("Resetar");
        jBResetar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBResetarMouseClicked(evt);
            }
        });

        jLTituloCad1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTituloCad1.setText("CONSULTAR");

        jLCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCliente.setText("LISTA DOS CLIENTES:");

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTClientes);

        jTLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTLivros);

        jLLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLLivro.setText("LISTA DOS LIVROS:");

        jLBuscaClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLBuscaClientes.setText("Nome:");

        jTBuscaClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jBBuscaClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBBuscaClientes.setText("Buscar");
        jBBuscaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBBuscaClientesMouseClicked(evt);
            }
        });

        jBResetarClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBResetarClientes.setText("Resetar");
        jBResetarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBResetarClientesMouseClicked(evt);
            }
        });

        jLBuscaLivros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLBuscaLivros.setText("Titulo:");

        jTBuscaLivros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jBBuscaLivros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBBuscaLivros.setText("Buscar");
        jBBuscaLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBBuscaLivrosMouseClicked(evt);
            }
        });

        jBResetarLivros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBResetarLivros.setText("Resetar");
        jBResetarLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBResetarLivrosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JBackgroundLayout = new javax.swing.GroupLayout(JBackground);
        JBackground.setLayout(JBackgroundLayout);
        JBackgroundLayout.setHorizontalGroup(
            JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JBackgroundLayout.createSequentialGroup()
                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTituloCad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JBackgroundLayout.createSequentialGroup()
                                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                                .addComponent(jLBuscaClientes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTBuscaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLDataAluguel)
                                            .addComponent(jLDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTDataAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jBEnviar)))
                                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                                .addComponent(jLBuscaLivros)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTBuscaLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLLivro)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                .addComponent(jBBuscaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBResetarClientes)
                                .addGap(124, 124, 124)
                                .addComponent(jBBuscaLivros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(jBResetarLivros)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTituloCad1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBusca)
                            .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTBusca, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(JBackgroundLayout.createSequentialGroup()
                                    .addComponent(jBBusca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBResetar))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(JPTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        JBackgroundLayout.setVerticalGroup(
            JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JBackgroundLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(JPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JBackgroundLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jLTituloCad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBBusca)
                            .addComponent(jBResetar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JBackgroundLayout.createSequentialGroup()
                        .addComponent(jLTituloCad)
                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jTDataAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLDataDev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jBEnviar))
                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCliente)
                                    .addComponent(jLDataAluguel)
                                    .addComponent(jLLivro))
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTBuscaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBuscaClientes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBBuscaClientes)
                                    .addComponent(jBResetarClientes)))
                            .addGroup(JBackgroundLayout.createSequentialGroup()
                                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLBuscaLivros)
                                    .addComponent(jTBuscaLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBBuscaLivros)
                                    .addComponent(jBResetarLivros))))))
                .addContainerGap())
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEnviarMouseClicked
        if(verificarSelecao()){
            enviarAluguel();
            if(controle.inserir()){
                limparCampos();            
                jTClientes.setModel(controle.getClienteModel("%%"));
                jTLivros.setModel(controle.getLivroModel("%%"));
                atualizarTabelaTudo();
            }
        }
    }//GEN-LAST:event_jBEnviarMouseClicked

    private void jBLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLivrosMouseClicked
        controle.desconectar();
        JFLivro jfl = new JFLivro();
        jfl.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBLivrosMouseClicked

    private void jTDataAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDataAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDataAluguelActionPerformed

    private void jTDataDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDataDevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDataDevActionPerformed

    private void jBEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEnviarActionPerformed

    private void jBClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClientesMouseClicked
        controle.desconectar();
        JFCliente jfc = new JFCliente();
        jfc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBClientesMouseClicked

    private void jBBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscaMouseClicked
        pesquisarGerarTabela();
    }//GEN-LAST:event_jBBuscaMouseClicked

    private void jBResetarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResetarMouseClicked
        atualizarTabelaTudo();
    }//GEN-LAST:event_jBResetarMouseClicked

    private void jBBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscaActionPerformed

    private void jBBuscaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscaClientesMouseClicked
        jTClientes.setModel(controle.getClienteModel("%"+jTBuscaClientes.getText()+"%"));
        jTBuscaClientes.setText("");
    }//GEN-LAST:event_jBBuscaClientesMouseClicked

    private void jBResetarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResetarClientesMouseClicked
        jTClientes.setModel(controle.getClienteModel("%%"));
        jTBuscaClientes.setText("");
    }//GEN-LAST:event_jBResetarClientesMouseClicked

    private void jBBuscaLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscaLivrosMouseClicked
        jTLivros.setModel(controle.getLivroModel("%"+jTBuscaLivros.getText()+"%"));
        jTBuscaLivros.setText("");
    }//GEN-LAST:event_jBBuscaLivrosMouseClicked

    private void jBResetarLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResetarLivrosMouseClicked
        jTLivros.setModel(controle.getLivroModel("%%"));
        jTBuscaLivros.setText("");
    }//GEN-LAST:event_jBResetarLivrosMouseClicked

    public void atualizarTabelaTudo(){
        controle.consultarTodos();
        jTResult.setModel(controle.gerarTabela());
    }
        
    public void pesquisarGerarTabela(){
        jTResult.setModel(controle.getPesquisaModel("%"+jTBusca.getText()+"%"));
    }
    
     public void enviarAluguel(){
        controle.getAluguel().setIdCliente(Integer.parseInt(jTClientes.getModel().getValueAt(jTClientes.getSelectedRow(),0).toString()));
        controle.getAluguel().setIdLivro(Integer.parseInt(jTLivros.getModel().getValueAt(jTLivros.getSelectedRow(), 0).toString()));
        controle.getAluguel().setDataAluguel(jTDataAluguel.getText());
        controle.getAluguel().setDataDev(jTDataDev.getText());
    }
    
    public void limparCampos(){
        jTDataDev.setText("");
        jTDataAluguel.setText("");
    }
    
    public void getAtualData(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDateTime now = LocalDateTime.now();
        jTDataAluguel.setText(dtf.format(now));
    }
    
    public boolean verificarSelecao(){
        if(jTClientes.getSelectionModel().isSelectionEmpty() || jTLivros.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Clientes ou Livro não foi selecionado! Por favor selecione um de cada para realizar o aluguel","FALHA AO SALVAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(JFAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new JFAluguel().setVisible(true);
            }
        });
    }



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JBackground;
    private javax.swing.JPanel JPBarrinha;
    private javax.swing.JPanel JPTitulo;
    private javax.swing.JButton jBBusca;
    private javax.swing.JButton jBBuscaClientes;
    private javax.swing.JButton jBBuscaLivros;
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JButton jBLivros;
    private javax.swing.JButton jBResetar;
    private javax.swing.JButton jBResetarClientes;
    private javax.swing.JButton jBResetarLivros;
    private javax.swing.JLabel jLBusca;
    private javax.swing.JLabel jLBuscaClientes;
    private javax.swing.JLabel jLBuscaLivros;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLDataAluguel;
    private javax.swing.JLabel jLDataDev;
    private javax.swing.JLabel jLLivro;
    private javax.swing.JLabel jLNomeAba;
    private javax.swing.JLabel jLTituloCad;
    private javax.swing.JLabel jLTituloCad1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPBarrinhaAba;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTBusca;
    private javax.swing.JTextField jTBuscaClientes;
    private javax.swing.JTextField jTBuscaLivros;
    private javax.swing.JTable jTClientes;
    private javax.swing.JFormattedTextField jTDataAluguel;
    private javax.swing.JFormattedTextField jTDataDev;
    private javax.swing.JTable jTLivros;
    private javax.swing.JTable jTResult;
    // End of variables declaration//GEN-END:variables
}
