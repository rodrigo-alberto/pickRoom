/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.room.views;

import javax.swing.JButton;

/**
 *
 * @author Telandes Moreira
 */
public class TelaConsQuartos extends javax.swing.JDialog {

    /**
     * Creates new form TelaQuartos
     */
    public TelaConsQuartos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
    }
    
    public JButton getjButtonPesquisar() {
        return jButtonPesquisar;
    }
    
    public JButton getjButtonFinalizarReservaHospedagem() {
        return jButtonFinalizarReservaHospedagem;
    }

    public JButton getjButtonVoltar() {
        return jButtonVoltar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButtonLivres = new javax.swing.JRadioButton();
        jRadioButtonOcupados = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonReservados = new javax.swing.JRadioButton();
        jButtonFinalizarReservaHospedagem = new javax.swing.JButton();
        jRadioButtonEmManutencao = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jButtonVoltar.setBackground(new java.awt.Color(235, 235, 235));
        jButtonVoltar.setForeground(new java.awt.Color(64, 64, 64));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setBorder(null);

        jScrollPane2.setBackground(new java.awt.Color(80, 80, 80));
        jScrollPane2.setForeground(new java.awt.Color(235, 235, 235));

        jTable1.setBackground(new java.awt.Color(64, 64, 64));
        jTable1.setForeground(new java.awt.Color(235, 235, 235));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Suíte"},
                {"2", "Quarto comum"}
            },
            new String [] {
                "Id", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTextFieldPesquisar.setBackground(new java.awt.Color(235, 235, 235));
        jTextFieldPesquisar.setForeground(new java.awt.Color(64, 64, 64));
        jTextFieldPesquisar.setBorder(null);

        jButtonPesquisar.setBackground(new java.awt.Color(235, 235, 235));
        jButtonPesquisar.setForeground(new java.awt.Color(64, 64, 64));
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/search.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setBorder(null);
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(80, 80, 80));
        jList1.setForeground(new java.awt.Color(235, 235, 235));
        jScrollPane1.setViewportView(jList1);

        jRadioButtonLivres.setBackground(new java.awt.Color(64, 64, 64));
        buttonGroup1.add(jRadioButtonLivres);
        jRadioButtonLivres.setForeground(new java.awt.Color(235, 235, 235));
        jRadioButtonLivres.setText("Livres");
        jRadioButtonLivres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLivresActionPerformed(evt);
            }
        });

        jRadioButtonOcupados.setBackground(new java.awt.Color(64, 64, 64));
        buttonGroup1.add(jRadioButtonOcupados);
        jRadioButtonOcupados.setForeground(new java.awt.Color(235, 235, 235));
        jRadioButtonOcupados.setText("Ocupados");
        jRadioButtonOcupados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOcupadosActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(235, 235, 235));
        jLabel1.setText("Info. do quarto:");

        jRadioButtonReservados.setBackground(new java.awt.Color(64, 64, 64));
        buttonGroup1.add(jRadioButtonReservados);
        jRadioButtonReservados.setForeground(new java.awt.Color(235, 235, 235));
        jRadioButtonReservados.setText("Reservados");
        jRadioButtonReservados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonReservadosActionPerformed(evt);
            }
        });

        jButtonFinalizarReservaHospedagem.setBackground(new java.awt.Color(235, 235, 235));
        jButtonFinalizarReservaHospedagem.setForeground(new java.awt.Color(64, 64, 64));
        jButtonFinalizarReservaHospedagem.setText("Finalizar reserva ou hospedagem");
        jButtonFinalizarReservaHospedagem.setBorder(null);
        jButtonFinalizarReservaHospedagem.setEnabled(false);

        jRadioButtonEmManutencao.setBackground(new java.awt.Color(64, 64, 64));
        buttonGroup1.add(jRadioButtonEmManutencao);
        jRadioButtonEmManutencao.setForeground(new java.awt.Color(235, 235, 235));
        jRadioButtonEmManutencao.setText("Em manutenção");
        jRadioButtonEmManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEmManutencaoActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonLivres)
                            .addComponent(jRadioButtonOcupados))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonEmManutencao)
                            .addComponent(jRadioButtonReservados)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(172, 172, 172)
                                    .addComponent(jButtonFinalizarReservaHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonLivres)
                    .addComponent(jRadioButtonReservados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonEmManutencao)
                    .addComponent(jRadioButtonOcupados, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFinalizarReservaHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonLivresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLivresActionPerformed
        this.jButtonFinalizarReservaHospedagem.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonLivresActionPerformed

    private void jRadioButtonOcupadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOcupadosActionPerformed
        this.jButtonFinalizarReservaHospedagem.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonOcupadosActionPerformed

    private void jRadioButtonReservadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonReservadosActionPerformed
        this.jButtonFinalizarReservaHospedagem.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonReservadosActionPerformed

    private void jRadioButtonEmManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEmManutencaoActionPerformed
        this.jButtonFinalizarReservaHospedagem.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonEmManutencaoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaConsQuartos dialog = new TelaConsQuartos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonFinalizarReservaHospedagem;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEmManutencao;
    private javax.swing.JRadioButton jRadioButtonLivres;
    private javax.swing.JRadioButton jRadioButtonOcupados;
    private javax.swing.JRadioButton jRadioButtonReservados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
