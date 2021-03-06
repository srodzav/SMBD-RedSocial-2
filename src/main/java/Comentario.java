// Librerias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Comentario extends javax.swing.JFrame {
    // Variables necesarias para modificar
    String id;
    public Comentario(String usuario) {
        // Inicializa los componentes y muestra la base de datos
        initComponents();
        llenaComboBox();
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
        
    }
    // Codigo generado automáticamente 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        personaCB = new javax.swing.JComboBox<>();
        postCB = new javax.swing.JComboBox<>();
        comentario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comentario");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Persona: ");

        jLabel2.setText("Post:");

        jLabel3.setText("Comentario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personaCB, 0, 226, Short.MAX_VALUE)
                            .addComponent(postCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comentario)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(personaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(postCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de datos"));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton Agregar
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
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
            String persona = personaCB.getSelectedItem().toString();
            String comparte = postCB.getSelectedItem().toString();
            // Genera el dia y la hora
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");  
            LocalDateTime now = LocalDateTime.now();
            // Ejecuta el query
            String cadena =  "INSERT INTO Comentario (id_post, id_persona, comentario, fecha_comentario) " +
                    "VALUES ('" + comparte.split("-")[0] + "','" + persona.split("-")[0] + "','" + comentario.getText() + "','" + dtf.format(now)  + "')";
            stmt.executeUpdate(cadena);
            // Limpia los formularios
            personaCB.setSelectedIndex(0);
            postCB.setSelectedIndex(0);
            comentario.setText("");
            // Cierra la conexión
            stmt.close();
            c.commit();
            c.close();
            muestraDB();
        }
        catch(Exception e)
        {// En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
    }//GEN-LAST:event_agregarActionPerformed

    // Evento para cargar datos a los formularios
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Se guarda la llave primaria
        id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        // Carga los datos de la tabla a los formularios
        for (int i = 0; i < personaCB.getItemCount(); i++) {
            if (personaCB.getItemAt(i).toString().contains(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString())) {
                personaCB.setSelectedIndex(i);
            }
        }
        String post = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString().split("-")[0];
        for (int i = 0; i < postCB.getItemCount(); i++) {
            if (postCB.getItemAt(i).toString().split("-")[0].compareTo(post) == 0) {
                postCB.setSelectedIndex(i);
            }
        }
        comentario.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
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
            stmt.executeUpdate("DELETE FROM Comentario WHERE id_comentario = " + id);
           // Limpia los formularios
            personaCB.setSelectedIndex(0);
            postCB.setSelectedIndex(0);
            comentario.setText("");
            id = null;
            // Cierra la conexión
            stmt.close();
            c.commit();
            c.close();
            muestraDB();
        }
        catch(Exception e)
        {// En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
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
            String persona = personaCB.getSelectedItem().toString();
            String comparte = postCB.getSelectedItem().toString();
            // Ejecuta el query
            String cadena =
                "UPDATE Comentario SET " +
                " comentario='" + comentario.getText() + "' WHERE id_comentario = '" + id + "';";
            stmt.executeUpdate(cadena);
            // Limpia los formularios
            personaCB.setSelectedIndex(0);
            postCB.setSelectedIndex(0);
            comentario.setText("");
            id = null;
            // Cierra la conexión
            stmt.close();
            c.commit();
            c.close();
            muestraDB();

        }
        catch(Exception e)
        {// En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
    }//GEN-LAST:event_modificarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comentario("Administrador").setVisible(true);
            }
        });
    }
    
    public void muestraDB() {
        // Crea la conexion a la base de datos
        Connection c = null;
        Statement stmt = null;
        String datos[] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_comentario");
        modelo.addColumn("Persona");
        modelo.addColumn("Post");
        modelo.addColumn("Comentario");
        modelo.addColumn("fecha_comentario");
        jTable1.setModel(modelo);
        try {
            // Conecta con la base de datos
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/redsocial","postgres","postgres");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_comentario, CONCAT(pe.id_persona, '-' ,pe.nombre) AS Persona, CONCAT(p.id_post, '-', p.descripcion) AS Post, c.comentario AS Comentario, fecha_comentario FROM Comentario as c inner join Post as p on c.id_post = p.id_post inner join Persona as pe on pe.id_persona = c.id_persona");
            while(rs.next())
            {
                datos[0] = rs.getString("id_comentario");
                datos[1] = rs.getString("Persona");
                datos[2] = rs.getString("Post");
                datos[3] = rs.getString("Comentario");
                datos[4] = rs.getString("fecha_comentario");
                modelo.addRow(datos);
            }
            // Cierra la conexión
            stmt.close();
            c.commit();
            c.close();
        }
        catch(Exception e)
        {// En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
    }
    
    public void llenaComboBox(){
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
            ResultSet rs = stmt.executeQuery("SELECT id_persona,nombre FROM Persona");
            ResultSet rsp = stmt.executeQuery("SELECT po.id_post as id_post, pe.nombre as nombre, po.tipo as tipo, po.fecha_post as fecha FROM Post po INNER JOIN Persona pe ON Po.id_persona = Pe.id_persona");
            // Limpia los formularios
            personaCB.addItem("");
            postCB.addItem("");
            // Carga a los combobox la informacion
            while(rs.next())
            {
                personaCB.addItem(rs.getString("id_persona") + "-" + rs.getString("nombre"));
            }
            while(rsp.next())
            {
                postCB.addItem(rsp.getString("id_post") + "-" + rsp.getString("nombre") + "-" + rsp.getString("tipo")+ "-" + rsp.getString("fecha"));
            }
            // Cierra la conexión
            stmt.close();
            c.commit();
            c.close();
        }
        catch(Exception e)
        {// En caso de haber un error, este lo muestra en un mensaje
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e.toString());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField comentario;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox<String> personaCB;
    private javax.swing.JComboBox<String> postCB;
    // End of variables declaration//GEN-END:variables
}
