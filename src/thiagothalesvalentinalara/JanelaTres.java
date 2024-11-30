package thiagothalesvalentinalara;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//Grupo: Thiago, Lara, Valentina e Thales

public class JanelaTres extends javax.swing.JFrame {
    private static ArrayList listap = new ArrayList();//Objeto da classe lista que recebe as pessoas inseridas
    private static ArrayList listap1 = new ArrayList();//Objeto da classe lista que recebe as pessoas inseridas e não-centróides
        
    public JanelaTres() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menuB1 = new javax.swing.JButton();
        inserirP = new javax.swing.JButton();
        nomeT = new javax.swing.JTextField();
        idadeT = new javax.swing.JTextField();
        sexoT = new javax.swing.JTextField();
        alturaT = new javax.swing.JTextField();
        pesoT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(614, 380));
        setMinimumSize(new java.awt.Dimension(614, 380));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 100, 60, 18);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Idade:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 130, 50, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sexo (0 para 'M' e 1 para 'F'):");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 170, 200, 18);
        jLabel4.getAccessibleContext().setAccessibleName("Sexo(0 para Masculino ou 1 para Feminino):");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Altura:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 200, 50, 18);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Peso:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 230, 40, 18);

        menuB1.setBackground(new java.awt.Color(255, 255, 255));
        menuB1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        menuB1.setForeground(new java.awt.Color(0, 0, 0));
        menuB1.setText("Menu");
        menuB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredII(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedII(evt);
            }
        });
        menuB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuB1ActionPerformed(evt);
            }
        });
        getContentPane().add(menuB1);
        menuB1.setBounds(290, 304, 90, 30);

        inserirP.setBackground(new java.awt.Color(255, 255, 255));
        inserirP.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        inserirP.setForeground(new java.awt.Color(0, 0, 0));
        inserirP.setText("Inserir");
        inserirP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JanelaTres.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JanelaTres.this.mouseExited(evt);
            }
        });
        inserirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirPActionPerformed(evt);
            }
        });
        getContentPane().add(inserirP);
        inserirP.setBounds(10, 304, 90, 30);

        nomeT.setBackground(new java.awt.Color(255, 255, 255));
        nomeT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nomeT.setForeground(new java.awt.Color(0, 0, 0));
        nomeT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(nomeT);
        nomeT.setBounds(60, 100, 320, 22);

        idadeT.setBackground(new java.awt.Color(255, 255, 255));
        idadeT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        idadeT.setForeground(new java.awt.Color(0, 0, 0));
        idadeT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(idadeT);
        idadeT.setBounds(60, 134, 64, 22);

        sexoT.setBackground(new java.awt.Color(255, 255, 255));
        sexoT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sexoT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sexoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoTActionPerformed(evt);
            }
        });
        getContentPane().add(sexoT);
        sexoT.setBounds(210, 170, 64, 22);

        alturaT.setBackground(new java.awt.Color(255, 255, 255));
        alturaT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        alturaT.setForeground(new java.awt.Color(0, 0, 0));
        alturaT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(alturaT);
        alturaT.setBounds(60, 200, 64, 22);

        pesoT.setBackground(new java.awt.Color(255, 255, 255));
        pesoT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pesoT.setForeground(new java.awt.Color(0, 0, 0));
        pesoT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(pesoT);
        pesoT.setBounds(54, 230, 60, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thiagothalesvalentinalara/3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 604, 338);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuB1ActionPerformed
        //Método que gera as ações ao clicar no botão de menu
        nomeT.setText("");//Deixa o campo de nome vazio
        idadeT.setText("");//Deixa o campo de idade vazio
        sexoT.setText("");//Deixa o campo de sexo vazio
        alturaT.setText("");//Deixa o campo de altura vazio
        pesoT.setText("");//Deixa o campo de peso vazio
        new JanelaUm().setVisible(true);//Deixa a janela de menu visível
        this.dispose();//Fecha a janela de inserir pessoas
    }//GEN-LAST:event_menuB1ActionPerformed

    private void inserirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirPActionPerformed
        //Método que gera as ações ao clicar no botão de inserir pessoa
        String nome = nomeT.getText();//Variável nome recebe o que estava no campo de texto
        String idades = idadeT.getText();//Variável idades recebe o que estava no campo de texto
        String sexos = sexoT.getText();//Variável sexos recebe o que estava no campo de texto
        String alturas = alturaT.getText();//Variável alturas recebe o que estava no campo de texto
        String pesos = pesoT.getText();//Variável pesos recebe o que estava no campo de texto
        if(idades.matches("-?\\d+")&&sexos.matches("-?\\d+")){//Verifica se idade e sexo receberam números inteiros
            Pessoa pes = new Pessoa();//Instancia objeto da classe Pessoa
            int idade = Integer.parseInt(idades);//Recebe a idade convertida em inteiro
            int sexo = Integer.parseInt(sexos);//Recebe o sexo convertido em inteiro
            float altura = Float.parseFloat(alturas);//Recebe a altura convertida em float
            float peso = Float.parseFloat(pesos);//Recebe o peso convertido em float
            if(pes.setNome(nome)&&pes.setIdade(idade)&&pes.setSexo(sexo)&&pes.setAltura(altura)&&pes.setPeso(peso)){//Verifica se todos os atributos foram preenchidos corretamente
                pes.validacao();//Valida o objeto, assim somando um ao total de pessoas
                listap.add(pes);//Adiciona o objeto validado à lista de pessoas
                listap1.clear();//Limpa a lista secundária de pessoas
                for (int l = 0; l < listap.size(); l ++){//A lista secundária recebe todos os objetos da "listap"
                        listap1.add(listap.get(l));//Adiciona um objeto de "listap" à "listap1"
                    }
                JOptionPane.showMessageDialog(null,"Pessoa inserida com sucesso!!!");//Informa ao usuário que a pessoa foi inserida
                nomeT.setText("");//Deixa o campo de nome vazio
                idadeT.setText("");//Deixa o campo de idade vazio
                sexoT.setText("");//Deixa o campo de sexo vazio
                alturaT.setText("");//Deixa o campo de altura vazio
                pesoT.setText("");//Deixa o campo de peso vazio
                nomeT.requestFocus();//Cursor vai automaticamente para o campo de inserir nome
            } else {//Caso dado inserido seja inválido
                JOptionPane.showMessageDialog(null,"ERRO:\nInformação inválida inserida.");//Mensagem informando ao usuário que algum dado inserido é inválido
                nomeT.requestFocus();//Cursor vai automaticamente para o campo de inserir nome
            }
        } else {//Caso dado inserido seja inválido
            JOptionPane.showMessageDialog(null,"ERRO:\nInformação inválida inserida.");//Mensagem informando ao usuário que algum dado inserido é inválido
            nomeT.requestFocus();//Cursor vai automaticamente para o campo de inserir nome
        }
    }//GEN-LAST:event_inserirPActionPerformed

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        //Método que gera ações ao passar o mouse por cima do botão de inserir pessoa
        inserirP.setSize(100, 32);//Aumenta o tamanho do botão
        inserirP.setBackground(Color.DARK_GRAY);//Muda a cor do botão para cinza escuro
    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
        //Método que gera ações ao parar de passar o mouse por cima do botão de inserir pessoa
        inserirP.setSize(90, 30);//Diminui o tamanho do botão
        inserirP.setBackground(Color.WHITE);//Muda a cor do botão para branco
    }//GEN-LAST:event_mouseExited

    private void mouseEnteredII(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnteredII
        //Método que gera ações ao passar o mouse por cima do botão de menu
        menuB1.setSize(100, 32);//Aumenta o tamanho do botão
        menuB1.setBackground(Color.DARK_GRAY);//Muda a cor do botão para cinza escuro
    }//GEN-LAST:event_mouseEnteredII

    private void mouseExitedII(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitedII
        //Método que gera ações ao parar de passar o mouse por cima do botão de menu
        menuB1.setSize(90, 30);//Diminui o tamanho do botão
        menuB1.setBackground(Color.WHITE);//Muda a cor do botão para branco
    }//GEN-LAST:event_mouseExitedII

    private void sexoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoTActionPerformed

    public static ArrayList getListap(){//Método estático que retorna a lista principal de pessoas
        return listap;
    }
    
    public static ArrayList getListap1(){//Método estático que retorna a lista secundária de pessoas
        return listap1;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaTres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alturaT;
    private javax.swing.JTextField idadeT;
    private javax.swing.JButton inserirP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton menuB1;
    private javax.swing.JTextField nomeT;
    private javax.swing.JTextField pesoT;
    private javax.swing.JTextField sexoT;
    // End of variables declaration//GEN-END:variables
}
