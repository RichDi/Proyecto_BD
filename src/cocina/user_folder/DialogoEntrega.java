/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocina.user_folder;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author drdr_
 */
public class DialogoEntrega extends javax.swing.JFrame {

    /**
     * Creates new form DialogoEntrega
     */
    
    DefaultListModel Lista = new DefaultListModel(); 
    DefaultListModel ListaK = new DefaultListModel(); 
    DefaultListModel ListaI = new DefaultListModel(); 
    ArrayList<String> lista_nombre = new ArrayList<>();
    ArrayList<String> lista_kilos = new ArrayList<>();
    ArrayList<String> lista_ids = new ArrayList<>();
        
    public DialogoEntrega() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("pro_bd?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        insumos_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT i FROM Insumos_1 i");
        insumos_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : insumos_1Query.getResultList();
        jPanel1 = new javax.swing.JPanel();
        tf_titulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        spinner_kilos = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txt_selins = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        txt_idins = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tf_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tf_titulo.setText("Nueva Entrega");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentacion/VEntana Agregar/botoncancelar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentacion/VEntana Agregar/botonagregar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Kilos");

        jList1.setModel(Lista       );
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Detalles");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentacion/VEntana Agregar/botonagregar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        txt_selins.setText("Insumo Seleccionado");

        jList2.setModel(ListaI);
        jScrollPane3.setViewportView(jList2);

        jLabel5.setText("ID");

        txt_idins.setText("...");

        jList3.setModel(ListaK);
        jScrollPane4.setViewportView(jList3);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, insumos_1List, jTable2);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idInsumo}"));
        columnBinding.setColumnName("Id Insumo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${categoria}"));
        columnBinding.setColumnName("Categoria");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spinner_kilos)
                                            .addComponent(txt_selins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_idins, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addComponent(jButton3))
                                    .addComponent(jLabel1)))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_idins))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_selins))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spinner_kilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        getMax();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String a = txt_selins.getText();
        int value = (int) spinner_kilos.getValue();
        String id = txt_idins.getText();
        
        lista_nombre.add(a);
        lista_kilos.add(String.valueOf(value));
        lista_ids.add(id);

        Lista.addElement(a);
        ListaK.addElement(value);
        ListaI.addElement(id);
        
                              
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int fila = jTable2.getSelectedRow();
        int id = (int) jTable2.getValueAt(fila, 0);
        String nombre = (String) jTable2.getValueAt(fila, 1);
        
        txt_idins.setText(String.valueOf(id));
        txt_selins.setText(nombre);       
                
        
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(DialogoEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogoEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private java.util.List<cocina.user_folder.Insumos_1> insumos_1List;
    private javax.persistence.Query insumos_1Query;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JSpinner spinner_kilos;
    private javax.swing.JLabel tf_titulo;
    private javax.swing.JLabel txt_idins;
    private javax.swing.JLabel txt_selins;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
           
    private void getMax() {   
        
        String sql_e = "insert into entregas values()";        
        connect_and_catch(sql_e,"Agregada Entrega"); 
        
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://localhost/pro_bd?user=root&password=qonmqa3p";
            Connection con = (Connection) DriverManager.getConnection(cadena);            
            PreparedStatement stmt = null;            
            
            ResultSet table;           
            String sql = "select max(id_entrega) from entregas";                    
            stmt = con.prepareStatement(sql);            
            table = stmt.executeQuery();  
            
            while(table.next()){
                String max = table.getString(1);
                grabar(max);
                sumarinsumo();
            }
                                    
        }catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null,e1);
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null,e2);
        }catch(Exception e3){
            JOptionPane.showMessageDialog(null,e3);
        }           
    }
    
    private void sumarinsumo(){               
        
        for(int x=0;x<lista_kilos.size();x++){
            
            String valor_actual = null;
            
            try{            
                String ids = (String) lista_ids.get(x); 
                String kilos = (String) lista_kilos.get(x);
                
                Class.forName("com.mysql.jdbc.Driver");
                String cadena = "jdbc:mysql://localhost/pro_bd?user=root&password=qonmqa3p";
                Connection con = (Connection) DriverManager.getConnection(cadena);            
                PreparedStatement stmt = null;            

                ResultSet table;           
                String sql = "select cantidad from insumos where id_insumo = "
                        + ids;                    
                stmt = con.prepareStatement(sql);            
                table = stmt.executeQuery();  

                while(table.next()){
                    valor_actual = table.getString(1);
                }
                
                int valor_nuevo = Integer.valueOf(kilos) + Integer.valueOf(valor_actual);
                
                String update = "update insumos set cantidad = " + valor_nuevo + " where id_insumo = "
                        + ids;
                connect_and_catch(update, "Update al insumo");
                                    
            }catch(ClassNotFoundException e1){
                JOptionPane.showMessageDialog(null,e1);
            }catch(SQLException e2){
                JOptionPane.showMessageDialog(null,e2);
            }catch(Exception e3){
                JOptionPane.showMessageDialog(null,e3);
            }         
        }                  
    }
    
    private void grabar(String max) {        
                        
        for(int x=0;x<lista_ids.size();x++){         
            String ids = (String) lista_ids.get(x);            
            
            System.out.println(ids);
                
            String sql = "insert into entrega_elements(id_entrega,id_insumo) values("
                + max + ","                 
                + ids + ");";
        
            System.out.println(sql);
        
            connect_and_catch(sql,"Entrega Registrada"); 
        }       
        
    }
    
    private void connect_and_catch(String sql,String mensaje) {        
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://localhost/pro_bd?user=root&password=qonmqa3p";
            Connection con = (Connection) DriverManager.getConnection(cadena);            
            PreparedStatement stmt = null;            
            stmt=con.prepareStatement(sql);
            int sw=stmt.executeUpdate();            
            if(sw!=0){
                JOptionPane.showMessageDialog(null,mensaje);
                this.dispose();
            }                        
        }catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null,e1);
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null,e2);
        }catch(Exception e3){
            JOptionPane.showMessageDialog(null,e3);
        }    
    }

}

