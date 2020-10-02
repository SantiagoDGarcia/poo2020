package proyectopoo;
import java.util.ArrayList;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class ProgramaV19 extends javax.swing.JFrame {
    // Variables de todos los objetos
    String nombre;
    int cantidad; 
    double precio;
    // Variables de unicas de cada objeto
    String peso;
    String tipo_material;
    String marca;
    String tipo;
    // Creacion de lista dinamica de objetos.
    public static List <Comestible> listaComes = new ArrayList<Comestible>();   
    public static List <Utensilio> listaUtens = new ArrayList<Utensilio>();
    public static List <Oficina> listaOficina = new ArrayList<Oficina>();
    public static List <Industrial> listaIndus = new ArrayList<Industrial>();
    //  Variables de objetos comprados
    String detalle;
    public static List <Comprado> listaCompras = new ArrayList<Comprado>();
    // Variables 
    int seleccion;
    // Programa 
    public ProgramaV19() {
        initComponents();
        // Al iniciar el programa
        menuObservarBase.setVisible(true);
        menuObservar.setVisible(false);
        menuObservar2.setVisible(false);
        miniMenuCantidadComprar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        menuOpciones = new javax.swing.JPanel();
        bRegistrar = new javax.swing.JButton();
        bVender = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        menuObservar = new javax.swing.JPanel();
        panelRegistar = new javax.swing.JTabbedPane();
        comestibles = new javax.swing.JPanel();
        subNombreC = new javax.swing.JLabel();
        subCantidadC = new javax.swing.JLabel();
        subPrecioC = new javax.swing.JLabel();
        subPesoC = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        txtCantidadC = new javax.swing.JTextField();
        txtPrecioC = new javax.swing.JTextField();
        txtPesoC = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        MostrarListaC = new javax.swing.JList<>();
        guardarC = new javax.swing.JButton();
        listaPeso = new javax.swing.JComboBox<>();
        subtituloC = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        utensilios = new javax.swing.JPanel();
        subNombreU = new javax.swing.JLabel();
        subCantidadU = new javax.swing.JLabel();
        subPrecioU = new javax.swing.JLabel();
        subMaterialU = new javax.swing.JLabel();
        txtNombreU = new javax.swing.JTextField();
        txtCantidadU = new javax.swing.JTextField();
        txtPrecioU = new javax.swing.JTextField();
        txtMaterialU = new javax.swing.JTextField();
        guardarU = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        MostrarListaU = new javax.swing.JList<>();
        icon2 = new javax.swing.JLabel();
        subIngresados1 = new javax.swing.JLabel();
        oficina = new javax.swing.JPanel();
        subNombreO = new javax.swing.JLabel();
        subCantidadO = new javax.swing.JLabel();
        subPrecioO = new javax.swing.JLabel();
        subMarcaO = new javax.swing.JLabel();
        txtNombreO = new javax.swing.JTextField();
        txtCantidadO = new javax.swing.JTextField();
        txtPrecioO = new javax.swing.JTextField();
        txtMarcaO = new javax.swing.JTextField();
        guardarO = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        MostrarListaO = new javax.swing.JList<>();
        icon3 = new javax.swing.JLabel();
        subIngresados2 = new javax.swing.JLabel();
        industrial = new javax.swing.JPanel();
        subNombreI = new javax.swing.JLabel();
        subCantidadI = new javax.swing.JLabel();
        subPrecioI = new javax.swing.JLabel();
        subTipoI = new javax.swing.JLabel();
        txtNombreI = new javax.swing.JTextField();
        txtCantidadI = new javax.swing.JTextField();
        txtPrecioI = new javax.swing.JTextField();
        listaTipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarListaI = new javax.swing.JList<>();
        guardarI = new javax.swing.JButton();
        icon4 = new javax.swing.JLabel();
        subIngresados3 = new javax.swing.JLabel();
        removerProducto = new javax.swing.JPanel();
        menuObservar2 = new javax.swing.JPanel();
        panelVender = new javax.swing.JTabbedPane();
        buscar = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        buscarProducto = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        MostrarTabla = new javax.swing.JTable();
        subtitulob = new javax.swing.JLabel();
        informacion = new javax.swing.JLabel();
        Comprar = new javax.swing.JButton();
        miniMenuCantidadComprar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcantidadcomprar = new javax.swing.JTextField();
        subEncontrado = new javax.swing.JLabel();
        comprar = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        MostrarTablaCompras = new javax.swing.JTable();
        informacioPaga = new javax.swing.JPanel();
        subSubtotal = new javax.swing.JLabel();
        subIva = new javax.swing.JLabel();
        subStotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        txtIva = new javax.swing.JLabel();
        bPagar = new javax.swing.JButton();
        txtprueba = new javax.swing.JLabel();
        menuObservarBase = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        introduccion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        base.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 102, 102));
        titulo.setText("Punto De Venta de Productos");

        menuOpciones.setBackground(new java.awt.Color(255, 255, 255));

        bRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        bRegistrar.setForeground(new java.awt.Color(51, 51, 255));
        bRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrars.png"))); // NOI18N
        bRegistrar.setText(" Registrar ");
        bRegistrar.setActionCommand("");
        bRegistrar.setBorder(null);
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });

        bVender.setBackground(new java.awt.Color(255, 255, 255));
        bVender.setForeground(new java.awt.Color(102, 204, 0));
        bVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venders2.png"))); // NOI18N
        bVender.setText("  Vender");
        bVender.setActionCommand(" Vender");
        bVender.setBorder(null);
        bVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVenderActionPerformed(evt);
            }
        });

        bSalir.setBackground(new java.awt.Color(255, 255, 255));
        bSalir.setForeground(new java.awt.Color(255, 51, 51));
        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirs2.png"))); // NOI18N
        bSalir.setText("    Salir   ");
        bSalir.setBorder(null);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuOpcionesLayout = new javax.swing.GroupLayout(menuOpciones);
        menuOpciones.setLayout(menuOpcionesLayout);
        menuOpcionesLayout.setHorizontalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
            .addComponent(bVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuOpcionesLayout.setVerticalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(bRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(bVender, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuObservar.setBackground(new java.awt.Color(153, 204, 255));

        panelRegistar.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRegistar.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panelRegistar.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        panelRegistar.setToolTipText("");
        panelRegistar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRegistar.setPreferredSize(new java.awt.Dimension(635, 356));

        comestibles.setBackground(new java.awt.Color(255, 255, 255));

        subNombreC.setText("Nombre del Producto:");

        subCantidadC.setText("Cantidad de Unidades:");

        subPrecioC.setText("Precio (Unidad):");

        subPesoC.setText("Peso Neto:");

        jScrollPane3.setViewportView(MostrarListaC);

        guardarC.setText("Guardar");
        guardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCActionPerformed(evt);
            }
        });

        listaPeso.setBackground(new java.awt.Color(255, 255, 255));
        listaPeso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "g", "kg", "ml", "L" }));
        listaPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPesoActionPerformed(evt);
            }
        });

        subtituloC.setText("Lista de Comestibles Ingresados");

        icon1.setText("$");

        javax.swing.GroupLayout comestiblesLayout = new javax.swing.GroupLayout(comestibles);
        comestibles.setLayout(comestiblesLayout);
        comestiblesLayout.setHorizontalGroup(
            comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comestiblesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(subtituloC)
                .addGap(71, 71, 71))
            .addGroup(comestiblesLayout.createSequentialGroup()
                .addGroup(comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comestiblesLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(guardarC))
                    .addGroup(comestiblesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subCantidadC)
                            .addComponent(subPrecioC)
                            .addComponent(subPesoC)
                            .addComponent(subNombreC))
                        .addGap(18, 18, 18)
                        .addGroup(comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(comestiblesLayout.createSequentialGroup()
                                .addGroup(comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPesoC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCantidadC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(txtPrecioC, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGroup(comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(comestiblesLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(icon1))
                                    .addGroup(comestiblesLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(listaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        comestiblesLayout.setVerticalGroup(
            comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comestiblesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(subtituloC)
                .addGap(26, 26, 26)
                .addGroup(comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subNombreC)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subCantidadC)
                    .addComponent(txtCantidadC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subPrecioC)
                    .addComponent(txtPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon1))
                .addGap(32, 32, 32)
                .addGroup(comestiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subPesoC)
                    .addComponent(txtPesoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(guardarC)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comestiblesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        panelRegistar.addTab("Comestibles", comestibles);

        utensilios.setBackground(new java.awt.Color(255, 255, 255));

        subNombreU.setText("Nombre del Producto:");

        subCantidadU.setText("Cantidad de Unidades:");

        subPrecioU.setText("Precio (Unidad):");

        subMaterialU.setText("Tipo de Material:");

        guardarU.setText("Guardar");
        guardarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarUActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(MostrarListaU);

        icon2.setText("$");

        subIngresados1.setText("Lista de Utensilios Ingresados");

        javax.swing.GroupLayout utensiliosLayout = new javax.swing.GroupLayout(utensilios);
        utensilios.setLayout(utensiliosLayout);
        utensiliosLayout.setHorizontalGroup(
            utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utensiliosLayout.createSequentialGroup()
                .addGroup(utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(utensiliosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(subPrecioU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subCantidadU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subNombreU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(subMaterialU))
                        .addGap(18, 18, 18)
                        .addGroup(utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombreU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txtMaterialU)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, utensiliosLayout.createSequentialGroup()
                                .addGroup(utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPrecioU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(txtCantidadU, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(4, 4, 4)
                                .addComponent(icon2))))
                    .addGroup(utensiliosLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(guardarU)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, utensiliosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(subIngresados1)
                .addGap(92, 92, 92))
        );
        utensiliosLayout.setVerticalGroup(
            utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utensiliosLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subNombreU)
                    .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subCantidadU)
                    .addComponent(txtCantidadU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subPrecioU)
                    .addComponent(txtPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon2))
                .addGap(28, 28, 28)
                .addGroup(utensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaterialU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subMaterialU))
                .addGap(40, 40, 40)
                .addComponent(guardarU)
                .addGap(47, 47, 47))
            .addGroup(utensiliosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(subIngresados1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRegistar.addTab("Utensilios", utensilios);

        oficina.setBackground(new java.awt.Color(255, 255, 255));

        subNombreO.setText("Nombre del Producto:");

        subCantidadO.setText("Cantidad de Unidades:");

        subPrecioO.setText("Precio (Unidad):");

        subMarcaO.setText("Marca:");

        guardarO.setText("Guardar");
        guardarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarOActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(MostrarListaO);

        icon3.setText("$");

        subIngresados2.setText("Lista de Productos de Oficina");

        javax.swing.GroupLayout oficinaLayout = new javax.swing.GroupLayout(oficina);
        oficina.setLayout(oficinaLayout);
        oficinaLayout.setHorizontalGroup(
            oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oficinaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subNombreO)
                    .addComponent(subCantidadO)
                    .addComponent(subPrecioO)
                    .addComponent(subMarcaO))
                .addGroup(oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oficinaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(oficinaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarcaO)
                            .addGroup(oficinaLayout.createSequentialGroup()
                                .addComponent(txtPrecioO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(icon3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(oficinaLayout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(guardarO)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oficinaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subIngresados2)
                .addGap(83, 83, 83))
        );
        oficinaLayout.setVerticalGroup(
            oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oficinaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subNombreO)
                    .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subCantidadO)
                    .addComponent(txtCantidadO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subPrecioO)
                    .addComponent(icon3))
                .addGap(28, 28, 28)
                .addGroup(oficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subMarcaO)
                    .addComponent(txtMarcaO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(guardarO)
                .addGap(34, 34, 34))
            .addGroup(oficinaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(subIngresados2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRegistar.addTab("De Oficina", oficina);

        industrial.setBackground(new java.awt.Color(255, 255, 255));

        subNombreI.setText("Nombre del Producto:");

        subCantidadI.setText("Cantidad de Unidades");

        subPrecioI.setText("Precio (Unidad):");

        subTipoI.setText("Tipo de Producto:");

        listaTipo.setBackground(new java.awt.Color(255, 255, 255));
        listaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agricola", "Natural", "Manufacturado", "Equipo", "Suministro" }));

        jScrollPane1.setViewportView(MostrarListaI);

        guardarI.setText("Guardar");
        guardarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarIActionPerformed(evt);
            }
        });

        icon4.setText("$");

        subIngresados3.setText("Lista de Productos Industriales");

        javax.swing.GroupLayout industrialLayout = new javax.swing.GroupLayout(industrial);
        industrial.setLayout(industrialLayout);
        industrialLayout.setHorizontalGroup(
            industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, industrialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subIngresados3)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, industrialLayout.createSequentialGroup()
                .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(industrialLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarI))
                    .addGroup(industrialLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, industrialLayout.createSequentialGroup()
                                .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subCantidadI)
                                    .addComponent(subPrecioI)
                                    .addComponent(subTipoI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listaTipo, 0, 205, Short.MAX_VALUE)
                                    .addGroup(industrialLayout.createSequentialGroup()
                                        .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPrecioI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(txtCantidadI, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(icon4)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, industrialLayout.createSequentialGroup()
                                .addComponent(subNombreI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreI)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        industrialLayout.setVerticalGroup(
            industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(industrialLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(subIngresados3)
                .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(industrialLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subNombreI)
                            .addComponent(txtNombreI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subCantidadI)
                            .addComponent(txtCantidadI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subPrecioI)
                            .addComponent(txtPrecioI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon4))
                        .addGap(25, 25, 25)
                        .addGroup(industrialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subTipoI)
                            .addComponent(listaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(guardarI))
                    .addGroup(industrialLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panelRegistar.addTab("Industriales", industrial);

        removerProducto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout removerProductoLayout = new javax.swing.GroupLayout(removerProducto);
        removerProducto.setLayout(removerProductoLayout);
        removerProductoLayout.setHorizontalGroup(
            removerProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        removerProductoLayout.setVerticalGroup(
            removerProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        panelRegistar.addTab("Remover Producto", removerProducto);

        javax.swing.GroupLayout menuObservarLayout = new javax.swing.GroupLayout(menuObservar);
        menuObservar.setLayout(menuObservarLayout);
        menuObservarLayout.setHorizontalGroup(
            menuObservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        menuObservarLayout.setVerticalGroup(
            menuObservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        menuObservar2.setBackground(new java.awt.Color(153, 204, 255));
        menuObservar2.setPreferredSize(new java.awt.Dimension(647, 392));

        panelVender.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setPreferredSize(new java.awt.Dimension(640, 377));

        buscarProducto.setBackground(new java.awt.Color(255, 255, 255));
        buscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngocean.com.png"))); // NOI18N
        buscarProducto.setText("Buscar");
        buscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProductoActionPerformed(evt);
            }
        });

        MostrarTabla.setAutoCreateRowSorter(true);
        MostrarTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo de Producto", "Nombre", "Detalle", "Cantidad", "Precio "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MostrarTabla.setToolTipText("");
        MostrarTabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        MostrarTabla.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        MostrarTabla.setSelectionBackground(new java.awt.Color(204, 153, 0));
        MostrarTabla.getTableHeader().setReorderingAllowed(false);
        MostrarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarTablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(MostrarTabla);

        subtitulob.setText("Ingrese el Nombre del Producto:");

        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad:");

        javax.swing.GroupLayout miniMenuCantidadComprarLayout = new javax.swing.GroupLayout(miniMenuCantidadComprar);
        miniMenuCantidadComprar.setLayout(miniMenuCantidadComprarLayout);
        miniMenuCantidadComprarLayout.setHorizontalGroup(
            miniMenuCantidadComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMenuCantidadComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcantidadcomprar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        miniMenuCantidadComprarLayout.setVerticalGroup(
            miniMenuCantidadComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMenuCantidadComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(miniMenuCantidadComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcantidadcomprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        subEncontrado.setText("Selecione el producto:");

        javax.swing.GroupLayout buscarLayout = new javax.swing.GroupLayout(buscar);
        buscar.setLayout(buscarLayout);
        buscarLayout.setHorizontalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitulob)
                    .addGroup(buscarLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarProducto))
                    .addGroup(buscarLayout.createSequentialGroup()
                        .addComponent(Comprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(miniMenuCantidadComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(subEncontrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        buscarLayout.setVerticalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(subtitulob)
                .addGap(23, 23, 23)
                .addGroup(buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProducto))
                .addGap(22, 22, 22)
                .addComponent(subEncontrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miniMenuCantidadComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buscarLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        panelVender.addTab("Agregar/Buscar Producto", buscar);

        comprar.setBackground(new java.awt.Color(255, 255, 255));

        MostrarTablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Típo de Producto", "Nombre", "Detalles", "Cantidad", "Precio $"
            }
        ));
        MostrarTablaCompras.setRowHeight(23);
        jScrollPane6.setViewportView(MostrarTablaCompras);

        subSubtotal.setText("Subtotal:");

        subIva.setText("IVA 12%:");

        subStotal.setText(" Total:");

        bPagar.setText("Pagar");
        bPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout informacioPagaLayout = new javax.swing.GroupLayout(informacioPaga);
        informacioPaga.setLayout(informacioPagaLayout);
        informacioPagaLayout.setHorizontalGroup(
            informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacioPagaLayout.createSequentialGroup()
                .addGroup(informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacioPagaLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(bPagar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(informacioPagaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subSubtotal)
                            .addGroup(informacioPagaLayout.createSequentialGroup()
                                .addGroup(informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(subIva)
                                    .addComponent(subStotal))
                                .addGap(2, 2, 2)))
                        .addGroup(informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informacioPagaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(informacioPagaLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        informacioPagaLayout.setVerticalGroup(
            informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacioPagaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subSubtotal)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subIva)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(informacioPagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subStotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(bPagar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout comprarLayout = new javax.swing.GroupLayout(comprar);
        comprar.setLayout(comprarLayout);
        comprarLayout.setHorizontalGroup(
            comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comprarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(informacioPaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comprarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtprueba, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
        );
        comprarLayout.setVerticalGroup(
            comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comprarLayout.createSequentialGroup()
                .addGroup(comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comprarLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(informacioPaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(comprarLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprueba, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelVender.addTab("Total a Pagar", comprar);

        javax.swing.GroupLayout menuObservar2Layout = new javax.swing.GroupLayout(menuObservar2);
        menuObservar2.setLayout(menuObservar2Layout);
        menuObservar2Layout.setHorizontalGroup(
            menuObservar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVender)
        );
        menuObservar2Layout.setVerticalGroup(
            menuObservar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        menuObservarBase.setBackground(new java.awt.Color(255, 255, 255));

        introduccion.setEditable(false);
        introduccion.setColumns(20);
        introduccion.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        introduccion.setRows(5);
        introduccion.setText("El siguiente programa muestra y opera las funciones basicas de un punto de venta, el mismo desea");
        introduccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jScrollPane7.setViewportView(introduccion);

        javax.swing.GroupLayout menuObservarBaseLayout = new javax.swing.GroupLayout(menuObservarBase);
        menuObservarBase.setLayout(menuObservarBaseLayout);
        menuObservarBaseLayout.setHorizontalGroup(
            menuObservarBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuObservarBaseLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuObservarBaseLayout.setVerticalGroup(
            menuObservarBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuObservarBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addComponent(menuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuObservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(baseLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseLayout.createSequentialGroup()
                    .addGap(0, 133, Short.MAX_VALUE)
                    .addComponent(menuObservar2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(baseLayout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addComponent(menuObservarBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuObservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseLayout.createSequentialGroup()
                    .addGap(0, 47, Short.MAX_VALUE)
                    .addComponent(menuObservar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(baseLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(menuObservarBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botones principales
    private void bVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVenderActionPerformed
        menuObservar2.setVisible(true);
        menuObservar.setVisible(false);
        menuObservarBase.setVisible(false);
    }//GEN-LAST:event_bVenderActionPerformed
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed
    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        menuObservar.setVisible(true);
        menuObservar2.setVisible(false);
        menuObservarBase.setVisible(false);
    }//GEN-LAST:event_bRegistrarActionPerformed

    // Se guardan los datos de los registros
    private void guardarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarUActionPerformed
        // Variables objeto Utensilio
        nombre = toUpperCase(txtNombreU.getText());
        cantidad = Integer.parseInt( txtCantidadU.getText());
        precio = Double.parseDouble(txtPrecioU.getText());
        tipo_material = txtMaterialU.getText();
        
        Utensilio utensilio = new Utensilio(nombre,cantidad,precio,tipo_material);
        
        listaUtens.add(utensilio);
        
        limpiarDatos();
        visualizarUtensilio();

    }//GEN-LAST:event_guardarUActionPerformed
    private void guardarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarIActionPerformed
        nombre = toUpperCase(txtNombreI.getText());
        cantidad = Integer.parseInt( txtCantidadI.getText());
        precio = Double.parseDouble(txtPrecioI.getText());
        tipo = String.format(String.valueOf(listaTipo.getSelectedItem()) );

        
        Industrial industrial = new Industrial(nombre, cantidad, precio, tipo);
        
        listaIndus.add(industrial);
        
        limpiarDatos();
        visualizarIndustrial();
        
    }//GEN-LAST:event_guardarIActionPerformed
    private void guardarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarOActionPerformed
        nombre = toUpperCase(txtNombreO.getText());
        cantidad = Integer.parseInt( txtCantidadO.getText());
        precio = Double.parseDouble(txtPrecioO.getText());
        marca = toUpperCase(txtMarcaO.getText());

        Oficina oficina = new Oficina(nombre, cantidad, precio, marca);

        listaOficina.add(oficina);

        limpiarDatos();
        visualizarOficina();

    }//GEN-LAST:event_guardarOActionPerformed

    // Metodo para buscar productos con boton
    private void buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProductoActionPerformed
       
       String buscar_producto = txtBuscar.getText();
       String [][] verTabla = new String [listaComes.size()][5];
       String [][] verTabla2 = new String [listaUtens.size()][5];
       String [][] verTabla3 = new String [listaOficina.size()][5];
       String [][] verTabla4 = new String [listaIndus.size()][5];

       informacion.setText("");
       
       boolean noencontrado1 = false, noencontrado2 = false, 
               noencontrado3 = false, noencontrado4 = false;
       int i = 0;
       int contador = 0;
       
        // Buscar en Comestibles
        for (Comestible busqComestible: listaComes) {
            if (busqComestible.getNombre().contains( toUpperCase( buscar_producto)) ) {
                verTabla[contador][0] = "Comestible";
                verTabla[contador][1] = listaComes.get(i).getNombre();
                verTabla[contador][2] = listaComes.get(i).getPeso_neto();
                verTabla[contador][3] = String.valueOf( listaComes.get(i).getStock());
                verTabla[contador][4] = String.valueOf(listaComes.get(i).getPrecio());

                contador++;

                MostrarTabla.setModel(new javax.swing.table.DefaultTableModel(
                verTabla , new String [] { " Tipo de Producto", "Nombre", "Detalle", 
                    "Cantidad", "Precio "} ));
            } else {
                noencontrado1 = true;
            }

            i++;
        }

        contador = 0;
        i = 0;
        // Buscar en Utensilios
        for (Utensilio busqUtensilio: listaUtens) {
            if (busqUtensilio.getNombre().contains( toUpperCase( buscar_producto)) ) {

                verTabla2[contador][0] = "Utensilio";
                verTabla2[contador][1] = listaUtens.get(i).getNombre();
                verTabla2[contador][2] = listaUtens.get(i).getTipo_material();
                verTabla2[contador][3] = String.valueOf( listaUtens.get(i).getStock());
                verTabla2[contador][4] = String.valueOf(listaUtens.get(i).getPrecio());

                contador++;

                MostrarTabla.setModel(new javax.swing.table.DefaultTableModel(
                verTabla2 , new String [] { " Tipo de Producto", "Nombre", "Detalle", "Cantidad", "Precio "} ));
            } else {
                noencontrado2 = true;
            }
            i++;
        }
        contador = 0;
        i = 0;

        // Buscar en Oficina
        for (Oficina busqOficina: listaOficina) {
            if (busqOficina.getNombre().contains( toUpperCase( buscar_producto)) ) {

                verTabla3[contador][0] = "Oficina";
                verTabla3[contador][1] = listaOficina.get(i).getNombre();
                verTabla3[contador][2] = listaOficina.get(i).getMarca() ;
                verTabla3[contador][3] = String.valueOf( listaOficina.get(i).getStock());
                verTabla3[contador][4] = String.valueOf(listaOficina.get(i).getPrecio());

                contador++;
                MostrarTabla.setModel(new javax.swing.table.DefaultTableModel(
                verTabla3 , new String [] { " Tipo de Producto", "Nombre", "Detalle", "Cantidad", "Precio "} ));
            } else {
                noencontrado3 = true;
            }
            i++;
        }
        contador = 0;
        i = 0;

        // Buscar en Industrial
        for (Industrial busqIndustrial: listaIndus) {
            if (busqIndustrial.getNombre().contains( toUpperCase( buscar_producto)) ) {

                verTabla4[contador][0] = "Oficina";
                verTabla4[contador][1] = listaIndus.get(i).getNombre();
                verTabla4[contador][2] = listaIndus.get(i).getTipo();
                verTabla4[contador][3] = String.valueOf( listaIndus.get(i).getStock());
                verTabla4[contador][4] = String.valueOf(listaIndus.get(i).getPrecio());


                contador++;
                MostrarTabla.setModel(new javax.swing.table.DefaultTableModel(
                verTabla4 , new String [] { " Tipo de Producto", "Nombre", "Detalle", "Cantidad", "Precio "} ));
            } else {
                noencontrado4 = true;
            }
            i++;
        }
        
        if (noencontrado1 == true && noencontrado2 == true && noencontrado3 == true && noencontrado4 == true ) {
            informacion.setText("No existe el producto Ingresado");
        }
    }//GEN-LAST:event_buscarProductoActionPerformed
    // Se guardan los datos de los registros de Comestibles
    private void guardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCActionPerformed
        nombre = toUpperCase(txtNombreC.getText());
        cantidad = Integer.parseInt( txtCantidadC.getText());
        precio = Double.parseDouble(txtPrecioC.getText());
        peso = String.format("%s\t%s", txtPesoC.getText(), 
                String.valueOf(listaPeso.getSelectedItem()) );

        Comestible comestible = new Comestible(nombre, cantidad, precio, peso);

        listaComes.add(comestible);

        limpiarDatos();
        visualizarComestible();
    }//GEN-LAST:event_guardarCActionPerformed
    // Boton final (Pagar)
    private void bPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPagarActionPerformed
        
        double subTotal = 0;
        double iva;
        double precioTotal;
        
        for(Comprado sumarCompra: listaCompras) {
            subTotal = subTotal + (sumarCompra.getPrecio() * sumarCompra.getStock());
        }
        
        iva = subTotal * 0.12;
        precioTotal = subTotal * 1.12;
        
        // Mostrar total a pagar
        txtSubtotal.setText( String.format("%.2f", subTotal) );
        txtIva.setText( String.format("%.2f", iva) );
        txtTotal.setText( String.format("%.2f", precioTotal));
        
    }//GEN-LAST:event_bPagarActionPerformed
    // Seleccion de la tabla
    private void MostrarTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarTablaMouseClicked
        // Extraccion de posicion en la tabla
        miniMenuCantidadComprar.setVisible(true);
        seleccion = MostrarTabla.rowAtPoint(evt.getPoint());   
    }//GEN-LAST:event_MostrarTablaMouseClicked
    // Boton (Comprar)
    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        
        tipo = (String.valueOf(MostrarTabla.getValueAt(seleccion,  0)));
        nombre = (String.valueOf(MostrarTabla.getValueAt(seleccion,  1)));
        detalle = (String.valueOf(MostrarTabla.getValueAt(seleccion,  2)));
        
        String aux = (String.valueOf(MostrarTabla.getValueAt(seleccion, 3)));
        cantidad = Integer.parseInt(aux);
        
        int cantidadIngresada = Integer.parseInt(txtcantidadcomprar.getText());
        
        aux = (String.valueOf(MostrarTabla.getValueAt(seleccion, 4)));
        precio = Double.parseDouble(aux);

        if (cantidadIngresada <= cantidad) {
            Comprado comprado = new Comprado(tipo, nombre, detalle ,
                    cantidadIngresada, precio);

            listaCompras.add(comprado);
            
            
            
            String [][] verTablaCompras = new String [listaCompras.size()][5];

            int contador = 0;

            for (Comprado busqCompras: listaCompras) {
                contador++;
                for (int i = 0; i < contador ; i++) {
                    verTablaCompras[i][0] = listaCompras.get(i).getTipo();
                    verTablaCompras[i][1] = listaCompras.get(i).getNombre();
                    verTablaCompras[i][2] = listaCompras.get(i).getDetalle();
                    verTablaCompras[i][3] = String.valueOf
                                            (listaCompras.get(i).getStock());
                    verTablaCompras[i][4] = String.valueOf
                                            (listaCompras.get(i).getPrecio());
                }
            }
            
            // Solucion visual compra en tabla
            int newCantidad = cantidad - cantidadIngresada; 
            MostrarTabla.setValueAt(newCantidad, seleccion ,3);

            
            // Solucion en Listas de compra en tabla
            int j = 0;
            for (Comestible busqComestible: listaComes) {
                if (busqComestible.getNombre().contains( toUpperCase( nombre)) ) {
                  busqComestible.setStock( listaComes.get(j).getStock()- cantidadIngresada  );
                } j++;
            }
            
            j = 0;
            for (Utensilio busqUtensilio: listaUtens) {
                if (busqUtensilio.getNombre().contains( toUpperCase( nombre)) ) {
                  busqUtensilio.setStock( listaUtens.get(j).getStock()- cantidadIngresada  );
                } j++;
            }
            j = 0;
            for (Oficina busqOficina: listaOficina) {
            if (busqOficina.getNombre().contains( toUpperCase( nombre)) ) {
                  busqOficina.setStock( listaOficina.get(j).getStock()- cantidadIngresada  );
                } j++;
            }
            j = 0;
            for (Industrial busqIndustrial: listaIndus) {
                if (busqIndustrial.getNombre().contains( toUpperCase( nombre)) ) {
                  busqIndustrial.setStock( listaIndus.get(j).getStock()- cantidadIngresada  );
                } j++;
            }
            
            informacion.setText("");
            
            MostrarTablaCompras.setModel(new javax.swing.table.DefaultTableModel(
                     verTablaCompras , new String [] { "Tipo de Producto", 
                         "Nombre", "Detalle", "Cantidad", "Precio "} ));
            informacion.setText("Agregado al Carrito");          
        }
        else{
            informacion.setText("No existe stock del producto");
        }    
    }//GEN-LAST:event_ComprarActionPerformed

    private void listaPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPesoActionPerformed

    // Metodos observar en listas REGISTRO
    public void visualizarUtensilio(){
        // recorrer
        String [] verUtensilio = new String [listaUtens.size()];
        int contador = 0;
        
        for (Utensilio objUtensilio: listaUtens) {
            verUtensilio[contador] = String.format("%s %s", objUtensilio.getNombre(),objUtensilio.getTipo_material() );
            contador++;         
        }
        
        MostrarListaU.setListData(verUtensilio);
    }
    public void visualizarComestible(){
        // recorrer
        String [] verComestible = new String [listaComes.size()];
        int contador = 0;
        
        for (Comestible objComestible: listaComes) {
            verComestible[contador] = String.format("%s  %s", 
                    objComestible.getNombre(), objComestible.getPeso_neto());
            contador++;         
        }
        
        MostrarListaC.setListData(verComestible);
    }
    public void visualizarOficina(){
        // recorrer
        String [] verOficina = new String [listaOficina.size()];
        int contador = 0;
        
        for (Oficina objOficina: listaOficina) {
            verOficina[contador] = String.format("%s %s", objOficina.getNombre(), objOficina.getMarca());
            contador++;         
        }
        
        MostrarListaO.setListData(verOficina);
    }
    public void visualizarIndustrial(){
        // recorrer
        String [] verIndustrial = new String [listaIndus.size()];
        int contador = 0;
        
        for (Industrial objIndustrial: listaIndus) {
            verIndustrial[contador] = String.format("%s %s", objIndustrial.getNombre(), objIndustrial.getTipo() );
            contador++;         
        }
        
        MostrarListaI.setListData(verIndustrial);
    }
    // Metodo para limpiar variables
    public void limpiarDatos(){
        // Comestibles
        txtNombreC.setText(""); 
        txtCantidadC.setText("");
        txtPrecioC.setText("");      
        txtPesoC.setText("");
        // Utensilios
        txtNombreU.setText(""); 
        txtCantidadU.setText("");
        txtPrecioU.setText("");      
        txtMaterialU.setText("");
        // De Oficina
        txtNombreO.setText(""); 
        txtCantidadO.setText("");
        txtPrecioO.setText("");      
        txtMarcaO.setText("");
        // Industrial
        txtNombreI.setText(""); 
        txtCantidadI.setText("");
        txtPrecioI.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaV19().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    private javax.swing.JList<String> MostrarListaC;
    private javax.swing.JList<String> MostrarListaI;
    private javax.swing.JList<String> MostrarListaO;
    private javax.swing.JList<String> MostrarListaU;
    private javax.swing.JTable MostrarTabla;
    private javax.swing.JTable MostrarTablaCompras;
    private javax.swing.JButton bPagar;
    private javax.swing.JButton bRegistrar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVender;
    private javax.swing.JPanel base;
    private javax.swing.JPanel buscar;
    private javax.swing.JButton buscarProducto;
    private javax.swing.JPanel comestibles;
    private javax.swing.JPanel comprar;
    private javax.swing.JButton guardarC;
    private javax.swing.JButton guardarI;
    private javax.swing.JButton guardarO;
    private javax.swing.JButton guardarU;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JPanel industrial;
    private javax.swing.JPanel informacioPaga;
    private javax.swing.JLabel informacion;
    private javax.swing.JTextArea introduccion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JComboBox<String> listaPeso;
    private javax.swing.JComboBox<String> listaTipo;
    private javax.swing.JPanel menuObservar;
    private javax.swing.JPanel menuObservar2;
    private javax.swing.JPanel menuObservarBase;
    private javax.swing.JPanel menuOpciones;
    private javax.swing.JPanel miniMenuCantidadComprar;
    private javax.swing.JPanel oficina;
    private javax.swing.JTabbedPane panelRegistar;
    private javax.swing.JTabbedPane panelVender;
    private javax.swing.JPanel removerProducto;
    private javax.swing.JLabel subCantidadC;
    private javax.swing.JLabel subCantidadI;
    private javax.swing.JLabel subCantidadO;
    private javax.swing.JLabel subCantidadU;
    private javax.swing.JLabel subEncontrado;
    private javax.swing.JLabel subIngresados1;
    private javax.swing.JLabel subIngresados2;
    private javax.swing.JLabel subIngresados3;
    private javax.swing.JLabel subIva;
    private javax.swing.JLabel subMarcaO;
    private javax.swing.JLabel subMaterialU;
    private javax.swing.JLabel subNombreC;
    private javax.swing.JLabel subNombreI;
    private javax.swing.JLabel subNombreO;
    private javax.swing.JLabel subNombreU;
    private javax.swing.JLabel subPesoC;
    private javax.swing.JLabel subPrecioC;
    private javax.swing.JLabel subPrecioI;
    private javax.swing.JLabel subPrecioO;
    private javax.swing.JLabel subPrecioU;
    private javax.swing.JLabel subStotal;
    private javax.swing.JLabel subSubtotal;
    private javax.swing.JLabel subTipoI;
    private javax.swing.JLabel subtituloC;
    private javax.swing.JLabel subtitulob;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidadC;
    private javax.swing.JTextField txtCantidadI;
    private javax.swing.JTextField txtCantidadO;
    private javax.swing.JTextField txtCantidadU;
    private javax.swing.JLabel txtIva;
    private javax.swing.JTextField txtMarcaO;
    private javax.swing.JTextField txtMaterialU;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreI;
    private javax.swing.JTextField txtNombreO;
    private javax.swing.JTextField txtNombreU;
    private javax.swing.JTextField txtPesoC;
    private javax.swing.JTextField txtPrecioC;
    private javax.swing.JTextField txtPrecioI;
    private javax.swing.JTextField txtPrecioO;
    private javax.swing.JTextField txtPrecioU;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextField txtcantidadcomprar;
    private javax.swing.JLabel txtprueba;
    private javax.swing.JPanel utensilios;
    // End of variables declaration//GEN-END:variables
}

