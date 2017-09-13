package treinandodatabase;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Felipe
 */
public class CadastroLivros extends javax.swing.JFrame {
TreinandoDataBase db = new TreinandoDataBase("jdbc:mysql://localhost:3306/livros","felipe","felipe15");
    /**
     * Creates new form CadastroLivros
     */
    public CadastroLivros() {
        initComponents();
        apgPainel.setVisible(false);
        EstantePainel.setVisible(false);
        AdcPainel.setVisible(false);
        localPainel.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdcPainel = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        anoLabel = new javax.swing.JLabel();
        autorLabel = new javax.swing.JLabel();
        adicionarBtn = new javax.swing.JButton();
        tituloTxt = new javax.swing.JTextField();
        autorTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diaTxt = new javax.swing.JTextField();
        mesTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        anoTxt = new javax.swing.JTextField();
        EstantePainel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPainel = new javax.swing.JTextPane();
        localPainel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tituloBsc = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        buscaRolagem = new javax.swing.JScrollPane();
        buscaTxt = new javax.swing.JTextArea();
        apgPainel = new javax.swing.JPanel();
        tituloDlt = new javax.swing.JTextField();
        autorDlt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apagaBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        livrosAT = new javax.swing.JTextArea();
        MenuBar = new javax.swing.JMenuBar();
        adcMenu = new javax.swing.JMenu();
        livroMenu = new javax.swing.JMenu();
        rmvMenu = new javax.swing.JMenu();
        lclMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 520, 510));
        setMaximumSize(new java.awt.Dimension(520, 510));
        setMinimumSize(new java.awt.Dimension(520, 510));
        setPreferredSize(new java.awt.Dimension(520, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(520, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloLabel.setText("Titulo :");

        anoLabel.setText("Ano da Publicação :");

        autorLabel.setText("Autor :");

        adicionarBtn.setText("Adicionar");
        adicionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("/");

        jLabel5.setText("/");

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdcPainelLayout = new javax.swing.GroupLayout(AdcPainel);
        AdcPainel.setLayout(AdcPainelLayout);
        AdcPainelLayout.setHorizontalGroup(
            AdcPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdcPainelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(AdcPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdcPainelLayout.createSequentialGroup()
                        .addComponent(anoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdcPainelLayout.createSequentialGroup()
                        .addGroup(AdcPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AdcPainelLayout.createSequentialGroup()
                                .addComponent(tituloLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tituloTxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AdcPainelLayout.createSequentialGroup()
                                .addComponent(autorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AdcPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(autorTxt)
                                    .addGroup(AdcPainelLayout.createSequentialGroup()
                                        .addGap(0, 53, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(39, 39, 39)
                                        .addComponent(adicionarBtn)
                                        .addGap(68, 68, 68)))))
                        .addGap(52, 52, 52))))
        );
        AdcPainelLayout.setVerticalGroup(
            AdcPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdcPainelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(AdcPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLabel)
                    .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(AdcPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anoLabel)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(diaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(AdcPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorLabel)
                    .addComponent(autorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(AdcPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarBtn)
                    .addComponent(jButton1))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(AdcPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 440, 290));

        jScrollPane1.setViewportView(textPainel);

        javax.swing.GroupLayout EstantePainelLayout = new javax.swing.GroupLayout(EstantePainel);
        EstantePainel.setLayout(EstantePainelLayout);
        EstantePainelLayout.setHorizontalGroup(
            EstantePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstantePainelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        EstantePainelLayout.setVerticalGroup(
            EstantePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstantePainelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        getContentPane().add(EstantePainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 7, 550, 440));

        localPainel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Titulo :");
        localPainel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));
        localPainel.add(tituloBsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 156, -1));

        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        localPainel.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        buscaTxt.setColumns(20);
        buscaTxt.setRows(5);
        buscaRolagem.setViewportView(buscaTxt);

        localPainel.add(buscaRolagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 390, 400));

        getContentPane().add(localPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 460, 420));

        jLabel1.setText("Titulo :");

        jLabel2.setText(" Autor :");

        apagaBtn.setText("Apagar");
        apagaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagaBtnActionPerformed(evt);
            }
        });

        livrosAT.setColumns(20);
        livrosAT.setRows(5);
        jScrollPane2.setViewportView(livrosAT);

        javax.swing.GroupLayout apgPainelLayout = new javax.swing.GroupLayout(apgPainel);
        apgPainel.setLayout(apgPainelLayout);
        apgPainelLayout.setHorizontalGroup(
            apgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(apgPainelLayout.createSequentialGroup()
                .addGroup(apgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(apgPainelLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(apagaBtn))
                    .addGroup(apgPainelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(apgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(apgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tituloDlt)
                            .addComponent(autorDlt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(apgPainelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        apgPainelLayout.setVerticalGroup(
            apgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(apgPainelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(apgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloDlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(apgPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorDlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addComponent(apagaBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(apgPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 410));

        adcMenu.setText("Adicionar");
        adcMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adcMenuMouseClicked(evt);
            }
        });
        MenuBar.add(adcMenu);

        livroMenu.setText("Livros");
        livroMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                livroMenuMouseClicked(evt);
            }
        });
        MenuBar.add(livroMenu);

        rmvMenu.setText("Remover");
        rmvMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rmvMenuMouseClicked(evt);
            }
        });
        MenuBar.add(rmvMenu);

        lclMenu.setText("Localizar");
        lclMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lclMenuMouseClicked(evt);
            }
        });
        MenuBar.add(lclMenu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBtnActionPerformed
        String titulo = tituloTxt.getText();
        String dia = diaTxt.getText();
        String mes = mesTxt.getText();
        String ano = anoTxt.getText();
        
        String data = ano + "-" + mes + "-" + dia;
        String autor = autorTxt.getText();
        
        db.fazUpdate("livros","livro","insert into livro"+"(titulo, lancado, autor)"
                   +"values"
                   +"('"+ titulo +"','"+ data +"','"+ autor +"')");
        
        tituloTxt.setText("");
        diaTxt.setText("");
        mesTxt.setText("");
        anoTxt.setText("");
        autorTxt.setText("");
    }//GEN-LAST:event_adicionarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void livroMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_livroMenuMouseClicked
        EstantePainel.setVisible(true);
        AdcPainel.setVisible(false);
        apgPainel.setVisible(false);
        localPainel.setVisible(false);
        String livro = "";
        ResultSet rs = db.fazQuery("livros", "livro", "select * from livro order by titulo");
    try {
        while(rs.next()){
           livro +="              Titulo:"+ rs.getString("titulo") +
                   "\n              Data:" + rs.getDate("lancado")+
                   "\n              Autor:" + rs.getString("autor") + "\n\n";
        }
    } catch (SQLException ex) {
        Logger.getLogger(CadastroLivros.class.getName()).log(Level.SEVERE, null, ex);
    }
    textPainel.setText(livro);
    }//GEN-LAST:event_livroMenuMouseClicked

    private void adcMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adcMenuMouseClicked
        apgPainel.setVisible(false);
        EstantePainel.setVisible(false);
        AdcPainel.setVisible(true);
        localPainel.setVisible(false);
    }//GEN-LAST:event_adcMenuMouseClicked

    private void rmvMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmvMenuMouseClicked
        apgPainel.setVisible(true);
        EstantePainel.setVisible(false);
        AdcPainel.setVisible(false);
        localPainel.setVisible(false);
        ResultSet rs = db.fazQuery("livros", "livro","select * from livro order by autor");
        String livro = "";
    try {
        while(rs.next()){
            livro += "Titulo: "+ rs.getString("titulo") +"\nAutor: " + rs.getString("autor") + "\n\n";
        }
    } catch (SQLException ex) {
        Logger.getLogger(CadastroLivros.class.getName()).log(Level.SEVERE, null, ex);
    }
       livrosAT.setText(livro);
    }//GEN-LAST:event_rmvMenuMouseClicked

    private void apagaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagaBtnActionPerformed
        String autor = autorDlt.getText();
        String titulo = tituloDlt.getText();
        db.fazUpdate("livros","livro", "delete from livro where " +"titulo = '"+titulo +"'and autor = '"+autor+"'" );
    }//GEN-LAST:event_apagaBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        buscaTxt.setVisible(true);
        buscaRolagem.setVisible(true);
        buscarBtn.setVisible(false);
        tituloBsc.setVisible(false);
        jLabel3.setVisible(false);
        String titulo = tituloBsc.getText(); 
        String mensagem = "";
        ResultSet rs = db.fazQuery("livros", "livro","select * from livro order by titulo");
    try {
        while(rs.next()){
           if(rs.getString("titulo").indexOf(titulo) >= 0){
               mensagem += "Titulo: "+rs.getString("titulo")+"\nAutor: "+rs.getString("autor")+"\nLançado em "+rs.getDate("lancado") + "\n\n";
           } 
        }
    } catch (SQLException ex) {
        Logger.getLogger(CadastroLivros.class.getName()).log(Level.SEVERE, null, ex);
    }
    if(mensagem.contains(titulo))
        buscaTxt.setText(mensagem);
    else
        buscaTxt.setText("Titulo não encontrado");
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void lclMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lclMenuMouseClicked
        buscaTxt.setVisible(false);
        buscaRolagem.setVisible(false);
        apgPainel.setVisible(false);
        EstantePainel.setVisible(false);
        AdcPainel.setVisible(false);
        localPainel.setVisible(true);
        tituloBsc.setVisible(true);
        jLabel3.setVisible(true);
        tituloBsc.setText("");
    }//GEN-LAST:event_lclMenuMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdcPainel;
    private javax.swing.JPanel EstantePainel;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu adcMenu;
    private javax.swing.JButton adicionarBtn;
    private javax.swing.JLabel anoLabel;
    private javax.swing.JTextField anoTxt;
    private javax.swing.JButton apagaBtn;
    private javax.swing.JPanel apgPainel;
    private javax.swing.JTextField autorDlt;
    private javax.swing.JLabel autorLabel;
    private javax.swing.JTextField autorTxt;
    private javax.swing.JScrollPane buscaRolagem;
    private javax.swing.JTextArea buscaTxt;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField diaTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu lclMenu;
    private javax.swing.JMenu livroMenu;
    private javax.swing.JTextArea livrosAT;
    private javax.swing.JPanel localPainel;
    private javax.swing.JTextField mesTxt;
    private javax.swing.JMenu rmvMenu;
    private javax.swing.JTextPane textPainel;
    private javax.swing.JTextField tituloBsc;
    private javax.swing.JTextField tituloDlt;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField tituloTxt;
    // End of variables declaration//GEN-END:variables
}
