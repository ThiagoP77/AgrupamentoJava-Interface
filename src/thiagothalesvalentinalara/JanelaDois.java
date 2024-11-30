package thiagothalesvalentinalara;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;
import java.lang.Math;

//Grupo: Thiago, Lara, Valentina e Thales

public class JanelaDois extends javax.swing.JFrame {
    private static ArrayList listap = JanelaTres.getListap();//Objeto que recebe a lista principal de pessoas
    private static ArrayList listap1 = JanelaTres.getListap1();//Objeto que recebe a lista secundária de pessoas
    ArrayList listac = new ArrayList();//Objeto da classe lista que recebe os centróides
    ArrayList listag = new ArrayList();//Objeto da classe lista que recebe os não-centróides e centróides já com grupos definidos
    Random aleatorio = new Random();//Objeto da classe Random para gerar centróides aleatórios
    float menordistancia = 0;//Variável para recer a menor distância euclidiana
    float distancia;//Variável para distância euclidiana
    String conteudo;//Variável contendo o que será mostrado na caixa de texto
    int w;//Variável de controle do While
    
    public JanelaDois() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        menuDois = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        saidaT = new javax.swing.JTextArea();
        numeroGT = new javax.swing.JTextField();
        agrupT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(614, 380));
        setMinimumSize(new java.awt.Dimension(614, 380));
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Informe quantos grupos serão criados:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 90, 270, 30);

        menuDois.setBackground(new java.awt.Color(255, 255, 255));
        menuDois.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        menuDois.setForeground(new java.awt.Color(0, 0, 0));
        menuDois.setText("Menu");
        menuDois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredII(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedII(evt);
            }
        });
        menuDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDoisActionPerformed(evt);
            }
        });
        getContentPane().add(menuDois);
        menuDois.setBounds(290, 304, 90, 30);

        saidaT.setEditable(false);
        saidaT.setBackground(new java.awt.Color(255, 255, 255));
        saidaT.setColumns(20);
        saidaT.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        saidaT.setForeground(new java.awt.Color(0, 0, 0));
        saidaT.setRows(5);
        saidaT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(saidaT);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 130, 370, 170);

        numeroGT.setBackground(new java.awt.Color(255, 255, 255));
        numeroGT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numeroGT.setForeground(new java.awt.Color(0, 0, 0));
        numeroGT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(numeroGT);
        numeroGT.setBounds(270, 94, 71, 22);

        agrupT.setBackground(new java.awt.Color(255, 255, 255));
        agrupT.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        agrupT.setForeground(new java.awt.Color(0, 0, 0));
        agrupT.setText("Agrupar");
        agrupT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JanelaDois.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JanelaDois.this.mouseExited(evt);
            }
        });
        agrupT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrupTActionPerformed(evt);
            }
        });
        getContentPane().add(agrupT);
        agrupT.setBounds(10, 304, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thiagothalesvalentinalara/5.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 603, 340);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDoisActionPerformed
        //Método que gera as ações ao clicar no botão de menu
        saidaT.setText("");//Deixa o campo de resultados vazio
        numeroGT.setText("");//Deixa o campo do número de grupos vazio
        new JanelaUm().setVisible(true);//Deixa a janela de menu visível
        this.dispose();//Fecha a janela de agrupar pessoas
    }//GEN-LAST:event_menuDoisActionPerformed

    private void agrupTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrupTActionPerformed
        //Método que gera ações ao clicar no botão de agrupar
        String kks = numeroGT.getText();//Variável que recebe o que estava na caixa de texto
        if(kks.matches("-?\\d+")){//Verifica se o conteúdo digitado é um número inteiro
            int kk = Integer.parseInt(kks);//Recebe o valor digitado convertido em inteiro
            if (kk<1||kk>Pessoa.getTotalPessoas()){//Ocorre caso o número seja menor que um ou maior que o total de pessoas
                JOptionPane.showMessageDialog(null,"ERRO:\nNúmero de grupos inválido.");//Informa ao usuário que o valor digitado é inválido
                numeroGT.setText("");//Deixa o campo do número de grupos vazio
                saidaT.setText("");//Deixa o campo de resultados vazio
                numeroGT.requestFocus();//Cursor vai automaticamente para o campo de inserir número de grupos
            } else if (kk<Pessoa.getTotalPessoas() && kk>0){
                listap1.clear();//Limpa a "listap1" para reincluir todas as pessoas
                listac.clear();//Limpa a "listac" para incluir apenas os novos centróides
                    
                for (int l = 0; l < listap.size(); l ++){//A lista secundária recebe todos os objetos da "listap"
                    listap1.add(listap.get(l));//Adiciona um objeto de "listap" à "listap1"
                }
                    
                int k = kk;//Váriavel "k" recebe "kk"
                    
                for (int f = 0; f<k; f++){//Código para escolha de centróides e não-centróides
                    int fk = listap1.size();//Código que garante que o número aleatório não seja maior que o tamanho da lista
                    int cn = aleatorio.nextInt(fk);//Variável "cn" recebe um número aleatório
                    Pessoa c1;//Cria um objeto Pessoa
                    c1 = (Pessoa)listap1.get(cn);//c1 recebe o objeto da "listap1" correspondente a "cn"
                    listap1.remove(cn);//Remove "cn" da lista de não-centróides
                    c1.setTipo("Líder");//Define o atributo de hieraquia no grupo dos centróides como "Líder"
                    listac.add(c1);//Adiciona "cn" à lista de centróides
                }
                    
                for (int h = 0; h<listap1.size(); h++){//Define o atributo de hieraquia no grupo dos restantes como "Membro"
                    Pessoa ph = (Pessoa)listap1.get(h);
                    ph.setTipo("Membro");
                }
                    
                for (int f2 = 0; f2<listap1.size(); f2++){//Código para verificar distância euclidiana de cada não-centróide
                    for(int f3 =0; f3<listac.size();f3++){//Código que compara cada não-centróide com cada centróide
                        Pessoa p2 = (Pessoa) listap1.get(f2);//p2 recebe o objeto pessoa correspondente à localização f2 na lista 
                        Pessoa c2 = (Pessoa) listac.get(f3);//c2 recebe o objeto pessoa correspondente à localização f3 na lista 
                        c2.setGrupo(f3+1);//Determina o grupo dos centróides
                        int deltaSexo = p2.getSexoI() - c2.getSexoI();//Calcula o deltaSexo entre centróide e não-centróide
                        int deltaIdade = p2.getIdade() - c2.getIdade();//Calcula o deltaIdade entre centróide e não-centróide
                        float deltaPeso = p2.getPeso() - c2.getPeso();//Calcula o deltaPeso entre centróide e não-centróide
                        float deltaAltura = p2.getAltura() - c2.getAltura();//Calcula o deltaAltura entre centróide e não-centróide
                        float deltaGeral = (deltaSexo*deltaSexo) + (deltaIdade*deltaIdade) + (deltaPeso*deltaPeso) + (deltaAltura*deltaAltura);//Calcula o deltaGeral entre centróide e não-centróide
                        float distancia = (float) Math.sqrt(deltaGeral);//Calcula a raíz quadrada do deltaGeral (distância euclidiana)
                            
                        if (f3 == 0){//Código que ocorre na primeira repetição
                            p2.setGrupo(1);//Determina o grupo do não-centróide como 1
                            menordistancia = distancia;//Determina a menor distância euclidiana como a primeira
                                
                        } else if (f3 != 0 && distancia<menordistancia) {//Código que ocorre a partir da segunda repetição e quando a distância for menor
                            menordistancia = distancia;//"menordistancia" recebe a distancia atual
                            p2.setGrupo(f3+1);//Grupo da pessoa muda para a da atual repetição
                        }
                            
                        if (f3+1==listac.size()){//Adiciona o não-centróide à "listag" na última repetição do for interno
                            listag.add(p2);
                        }
                            
                        if (f2+1==listap1.size()){//Adiciona o centróide à "listag" na última repetição do for externo
                            listag.add(c2);
                        }
                        }
                    }
                
                for (int g = 1; g <= k; g++){//Código para mostrar os resultados
                    if(g==1){//Caso seja a primeira repetição do for, conteudo recebe só o título de grupo 1
                        conteudo = "===== Grupo 1 =====";
                    } else {//Nas demais repetições, junta o que ja está na variável e o número do grupo
                        conteudo = conteudo + "\n"+ "\n" + "\n" + "===== Grupo "+(g)+" =====";
                    }   
                    
                    for (int g1 = 0; g1 < listag.size(); g1++){//Código para mostrar os dados de cada componente do grupo
                        Pessoa pp = (Pessoa) listag.get(g1);//Instancia objeto da classe Pessoa
                        if (pp.getGrupo()==g){//Adiciona o dado somente de quem pertence ao grupo
                            conteudo = conteudo + "\n" + "\n"+"("+pp.getTipo()+") "+pp.getNome()+ " [Sexo = "+pp.getSexoI()+"] [Idade = "+pp.getIdade()+"] [IMC = "+pp.calculaIMC()+"] "+pp.classificaIMC();//Adiciona linha de dados sobre a pessoa em questão à variável conteudo
                        } else {//Não ocorre nada caso a pessoa não seja do grupo
                            
                        }
                        
                    }    
                }
                
                saidaT.setText(conteudo);//Campo de texto irá mostrar o que está na variável conteudo
                numeroGT.setText("");//Deixa o campo do número de grupos vazio
                numeroGT.requestFocus();//Cursor vai automaticamente para o campo de inserir número de grupos
                conteudo = "";//Limpa a variável conteudo
                listag.clear();//Limpa a "listag" para futuros agrupamentos
                
            } else if (kk == Pessoa.getTotalPessoas()) {//Caso o número digitado seja igual ao de pessoas inseridas
                listap1.clear();//Limpa a lista de não-centróides
                listac.clear();//Limpa a lista de centróides
                    
                for (int l = 0; l < listap.size(); l++){//A lista secundária recebe todos os objetos da "listap"
                    listap1.add(listap.get(l));//Adiciona um objeto de "listap" à "listap1"
                }
                
                for (int f7 = 0; f7<listap1.size(); f7++){//Código para mostrar os resultados
                    Pessoa pf2 = (Pessoa) listap1.get(f7);//"pf2" recebe o objeto Pessoa de "listap1" correspondente ao f7
                    pf2.setGrupo(f7+1);//Determina o grupo de "pf2"
                    pf2.setTipo("Líder");//Define o atributo de hieraquia no grupo como "Líder"
                    if(f7==0){//Caso seja a primeira repetição do for, conteudo recebe só o número do grupo
                        conteudo = "====== Grupo "+pf2.getGrupo()+" ======";
                    } else {//Nas demais repetições, junta o que ja está na variável e o número do grupo
                        conteudo = conteudo + "====== Grupo "+pf2.getGrupo()+" ======";
                    }
                    
                    conteudo = conteudo + "\n" + "\n" + "("+pf2.getTipo()+") "+pf2.getNome()+ " [Sexo = "+pf2.getSexoI()+"] [Idade = "+pf2.getIdade()+"] [IMC = "+pf2.calculaIMC()+"] "+pf2.classificaIMC();//Adiciona linha de dados sobre a pessoa em questão à variável conteudo
                    conteudo = conteudo + "\n" + "\n" + "\n";//Pula espaço no texto do conteudo
                }
                
                saidaT.setText(conteudo);//Campo de texto irá mostrar o que está na variável conteudo
                numeroGT.setText("");//Deixa o campo do número de grupos vazio
                numeroGT.requestFocus();//Cursor vai automaticamente para o campo de inserir número de grupos
                conteudo = "";//Limpa a variável conteudo
                listag.clear();//Limpa a "listag" para futuros agrupamentos
            }  
            
        } else {//Ocorre caso seja digitado algo que não seja número inteiro
            JOptionPane.showMessageDialog(null,"ERRO:\nNúmero de grupos inválido.");//Informa ao usuário que o valor digitado é inválido
            numeroGT.setText("");//Deixa o campo do número de grupos vazio
            saidaT.setText("");//Deixa o campo de resultados vazio
            numeroGT.requestFocus();//Cursor vai automaticamente para o campo de inserir número de grupos
        }
        
    }//GEN-LAST:event_agrupTActionPerformed

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        //Método que gera ações ao passar o mouse sobre o botão de agrupar
        agrupT.setSize(100, 32);//Aumenta o tamanho do botão
        agrupT.setBackground(Color.DARK_GRAY);//Muda a cor do botão para cinza escuro
    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
        //Método que gera ações ao parar de passar o mouse sobre o botão de agrupar
        agrupT.setSize(90, 30);//Diminui o tamanho do botão
        agrupT.setBackground(Color.WHITE);//Muda a cor do botão para branco
    }//GEN-LAST:event_mouseExited

    private void mouseEnteredII(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnteredII
        //Método que gera ações ao passar o mouse sobre o botão de menu
        menuDois.setSize(100, 32);//Aumenta o tamanho do botão
        menuDois.setBackground(Color.DARK_GRAY);//Muda a cor do botão para cinza escuro
    }//GEN-LAST:event_mouseEnteredII

    private void mouseExitedII(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitedII
        //Método que gera ações ao parar de passar o mouse sobre o botão de menu
        menuDois.setSize(90, 30);//Diminui o tamanho do botão
        menuDois.setBackground(Color.WHITE);//Muda a cor do botão para branco
    }//GEN-LAST:event_mouseExitedII

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaDois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaDois().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agrupT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton menuDois;
    private javax.swing.JTextField numeroGT;
    private javax.swing.JTextArea saidaT;
    // End of variables declaration//GEN-END:variables
}
