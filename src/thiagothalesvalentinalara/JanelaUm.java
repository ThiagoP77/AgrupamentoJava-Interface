package thiagothalesvalentinalara;

import java.awt.Color;

//Grupo: Thiago, Lara, Valentina e Thales

public class JanelaUm extends javax.swing.JFrame {

    public JanelaUm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoIn = new javax.swing.JButton();
        botaoAP = new javax.swing.JButton();
        imagemUm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(614, 380));
        setMinimumSize(new java.awt.Dimension(614, 380));
        getContentPane().setLayout(null);

        botaoIn.setBackground(new java.awt.Color(255, 255, 255));
        botaoIn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botaoIn.setForeground(new java.awt.Color(0, 0, 0));
        botaoIn.setText("Inserir Pessoas");
        botaoIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JanelaUm.this.mouseExited(evt);
            }
        });
        botaoIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInActionPerformed(evt);
            }
        });
        getContentPane().add(botaoIn);
        botaoIn.setBounds(50, 170, 150, 40);

        botaoAP.setBackground(new java.awt.Color(255, 255, 255));
        botaoAP.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botaoAP.setForeground(new java.awt.Color(0, 0, 0));
        botaoAP.setText("Agrupar Pessoas");
        botaoAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JanelaUm.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitd(evt);
            }
        });
        botaoAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAPActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAP);
        botaoAP.setBounds(50, 230, 150, 40);

        imagemUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thiagothalesvalentinalara/1.jpg"))); // NOI18N
        imagemUm.setText("jLabel1");
        imagemUm.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/thiagothalesvalentinalara/1.jpg"))); // NOI18N
        imagemUm.setMaximumSize(new java.awt.Dimension(600, 340));
        imagemUm.setMinimumSize(new java.awt.Dimension(600, 340));
        imagemUm.setPreferredSize(new java.awt.Dimension(600, 340));
        getContentPane().add(imagemUm);
        imagemUm.setBounds(0, 0, 600, 340);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInActionPerformed
        //Método gerado ao clicar o botão de inserir pessoas
        new JanelaTres().setVisible(true);//Torna a tela de inserir pessoas visível 
        this.dispose();//Fecha a tela de menu
    }//GEN-LAST:event_botaoInActionPerformed

    private void botaoAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAPActionPerformed
        //Método gerado ao clicar o botão de agrupar pessoas
        new JanelaDois().setVisible(true);//Torna a tela de agrupar pessoas visível
        this.dispose();//Fecha a tela de menu
    }//GEN-LAST:event_botaoAPActionPerformed

    private void mouseEnterd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnterd
        //Método gerado ao passar o mouse sobre o botão de inserir pessoas
        botaoIn.setSize(160, 50);//Aumenta o tamanho do botão
        botaoIn.setBackground(Color.DARK_GRAY);//Muda a cor do botão para cinza-escuro
    }//GEN-LAST:event_mouseEnterd

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        //Método gerado ao passar o mouse sobre o botão de agrupar pessoas
        botaoAP.setSize(160, 50);//Aumenta o tamanho do botão
        botaoAP.setBackground(Color.DARK_GRAY);//Muda a cor do botão para cinza-escuro
    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
        //Método gerado ao parar de passar o mouse sobre o botão de inserir pessoas
        botaoIn.setSize(150, 40);//Diminui o tamanho do botão
        botaoIn.setBackground(Color.WHITE);//Muda a cor do botão para branco
    }//GEN-LAST:event_mouseExited

    private void mouseExitd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitd
        //Método gerado ao parar de passar o mouse sobre o botão de agrupar pessoas
        botaoAP.setSize(150, 40);//Diminui o tamanho do botão
        botaoAP.setBackground(Color.WHITE);//Muda a cor do botão para branco
    }//GEN-LAST:event_mouseExitd

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new JanelaUm().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAP;
    private javax.swing.JButton botaoIn;
    private javax.swing.JLabel imagemUm;
    // End of variables declaration//GEN-END:variables

}
