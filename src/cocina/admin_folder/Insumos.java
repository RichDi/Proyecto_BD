package cocina.admin_folder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Insumos extends javax.swing.JFrame {
    public Insumos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        insumostxt = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        grabar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cantidades = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idcategoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(204, 0, 204)));

        jLabel1.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id_insumos");

        jLabel2.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        insumostxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insumostxtActionPerformed(evt);
            }
        });

        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentacion/nuevo.png"))); // NOI18N
        jButton1.setText("Nuevo\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        grabar.setBackground(new java.awt.Color(204, 0, 204));
        grabar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentacion/grabar.png"))); // NOI18N
        grabar.setText("Grabar\n");
        grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentacion/modificar.png"))); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 0, 204));
        jButton4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentacion/consultar.png"))); // NOI18N
        jButton4.setText("Consultar\n");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentacion/salir.png"))); // NOI18N
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");

        cantidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Categoría");

        idcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidades, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insumostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton4)
                        .addGap(102, 102, 102)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(insumostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombres))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantidades))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idcategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(grabar)
                    .addComponent(jButton3))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(28, 28, 28))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insumostxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insumostxtActionPerformed
         String nulo="";
          if(insumostxt.getText().equals(nulo)){
              JOptionPane.showMessageDialog(null,"*** El id_insumos es requerido ***");
          }else  {
              nombres.requestFocusInWindow();
          }
    }//GEN-LAST:event_insumostxtActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        String nulo="";
          if(nombres.getText().equals(nulo)){
              JOptionPane.showMessageDialog(null,"*** El Nombre es requerido ***");
          }else  {
              cantidades.requestFocusInWindow();
          }
    }//GEN-LAST:event_nombresActionPerformed

    private void cantidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadesActionPerformed
        String nulo="";
          if(cantidades.getText().equals(nulo)){
              JOptionPane.showMessageDialog(null,"*** La Cantidad es requerida ***");
          }else  {
              idcategoria.requestFocusInWindow();
          }
    }//GEN-LAST:event_cantidadesActionPerformed

    private void idcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcategoriaActionPerformed
         String nulo="";
          if(idcategoria.getText().equals(nulo)){
              JOptionPane.showMessageDialog(null,"*** El id_categoria es requerido ***");
          }else  {
              grabar.requestFocusInWindow();
          }
    }//GEN-LAST:event_idcategoriaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       nuevo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed
       grabar();
    }//GEN-LAST:event_grabarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       modificar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       consultar();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void modificar(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
         String cadena="jdbc:mysql://localhost/pro_bd?user=root&password=qonmqa3p";
         Connection con;
         PreparedStatement stmt;
         con= DriverManager.getConnection(cadena);
         
           String id_insumos=insumostxt.getText();
           String nombre = nombres.getText();
           String cantidad= cantidades.getText();
           String categoria= idcategoria.getText();
           
           String sql="update insumos set ";
           sql += "id_insumo= "+"\"" + id_insumos + "\",";
          sql += "nombre= "+"\"" + nombre + "\",";
           sql += "cantidad= "+"\"" + cantidad + "\",";
           sql += "categoria= "+"\"" + categoria + "\" " + " where id_insumo= " + id_insumos + " ; ";
           
           //JOptionPane.showMessageDialog(null, sql);
           stmt=con.prepareStatement(sql);
           int sw= stmt.executeUpdate();
           if(sw!=0){
               JOptionPane.showMessageDialog(null, "Registro Modificado");
               nuevo();
           }
         }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, e);
     }
     catch(SQLException e1){
         JOptionPane.showMessageDialog(null, e1);
     }
     catch(Exception e2){
         JOptionPane.showMessageDialog(null, e2);
     }
    }
    //--------------------------------------------------------------------------------------
    
    public void nuevo(){
        insumostxt.setText(""); 
        nombres.setText(""); 
        cantidades.setText("");
        idcategoria.setText("");
        insumostxt.requestFocusInWindow();
    }
    //--------------------------------------------------------------------------------------
    
     public void grabar(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            String cadena =  "jdbc:mysql://localhost/pro_bd?user=root&password=qonmqa3p";
            Connection con = DriverManager.getConnection(cadena);
            PreparedStatement stmt = null;
            String id_insumos = insumostxt.getText();
            String nombre = nombres.getText();
            String cantidad = cantidades.getText();
            String categoria = idcategoria.getText();
            String sql="insert into insumos values(";
            sql += id_insumos + ",\"" +nombre+"\",";
            sql += cantidad + ",\"" + categoria + "\")";
            
            //JOptionPane.showMessageDialog(null,sql);
            stmt = con.prepareStatement(sql);
            int sw = stmt.executeUpdate();
            if(sw!=0){JOptionPane.showMessageDialog(null, "Registrado con exito");
            nuevo();}
            
            
        }  catch(ClassNotFoundException e1){

            JOptionPane.showMessageDialog(null, e1);
        }
        catch(SQLException e2){
        
            JOptionPane.showMessageDialog(null, e2);
        }
        catch(Exception e3){}
    }
     //--------------------------------------------------------------------------------------
     
     public void consultar(){
       int swh=0;
        try{
             Class.forName("com.mysql.jdbc.Driver");
            String cadena =  "jdbc:mysql://localhost/pro_bd?user=root&password=qonmqa3p";
            Connection con ;//hace coneccion
            PreparedStatement stmt;//traduce la cadea para pasarla a la base de datos
            ResultSet tabla;
           con = DriverManager.getConnection(cadena);
           String id_insumos=insumostxt.getText(); //getText (tomar texto) toma el texto del cuadro de texto y se deposita en la cadena
           
          String sql=  "select * from insumos where id_insumo= ";
          sql += id_insumos;
          
           //JOptionPane.showMessageDialog(null, sql);
           stmt=con.prepareStatement(sql);
           
           tabla=stmt.executeQuery();
           
           while(tabla.next()){
               swh=1;
               //mientras tabla tenga un siguiente valor, que vuelva hacer el ciclo
               nombres.setText(tabla.getString(2));
               cantidades.setText(tabla.getString(3));
               idcategoria.setText(tabla.getString(4));           
           }
           
         }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, e);
         //null para todo objeto que no tenga valor
     }
     catch(SQLException e1){
         JOptionPane.showMessageDialog(null, e1);
     }
     catch(Exception e2){
         JOptionPane.showMessageDialog(null, e2);
     }   
        if(swh==0){
             JOptionPane.showMessageDialog(null, " ***NO EXISTE EL REGISTRO***");
        }
    }
    //--------------------------------------------------------------------------------------
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insumos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidades;
    private javax.swing.JButton grabar;
    private javax.swing.JTextField idcategoria;
    private javax.swing.JTextField insumostxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombres;
    // End of variables declaration//GEN-END:variables
}
