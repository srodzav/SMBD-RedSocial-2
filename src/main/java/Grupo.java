// Librerias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Grupo extends javax.swing.JFrame {
    // Variables necesarias para modificar
    String _filename = null;
    String id = null;
    String nombre = null;
    String descripcion = null;
    
    public Grupo(String usuario) {
        // Inicializa los componentes y muestra la base de datos
        initComponents();
        muestraDB();
    }
    // Codigo generado automáticamente 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grupo");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Nombre del grupo");

        jLabel2.setText("Creador");

        jLabel3.setText("Imagen del grupo:");

        jLabel4.setText("Descripción");

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Bases de Datos"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Boton Agregar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Crea la conexion a la base de datos
        Connection c = null;
        Statement stmt = null;        
        try {
            // Conecta con la base de datos
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/redsocial","postgres","postgres");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            // Guarda los datos a insertar
            String nombre = jTextField1.getText();
            String creador = jComboBox1.getSelectedItem().toString();
            String descripcion = jTextField2.getText();
            // Genera el dia y la hora
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
            LocalDateTime now = LocalDateTime.now();          
            // Ejecuta el query
            stmt.executeUpdate("INSERT INTO grupo (id_creador,nombre,descripcion,imagen,fecha_creacion) "
                    + " VALUES ('" + creador.split(" - ")[0] + "','" + nombre + "','" + descripcion + "','" + _filename + "','" + dtf.format(now) + "')");
            // Limpia los formularios
            jTextField1.setText("");
            jTextField2.setText("");
            jComboBox1.setSelectedIndex(0);
            _filename = null;
            // Cierra la conexión
            stmt.close();
            c.commit();
            c.close();
            muestraDB();
        }
        catch(Exception e)
        {
            // En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    // Boton para abrir un recurso
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showSaveDialog(null);
        // Se abre una ventana de seleccion de recurso y se guarda el nombre
        String path=chooser.getSelectedFile().getAbsolutePath();
        String filename=chooser.getSelectedFile().getName();
        _filename = filename;
    }//GEN-LAST:event_jButton1ActionPerformed

    // Cargar los datos a los combobox
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // Crea la conexion a la base de datos
        Connection c = null;
        Statement stmt = null;
        try {
            // Conecta con la base de datos
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/redsocial","postgres","postgres");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            // Genera el query para eliminar los datos
            ResultSet rs = stmt.executeQuery("SELECT id_persona,nombre,nombre_red_social FROM Persona");
            // Limpia los formularios
            jComboBox1.addItem("");
            while(rs.next())
            {
                // Carga a los combobox la informacion
                jComboBox1.addItem(rs.getString("id_persona") +  " - " + rs.getString("nombre_red_social"));
            }
            // Cierra la conexión
            stmt.close();
            c.commit();
            c.close();
        }
        catch(Exception e)
        {
            // En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    // Boton Modificar
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Crea la conexion a la base de datos
        Connection c = null;
        Statement stmt = null;
        try {
            // Conecta con la base de datos
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/redsocial","postgres","postgres");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            // Guarda las variables
            String nombre = jTextField1.getText();
            String creador = jComboBox1.getSelectedItem().toString();
            String descripcion = jTextField2.getText();
            // Genera el query para modificar los datos
            String cadena = "UPDATE Grupo SET id_creador="+creador.split("-")[0]+", nombre='"+nombre+"', descripcion='"+descripcion+"', imagen='"+_filename+"' " +
                "WHERE id_grupo = "+id;
            stmt.executeUpdate(cadena);
            // Limpia los formularios
            jTextField1.setText("");
            jTextField2.setText("");
            jComboBox1.setSelectedIndex(0);
            _filename = null;
            // Cierra la conexión
            stmt.close();
            c.commit();
            c.close();
            muestraDB();
        }
        catch(Exception e)
        {
            // En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // Evento para cargar datos a los formularios
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Se guarda la llave primaria
        id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        nombre = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        // Carga los datos de la tabla a los formularios
        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            if (jComboBox1.getItemAt(i).toString().contains(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString())) {
                jComboBox1.setSelectedIndex(i);
            }
        }
        _filename = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        descripcion = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        
        jTextField1.setText(nombre);
        jTextField2.setText(descripcion);
    }//GEN-LAST:event_jTable1MouseClicked

    // Boton Eliminar
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Crea la conexion a la base de datos
        Connection c = null;
        Statement stmt = null;
        try {
            // Conecta con la base de datos
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/redsocial","postgres","postgres");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            // Genera el query para eliminar los datos
            stmt.executeUpdate("DELETE FROM Grupo WHERE id_grupo = " + id);
           // Limpia los formularios
            jTextField1.setText("");
            jTextField2.setText("");
            jComboBox1.setSelectedIndex(0);
            _filename = null;
            // Cierra la conexión
            stmt.close();
            c.commit();
            c.close();
            muestraDB();
        }
        catch(Exception e)
        {
            // En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grupo("Administrador").setVisible(true);
            }
        });
    }
       
    // Mostrar la Base de Datos
     public void muestraDB() {
         // Crea la conexion a la base de datos
        Connection c = null;
        Statement stmt = null;
        String datos[] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        // Genera las columnas
        modelo.addColumn("id_grupo");
        modelo.addColumn("creador");
        modelo.addColumn("nombre");
        modelo.addColumn("descripcion");
        modelo.addColumn("imagen");
        modelo.addColumn("fecha_creacion");
        jTable1.setModel(modelo);
        try {
            // Conecta con la base de datos
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/redsocial","postgres","postgres");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            // Se ejecuta el query para mostrar los datos
            ResultSet rs = stmt.executeQuery("SELECT A.id_grupo, CONCAT(P.id_persona, ' - ' ,P.nombre_red_social) as amigo,A.nombre, A.imagen, A.descripcion, A.fecha_creacion " +
                 " FROM Grupo A "+
                " INNER JOIN Persona AS P " +
                " ON A.id_creador = P.id_persona; ");
            while(rs.next())
            {
                // Carga los datos a la tabla
                datos[0] = rs.getString("id_grupo");
                datos[1] = rs.getString("amigo");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("imagen");
                datos[4] = rs.getString("descripcion");
                datos[5] = rs.getString("fecha_creacion");
                modelo.addRow(datos);
            }
            // Cierra la conexion
            stmt.close();
            c.commit();
            c.close();
        }
        catch(Exception e)
        {
            // En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
