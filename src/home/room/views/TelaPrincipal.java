/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.room.views;

import javax.swing.JMenuItem;

/**
 *
 * @author Telandes Moreira
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        setUndecorated(true);
        initComponents();
    }

    public JMenuItem getjMenuItemAcessoAdministrador() {
        return jMenuItemAcessoAdministrador;
    }

    public JMenuItem getjMenuItemCadHospedagem() {
        return jMenuItemCadHospedagem;
    }

    public JMenuItem getjMenuItemCadReservas() {
        return jMenuItemCadReservas;
    }

    public JMenuItem getjMenuItemConsQuartos() {
        return jMenuItemConsQuartos;
    }

    public JMenuItem getjMenuItemInfoUsuario() {
        return jMenuItemInfoUsuario;
    }

    public JMenuItem getjMenuItemFazerLogOut() {
        return jMenuItemFazerLogOut;
    }

    public JMenuItem getjMenuItemSair() {
        return jMenuItemSair;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemInfoUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCadReservas = new javax.swing.JMenuItem();
        jMenuItemCadHospedagem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemConsQuartos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAcessoAdministrador = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemFazerLogOut = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBounds(new java.awt.Rectangle(100, 100, 800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/bg_main.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(800, 50));

        jMenu1.setBorder(null);
        jMenu1.setText("Início");
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 21));

        jMenuItemInfoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/informacoes.png"))); // NOI18N
        jMenuItemInfoUsuario.setText("Informações do usuário");
        jMenuItemInfoUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenuItemInfoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInfoUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemInfoUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setText("Cadastros");
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 21));

        jMenuItemCadReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/add.png"))); // NOI18N
        jMenuItemCadReservas.setText("Cadastrar reserva(s)");
        jMenuItemCadReservas.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu2.add(jMenuItemCadReservas);

        jMenuItemCadHospedagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/add.png"))); // NOI18N
        jMenuItemCadHospedagem.setText("Cadastrar hospedagem");
        jMenuItemCadHospedagem.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu2.add(jMenuItemCadHospedagem);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(null);
        jMenu3.setText("Consultas");
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 21));

        jMenuItemConsQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/search.png"))); // NOI18N
        jMenuItemConsQuartos.setText("Consultar quarto(s)");
        jMenuItemConsQuartos.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu3.add(jMenuItemConsQuartos);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(null);
        jMenu4.setText("Área restrita");
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 21));

        jMenuItemAcessoAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/cadeado.png"))); // NOI18N
        jMenuItemAcessoAdministrador.setText("Acesso do administrador");
        jMenuItemAcessoAdministrador.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu4.add(jMenuItemAcessoAdministrador);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(null);
        jMenu5.setText("Sair");
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 21));

        jMenuItemFazerLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/exit.png"))); // NOI18N
        jMenuItemFazerLogOut.setText("Fazer log out");
        jMenuItemFazerLogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu5.add(jMenuItemFazerLogOut);

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/room/views/images/cancel-button.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu5.add(jMenuItemSair);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemInfoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInfoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemInfoUsuarioActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAcessoAdministrador;
    private javax.swing.JMenuItem jMenuItemCadHospedagem;
    private javax.swing.JMenuItem jMenuItemCadReservas;
    private javax.swing.JMenuItem jMenuItemConsQuartos;
    private javax.swing.JMenuItem jMenuItemFazerLogOut;
    private javax.swing.JMenuItem jMenuItemInfoUsuario;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
