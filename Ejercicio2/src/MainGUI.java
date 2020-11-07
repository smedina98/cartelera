
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MaingGUI
     */
    public MainGUI() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtTitulo = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        txtComienzo = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        txtSala = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSolucion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFinal = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaOrdenada = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaTiempo = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaIngreso = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        labelTexto = new javax.swing.JLabel();
        btnExaminar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnComprobar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CineCuenca");

        txtTitulo.setEnabled(false);

        txtDirector.setEnabled(false);

        txtComienzo.setEnabled(false);
        txtComienzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComienzoActionPerformed(evt);
            }
        });

        txtDuracion.setEnabled(false);

        txtSala.setEnabled(false);

        jLabel1.setText("Comienzo:");

        jLabel2.setText("Título:");

        jLabel3.setText("Director:");

        jLabel4.setText("Duración:");

        jLabel5.setText("Películas que puede ver:");

        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaSolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Solución", "Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSolucion.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaSolucion);

        tablaFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Comienzo", "Duración", "Finalización", "Sala"
            }
        ));
        tablaFinal.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaFinal);

        tablaOrdenada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posición", "Comienzo", "Duración", "Finalización"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaOrdenada.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaOrdenada);

        tablaTiempo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tiempo", "Posición en Finalización"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTiempo.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaTiempo);
        if (tablaTiempo.getColumnModel().getColumnCount() > 0) {
            tablaTiempo.getColumnModel().getColumn(0).setResizable(false);
            tablaTiempo.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        tablaIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Director", "Duración", "Sala", "Comienzo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaIngreso.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tablaIngreso);

        jLabel6.setText("Sala:");

        labelTexto.setText("Archivo de texto:");

        btnExaminar.setText("Examinar");
        btnExaminar.setEnabled(false);
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Archivo de texto");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Seleccione el método de entrada:");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Entrada manual");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btnComprobar.setText("Comprobar");
        btnComprobar.setEnabled(false);
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(24, 24, 24)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(133, 133, 133)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTitulo)
                                        .addComponent(txtDirector, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(133, 133, 133)
                                            .addComponent(txtComienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(20, 20, 20)
                                            .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(54, 54, 54)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnExaminar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jRadioButton1)
                                    .addGap(21, 21, 21)
                                    .addComponent(jRadioButton2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTexto)
                    .addComponent(btnExaminar))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)))
                            .addComponent(txtComienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComprobar)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtComienzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComienzoActionPerformed

    }//GEN-LAST:event_txtComienzoActionPerformed

    DefaultTableModel modelo1;

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Validacion validar = new Validacion();
        if (!"".equals(txtTitulo.getText())) {
            if (!"".equals(txtDirector.getText())) {
                validar.establecer_cadena(txtDuracion.getText());
                if (validar.verificar_hora()) {
                    validar.establecer_cadena(txtSala.getText());
                    if (validar.verificar_entero_positivo()) {
                        validar.establecer_cadena(txtComienzo.getText());
                        if (validar.verificar_hora()) {
                            modelo1 = (DefaultTableModel) tablaIngreso.getModel();
                            modelo1.addRow(new Object[]{txtTitulo.getText(), txtDirector.getText(), txtDuracion.getText(), txtSala.getText(), txtComienzo.getText()});
                        } else {
                            JOptionPane.showMessageDialog(this, "El formato de hora ingresado no es correcto\n\nEjemplo: 06:00:00", "Error", JOptionPane.ERROR_MESSAGE);
                            txtComienzo.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "El número ingresado no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
                        txtSala.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El formato de hora ingresado no es correcto\n\nEjemplo: 06:00:00", "Error", JOptionPane.ERROR_MESSAGE);
                    txtDuracion.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "El campo Director no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                txtDirector.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "El campo Título no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            txtTitulo.requestFocus();
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            txtTitulo.setEnabled(true);
            txtDuracion.setEnabled(true);
            txtDirector.setEnabled(true);
            txtComienzo.setEnabled(true);
            btnAgregar.setEnabled(true);
            txtSala.setEnabled(true);
            txtTitulo.requestFocus();
            btnExaminar.setEnabled(false);
            btnComprobar.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        JFileChooser jf = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Documentos de texto(*.txt)", "txt");
        jf.setFileFilter(filter);
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            FileReader reader = null;
            try {
                String file = archivo.getAbsolutePath();
                reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader);
                String line = br.readLine();
                StringBuilder sb = new StringBuilder();

                while (line != null) {
                    sb.append(line).append("\n");
                    line = br.readLine();
                }

                String aux = sb.toString();
                //txtSistema.read(br, null);
                //txt_tmp = txtSistema.getText();

                String lineas[] = aux.split("\n");
                Pelicula pelicula = new Pelicula();
                pelicula.inicializarVector(lineas.length);
                DefaultTableModel model = (DefaultTableModel) tablaIngreso.getModel();
                for (int i = 0; i < lineas.length; i++) {
                    String[] contenido = lineas[i].split(";");

                    pelicula.Titulo[i] = contenido[0];
                    pelicula.Director[i] = contenido[1];
                    Tiempo tiempito = new Tiempo();
                    Tiempo tiempito2 = new Tiempo();
                    tiempito.setcadena(contenido[2]);
                    pelicula.Duracion[i] = tiempito;
                    pelicula.Sala[i] = Integer.parseInt(contenido[3]);
                    tiempito2.setcadena(contenido[4]);
                    pelicula.Comienzo[i] = tiempito2;
                    model.addRow(new Object[]{pelicula.Titulo[i], pelicula.Director[i], pelicula.Duracion[i].devolvercadena(), pelicula.Sala[i], pelicula.Comienzo[i].devolvercadena()});
                }
                AlgoritmoVoraz voraz = new AlgoritmoVoraz();
                try {
                    voraz.ordvectores();
                    voraz.cargarterminacion();
                    DefaultTableModel model1 = (DefaultTableModel) tablaTiempo.getModel();
                    for (int i = 0; i < lineas.length; i++) {
                        model1.addRow(new Object[]{pelicula.Terminacion[i].devolvercadena(), i + 1});
                    }
                    DefaultTableModel model2 = (DefaultTableModel) tablaOrdenada.getModel();
                    for (int i = 0; i < lineas.length; i++) {
                        model2.addRow(new Object[]{i + 1, pelicula.Comienzo[i].devolvercadena(), pelicula.Duracion[i].devolvercadena(), pelicula.Terminacion[i].devolvercadena()});
                    }

                    DefaultTableModel model3 = (DefaultTableModel) tablaSolucion.getModel();
                    DefaultTableModel model4 = (DefaultTableModel) tablaFinal.getModel();
                    int solucion[] = voraz.solucionvoraz();
                    for (int i = 0; i < solucion.length; i++) {
                        if (solucion[i] == -1) {
                            model3.addRow(new Object[]{"Falso", ""});
                        } else {
                            model3.addRow(new Object[]{"Verdadero", pelicula.Terminacion[i].devolvercadena()});
                            model4.addRow(new Object[]{pelicula.Titulo[i], pelicula.Comienzo[i].devolvercadena(), pelicula.Duracion[i].devolvercadena(), pelicula.Terminacion[i].devolvercadena(), pelicula.Sala[i]});
                        }

                    }

                } catch (ParseException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                labelTexto.setText(file);
                br.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        if (jRadioButton1.isSelected()) {
            txtTitulo.setEnabled(false);
            txtDuracion.setEnabled(false);
            txtDirector.setEnabled(false);
            txtComienzo.setEnabled(false);
            txtSala.setEnabled(false);
            btnAgregar.setEnabled(false);
            txtTitulo.requestFocus();
            btnExaminar.setEnabled(true);
            btnExaminar.requestFocus();
            btnComprobar.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed
        txtTitulo.setEnabled(false);
        txtDuracion.setEnabled(false);
        txtDirector.setEnabled(false);
        txtComienzo.setEnabled(false);
        txtSala.setEnabled(false);
        btnComprobar.setEnabled(false);
        btnAgregar.setEnabled(false);

        int tam = modelo1.getRowCount();
        Pelicula pelicula = new Pelicula();
        pelicula.inicializarVector(modelo1.getRowCount());

        for (int i = 0; i < tam; i++) {

            pelicula.Titulo[i] = String.valueOf(modelo1.getValueAt(i, 0));
            pelicula.Director[i] = String.valueOf(modelo1.getValueAt(i, 1));
            Tiempo tiempito = new Tiempo();
            Tiempo tiempito2 = new Tiempo();
            tiempito.setcadena(String.valueOf(modelo1.getValueAt(i, 2)));
            pelicula.Duracion[i] = tiempito;
            pelicula.Sala[i] = Integer.parseInt(String.valueOf(modelo1.getValueAt(i, 3)));
            tiempito2.setcadena(String.valueOf(modelo1.getValueAt(i, 4)));
            pelicula.Comienzo[i] = tiempito2;

        }
        AlgoritmoVoraz voraz = new AlgoritmoVoraz();
        try {
            voraz.ordvectores();
            voraz.cargarterminacion();
            DefaultTableModel model1 = (DefaultTableModel) tablaTiempo.getModel();
            for (int i = 0; i < tam; i++) {
                model1.addRow(new Object[]{pelicula.Terminacion[i].devolvercadena(), i + 1});
            }
            DefaultTableModel model2 = (DefaultTableModel) tablaOrdenada.getModel();
            for (int i = 0; i < tam; i++) {
                model2.addRow(new Object[]{i + 1, pelicula.Comienzo[i].devolvercadena(), pelicula.Duracion[i].devolvercadena(), pelicula.Terminacion[i].devolvercadena()});
            }

            DefaultTableModel model3 = (DefaultTableModel) tablaSolucion.getModel();
            DefaultTableModel model4 = (DefaultTableModel) tablaFinal.getModel();
            int solucion[] = voraz.solucionvoraz();
            for (int i = 0; i < solucion.length; i++) {
                if (solucion[i] == -1) {
                    model3.addRow(new Object[]{"Falso", ""});
                } else {
                    model3.addRow(new Object[]{"Verdadero", pelicula.Terminacion[i].devolvercadena()});
                    model4.addRow(new Object[]{pelicula.Titulo[i], pelicula.Comienzo[i].devolvercadena(), pelicula.Duracion[i].devolvercadena(), pelicula.Terminacion[i].devolvercadena(), pelicula.Sala[i]});
                }

            }

        } catch (ParseException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnComprobarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JTable tablaFinal;
    private javax.swing.JTable tablaIngreso;
    private javax.swing.JTable tablaOrdenada;
    private javax.swing.JTable tablaSolucion;
    private javax.swing.JTable tablaTiempo;
    private javax.swing.JTextField txtComienzo;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtSala;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
