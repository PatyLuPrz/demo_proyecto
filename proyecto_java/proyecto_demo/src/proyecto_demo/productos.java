package proyecto_demo; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
public class productos extends javax.swing.JFrame {
    public static final String PATH = "jdbc:mysql://localhost:3306/demo_proyecto";
    public static final String USUARIO = "root";
    public static final String PASS = "";
    
    PreparedStatement ps;
    ResultSet rs;

 public static Connection getConection() {
        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(PATH, USUARIO, PASS);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    private void limpiarCajas(){
        this.jtf_id.setText(null);
        this.jtf_nombre.setText(null);
        this.jtf_marca.setText(null);
        this.jtf_precio.setText(null);
        this.jtf_existencia.setText(null);
    }
     
    private void anteriorRegistro(){  
        Connection con = null;
        try
        {     
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM productos");
            rs = ps.executeQuery();
            if(rs.isFirst()==true) {   
                rs.previous();            
                this.jtf_id.setText(rs.getString("id"));                         
                this.jtf_nombre.setText(rs.getString("nombre"));             
                this.jtf_marca.setText(rs.getString("marca"));
                this.jtf_precio.setText(rs.getString("precio")); 
                this.jtf_existencia.setText(rs.getString("existencia")); 
            }     
        }
        catch(Exception err) {      
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());       
        } 
    }
    private void primerRegistro(){    
        Connection con = null;
        try
        {             
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM productos");
            rs = ps.executeQuery();
            if(rs.isFirst()==true) {   
                rs.first();            
                this.jtf_id.setText(rs.getString("id"));                         
                this.jtf_nombre.setText(rs.getString("nombre"));             
                this.jtf_marca.setText(rs.getString("marca"));
                this.jtf_precio.setText(rs.getString("precio")); 
                this.jtf_existencia.setText(rs.getString("existencia")); 
            }     
        }
        catch(Exception err) {      
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());       
        } 
    }
    private void ultimoRegistro(){
        Connection con = null;
        try
        {             
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM productos");
            rs = ps.executeQuery();
            if(rs.isLast()==false) {   
                rs.last();            
                this.jtf_id.setText(rs.getString("id"));                         
                this.jtf_nombre.setText(rs.getString("nombre"));             
                this.jtf_marca.setText(rs.getString("marca"));
                this.jtf_precio.setText(rs.getString("precio")); 
                this.jtf_existencia.setText(rs.getString("existencia")); 
            }     
        }
        catch(Exception err) {      
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());       
        } 
    }
    private void siguienteRegistro(){
        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM productos");
            rs = ps.executeQuery();
            if(rs.isLast()==false) {   
                rs.next();            
                this.jtf_id.setText(rs.getString("id"));                         
                this.jtf_nombre.setText(rs.getString("nombre"));             
                this.jtf_marca.setText(rs.getString("marca"));
                this.jtf_precio.setText(rs.getString("precio")); 
                this.jtf_existencia.setText(rs.getString("existencia")); 
            }     
        }
        catch(Exception err) {      
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());       
        } 
    }
    public productos() {
        initComponents();
        getConection();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_precio = new javax.swing.JTextField();
        jtf_existencia = new javax.swing.JTextField();
        jtf_marca = new javax.swing.JTextField();
        jb_search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        anterior = new javax.swing.JButton();
        primero = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        siguiente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jb_save = new javax.swing.JButton();
        jb_update = new javax.swing.JButton();
        jb_delete = new javax.swing.JButton();
        ib_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setText("Existencia");

        jtf_id.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_idActionPerformed(evt);
            }
        });

        jtf_nombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });

        jtf_precio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtf_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_precioActionPerformed(evt);
            }
        });

        jtf_existencia.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtf_existencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_existenciaActionPerformed(evt);
            }
        });

        jtf_marca.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtf_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_marcaActionPerformed(evt);
            }
        });

        jb_search.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jb_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_demo/IconSearch.png"))); // NOI18N
        jb_search.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_search.setSelected(true);
        jb_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_searchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jtf_precio)
                    .addComponent(jtf_existencia)
                    .addComponent(jtf_nombre)
                    .addComponent(jtf_marca))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_existencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        anterior.setText("<");
        anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorMouseClicked(evt);
            }
        });
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        primero.setText("|<");
        primero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primeroMouseClicked(evt);
            }
        });

        ultimo.setText(">|");
        ultimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ultimoMouseClicked(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        siguiente.setText(">");
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(primero)
                .addGap(15, 15, 15)
                .addComponent(anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(siguiente)
                .addGap(18, 18, 18)
                .addComponent(ultimo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anterior)
                            .addComponent(primero)
                            .addComponent(ultimo)
                            .addComponent(siguiente))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jb_save.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jb_save.setText("Guardar");
        jb_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_saveMouseClicked(evt);
            }
        });

        jb_update.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jb_update.setText("Modificar");
        jb_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_updateMouseClicked(evt);
            }
        });
        jb_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_updateActionPerformed(evt);
            }
        });

        jb_delete.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jb_delete.setText("Eliminar");
        jb_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_deleteMouseClicked(evt);
            }
        });

        ib_clear.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        ib_clear.setText("Limpiar");
        ib_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ib_clearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_update, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jb_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ib_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jb_save)
                .addGap(18, 18, 18)
                .addComponent(jb_update)
                .addGap(18, 18, 18)
                .addComponent(jb_delete)
                .addGap(18, 18, 18)
                .addComponent(ib_clear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_idActionPerformed

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void jtf_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_precioActionPerformed

    private void jtf_existenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_existenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_existenciaActionPerformed

    private void jtf_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_marcaActionPerformed

    private void jb_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_updateActionPerformed

    private void jb_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_searchMouseClicked
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM productos WHERE id = ?");
            ps.setString(1, this.jtf_id.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                this.jtf_id.setText(rs.getString("id"));                         
                this.jtf_nombre.setText(rs.getString("nombre"));             
                this.jtf_marca.setText(rs.getString("marca"));
                this.jtf_precio.setText(rs.getString("precio")); 
                this.jtf_existencia.setText(rs.getString("existencia")); 
            } else {
                JOptionPane.showMessageDialog(null, "No existe");
            }
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_jb_searchMouseClicked

    private void jb_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_saveMouseClicked
        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("INSERT INTO productos (id, nombre, marca, precio, existencia) VALUES(?,?,?,?,?) ");
            ps.setString(1, jtf_id.getText());
            ps.setString(2, jtf_nombre.getText());
            ps.setString(3, jtf_marca.getText());
            ps.setString(4, jtf_precio.getText());
            ps.setString(5, jtf_existencia.getText());
            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Producto Guardado");
                limpiarCajas();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar produto");
                 limpiarCajas();
            }
            con.close();
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_jb_saveMouseClicked

    private void jb_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_updateMouseClicked
        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("UPDATE productos SET id=?, nombre=?, marca=?, precio=?, existencia=? WHERE id=?");
            ps.setString(1, jtf_id.getText());
            ps.setString(2, jtf_nombre.getText());
            ps.setString(3, jtf_marca.getText());
            ps.setString(4, jtf_precio.getText());
            ps.setString(5, jtf_existencia.getText());
            ps.setString(6, jtf_id.getText());
            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Producto Modificado");
                limpiarCajas();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar Producto");
                 limpiarCajas();
            }
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_jb_updateMouseClicked

    private void jb_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_deleteMouseClicked
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("DELETE FROM productos WHERE id=?");
            ps.setString(1, this.jtf_id.getText());            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                limpiarCajas();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar producto");
                 limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_jb_deleteMouseClicked

    private void ib_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ib_clearMouseClicked
        limpiarCajas();
    }//GEN-LAST:event_ib_clearMouseClicked

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        siguienteRegistro();
    }//GEN-LAST:event_siguienteMouseClicked

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anteriorActionPerformed

    private void anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorMouseClicked
        anteriorRegistro();
    }//GEN-LAST:event_anteriorMouseClicked

    private void primeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeroMouseClicked
        primerRegistro();
    }//GEN-LAST:event_primeroMouseClicked

    private void ultimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ultimoMouseClicked
        ultimoRegistro();
    }//GEN-LAST:event_ultimoMouseClicked

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
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton ib_clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_delete;
    private javax.swing.JButton jb_save;
    private javax.swing.JButton jb_search;
    private javax.swing.JButton jb_update;
    private javax.swing.JTextField jtf_existencia;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_marca;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_precio;
    private javax.swing.JButton primero;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
