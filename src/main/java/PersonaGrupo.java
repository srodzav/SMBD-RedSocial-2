// Librerias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PersonaGrupo extends javax.swing.JFrame {
    // Variables necesarias para modificar
    String id=null;
    public PersonaGrupo(String usuario) {
        // Inicializa los componentes y muestra la base de datos
        initComponents();
        llenaComboBox();
        llenaComboBox2();
        muestraDB();
        if (usuario.compareTo("Usuario") == 0) {
            bloquearBotonesUsuario();
        }else if(usuario.compareTo("Moderador") == 0){
            bloquearBotonesModerador();
        }
    }

    private void bloquearBotonesModerador(){
    }
    
    private void bloquearBotonesUsuario(){
        jButton2.setEnabled(false);
    }
    // Codigo generado automáticamente 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Administrador:");

        jLabel2.setText("Grupo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, 113, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de Datos"));

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
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton Agregar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            String persona = jComboBox1.getSelectedItem().toString();
            String grupo = jComboBox2.getSelectedItem().toString();
            // Genera el dia y la hora
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
            LocalDateTime now = LocalDateTime.now();
            // Ejecuta el query
            String cadena = "INSERT INTO PersonaGrupo (id_persona, id_grupo) " +
                    "VALUES (" + persona.split("-")[0] + " , " + grupo.split("-")[0] + ")";
            
            stmt.executeUpdate(cadena);
           // Limpia los formularios
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
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
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Evento para cargar datos a los formularios
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Se guarda la llave primaria
        id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        jComboBox1.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jComboBox2.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        // Carga los datos de la tabla a los formularios
        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            if (jComboBox1.getItemAt(i).toString().contains(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString())) {
                jComboBox1.setSelectedIndex(i);
            }
            if (jComboBox2.getItemAt(i).toString().contains(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString())) {
                jComboBox2.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // Boton Modificar
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
            // Guarda las variables
            String persona = jComboBox1.getSelectedItem().toString();
            String grupo = jComboBox2.getSelectedItem().toString();
            // Genera el query para modificar los datos
            String cadena = 
                "UPDATE PersonaGrupo SET id_persona=" + persona.split("-")[0] + ", id_grupo=" + grupo.split("-")[0] + " WHERE id_persona = " + id.split("-")[0];
            stmt.executeUpdate(cadena);
            // Limpia los formularios
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            id = null;
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
    
    // Boton Eliminar
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
            // Genera el query para eliminar los datos
            stmt.executeUpdate("DELETE FROM PersonaGrupo WHERE id_persona = " + id.split("-")[0]);
           // Limpia los formularios
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            id = null;
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaGrupo("Administrador").setVisible(true);
            }
        });
    }
    
    // Mostrar la Base de Datos
    private void muestraDB() {
        // Crea la conexion a la base de datos
        Connection c = null;
        Statement stmt = null;
        String datos[] = new String[7];
        DefaultTableModel modelo = new DefaultTableModel();
        // Genera las columnas
        modelo.addColumn("persona");
        modelo.addColumn("grupo");
        jTable1.setModel(modelo);
        try {
            // Conecta con la base de datos
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/redsocial","postgres","postgres");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            // Se ejecuta el query para mostrar los datos
            String cadena =  "SELECT CONCAT(P.id_persona, '-' ,P.nombre_red_social) as Persona,CONCAT(G.id_grupo, '-' ,G.nombre) as Grupo FROM PersonaGrupo A INNER JOIN Persona AS P ON A.id_persona = P.id_persona INNER JOIN Grupo AS G ON A.id_grupo = G.id_grupo;";      
            ResultSet rs = stmt.executeQuery(cadena);
            while(rs.next())
            {
                // Carga los datos a la tabla
                datos[0] = rs.getString("persona");
                datos[1] = rs.getString("grupo");
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

    private void llenaComboBox()
    {
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
            // Carga a los combobox la informacion
            while(rs.next())
            {
                jComboBox1.addItem(rs.getString("id_persona") + "-" + rs.getString("nombre_red_social"));
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
    }
    
    private void llenaComboBox2()
    {
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
            ResultSet rs = stmt.executeQuery("SELECT id_grupo,nombre FROM Grupo");
            // Limpia los formularios
            jComboBox2.addItem("");
            // Carga a los combobox la informacion
            while(rs.next())
            {
                jComboBox2.addItem(rs.getString("id_grupo") + "-" + rs.getString("nombre"));
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
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
