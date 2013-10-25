/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tourpelotransporte;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacimar
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTranspCargas = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListTranspPassageiros = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListVeiculos = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextCategoria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListVeiculosSociedade = new javax.swing.JList();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Um tour pelo Transporte: conheça nossa organização");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(650, 600));
        setMinimumSize(new java.awt.Dimension(600, 650));
        setName("frmPrincipal"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Tour pelo Transporte:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("O transporte é dividido por duas categorias:");

        jLabel3.setText("Transporte de Cargas");

        jLabel4.setText("Transporte de Passageiros");

        jScrollPane1.setViewportView(jListTranspCargas);

        jScrollPane2.setViewportView(jListTranspPassageiros);

        jButton1.setText("Obter Subcategorias sem infêrencia");
        jButton1.setMaximumSize(new java.awt.Dimension(267, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Obter Subcategorias com infêrencia");
        jButton2.setMaximumSize(new java.awt.Dimension(267, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Obter Subcategorias sem infêrencia (com Sparql)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Obter Subcategorias com infêrencia (com Sparql)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("O transporte possui os seguintes veículos:");

        jScrollPane3.setViewportView(jListVeiculos);

        jButton5.setText("Obter todos os veículos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("ou");

        jLabel7.setText("Informe uma categoria ou subcategoria:");

        jButton6.setText("Pesquisar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Regras da Sociedade:");

        jLabel9.setText("João e Márcio são sócios em alguns veículos.");

        jScrollPane4.setViewportView(jListVeiculosSociedade);

        jButton7.setText("Clique aqui e veja quais");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3)
                                            .addComponent(jButton4)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextCategoria)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel6))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String transpCargas = "TransporteDeCargas";
    private static String transpPassageiros = "TransporteDePassageiros";
    private static String individuo = "João";
    private static String file = "file:///C:/Ontologias/OntologiaDoTransporte.owl";
    private static String baseURI="http://www.semanticweb.org/jacimar/ontologies/2013/6/Transporte/OntologiaDoTransporte.owl#";
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            List<String> listaSubclasses1 = obterSubclassesSemInferenciaSparql(transpCargas);
            List<String> listaSubclasses2 = obterSubclassesSemInferenciaSparql(transpPassageiros);
            DefaultListModel lista1 = new DefaultListModel();
            DefaultListModel lista2 = new DefaultListModel();
            Iterator i = listaSubclasses1.iterator();
            Iterator i2 = listaSubclasses2.iterator();
            while(i.hasNext())
            {
                lista1.addElement((Object)i.next());
            }
            while(i2.hasNext())
            {
                lista2.addElement((Object)i2.next());
            }
            //JOptionPane.showMessageDialog(rootPane, "Consulta realizada com sucesso!");
            jListTranspCargas.setModel(lista1);
            jListTranspPassageiros.setModel(lista2);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(rootPane, "Não foi possivel conectar ao web service. Tente Novamente!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {            
            List<String> listaSubclasses1 = obterSubclassesSemInferencia(transpCargas);
            List<String> listaSubclasses2 = obterSubclassesSemInferencia(transpPassageiros);
            DefaultListModel lista1 = new DefaultListModel();
            DefaultListModel lista2 = new DefaultListModel();
            Iterator i = listaSubclasses1.iterator();
            Iterator i2 = listaSubclasses2.iterator();
            while(i.hasNext())
            {
                lista1.addElement((Object)i.next());
            }
            while(i2.hasNext())
            {
                lista2.addElement((Object)i2.next());
            }
            //JOptionPane.showMessageDialog(rootPane, "Consulta realizada com sucesso!");
            jListTranspCargas.setModel(lista1);
            jListTranspPassageiros.setModel(lista2);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(rootPane, "Não foi possivel conectar ao web service. Tente Novamente!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {            
            List<String> listaSubclasses1 = obterSubclassesComInferencia(transpCargas);
            List<String> listaSubclasses2 = obterSubclassesComInferencia(transpPassageiros);
            DefaultListModel lista1 = new DefaultListModel();
            DefaultListModel lista2 = new DefaultListModel();
            Iterator i = listaSubclasses1.iterator();
            Iterator i2 = listaSubclasses2.iterator();
            while(i.hasNext())
            {
                lista1.addElement((Object)i.next());
            }
            while(i2.hasNext())
            {
                lista2.addElement((Object)i2.next());
            }
            //JOptionPane.showMessageDialog(rootPane, "Consulta realizada com sucesso!");
            jListTranspCargas.setModel(lista1);
            jListTranspPassageiros.setModel(lista2);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(rootPane, "Não foi possivel conectar ao web service. Tente Novamente!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            List<String> listaSubclasses1 = obterSubclassesComInferenciaSparql(transpCargas);
            List<String> listaSubclasses2 = obterSubclassesComInferenciaSparql(transpPassageiros);
            DefaultListModel lista1 = new DefaultListModel();
            DefaultListModel lista2 = new DefaultListModel();
            Iterator i = listaSubclasses1.iterator();
            Iterator i2 = listaSubclasses2.iterator();
            while(i.hasNext())
            {
                lista1.addElement((Object)i.next());
            }
            while(i2.hasNext())
            {
                lista2.addElement((Object)i2.next());
            }
            //JOptionPane.showMessageDialog(rootPane, "Consulta realizada com sucesso!");
            jListTranspCargas.setModel(lista1);
            jListTranspPassageiros.setModel(lista2);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(rootPane, "Não foi possivel conectar ao web service. Tente Novamente!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {
            List<String> listaVeiculos = obterIndividuosComInferencia("VeiculosTerrestresAutomotores");            
            DefaultListModel lista = new DefaultListModel();            
            Iterator i = listaVeiculos.iterator();
            while(i.hasNext())
            {
                lista.addElement((Object)i.next());
            }
            //JOptionPane.showMessageDialog(rootPane, "Consulta realizada com sucesso!");
            jListVeiculos.setModel(lista);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(rootPane, "Não foi possivel conectar ao web service. Tente Novamente!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String categoria = jTextCategoria.getText();
        if(categoria.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Informe uma Categoria");
        }
        else
        {
            try
            {
                List<String> listaVeiculos = obterIndividuosComInferencia(categoria);            
                DefaultListModel lista = new DefaultListModel();            
                Iterator i = listaVeiculos.iterator();
                if(listaVeiculos.isEmpty())
                {
                    JOptionPane.showMessageDialog(rootPane, "Informe uma categoria válida");
                }
                else
                {
                    while(i.hasNext())
                    {
                        lista.addElement((Object)i.next());
                    }
                    //JOptionPane.showMessageDialog(rootPane, "Consulta realizada com sucesso!");
                    jListVeiculos.setModel(lista); 
                }                
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(rootPane, "Não foi possivel conectar ao web service. Tente Novamente!");
            }
        }        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try
        {
            List<String> listaVeiculos = obterVeiculosDeMarcio(individuo);            
            DefaultListModel lista = new DefaultListModel();            
            Iterator i = listaVeiculos.iterator();
            while(i.hasNext())
            {
                lista.addElement((Object)i.next());
            }
            //JOptionPane.showMessageDialog(rootPane, "Consulta realizada com sucesso!");
            jListVeiculosSociedade.setModel(lista);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(rootPane, "Não foi possivel conectar ao web service. Tente Novamente!");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListTranspCargas;
    private javax.swing.JList jListTranspPassageiros;
    private javax.swing.JList jListVeiculos;
    private javax.swing.JList jListVeiculosSociedade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextCategoria;
    // End of variables declaration//GEN-END:variables

        

    private static java.util.List<java.lang.String> obterSubclassesComInferenciaSparql(java.lang.String transpSelecionado) 
    {
        ufjf.br.model.Webservicejena_Service service = new ufjf.br.model.Webservicejena_Service();
        ufjf.br.model.Webservicejena port = service.getWebservicejenaPort();
        return port.obterSubclassesComInferenciaSparql(file, baseURI, transpSelecionado);
    }
    
    private static java.util.List<java.lang.String> obterSubclassesSemInferenciaSparql(java.lang.String transpSelecionado) 
    {
        ufjf.br.model.Webservicejena_Service service = new ufjf.br.model.Webservicejena_Service();
        ufjf.br.model.Webservicejena port = service.getWebservicejenaPort();
        return port.obterSubclassesSemInferenciaSparql(file, baseURI, transpSelecionado);
    }
    
    private static java.util.List<java.lang.String> obterSubclassesComInferencia(java.lang.String transpSelecionado) 
    {
        ufjf.br.model.Webservicejena_Service service = new ufjf.br.model.Webservicejena_Service();
        ufjf.br.model.Webservicejena port = service.getWebservicejenaPort();
        return port.obterSubclassesComInferencia(file, baseURI, transpSelecionado);
    }
    
    private static java.util.List<java.lang.String> obterSubclassesSemInferencia(java.lang.String transpSelecionado) 
    {
        ufjf.br.model.Webservicejena_Service service = new ufjf.br.model.Webservicejena_Service();
        ufjf.br.model.Webservicejena port = service.getWebservicejenaPort();
        return port.obterSubclassesSemInferencia(file, baseURI, transpSelecionado);
    }
    
    private static java.util.List<java.lang.String> obterIndividuosComInferencia(java.lang.String transpSelecionado) 
    {
        ufjf.br.model.Webservicejena_Service service = new ufjf.br.model.Webservicejena_Service();
        ufjf.br.model.Webservicejena port = service.getWebservicejenaPort();
        return port.obterIndividuosComInferencia(file, baseURI, transpSelecionado);
    }
    
    private static java.util.List<java.lang.String> obterVeiculosDeMarcio(java.lang.String individuo) 
    {
        ufjf.br.model.Webservicejena_Service service = new ufjf.br.model.Webservicejena_Service();
        ufjf.br.model.Webservicejena port = service.getWebservicejenaPort();
        return port.obterVeiculosDeMarcio(file, baseURI, individuo);
    }
}