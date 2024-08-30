
package vista;

import java.awt.Color; // libreria para color
import java.sql.ResultSetMetaData;
import java.util.Date; // libreria para obtener fecha
import java.text.SimpleDateFormat; // libreria para obtener fecha
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import conexion.ConexionBD;
import java.sql.Connection;
import java.util.Set;
import poo.RegistrosHoteles;
import java.sql.PreparedStatement;
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import javax.swing.*;


public class Empleado extends javax.swing.JFrame {
    ConexionBD conBD = new ConexionBD();
    RegistrosHoteles hotelR = new RegistrosHoteles();
    private DefaultTableModel modeloDatos;

    
    public Empleado() {
        initComponents();
        
        // Obtención y formateo de la fecha actual
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formato.format(fechaActual);
        
        // agrego la fecha a mi lblFecha
        lblFecha.setText(fechaFormateada);
        
        // Configurar la tabla con un DefaultTableModel editable
        modeloDatos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return true; // Permitir la edición de todas las celdas
            }
        };  
        
        
        // Configurar las columnas de la tabla (esto puede variar según tu configuración)
        modeloDatos.addColumn("Habitacion");
        modeloDatos.addColumn("Nombre");
        modeloDatos.addColumn("Telefono");
        modeloDatos.addColumn("Noches");
        modeloDatos.addColumn("Fecha");
        JtConsultaRegistrosCD.setModel(modeloDatos);
        JtConsultaRegistrosAca.setModel(modeloDatos);
        JtConsultaRegistrosLpz.setModel(modeloDatos);
        JtConsultaRegistrosQuin.setModel(modeloDatos);
        
        // Añadir el listener para el botón de actualizar CDMX
        btnActualizarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCDActionPerformed(evt);
            }
        });
        // Añadir el listener para el botón de actualizar Acapulco
        btnActualizarAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCDActionPerformed(evt);
            }
        });
        // Añadir el listener para el botón de actualizar La Paz
        btnActualizarLpz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCDActionPerformed(evt);
            }
        });
        // Añadir el listener para el botón de actualizar Quintana Roo
        btnActualizarQuin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCDActionPerformed(evt);
            }
        });
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panLogoMontage = new javax.swing.JPanel();
        panBarraTop = new javax.swing.JPanel();
        lblLogoMontageTopLeft = new javax.swing.JLabel();
        panMenuLeft = new javax.swing.JPanel();
        panBtnInicio = new javax.swing.JPanel();
        lblBtnInicio = new javax.swing.JLabel();
        panBtnCDMX = new javax.swing.JPanel();
        lblBtnCDMX = new javax.swing.JLabel();
        panBtnAcapulco = new javax.swing.JPanel();
        lblBtnAcapulco = new javax.swing.JLabel();
        panBtnLaPaz = new javax.swing.JPanel();
        lblBtnLaPaz = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        panBtnQuintana = new javax.swing.JPanel();
        lblBtnQuintana = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        panBtnEventos = new javax.swing.JPanel();
        lblBtnEventos = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        panBarraTop2 = new javax.swing.JPanel();
        panSalirLogin = new javax.swing.JPanel();
        lblBtnSalirLogin = new javax.swing.JLabel();
        panContenedorTJ = new javax.swing.JPanel();
        tpManejoHoteles = new javax.swing.JTabbedPane();
        panJTInicio = new javax.swing.JPanel();
        panTJInicio2 = new javax.swing.JPanel();
        panJTInicioTop = new javax.swing.JPanel();
        panJTInicioTopCenter = new javax.swing.JPanel();
        lblJTinicio = new javax.swing.JLabel();
        panJTInicioTop3 = new javax.swing.JPanel();
        panJTInicioTopCenter3 = new javax.swing.JPanel();
        lblJTinicio3 = new javax.swing.JLabel();
        panJTInicioTop5 = new javax.swing.JPanel();
        panJTInicioTopCenter5 = new javax.swing.JPanel();
        lblJTinicio5 = new javax.swing.JLabel();
        lblJTinicio6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        panJTCDMX = new javax.swing.JPanel();
        panJTICDMXMedio = new javax.swing.JPanel();
        panJTCDMXTopMedio = new javax.swing.JPanel();
        lblRegistros = new javax.swing.JLabel();
        lblRealizarReservacion = new javax.swing.JLabel();
        panJTICDMXTop1 = new javax.swing.JPanel();
        lblImagenHotelCDMX = new javax.swing.JLabel();
        panJTICDMXTop = new javax.swing.JPanel();
        panJTCDMXTopCenter = new javax.swing.JPanel();
        lblJTCDMX = new javax.swing.JLabel();
        lblJTinicio1 = new javax.swing.JLabel();
        lblCapacidad30 = new javax.swing.JLabel();
        panJTInicioTopCenter7 = new javax.swing.JPanel();
        txtNombreVerifiCD = new javax.swing.JTextField();
        lblNombreBuscar = new javax.swing.JLabel();
        lblFechaBuscar = new javax.swing.JLabel();
        txtFechaVerifiCD = new javax.swing.JTextField();
        lblBuscarReservacion = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        btnVerificarReservacionCD = new javax.swing.JButton();
        panRightImagen = new javax.swing.JPanel();
        lblLogoRight = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        panJTICDMXTop3 = new javax.swing.JPanel();
        panRealizarReservacion = new javax.swing.JPanel();
        lblHabitacionRealizar = new javax.swing.JLabel();
        lblNombreRealizar = new javax.swing.JLabel();
        lblTelefonoRealizar = new javax.swing.JLabel();
        lblNocheRealizar = new javax.swing.JLabel();
        txtNombreRegistroCD = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtHabitacionRegistroCD = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txtTelefonoRegistroCD = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtNochesRegistroCD = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        btnIngresarRegistroCD = new javax.swing.JButton();
        panBorrarRegistro = new javax.swing.JPanel();
        panBorrarRegistroTop = new javax.swing.JPanel();
        lblVerRegistros = new javax.swing.JLabel();
        panVerRegistros = new javax.swing.JPanel();
        btnBorrarRegistroCD = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        lblActualizarRegistro = new javax.swing.JLabel();
        btnVerRegistrosCD = new javax.swing.JButton();
        btnActualizarCD = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        lblBorrarRegistro = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtConsultaRegistrosCD = new javax.swing.JTable();
        panJTAcapulco = new javax.swing.JPanel();
        panJTAcapulcoMedio = new javax.swing.JPanel();
        panJTCDMXTopMedio1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRealizarReservacion1 = new javax.swing.JLabel();
        panJTAcapulcoTop = new javax.swing.JPanel();
        lblImagenHotelAcapulco = new javax.swing.JLabel();
        panJTAcapulcoTop1 = new javax.swing.JPanel();
        panJTAcapulcoTopCenter = new javax.swing.JPanel();
        lblJTAcapulco = new javax.swing.JLabel();
        lblJTHotelRamada = new javax.swing.JLabel();
        lblCapacidad40 = new javax.swing.JLabel();
        panJTBuscarReservacion = new javax.swing.JPanel();
        txtNombreVerifiAca = new javax.swing.JTextField();
        lblNombreBuscar1 = new javax.swing.JLabel();
        lblFechaBuscar1 = new javax.swing.JLabel();
        txtFechaVerifiAca = new javax.swing.JTextField();
        lblBuscarReservacion1 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        btnVerificarReservacionAca = new javax.swing.JButton();
        panRightImagen1 = new javax.swing.JPanel();
        lblLogoRight1 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        panJTIAcapulcoTop = new javax.swing.JPanel();
        panRealizarReservacion1 = new javax.swing.JPanel();
        lblHabitacionRealizar1 = new javax.swing.JLabel();
        lblNombreRealizar1 = new javax.swing.JLabel();
        lblTelefonoRealizar1 = new javax.swing.JLabel();
        lblNocheRealizar1 = new javax.swing.JLabel();
        txtNombreRegistroAca = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        txtHabitacionRegistroAca = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        txtTelefonoRegistroAca = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        txtNochesRegistroAca = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        btnIngresarRegistroAca = new javax.swing.JButton();
        panBorrarRegistro4 = new javax.swing.JPanel();
        panBorrarRegistroTop1 = new javax.swing.JPanel();
        lblVerRegistros1 = new javax.swing.JLabel();
        panVerRegistros4 = new javax.swing.JPanel();
        btnBorrarRegistroAca = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        lblActualizarRegistro1 = new javax.swing.JLabel();
        btnVerRegistrosAca = new javax.swing.JButton();
        btnActualizarAca = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        lblBorrarRegistro1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtConsultaRegistrosAca = new javax.swing.JTable();
        panJTLaPaz = new javax.swing.JPanel();
        panJTILaPazMedio = new javax.swing.JPanel();
        panJTCDMXTopMedio2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblRealizarReservacion2 = new javax.swing.JLabel();
        panJTILaPazTop = new javax.swing.JPanel();
        lblImagenHotelLaPaz = new javax.swing.JLabel();
        panJTILaPazTop1 = new javax.swing.JPanel();
        panJTLaPazTopCenter = new javax.swing.JPanel();
        lblJTLaPaz = new javax.swing.JLabel();
        lblJTGranti = new javax.swing.JLabel();
        lblCapacidad20 = new javax.swing.JLabel();
        panJTInicioTopCenter9 = new javax.swing.JPanel();
        txtNombreVerifiLpz = new javax.swing.JTextField();
        lblNombreBuscar2 = new javax.swing.JLabel();
        lblFechaBuscar2 = new javax.swing.JLabel();
        txtFechaVerifiLpz = new javax.swing.JTextField();
        lblBuscarReservacion2 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        btnVerificarReservacionLpz = new javax.swing.JButton();
        panRightImagen2 = new javax.swing.JPanel();
        lblLogoRight2 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        panJTILaPazTop2 = new javax.swing.JPanel();
        panRealizarReservacion2 = new javax.swing.JPanel();
        lblHabitacionRealizar2 = new javax.swing.JLabel();
        lblNombreRealizar2 = new javax.swing.JLabel();
        lblTelefonoRealizar2 = new javax.swing.JLabel();
        lblNocheRealizar2 = new javax.swing.JLabel();
        txtNombreRegistroLpz = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        txtHabitacionRegistroLpz = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        txtTelefonoRegistroLpz = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        txtNochesRegistroLpz = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        btnIngresarRegistroLpz = new javax.swing.JButton();
        panBorrarRegistro5 = new javax.swing.JPanel();
        panBorrarRegistroTop4 = new javax.swing.JPanel();
        lblVerRegistros2 = new javax.swing.JLabel();
        panVerRegistros5 = new javax.swing.JPanel();
        btnBorrarRegistroLpz = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        lblActualizarRegistro2 = new javax.swing.JLabel();
        btnVerRegistrosLpz = new javax.swing.JButton();
        btnActualizarLpz = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        lblBorrarRegistro4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JtConsultaRegistrosLpz = new javax.swing.JTable();
        panJTQuintanaRoo = new javax.swing.JPanel();
        panJTIQuintMedio = new javax.swing.JPanel();
        panJTQuintTopMedio1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblRealizarReservacion3 = new javax.swing.JLabel();
        panJTIQuintTop = new javax.swing.JPanel();
        lblImagenHotelQuint = new javax.swing.JLabel();
        panJTQuintTop1 = new javax.swing.JPanel();
        panJTQuintTopCenter = new javax.swing.JPanel();
        lblJTQuint = new javax.swing.JLabel();
        lblJTHotelSinupa = new javax.swing.JLabel();
        lblCapacidad25 = new javax.swing.JLabel();
        panJTInicioTopCenter10 = new javax.swing.JPanel();
        txtNombreVerifiQuin = new javax.swing.JTextField();
        lblNombreBuscar3 = new javax.swing.JLabel();
        lblFechaBuscar3 = new javax.swing.JLabel();
        txtFechaVerifiQuin = new javax.swing.JTextField();
        lblBuscarReservacion3 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        btnVerificarReservacionQuin = new javax.swing.JButton();
        panRightImagen3 = new javax.swing.JPanel();
        lblLogoRight3 = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        panJTIRealizarReservacion = new javax.swing.JPanel();
        panRealizarReservacion3 = new javax.swing.JPanel();
        lblHabitacionRealizar3 = new javax.swing.JLabel();
        lblNombreRealizar3 = new javax.swing.JLabel();
        lblTelefonoRealizar3 = new javax.swing.JLabel();
        lblNocheRealizar3 = new javax.swing.JLabel();
        txtNombreRegistroQuin = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        txtHabitacionRegistroQuin = new javax.swing.JTextField();
        jSeparator32 = new javax.swing.JSeparator();
        txtTelefonoRegistroQuin = new javax.swing.JTextField();
        jSeparator33 = new javax.swing.JSeparator();
        txtNochesRegistroQuin = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        btnIngresarRegistroQuin = new javax.swing.JButton();
        panBorrarRegistro6 = new javax.swing.JPanel();
        panBorrarRegistroTop5 = new javax.swing.JPanel();
        lblVerRegistros3 = new javax.swing.JLabel();
        panVerRegistros6 = new javax.swing.JPanel();
        btnBorrarRegistroQuin = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        lblActualizarRegistro3 = new javax.swing.JLabel();
        btnVerRegistrosQuin = new javax.swing.JButton();
        btnActualizarQuin = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        lblBorrarRegistro5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        JtConsultaRegistrosQuin = new javax.swing.JTable();
        panJTEvento = new javax.swing.JPanel();
        panJTIQuintMedio1 = new javax.swing.JPanel();
        panJTQuintTopMedio2 = new javax.swing.JPanel();
        lblRealizarReservacion4 = new javax.swing.JLabel();
        panJTIQuintTop1 = new javax.swing.JPanel();
        lblImagenHotelQuint1 = new javax.swing.JLabel();
        panJTQuintTop2 = new javax.swing.JPanel();
        panJTQuintTopCenter1 = new javax.swing.JPanel();
        lblJTQuint1 = new javax.swing.JLabel();
        panJTIRealizarReservacion1 = new javax.swing.JPanel();
        panRealizarEvento = new javax.swing.JPanel();
        txtNombreEvento = new javax.swing.JTextField();
        lblNombreEvento = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator40 = new javax.swing.JSeparator();
        lblFechaEvento = new javax.swing.JLabel();
        btnIngresarEvento = new javax.swing.JButton();
        lblEnHotel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstHoteles = new javax.swing.JList<>();
        jtSolicitarEventos = new javax.swing.JScrollPane();
        panJTEventos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        optMesa = new javax.swing.JCheckBox();
        optMantel = new javax.swing.JCheckBox();
        optCentro = new javax.swing.JCheckBox();
        optLuces = new javax.swing.JCheckBox();
        optFlores = new javax.swing.JCheckBox();
        jSeparator36 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Montage Mata");

        panLogoMontage.setBackground(new java.awt.Color(153, 0, 0));

        panBarraTop.setBackground(new java.awt.Color(204, 0, 0));

        lblLogoMontageTopLeft.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblLogoMontageTopLeft.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoMontageTopLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoMontageTopLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logMonCirChico.png"))); // NOI18N
        lblLogoMontageTopLeft.setText("Montage");

        javax.swing.GroupLayout panBarraTopLayout = new javax.swing.GroupLayout(panBarraTop);
        panBarraTop.setLayout(panBarraTopLayout);
        panBarraTopLayout.setHorizontalGroup(
            panBarraTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoMontageTopLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panBarraTopLayout.setVerticalGroup(
            panBarraTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoMontageTopLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panMenuLeft.setBackground(new java.awt.Color(153, 51, 0));

        panBtnInicio.setBackground(new java.awt.Color(0, 0, 0));
        panBtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panBtnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panBtnInicioMouseExited(evt);
            }
        });

        lblBtnInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnInicio.setText("Inicio");
        lblBtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnInicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnInicioLayout = new javax.swing.GroupLayout(panBtnInicio);
        panBtnInicio.setLayout(panBtnInicioLayout);
        panBtnInicioLayout.setHorizontalGroup(
            panBtnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnInicioLayout.setVerticalGroup(
            panBtnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        panBtnCDMX.setBackground(new java.awt.Color(0, 0, 0));
        panBtnCDMX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panBtnCDMXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panBtnCDMXMouseExited(evt);
            }
        });

        lblBtnCDMX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnCDMX.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnCDMX.setText("CDMX");
        lblBtnCDMX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnCDMXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnCDMXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnCDMXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnCDMXLayout = new javax.swing.GroupLayout(panBtnCDMX);
        panBtnCDMX.setLayout(panBtnCDMXLayout);
        panBtnCDMXLayout.setHorizontalGroup(
            panBtnCDMXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnCDMXLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnCDMX, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnCDMXLayout.setVerticalGroup(
            panBtnCDMXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnCDMX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        panBtnAcapulco.setBackground(new java.awt.Color(0, 0, 0));
        panBtnAcapulco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panBtnAcapulcoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panBtnAcapulcoMouseExited(evt);
            }
        });

        lblBtnAcapulco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnAcapulco.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnAcapulco.setText("Acapulco");
        lblBtnAcapulco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnAcapulcoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnAcapulcoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnAcapulcoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnAcapulcoLayout = new javax.swing.GroupLayout(panBtnAcapulco);
        panBtnAcapulco.setLayout(panBtnAcapulcoLayout);
        panBtnAcapulcoLayout.setHorizontalGroup(
            panBtnAcapulcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnAcapulcoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnAcapulco, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnAcapulcoLayout.setVerticalGroup(
            panBtnAcapulcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnAcapulco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        panBtnLaPaz.setBackground(new java.awt.Color(0, 0, 0));
        panBtnLaPaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panBtnLaPazMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panBtnLaPazMouseExited(evt);
            }
        });

        lblBtnLaPaz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnLaPaz.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnLaPaz.setText("La Paz");
        lblBtnLaPaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnLaPazMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnLaPazMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnLaPazMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnLaPazLayout = new javax.swing.GroupLayout(panBtnLaPaz);
        panBtnLaPaz.setLayout(panBtnLaPazLayout);
        panBtnLaPazLayout.setHorizontalGroup(
            panBtnLaPazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnLaPazLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnLaPaz, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnLaPazLayout.setVerticalGroup(
            panBtnLaPazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnLaPaz, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        panBtnQuintana.setBackground(new java.awt.Color(0, 0, 0));
        panBtnQuintana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panBtnQuintanaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panBtnQuintanaMouseExited(evt);
            }
        });

        lblBtnQuintana.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnQuintana.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnQuintana.setText("QuintanaRoo");
        lblBtnQuintana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnQuintanaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnQuintanaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnQuintanaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnQuintanaLayout = new javax.swing.GroupLayout(panBtnQuintana);
        panBtnQuintana.setLayout(panBtnQuintanaLayout);
        panBtnQuintanaLayout.setHorizontalGroup(
            panBtnQuintanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnQuintanaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnQuintana, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnQuintanaLayout.setVerticalGroup(
            panBtnQuintanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnQuintana, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha");

        panBtnEventos.setBackground(new java.awt.Color(0, 0, 0));
        panBtnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panBtnEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panBtnEventosMouseExited(evt);
            }
        });

        lblBtnEventos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnEventos.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnEventos.setText("Eventos");
        lblBtnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnEventosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnEventosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnEventosLayout = new javax.swing.GroupLayout(panBtnEventos);
        panBtnEventos.setLayout(panBtnEventosLayout);
        panBtnEventosLayout.setHorizontalGroup(
            panBtnEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnEventosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnEventosLayout.setVerticalGroup(
            panBtnEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panMenuLeftLayout = new javax.swing.GroupLayout(panMenuLeft);
        panMenuLeft.setLayout(panMenuLeftLayout);
        panMenuLeftLayout.setHorizontalGroup(
            panMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBtnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBtnCDMX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBtnAcapulco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBtnLaPaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBtnQuintana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panMenuLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panMenuLeftLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5)))
            .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBtnEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panMenuLeftLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator7))
        );
        panMenuLeftLayout.setVerticalGroup(
            panMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLeftLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panBtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBtnCDMX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBtnAcapulco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBtnLaPaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBtnQuintana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panBtnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addContainerGap())
        );

        javax.swing.GroupLayout panLogoMontageLayout = new javax.swing.GroupLayout(panLogoMontage);
        panLogoMontage.setLayout(panLogoMontageLayout);
        panLogoMontageLayout.setHorizontalGroup(
            panLogoMontageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBarraTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panMenuLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panLogoMontageLayout.setVerticalGroup(
            panLogoMontageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLogoMontageLayout.createSequentialGroup()
                .addComponent(panBarraTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panMenuLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panBarraTop2.setBackground(new java.awt.Color(204, 0, 51));
        panBarraTop2.setForeground(new java.awt.Color(204, 0, 0));

        panSalirLogin.setBackground(new java.awt.Color(204, 0, 0));
        panSalirLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnSalirLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salirSistema.png"))); // NOI18N
        lblBtnSalirLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnSalirLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnSalirLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnSalirLoginMouseExited(evt);
            }
        });
        panSalirLogin.add(lblBtnSalirLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        javax.swing.GroupLayout panBarraTop2Layout = new javax.swing.GroupLayout(panBarraTop2);
        panBarraTop2.setLayout(panBarraTop2Layout);
        panBarraTop2Layout.setHorizontalGroup(
            panBarraTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBarraTop2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panSalirLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panBarraTop2Layout.setVerticalGroup(
            panBarraTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBarraTop2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panSalirLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panContenedorTJ.setBackground(new java.awt.Color(255, 255, 255));

        tpManejoHoteles.setForeground(new java.awt.Color(255, 255, 255));

        panJTInicio.setBackground(new java.awt.Color(255, 255, 255));

        panJTInicioTop.setBackground(new java.awt.Color(51, 51, 51));
        panJTInicioTop.setForeground(new java.awt.Color(102, 102, 102));

        panJTInicioTopCenter.setBackground(new java.awt.Color(51, 51, 51));
        panJTInicioTopCenter.setForeground(new java.awt.Color(102, 102, 102));

        lblJTinicio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTinicio.setForeground(new java.awt.Color(255, 255, 255));
        lblJTinicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTinicio.setText("Inicio");

        javax.swing.GroupLayout panJTInicioTopCenterLayout = new javax.swing.GroupLayout(panJTInicioTopCenter);
        panJTInicioTopCenter.setLayout(panJTInicioTopCenterLayout);
        panJTInicioTopCenterLayout.setHorizontalGroup(
            panJTInicioTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTinicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTInicioTopCenterLayout.setVerticalGroup(
            panJTInicioTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTinicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTInicioTopLayout = new javax.swing.GroupLayout(panJTInicioTop);
        panJTInicioTop.setLayout(panJTInicioTopLayout);
        panJTInicioTopLayout.setHorizontalGroup(
            panJTInicioTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTopLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(panJTInicioTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        panJTInicioTopLayout.setVerticalGroup(
            panJTInicioTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTopLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panJTInicioTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panJTInicioTop3.setBackground(new java.awt.Color(255, 255, 255));
        panJTInicioTop3.setForeground(new java.awt.Color(102, 102, 102));

        panJTInicioTopCenter3.setBackground(new java.awt.Color(255, 255, 255));
        panJTInicioTopCenter3.setForeground(new java.awt.Color(102, 102, 102));

        lblJTinicio3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTinicio3.setForeground(new java.awt.Color(255, 255, 255));
        lblJTinicio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTinicio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMontageCuadroGrande.jpg"))); // NOI18N

        javax.swing.GroupLayout panJTInicioTopCenter3Layout = new javax.swing.GroupLayout(panJTInicioTopCenter3);
        panJTInicioTopCenter3.setLayout(panJTInicioTopCenter3Layout);
        panJTInicioTopCenter3Layout.setHorizontalGroup(
            panJTInicioTopCenter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTinicio3, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        panJTInicioTopCenter3Layout.setVerticalGroup(
            panJTInicioTopCenter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTinicio3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTInicioTop3Layout = new javax.swing.GroupLayout(panJTInicioTop3);
        panJTInicioTop3.setLayout(panJTInicioTop3Layout);
        panJTInicioTop3Layout.setHorizontalGroup(
            panJTInicioTop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTop3Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(panJTInicioTopCenter3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        panJTInicioTop3Layout.setVerticalGroup(
            panJTInicioTop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTop3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panJTInicioTopCenter3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panJTInicioTop5.setBackground(new java.awt.Color(255, 255, 255));
        panJTInicioTop5.setForeground(new java.awt.Color(102, 102, 102));

        panJTInicioTopCenter5.setBackground(new java.awt.Color(255, 255, 255));
        panJTInicioTopCenter5.setForeground(new java.awt.Color(102, 102, 102));

        lblJTinicio5.setBackground(new java.awt.Color(0, 0, 0));
        lblJTinicio5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTinicio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTinicio5.setText("Bienvenid@ A Sistemas Montage MATA");

        lblJTinicio6.setBackground(new java.awt.Color(0, 0, 0));
        lblJTinicio6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTinicio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTinicio6.setText("Area de Empleado");

        javax.swing.GroupLayout panJTInicioTopCenter5Layout = new javax.swing.GroupLayout(panJTInicioTopCenter5);
        panJTInicioTopCenter5.setLayout(panJTInicioTopCenter5Layout);
        panJTInicioTopCenter5Layout.setHorizontalGroup(
            panJTInicioTopCenter5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTopCenter5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panJTInicioTopCenter5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJTinicio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblJTinicio6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panJTInicioTopCenter5Layout.setVerticalGroup(
            panJTInicioTopCenter5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTopCenter5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJTinicio5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblJTinicio6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panJTInicioTop5Layout = new javax.swing.GroupLayout(panJTInicioTop5);
        panJTInicioTop5.setLayout(panJTInicioTop5Layout);
        panJTInicioTop5Layout.setHorizontalGroup(
            panJTInicioTop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTInicioTopCenter5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTInicioTop5Layout.setVerticalGroup(
            panJTInicioTop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTInicioTopCenter5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE)
        );

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panTJInicio2Layout = new javax.swing.GroupLayout(panTJInicio2);
        panTJInicio2.setLayout(panTJInicio2Layout);
        panTJInicio2Layout.setHorizontalGroup(
            panTJInicio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTJInicio2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTJInicio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addComponent(panJTInicioTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTInicioTop3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTInicioTop5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panTJInicio2Layout.setVerticalGroup(
            panTJInicio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTJInicio2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panJTInicioTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTInicioTop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTInicioTop5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panJTInicioLayout = new javax.swing.GroupLayout(panJTInicio);
        panJTInicio.setLayout(panJTInicioLayout);
        panJTInicioLayout.setHorizontalGroup(
            panJTInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTJInicio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTInicioLayout.setVerticalGroup(
            panJTInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTJInicio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tpManejoHoteles.addTab("Inicio", panJTInicio);

        panJTICDMXMedio.setBackground(new java.awt.Color(51, 51, 51));
        panJTICDMXMedio.setForeground(new java.awt.Color(102, 102, 102));

        panJTCDMXTopMedio.setBackground(new java.awt.Color(51, 51, 51));
        panJTCDMXTopMedio.setForeground(new java.awt.Color(102, 102, 102));

        lblRegistros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRegistros.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistros.setText("Registros:");

        javax.swing.GroupLayout panJTCDMXTopMedioLayout = new javax.swing.GroupLayout(panJTCDMXTopMedio);
        panJTCDMXTopMedio.setLayout(panJTCDMXTopMedioLayout);
        panJTCDMXTopMedioLayout.setHorizontalGroup(
            panJTCDMXTopMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTCDMXTopMedioLayout.setVerticalGroup(
            panJTCDMXTopMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTCDMXTopMedioLayout.createSequentialGroup()
                .addComponent(lblRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblRealizarReservacion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRealizarReservacion.setForeground(new java.awt.Color(255, 255, 255));
        lblRealizarReservacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRealizarReservacion.setText("Realizar Reservacion");

        javax.swing.GroupLayout panJTICDMXMedioLayout = new javax.swing.GroupLayout(panJTICDMXMedio);
        panJTICDMXMedio.setLayout(panJTICDMXMedioLayout);
        panJTICDMXMedioLayout.setHorizontalGroup(
            panJTICDMXMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTICDMXMedioLayout.createSequentialGroup()
                .addComponent(lblRealizarReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTCDMXTopMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        panJTICDMXMedioLayout.setVerticalGroup(
            panJTICDMXMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTCDMXTopMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRealizarReservacion)
        );

        panJTICDMXTop1.setBackground(new java.awt.Color(255, 255, 255));
        panJTICDMXTop1.setForeground(new java.awt.Color(102, 102, 102));

        lblImagenHotelCDMX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenHotelCDMX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel-stanza.jpg"))); // NOI18N
        lblImagenHotelCDMX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panJTICDMXTop1Layout = new javax.swing.GroupLayout(panJTICDMXTop1);
        panJTICDMXTop1.setLayout(panJTICDMXTop1Layout);
        panJTICDMXTop1Layout.setHorizontalGroup(
            panJTICDMXTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTICDMXTop1Layout.createSequentialGroup()
                .addComponent(lblImagenHotelCDMX)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        panJTICDMXTop1Layout.setVerticalGroup(
            panJTICDMXTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenHotelCDMX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE)
        );

        panJTICDMXTop.setBackground(new java.awt.Color(51, 51, 51));
        panJTICDMXTop.setForeground(new java.awt.Color(102, 102, 102));

        panJTCDMXTopCenter.setBackground(new java.awt.Color(51, 51, 51));
        panJTCDMXTopCenter.setForeground(new java.awt.Color(102, 102, 102));

        lblJTCDMX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTCDMX.setForeground(new java.awt.Color(255, 255, 255));
        lblJTCDMX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTCDMX.setText("CDMX");

        javax.swing.GroupLayout panJTCDMXTopCenterLayout = new javax.swing.GroupLayout(panJTCDMXTopCenter);
        panJTCDMXTopCenter.setLayout(panJTCDMXTopCenterLayout);
        panJTCDMXTopCenterLayout.setHorizontalGroup(
            panJTCDMXTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTCDMX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTCDMXTopCenterLayout.setVerticalGroup(
            panJTCDMXTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTCDMX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblJTinicio1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTinicio1.setForeground(new java.awt.Color(255, 255, 255));
        lblJTinicio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJTinicio1.setText("Hotel: Stanza");

        lblCapacidad30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCapacidad30.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidad30.setText("Capacidad: 30 Habitaciones");

        javax.swing.GroupLayout panJTICDMXTopLayout = new javax.swing.GroupLayout(panJTICDMXTop);
        panJTICDMXTop.setLayout(panJTICDMXTopLayout);
        panJTICDMXTopLayout.setHorizontalGroup(
            panJTICDMXTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTICDMXTopLayout.createSequentialGroup()
                .addComponent(lblJTinicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTCDMXTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCapacidad30, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panJTICDMXTopLayout.setVerticalGroup(
            panJTICDMXTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTCDMXTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panJTICDMXTopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblJTinicio1))
            .addComponent(lblCapacidad30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTInicioTopCenter7.setBackground(new java.awt.Color(255, 255, 255));
        panJTInicioTopCenter7.setForeground(new java.awt.Color(102, 102, 102));

        txtNombreVerifiCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreVerifiCD.setBorder(null);

        lblNombreBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombreBuscar.setText("Nombre:");

        lblFechaBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFechaBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFechaBuscar.setText("Fecha:");

        txtFechaVerifiCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFechaVerifiCD.setBorder(null);

        lblBuscarReservacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBuscarReservacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarReservacion.setText("Buscar Reservacion");

        btnVerificarReservacionCD.setBackground(new java.awt.Color(0, 0, 0));
        btnVerificarReservacionCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerificarReservacionCD.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificarReservacionCD.setText("Verificar Reservacion");
        btnVerificarReservacionCD.setBorder(null);
        btnVerificarReservacionCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerificarReservacionCDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerificarReservacionCDMouseExited(evt);
            }
        });
        btnVerificarReservacionCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarReservacionCDActionPerformed(evt);
            }
        });

        panRightImagen.setBackground(new java.awt.Color(255, 255, 255));

        lblLogoRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMontageCirculo.png"))); // NOI18N

        javax.swing.GroupLayout panRightImagenLayout = new javax.swing.GroupLayout(panRightImagen);
        panRightImagen.setLayout(panRightImagenLayout);
        panRightImagenLayout.setHorizontalGroup(
            panRightImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoRight, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panRightImagenLayout.setVerticalGroup(
            panRightImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTInicioTopCenter7Layout = new javax.swing.GroupLayout(panJTInicioTopCenter7);
        panJTInicioTopCenter7.setLayout(panJTInicioTopCenter7Layout);
        panJTInicioTopCenter7Layout.setHorizontalGroup(
            panJTInicioTopCenter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTopCenter7Layout.createSequentialGroup()
                .addGroup(panJTInicioTopCenter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panJTInicioTopCenter7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panJTInicioTopCenter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerificarReservacionCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panJTInicioTopCenter7Layout.createSequentialGroup()
                                .addGroup(panJTInicioTopCenter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombreBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFechaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panJTInicioTopCenter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaVerifiCD)
                                    .addComponent(jSeparator8)
                                    .addGroup(panJTInicioTopCenter7Layout.createSequentialGroup()
                                        .addGroup(panJTInicioTopCenter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombreVerifiCD, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(jSeparator14))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(5, 5, 5))
                    .addComponent(lblBuscarReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panRightImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panJTInicioTopCenter7Layout.setVerticalGroup(
            panJTInicioTopCenter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panJTInicioTopCenter7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBuscarReservacion)
                .addGap(45, 45, 45)
                .addGroup(panJTInicioTopCenter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreVerifiCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panJTInicioTopCenter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaVerifiCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnVerificarReservacionCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panRightImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTICDMXTop3.setBackground(new java.awt.Color(255, 255, 255));
        panJTICDMXTop3.setForeground(new java.awt.Color(102, 102, 102));

        panRealizarReservacion.setBackground(new java.awt.Color(255, 255, 255));
        panRealizarReservacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panRealizarReservacion.setForeground(new java.awt.Color(102, 102, 102));

        lblHabitacionRealizar.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblHabitacionRealizar.setText("Habitacion:");

        lblNombreRealizar.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNombreRealizar.setText("Nombre:");

        lblTelefonoRealizar.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblTelefonoRealizar.setText("Telefono:");

        lblNocheRealizar.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNocheRealizar.setText("Noches:");

        txtNombreRegistroCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreRegistroCD.setBorder(null);

        txtHabitacionRegistroCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHabitacionRegistroCD.setBorder(null);

        txtTelefonoRegistroCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTelefonoRegistroCD.setBorder(null);
        txtTelefonoRegistroCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoRegistroCDActionPerformed(evt);
            }
        });

        txtNochesRegistroCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNochesRegistroCD.setBorder(null);

        btnIngresarRegistroCD.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresarRegistroCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresarRegistroCD.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarRegistroCD.setText("Ingresar");
        btnIngresarRegistroCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarRegistroCDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarRegistroCDMouseExited(evt);
            }
        });
        btnIngresarRegistroCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarRegistroCDActionPerformed(evt);
            }
        });

        panBorrarRegistro.setBackground(new java.awt.Color(255, 255, 255));

        panBorrarRegistroTop.setBackground(new java.awt.Color(51, 51, 51));

        lblVerRegistros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVerRegistros.setForeground(new java.awt.Color(255, 255, 255));
        lblVerRegistros.setText("Ver Registros");

        javax.swing.GroupLayout panBorrarRegistroTopLayout = new javax.swing.GroupLayout(panBorrarRegistroTop);
        panBorrarRegistroTop.setLayout(panBorrarRegistroTopLayout);
        panBorrarRegistroTopLayout.setHorizontalGroup(
            panBorrarRegistroTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panBorrarRegistroTopLayout.setVerticalGroup(
            panBorrarRegistroTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerRegistros, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panVerRegistros.setBackground(new java.awt.Color(255, 255, 255));

        btnBorrarRegistroCD.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarRegistroCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBorrarRegistroCD.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarRegistroCD.setText("Borrar");
        btnBorrarRegistroCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarRegistroCDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarRegistroCDMouseExited(evt);
            }
        });
        btnBorrarRegistroCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegistroCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVerRegistrosLayout = new javax.swing.GroupLayout(panVerRegistros);
        panVerRegistros.setLayout(panVerRegistrosLayout);
        panVerRegistrosLayout.setHorizontalGroup(
            panVerRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVerRegistrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrarRegistroCD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        panVerRegistrosLayout.setVerticalGroup(
            panVerRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVerRegistrosLayout.createSequentialGroup()
                .addComponent(btnBorrarRegistroCD)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        lblActualizarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblActualizarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizarRegistro.setText("Actualizar Registro");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnVerRegistrosCD.setBackground(new java.awt.Color(0, 0, 0));
        btnVerRegistrosCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerRegistrosCD.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRegistrosCD.setText("Ver");
        btnVerRegistrosCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerRegistrosCDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerRegistrosCDMouseExited(evt);
            }
        });
        btnVerRegistrosCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistrosCDActionPerformed(evt);
            }
        });

        btnActualizarCD.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarCD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnActualizarCD.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCD.setText("Actualizar");
        btnActualizarCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarCDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarCDMouseExited(evt);
            }
        });
        btnActualizarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCDActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));

        lblBorrarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBorrarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrarRegistro.setText("Borrar Registro");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panBorrarRegistroLayout = new javax.swing.GroupLayout(panBorrarRegistro);
        panBorrarRegistro.setLayout(panBorrarRegistroLayout);
        panBorrarRegistroLayout.setHorizontalGroup(
            panBorrarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBorrarRegistroTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panVerRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBorrarRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panBorrarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerRegistrosCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
        );
        panBorrarRegistroLayout.setVerticalGroup(
            panBorrarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorrarRegistroLayout.createSequentialGroup()
                .addComponent(panBorrarRegistroTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerRegistrosCD)
                .addGap(13, 13, 13)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarCD)
                .addGap(14, 14, 14)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panVerRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panRealizarReservacionLayout = new javax.swing.GroupLayout(panRealizarReservacion);
        panRealizarReservacion.setLayout(panRealizarReservacionLayout);
        panRealizarReservacionLayout.setHorizontalGroup(
            panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarReservacionLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panRealizarReservacionLayout.createSequentialGroup()
                            .addComponent(lblHabitacionRealizar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHabitacionRegistroCD))
                        .addGroup(panRealizarReservacionLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTelefonoRealizar)
                                .addComponent(lblNocheRealizar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator12)
                                .addComponent(txtNochesRegistroCD, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator11)
                                .addComponent(txtTelefonoRegistroCD, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panRealizarReservacionLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(lblNombreRealizar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreRegistroCD, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addComponent(panBorrarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRealizarReservacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresarRegistroCD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        panRealizarReservacionLayout.setVerticalGroup(
            panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarReservacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHabitacionRealizar)
                    .addComponent(txtHabitacionRegistroCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreRegistroCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreRealizar))
                .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRealizarReservacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panRealizarReservacionLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefonoRealizar)
                            .addComponent(txtTelefonoRegistroCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNocheRealizar)
                    .addComponent(txtNochesRegistroCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarRegistroCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBorrarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtConsultaRegistrosCD.setBackground(new java.awt.Color(102, 255, 102));
        JtConsultaRegistrosCD.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        JtConsultaRegistrosCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitacion", "Nombre", "Telefono", "Noches", "Fecha"
            }
        ));
        JtConsultaRegistrosCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtConsultaRegistrosCDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JtConsultaRegistrosCD);

        javax.swing.GroupLayout panJTICDMXTop3Layout = new javax.swing.GroupLayout(panJTICDMXTop3);
        panJTICDMXTop3.setLayout(panJTICDMXTop3Layout);
        panJTICDMXTop3Layout.setHorizontalGroup(
            panJTICDMXTop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTICDMXTop3Layout.createSequentialGroup()
                .addComponent(panRealizarReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        panJTICDMXTop3Layout.setVerticalGroup(
            panJTICDMXTop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panRealizarReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout panJTCDMXLayout = new javax.swing.GroupLayout(panJTCDMX);
        panJTCDMX.setLayout(panJTCDMXLayout);
        panJTCDMXLayout.setHorizontalGroup(
            panJTCDMXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTCDMXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panJTCDMXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panJTCDMXLayout.createSequentialGroup()
                        .addComponent(panJTICDMXTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panJTInicioTopCenter7, javax.swing.GroupLayout.PREFERRED_SIZE, 305, Short.MAX_VALUE))
                    .addComponent(panJTICDMXMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTICDMXTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTICDMXTop3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panJTCDMXLayout.setVerticalGroup(
            panJTCDMXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTCDMXLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(panJTICDMXTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panJTCDMXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panJTICDMXTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTInicioTopCenter7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panJTICDMXMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTICDMXTop3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpManejoHoteles.addTab("CDMX", panJTCDMX);

        panJTAcapulcoMedio.setBackground(new java.awt.Color(51, 51, 51));
        panJTAcapulcoMedio.setForeground(new java.awt.Color(102, 102, 102));

        panJTCDMXTopMedio1.setBackground(new java.awt.Color(51, 51, 51));
        panJTCDMXTopMedio1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registros:");

        javax.swing.GroupLayout panJTCDMXTopMedio1Layout = new javax.swing.GroupLayout(panJTCDMXTopMedio1);
        panJTCDMXTopMedio1.setLayout(panJTCDMXTopMedio1Layout);
        panJTCDMXTopMedio1Layout.setHorizontalGroup(
            panJTCDMXTopMedio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTCDMXTopMedio1Layout.setVerticalGroup(
            panJTCDMXTopMedio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblRealizarReservacion1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRealizarReservacion1.setForeground(new java.awt.Color(255, 255, 255));
        lblRealizarReservacion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRealizarReservacion1.setText("Realizar Reservacion");

        javax.swing.GroupLayout panJTAcapulcoMedioLayout = new javax.swing.GroupLayout(panJTAcapulcoMedio);
        panJTAcapulcoMedio.setLayout(panJTAcapulcoMedioLayout);
        panJTAcapulcoMedioLayout.setHorizontalGroup(
            panJTAcapulcoMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTAcapulcoMedioLayout.createSequentialGroup()
                .addComponent(lblRealizarReservacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTCDMXTopMedio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        panJTAcapulcoMedioLayout.setVerticalGroup(
            panJTAcapulcoMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTCDMXTopMedio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRealizarReservacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTAcapulcoTop.setBackground(new java.awt.Color(255, 255, 255));
        panJTAcapulcoTop.setForeground(new java.awt.Color(102, 102, 102));

        lblImagenHotelAcapulco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenHotelAcapulco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Acapulco.jpg"))); // NOI18N
        lblImagenHotelAcapulco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panJTAcapulcoTopLayout = new javax.swing.GroupLayout(panJTAcapulcoTop);
        panJTAcapulcoTop.setLayout(panJTAcapulcoTopLayout);
        panJTAcapulcoTopLayout.setHorizontalGroup(
            panJTAcapulcoTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTAcapulcoTopLayout.createSequentialGroup()
                .addComponent(lblImagenHotelAcapulco)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        panJTAcapulcoTopLayout.setVerticalGroup(
            panJTAcapulcoTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenHotelAcapulco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE)
        );

        panJTAcapulcoTop1.setBackground(new java.awt.Color(51, 51, 51));
        panJTAcapulcoTop1.setForeground(new java.awt.Color(102, 102, 102));

        panJTAcapulcoTopCenter.setBackground(new java.awt.Color(51, 51, 51));
        panJTAcapulcoTopCenter.setForeground(new java.awt.Color(102, 102, 102));

        lblJTAcapulco.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTAcapulco.setForeground(new java.awt.Color(255, 255, 255));
        lblJTAcapulco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTAcapulco.setText("Acapulco");

        javax.swing.GroupLayout panJTAcapulcoTopCenterLayout = new javax.swing.GroupLayout(panJTAcapulcoTopCenter);
        panJTAcapulcoTopCenter.setLayout(panJTAcapulcoTopCenterLayout);
        panJTAcapulcoTopCenterLayout.setHorizontalGroup(
            panJTAcapulcoTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTAcapulco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTAcapulcoTopCenterLayout.setVerticalGroup(
            panJTAcapulcoTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTAcapulco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblJTHotelRamada.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTHotelRamada.setForeground(new java.awt.Color(255, 255, 255));
        lblJTHotelRamada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJTHotelRamada.setText("Hotel: Ramada");

        lblCapacidad40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCapacidad40.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidad40.setText("Capacidad: 40 Habitaciones");

        javax.swing.GroupLayout panJTAcapulcoTop1Layout = new javax.swing.GroupLayout(panJTAcapulcoTop1);
        panJTAcapulcoTop1.setLayout(panJTAcapulcoTop1Layout);
        panJTAcapulcoTop1Layout.setHorizontalGroup(
            panJTAcapulcoTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTAcapulcoTop1Layout.createSequentialGroup()
                .addComponent(lblJTHotelRamada, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTAcapulcoTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCapacidad40, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panJTAcapulcoTop1Layout.setVerticalGroup(
            panJTAcapulcoTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTAcapulcoTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panJTAcapulcoTop1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblJTHotelRamada))
            .addComponent(lblCapacidad40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTBuscarReservacion.setBackground(new java.awt.Color(255, 255, 255));
        panJTBuscarReservacion.setForeground(new java.awt.Color(102, 102, 102));

        txtNombreVerifiAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreVerifiAca.setBorder(null);

        lblNombreBuscar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombreBuscar1.setText("Nombre:");

        lblFechaBuscar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFechaBuscar1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFechaBuscar1.setText("Fecha:");

        txtFechaVerifiAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFechaVerifiAca.setBorder(null);

        lblBuscarReservacion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBuscarReservacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarReservacion1.setText("Buscar Reservacion");

        btnVerificarReservacionAca.setBackground(new java.awt.Color(0, 0, 0));
        btnVerificarReservacionAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerificarReservacionAca.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificarReservacionAca.setText("Verificar Reservacion");
        btnVerificarReservacionAca.setBorder(null);
        btnVerificarReservacionAca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerificarReservacionAcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerificarReservacionAcaMouseExited(evt);
            }
        });
        btnVerificarReservacionAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarReservacionAcaActionPerformed(evt);
            }
        });

        panRightImagen1.setBackground(new java.awt.Color(255, 255, 255));

        lblLogoRight1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoRight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMontageCirculo.png"))); // NOI18N

        javax.swing.GroupLayout panRightImagen1Layout = new javax.swing.GroupLayout(panRightImagen1);
        panRightImagen1.setLayout(panRightImagen1Layout);
        panRightImagen1Layout.setHorizontalGroup(
            panRightImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoRight1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panRightImagen1Layout.setVerticalGroup(
            panRightImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoRight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTBuscarReservacionLayout = new javax.swing.GroupLayout(panJTBuscarReservacion);
        panJTBuscarReservacion.setLayout(panJTBuscarReservacionLayout);
        panJTBuscarReservacionLayout.setHorizontalGroup(
            panJTBuscarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTBuscarReservacionLayout.createSequentialGroup()
                .addGroup(panJTBuscarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panJTBuscarReservacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panJTBuscarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerificarReservacionAca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panJTBuscarReservacionLayout.createSequentialGroup()
                                .addGroup(panJTBuscarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombreBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFechaBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panJTBuscarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaVerifiAca)
                                    .addComponent(jSeparator15)
                                    .addGroup(panJTBuscarReservacionLayout.createSequentialGroup()
                                        .addGroup(panJTBuscarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombreVerifiAca, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(jSeparator16))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(5, 5, 5))
                    .addComponent(lblBuscarReservacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panRightImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panJTBuscarReservacionLayout.setVerticalGroup(
            panJTBuscarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panJTBuscarReservacionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBuscarReservacion1)
                .addGap(45, 45, 45)
                .addGroup(panJTBuscarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreVerifiAca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreBuscar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panJTBuscarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaVerifiAca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnVerificarReservacionAca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panRightImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTIAcapulcoTop.setBackground(new java.awt.Color(255, 255, 255));
        panJTIAcapulcoTop.setForeground(new java.awt.Color(102, 102, 102));

        panRealizarReservacion1.setBackground(new java.awt.Color(255, 255, 255));
        panRealizarReservacion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panRealizarReservacion1.setForeground(new java.awt.Color(102, 102, 102));

        lblHabitacionRealizar1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblHabitacionRealizar1.setText("Habitacion:");

        lblNombreRealizar1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNombreRealizar1.setText("Nombre:");

        lblTelefonoRealizar1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblTelefonoRealizar1.setText("Telefono:");

        lblNocheRealizar1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNocheRealizar1.setText("Noches:");

        txtNombreRegistroAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreRegistroAca.setBorder(null);

        txtHabitacionRegistroAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHabitacionRegistroAca.setBorder(null);

        txtTelefonoRegistroAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTelefonoRegistroAca.setBorder(null);
        txtTelefonoRegistroAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoRegistroAcaActionPerformed(evt);
            }
        });

        txtNochesRegistroAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNochesRegistroAca.setBorder(null);

        btnIngresarRegistroAca.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresarRegistroAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresarRegistroAca.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarRegistroAca.setText("Ingresar");
        btnIngresarRegistroAca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarRegistroAcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarRegistroAcaMouseExited(evt);
            }
        });
        btnIngresarRegistroAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarRegistroAcaActionPerformed(evt);
            }
        });

        panBorrarRegistro4.setBackground(new java.awt.Color(255, 255, 255));

        panBorrarRegistroTop1.setBackground(new java.awt.Color(51, 51, 51));

        lblVerRegistros1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVerRegistros1.setForeground(new java.awt.Color(255, 255, 255));
        lblVerRegistros1.setText("Ver Registros");

        javax.swing.GroupLayout panBorrarRegistroTop1Layout = new javax.swing.GroupLayout(panBorrarRegistroTop1);
        panBorrarRegistroTop1.setLayout(panBorrarRegistroTop1Layout);
        panBorrarRegistroTop1Layout.setHorizontalGroup(
            panBorrarRegistroTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerRegistros1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panBorrarRegistroTop1Layout.setVerticalGroup(
            panBorrarRegistroTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerRegistros1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panVerRegistros4.setBackground(new java.awt.Color(255, 255, 255));

        btnBorrarRegistroAca.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarRegistroAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBorrarRegistroAca.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarRegistroAca.setText("Borrar");
        btnBorrarRegistroAca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarRegistroAcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarRegistroAcaMouseExited(evt);
            }
        });
        btnBorrarRegistroAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegistroAcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVerRegistros4Layout = new javax.swing.GroupLayout(panVerRegistros4);
        panVerRegistros4.setLayout(panVerRegistros4Layout);
        panVerRegistros4Layout.setHorizontalGroup(
            panVerRegistros4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVerRegistros4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrarRegistroAca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        panVerRegistros4Layout.setVerticalGroup(
            panVerRegistros4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVerRegistros4Layout.createSequentialGroup()
                .addComponent(btnBorrarRegistroAca)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));

        lblActualizarRegistro1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblActualizarRegistro1.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizarRegistro1.setText("Actualizar Registro");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarRegistro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarRegistro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnVerRegistrosAca.setBackground(new java.awt.Color(0, 0, 0));
        btnVerRegistrosAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerRegistrosAca.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRegistrosAca.setText("Ver");
        btnVerRegistrosAca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerRegistrosAcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerRegistrosAcaMouseExited(evt);
            }
        });
        btnVerRegistrosAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistrosAcaActionPerformed(evt);
            }
        });

        btnActualizarAca.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarAca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnActualizarAca.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarAca.setText("Actualizar");
        btnActualizarAca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarAcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarAcaMouseExited(evt);
            }
        });
        btnActualizarAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAcaActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));

        lblBorrarRegistro1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBorrarRegistro1.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrarRegistro1.setText("Borrar Registro");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarRegistro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarRegistro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panBorrarRegistro4Layout = new javax.swing.GroupLayout(panBorrarRegistro4);
        panBorrarRegistro4.setLayout(panBorrarRegistro4Layout);
        panBorrarRegistro4Layout.setHorizontalGroup(
            panBorrarRegistro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBorrarRegistroTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panVerRegistros4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBorrarRegistro4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panBorrarRegistro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerRegistrosAca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarAca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
        );
        panBorrarRegistro4Layout.setVerticalGroup(
            panBorrarRegistro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorrarRegistro4Layout.createSequentialGroup()
                .addComponent(panBorrarRegistroTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerRegistrosAca)
                .addGap(13, 13, 13)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarAca)
                .addGap(14, 14, 14)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panVerRegistros4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panRealizarReservacion1Layout = new javax.swing.GroupLayout(panRealizarReservacion1);
        panRealizarReservacion1.setLayout(panRealizarReservacion1Layout);
        panRealizarReservacion1Layout.setHorizontalGroup(
            panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarReservacion1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panRealizarReservacion1Layout.createSequentialGroup()
                            .addComponent(lblHabitacionRealizar1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHabitacionRegistroAca))
                        .addGroup(panRealizarReservacion1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTelefonoRealizar1)
                                .addComponent(lblNocheRealizar1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator20)
                                .addComponent(txtNochesRegistroAca, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator19)
                                .addComponent(txtTelefonoRegistroAca, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panRealizarReservacion1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(lblNombreRealizar1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreRegistroAca, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRealizarReservacion1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresarRegistroAca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addComponent(panBorrarRegistro4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panRealizarReservacion1Layout.setVerticalGroup(
            panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarReservacion1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHabitacionRealizar1)
                    .addComponent(txtHabitacionRegistroAca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreRegistroAca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreRealizar1))
                .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRealizarReservacion1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panRealizarReservacion1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefonoRealizar1)
                            .addComponent(txtTelefonoRegistroAca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNocheRealizar1)
                    .addComponent(txtNochesRegistroAca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarRegistroAca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBorrarRegistro4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtConsultaRegistrosAca.setBackground(new java.awt.Color(102, 204, 255));
        JtConsultaRegistrosAca.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        JtConsultaRegistrosAca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitacion", "Nombre", "Telefono", "Noches", "Fecha"
            }
        ));
        jScrollPane3.setViewportView(JtConsultaRegistrosAca);

        javax.swing.GroupLayout panJTIAcapulcoTopLayout = new javax.swing.GroupLayout(panJTIAcapulcoTop);
        panJTIAcapulcoTop.setLayout(panJTIAcapulcoTopLayout);
        panJTIAcapulcoTopLayout.setHorizontalGroup(
            panJTIAcapulcoTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIAcapulcoTopLayout.createSequentialGroup()
                .addComponent(panRealizarReservacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        panJTIAcapulcoTopLayout.setVerticalGroup(
            panJTIAcapulcoTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panRealizarReservacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );

        javax.swing.GroupLayout panJTAcapulcoLayout = new javax.swing.GroupLayout(panJTAcapulco);
        panJTAcapulco.setLayout(panJTAcapulcoLayout);
        panJTAcapulcoLayout.setHorizontalGroup(
            panJTAcapulcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTAcapulcoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panJTAcapulcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panJTAcapulcoLayout.createSequentialGroup()
                        .addComponent(panJTAcapulcoTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panJTBuscarReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 305, Short.MAX_VALUE))
                    .addComponent(panJTAcapulcoMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTAcapulcoTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTIAcapulcoTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panJTAcapulcoLayout.setVerticalGroup(
            panJTAcapulcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTAcapulcoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(panJTAcapulcoTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panJTAcapulcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panJTAcapulcoTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTBuscarReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panJTAcapulcoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTIAcapulcoTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpManejoHoteles.addTab("Acapulco", panJTAcapulco);

        panJTILaPazMedio.setBackground(new java.awt.Color(51, 51, 51));
        panJTILaPazMedio.setForeground(new java.awt.Color(102, 102, 102));

        panJTCDMXTopMedio2.setBackground(new java.awt.Color(51, 51, 51));
        panJTCDMXTopMedio2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registros:");

        javax.swing.GroupLayout panJTCDMXTopMedio2Layout = new javax.swing.GroupLayout(panJTCDMXTopMedio2);
        panJTCDMXTopMedio2.setLayout(panJTCDMXTopMedio2Layout);
        panJTCDMXTopMedio2Layout.setHorizontalGroup(
            panJTCDMXTopMedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTCDMXTopMedio2Layout.setVerticalGroup(
            panJTCDMXTopMedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblRealizarReservacion2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRealizarReservacion2.setForeground(new java.awt.Color(255, 255, 255));
        lblRealizarReservacion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRealizarReservacion2.setText("Realizar Reservacion");

        javax.swing.GroupLayout panJTILaPazMedioLayout = new javax.swing.GroupLayout(panJTILaPazMedio);
        panJTILaPazMedio.setLayout(panJTILaPazMedioLayout);
        panJTILaPazMedioLayout.setHorizontalGroup(
            panJTILaPazMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTILaPazMedioLayout.createSequentialGroup()
                .addComponent(lblRealizarReservacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTCDMXTopMedio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        panJTILaPazMedioLayout.setVerticalGroup(
            panJTILaPazMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTCDMXTopMedio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRealizarReservacion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTILaPazTop.setBackground(new java.awt.Color(255, 255, 255));
        panJTILaPazTop.setForeground(new java.awt.Color(102, 102, 102));

        lblImagenHotelLaPaz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenHotelLaPaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LaPaz.jpg"))); // NOI18N
        lblImagenHotelLaPaz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panJTILaPazTopLayout = new javax.swing.GroupLayout(panJTILaPazTop);
        panJTILaPazTop.setLayout(panJTILaPazTopLayout);
        panJTILaPazTopLayout.setHorizontalGroup(
            panJTILaPazTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTILaPazTopLayout.createSequentialGroup()
                .addComponent(lblImagenHotelLaPaz)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        panJTILaPazTopLayout.setVerticalGroup(
            panJTILaPazTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenHotelLaPaz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE)
        );

        panJTILaPazTop1.setBackground(new java.awt.Color(51, 51, 51));
        panJTILaPazTop1.setForeground(new java.awt.Color(102, 102, 102));

        panJTLaPazTopCenter.setBackground(new java.awt.Color(51, 51, 51));
        panJTLaPazTopCenter.setForeground(new java.awt.Color(102, 102, 102));

        lblJTLaPaz.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTLaPaz.setForeground(new java.awt.Color(255, 255, 255));
        lblJTLaPaz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTLaPaz.setText("La Paz");

        javax.swing.GroupLayout panJTLaPazTopCenterLayout = new javax.swing.GroupLayout(panJTLaPazTopCenter);
        panJTLaPazTopCenter.setLayout(panJTLaPazTopCenterLayout);
        panJTLaPazTopCenterLayout.setHorizontalGroup(
            panJTLaPazTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTLaPaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTLaPazTopCenterLayout.setVerticalGroup(
            panJTLaPazTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTLaPaz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblJTGranti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTGranti.setForeground(new java.awt.Color(255, 255, 255));
        lblJTGranti.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJTGranti.setText("Hotel: Granti ");

        lblCapacidad20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCapacidad20.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidad20.setText("Capacidad: 20 Habitaciones");

        javax.swing.GroupLayout panJTILaPazTop1Layout = new javax.swing.GroupLayout(panJTILaPazTop1);
        panJTILaPazTop1.setLayout(panJTILaPazTop1Layout);
        panJTILaPazTop1Layout.setHorizontalGroup(
            panJTILaPazTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTILaPazTop1Layout.createSequentialGroup()
                .addComponent(lblJTGranti, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTLaPazTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCapacidad20, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panJTILaPazTop1Layout.setVerticalGroup(
            panJTILaPazTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTLaPazTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panJTILaPazTop1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblJTGranti))
            .addComponent(lblCapacidad20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTInicioTopCenter9.setBackground(new java.awt.Color(255, 255, 255));
        panJTInicioTopCenter9.setForeground(new java.awt.Color(102, 102, 102));

        txtNombreVerifiLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreVerifiLpz.setBorder(null);

        lblNombreBuscar2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombreBuscar2.setText("Nombre:");

        lblFechaBuscar2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFechaBuscar2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFechaBuscar2.setText("Fecha:");

        txtFechaVerifiLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFechaVerifiLpz.setBorder(null);

        lblBuscarReservacion2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBuscarReservacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarReservacion2.setText("Buscar Reservacion");

        btnVerificarReservacionLpz.setBackground(new java.awt.Color(0, 0, 0));
        btnVerificarReservacionLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerificarReservacionLpz.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificarReservacionLpz.setText("Verificar Reservacion");
        btnVerificarReservacionLpz.setBorder(null);
        btnVerificarReservacionLpz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerificarReservacionLpzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerificarReservacionLpzMouseExited(evt);
            }
        });
        btnVerificarReservacionLpz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarReservacionLpzActionPerformed(evt);
            }
        });

        panRightImagen2.setBackground(new java.awt.Color(255, 255, 255));

        lblLogoRight2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoRight2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMontageCirculo.png"))); // NOI18N

        javax.swing.GroupLayout panRightImagen2Layout = new javax.swing.GroupLayout(panRightImagen2);
        panRightImagen2.setLayout(panRightImagen2Layout);
        panRightImagen2Layout.setHorizontalGroup(
            panRightImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoRight2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panRightImagen2Layout.setVerticalGroup(
            panRightImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoRight2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTInicioTopCenter9Layout = new javax.swing.GroupLayout(panJTInicioTopCenter9);
        panJTInicioTopCenter9.setLayout(panJTInicioTopCenter9Layout);
        panJTInicioTopCenter9Layout.setHorizontalGroup(
            panJTInicioTopCenter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTopCenter9Layout.createSequentialGroup()
                .addGroup(panJTInicioTopCenter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panJTInicioTopCenter9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panJTInicioTopCenter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerificarReservacionLpz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panJTInicioTopCenter9Layout.createSequentialGroup()
                                .addGroup(panJTInicioTopCenter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombreBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFechaBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panJTInicioTopCenter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaVerifiLpz)
                                    .addComponent(jSeparator22)
                                    .addGroup(panJTInicioTopCenter9Layout.createSequentialGroup()
                                        .addGroup(panJTInicioTopCenter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombreVerifiLpz, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(jSeparator23))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(5, 5, 5))
                    .addComponent(lblBuscarReservacion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panRightImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panJTInicioTopCenter9Layout.setVerticalGroup(
            panJTInicioTopCenter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panJTInicioTopCenter9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBuscarReservacion2)
                .addGap(45, 45, 45)
                .addGroup(panJTInicioTopCenter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreVerifiLpz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreBuscar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panJTInicioTopCenter9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaVerifiLpz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnVerificarReservacionLpz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panRightImagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTILaPazTop2.setBackground(new java.awt.Color(255, 255, 255));
        panJTILaPazTop2.setForeground(new java.awt.Color(102, 102, 102));

        panRealizarReservacion2.setBackground(new java.awt.Color(255, 255, 255));
        panRealizarReservacion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panRealizarReservacion2.setForeground(new java.awt.Color(102, 102, 102));

        lblHabitacionRealizar2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblHabitacionRealizar2.setText("Habitacion:");

        lblNombreRealizar2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNombreRealizar2.setText("Nombre:");

        lblTelefonoRealizar2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblTelefonoRealizar2.setText("Telefono:");

        lblNocheRealizar2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNocheRealizar2.setText("Noches:");

        txtNombreRegistroLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreRegistroLpz.setBorder(null);

        txtHabitacionRegistroLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHabitacionRegistroLpz.setBorder(null);

        txtTelefonoRegistroLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTelefonoRegistroLpz.setBorder(null);
        txtTelefonoRegistroLpz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoRegistroLpzActionPerformed(evt);
            }
        });

        txtNochesRegistroLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNochesRegistroLpz.setBorder(null);

        btnIngresarRegistroLpz.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresarRegistroLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresarRegistroLpz.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarRegistroLpz.setText("Ingresar");
        btnIngresarRegistroLpz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarRegistroLpzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarRegistroLpzMouseExited(evt);
            }
        });
        btnIngresarRegistroLpz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarRegistroLpzActionPerformed(evt);
            }
        });

        panBorrarRegistro5.setBackground(new java.awt.Color(255, 255, 255));

        panBorrarRegistroTop4.setBackground(new java.awt.Color(51, 51, 51));

        lblVerRegistros2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVerRegistros2.setForeground(new java.awt.Color(255, 255, 255));
        lblVerRegistros2.setText("Ver Registros");

        javax.swing.GroupLayout panBorrarRegistroTop4Layout = new javax.swing.GroupLayout(panBorrarRegistroTop4);
        panBorrarRegistroTop4.setLayout(panBorrarRegistroTop4Layout);
        panBorrarRegistroTop4Layout.setHorizontalGroup(
            panBorrarRegistroTop4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerRegistros2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panBorrarRegistroTop4Layout.setVerticalGroup(
            panBorrarRegistroTop4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerRegistros2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panVerRegistros5.setBackground(new java.awt.Color(255, 255, 255));

        btnBorrarRegistroLpz.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarRegistroLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBorrarRegistroLpz.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarRegistroLpz.setText("Borrar");
        btnBorrarRegistroLpz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarRegistroLpzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarRegistroLpzMouseExited(evt);
            }
        });
        btnBorrarRegistroLpz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegistroLpzActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVerRegistros5Layout = new javax.swing.GroupLayout(panVerRegistros5);
        panVerRegistros5.setLayout(panVerRegistros5Layout);
        panVerRegistros5Layout.setHorizontalGroup(
            panVerRegistros5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVerRegistros5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrarRegistroLpz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        panVerRegistros5Layout.setVerticalGroup(
            panVerRegistros5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVerRegistros5Layout.createSequentialGroup()
                .addComponent(btnBorrarRegistroLpz)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));

        lblActualizarRegistro2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblActualizarRegistro2.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizarRegistro2.setText("Actualizar Registro");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarRegistro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarRegistro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnVerRegistrosLpz.setBackground(new java.awt.Color(0, 0, 0));
        btnVerRegistrosLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerRegistrosLpz.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRegistrosLpz.setText("Ver");
        btnVerRegistrosLpz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerRegistrosLpzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerRegistrosLpzMouseExited(evt);
            }
        });
        btnVerRegistrosLpz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistrosLpzActionPerformed(evt);
            }
        });

        btnActualizarLpz.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarLpz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnActualizarLpz.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarLpz.setText("Actualizar");
        btnActualizarLpz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarLpzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarLpzMouseExited(evt);
            }
        });
        btnActualizarLpz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLpzActionPerformed(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));

        lblBorrarRegistro4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBorrarRegistro4.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrarRegistro4.setText("Borrar Registro");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarRegistro4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarRegistro4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panBorrarRegistro5Layout = new javax.swing.GroupLayout(panBorrarRegistro5);
        panBorrarRegistro5.setLayout(panBorrarRegistro5Layout);
        panBorrarRegistro5Layout.setHorizontalGroup(
            panBorrarRegistro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBorrarRegistroTop4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panVerRegistros5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBorrarRegistro5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panBorrarRegistro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerRegistrosLpz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarLpz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
        );
        panBorrarRegistro5Layout.setVerticalGroup(
            panBorrarRegistro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorrarRegistro5Layout.createSequentialGroup()
                .addComponent(panBorrarRegistroTop4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerRegistrosLpz)
                .addGap(13, 13, 13)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarLpz)
                .addGap(14, 14, 14)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panVerRegistros5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panRealizarReservacion2Layout = new javax.swing.GroupLayout(panRealizarReservacion2);
        panRealizarReservacion2.setLayout(panRealizarReservacion2Layout);
        panRealizarReservacion2Layout.setHorizontalGroup(
            panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarReservacion2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panRealizarReservacion2Layout.createSequentialGroup()
                            .addComponent(lblHabitacionRealizar2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHabitacionRegistroLpz))
                        .addGroup(panRealizarReservacion2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTelefonoRealizar2)
                                .addComponent(lblNocheRealizar2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator27)
                                .addComponent(txtNochesRegistroLpz, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator26)
                                .addComponent(txtTelefonoRegistroLpz, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panRealizarReservacion2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(lblNombreRealizar2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreRegistroLpz, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRealizarReservacion2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresarRegistroLpz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addComponent(panBorrarRegistro5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panRealizarReservacion2Layout.setVerticalGroup(
            panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarReservacion2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHabitacionRealizar2)
                    .addComponent(txtHabitacionRegistroLpz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreRegistroLpz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreRealizar2))
                .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRealizarReservacion2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panRealizarReservacion2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefonoRealizar2)
                            .addComponent(txtTelefonoRegistroLpz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRealizarReservacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNocheRealizar2)
                    .addComponent(txtNochesRegistroLpz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarRegistroLpz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBorrarRegistro5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtConsultaRegistrosLpz.setBackground(new java.awt.Color(255, 204, 102));
        JtConsultaRegistrosLpz.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        JtConsultaRegistrosLpz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitacion", "Nombre", "Telefono", "Noches", "Fecha"
            }
        ));
        jScrollPane4.setViewportView(JtConsultaRegistrosLpz);

        javax.swing.GroupLayout panJTILaPazTop2Layout = new javax.swing.GroupLayout(panJTILaPazTop2);
        panJTILaPazTop2.setLayout(panJTILaPazTop2Layout);
        panJTILaPazTop2Layout.setHorizontalGroup(
            panJTILaPazTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTILaPazTop2Layout.createSequentialGroup()
                .addComponent(panRealizarReservacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        panJTILaPazTop2Layout.setVerticalGroup(
            panJTILaPazTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panRealizarReservacion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
        );

        javax.swing.GroupLayout panJTLaPazLayout = new javax.swing.GroupLayout(panJTLaPaz);
        panJTLaPaz.setLayout(panJTLaPazLayout);
        panJTLaPazLayout.setHorizontalGroup(
            panJTLaPazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTLaPazLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panJTLaPazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panJTLaPazLayout.createSequentialGroup()
                        .addComponent(panJTILaPazTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panJTInicioTopCenter9, javax.swing.GroupLayout.PREFERRED_SIZE, 305, Short.MAX_VALUE))
                    .addComponent(panJTILaPazMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTILaPazTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTILaPazTop2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panJTLaPazLayout.setVerticalGroup(
            panJTLaPazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTLaPazLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(panJTILaPazTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panJTLaPazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panJTILaPazTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTInicioTopCenter9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panJTILaPazMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTILaPazTop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpManejoHoteles.addTab("La Paz", panJTLaPaz);

        panJTIQuintMedio.setBackground(new java.awt.Color(51, 51, 51));
        panJTIQuintMedio.setForeground(new java.awt.Color(102, 102, 102));

        panJTQuintTopMedio1.setBackground(new java.awt.Color(51, 51, 51));
        panJTQuintTopMedio1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registros:");

        javax.swing.GroupLayout panJTQuintTopMedio1Layout = new javax.swing.GroupLayout(panJTQuintTopMedio1);
        panJTQuintTopMedio1.setLayout(panJTQuintTopMedio1Layout);
        panJTQuintTopMedio1Layout.setHorizontalGroup(
            panJTQuintTopMedio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTQuintTopMedio1Layout.setVerticalGroup(
            panJTQuintTopMedio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblRealizarReservacion3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRealizarReservacion3.setForeground(new java.awt.Color(255, 255, 255));
        lblRealizarReservacion3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRealizarReservacion3.setText("Realizar Reservacion");

        javax.swing.GroupLayout panJTIQuintMedioLayout = new javax.swing.GroupLayout(panJTIQuintMedio);
        panJTIQuintMedio.setLayout(panJTIQuintMedioLayout);
        panJTIQuintMedioLayout.setHorizontalGroup(
            panJTIQuintMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIQuintMedioLayout.createSequentialGroup()
                .addComponent(lblRealizarReservacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTQuintTopMedio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        panJTIQuintMedioLayout.setVerticalGroup(
            panJTIQuintMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTQuintTopMedio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRealizarReservacion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTIQuintTop.setBackground(new java.awt.Color(255, 255, 255));
        panJTIQuintTop.setForeground(new java.awt.Color(102, 102, 102));

        lblImagenHotelQuint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenHotelQuint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/QuinRoo.jpg"))); // NOI18N
        lblImagenHotelQuint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panJTIQuintTopLayout = new javax.swing.GroupLayout(panJTIQuintTop);
        panJTIQuintTop.setLayout(panJTIQuintTopLayout);
        panJTIQuintTopLayout.setHorizontalGroup(
            panJTIQuintTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIQuintTopLayout.createSequentialGroup()
                .addComponent(lblImagenHotelQuint)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        panJTIQuintTopLayout.setVerticalGroup(
            panJTIQuintTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenHotelQuint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE)
        );

        panJTQuintTop1.setBackground(new java.awt.Color(51, 51, 51));
        panJTQuintTop1.setForeground(new java.awt.Color(102, 102, 102));

        panJTQuintTopCenter.setBackground(new java.awt.Color(51, 51, 51));
        panJTQuintTopCenter.setForeground(new java.awt.Color(102, 102, 102));

        lblJTQuint.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTQuint.setForeground(new java.awt.Color(255, 255, 255));
        lblJTQuint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTQuint.setText("Quintana Roo");

        javax.swing.GroupLayout panJTQuintTopCenterLayout = new javax.swing.GroupLayout(panJTQuintTopCenter);
        panJTQuintTopCenter.setLayout(panJTQuintTopCenterLayout);
        panJTQuintTopCenterLayout.setHorizontalGroup(
            panJTQuintTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTQuint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTQuintTopCenterLayout.setVerticalGroup(
            panJTQuintTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTQuint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblJTHotelSinupa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTHotelSinupa.setForeground(new java.awt.Color(255, 255, 255));
        lblJTHotelSinupa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJTHotelSinupa.setText("Hotel: Sinupa");

        lblCapacidad25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCapacidad25.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidad25.setText("Capacidad: 25 Habitaciones");

        javax.swing.GroupLayout panJTQuintTop1Layout = new javax.swing.GroupLayout(panJTQuintTop1);
        panJTQuintTop1.setLayout(panJTQuintTop1Layout);
        panJTQuintTop1Layout.setHorizontalGroup(
            panJTQuintTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTQuintTop1Layout.createSequentialGroup()
                .addComponent(lblJTHotelSinupa, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTQuintTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCapacidad25, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panJTQuintTop1Layout.setVerticalGroup(
            panJTQuintTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTQuintTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panJTQuintTop1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblJTHotelSinupa))
            .addComponent(lblCapacidad25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTInicioTopCenter10.setBackground(new java.awt.Color(255, 255, 255));
        panJTInicioTopCenter10.setForeground(new java.awt.Color(102, 102, 102));

        txtNombreVerifiQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreVerifiQuin.setBorder(null);

        lblNombreBuscar3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombreBuscar3.setText("Nombre:");

        lblFechaBuscar3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFechaBuscar3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFechaBuscar3.setText("Fecha:");

        txtFechaVerifiQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFechaVerifiQuin.setBorder(null);

        lblBuscarReservacion3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBuscarReservacion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarReservacion3.setText("Buscar Reservacion");

        btnVerificarReservacionQuin.setBackground(new java.awt.Color(0, 0, 0));
        btnVerificarReservacionQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerificarReservacionQuin.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificarReservacionQuin.setText("Verificar Reservacion");
        btnVerificarReservacionQuin.setBorder(null);
        btnVerificarReservacionQuin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerificarReservacionQuinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerificarReservacionQuinMouseExited(evt);
            }
        });
        btnVerificarReservacionQuin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarReservacionQuinActionPerformed(evt);
            }
        });

        panRightImagen3.setBackground(new java.awt.Color(255, 255, 255));

        lblLogoRight3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoRight3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMontageCirculo.png"))); // NOI18N

        javax.swing.GroupLayout panRightImagen3Layout = new javax.swing.GroupLayout(panRightImagen3);
        panRightImagen3.setLayout(panRightImagen3Layout);
        panRightImagen3Layout.setHorizontalGroup(
            panRightImagen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoRight3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panRightImagen3Layout.setVerticalGroup(
            panRightImagen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoRight3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTInicioTopCenter10Layout = new javax.swing.GroupLayout(panJTInicioTopCenter10);
        panJTInicioTopCenter10.setLayout(panJTInicioTopCenter10Layout);
        panJTInicioTopCenter10Layout.setHorizontalGroup(
            panJTInicioTopCenter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTopCenter10Layout.createSequentialGroup()
                .addGroup(panJTInicioTopCenter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panJTInicioTopCenter10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panJTInicioTopCenter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerificarReservacionQuin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panJTInicioTopCenter10Layout.createSequentialGroup()
                                .addGroup(panJTInicioTopCenter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombreBuscar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFechaBuscar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panJTInicioTopCenter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaVerifiQuin)
                                    .addComponent(jSeparator29)
                                    .addGroup(panJTInicioTopCenter10Layout.createSequentialGroup()
                                        .addGroup(panJTInicioTopCenter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombreVerifiQuin, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(jSeparator30))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(5, 5, 5))
                    .addComponent(lblBuscarReservacion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panRightImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panJTInicioTopCenter10Layout.setVerticalGroup(
            panJTInicioTopCenter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panJTInicioTopCenter10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBuscarReservacion3)
                .addGap(45, 45, 45)
                .addGroup(panJTInicioTopCenter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreVerifiQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreBuscar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panJTInicioTopCenter10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaVerifiQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaBuscar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnVerificarReservacionQuin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panRightImagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTIRealizarReservacion.setBackground(new java.awt.Color(255, 255, 255));
        panJTIRealizarReservacion.setForeground(new java.awt.Color(102, 102, 102));

        panRealizarReservacion3.setBackground(new java.awt.Color(255, 255, 255));
        panRealizarReservacion3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panRealizarReservacion3.setForeground(new java.awt.Color(102, 102, 102));

        lblHabitacionRealizar3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblHabitacionRealizar3.setText("Habitacion:");

        lblNombreRealizar3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNombreRealizar3.setText("Nombre:");

        lblTelefonoRealizar3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblTelefonoRealizar3.setText("Telefono:");

        lblNocheRealizar3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNocheRealizar3.setText("Noches:");

        txtNombreRegistroQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreRegistroQuin.setBorder(null);

        txtHabitacionRegistroQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHabitacionRegistroQuin.setBorder(null);

        txtTelefonoRegistroQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTelefonoRegistroQuin.setBorder(null);
        txtTelefonoRegistroQuin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoRegistroQuinActionPerformed(evt);
            }
        });

        txtNochesRegistroQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNochesRegistroQuin.setBorder(null);

        btnIngresarRegistroQuin.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresarRegistroQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresarRegistroQuin.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarRegistroQuin.setText("Ingresar");
        btnIngresarRegistroQuin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarRegistroQuinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarRegistroQuinMouseExited(evt);
            }
        });
        btnIngresarRegistroQuin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarRegistroQuinActionPerformed(evt);
            }
        });

        panBorrarRegistro6.setBackground(new java.awt.Color(255, 255, 255));

        panBorrarRegistroTop5.setBackground(new java.awt.Color(51, 51, 51));

        lblVerRegistros3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVerRegistros3.setForeground(new java.awt.Color(255, 255, 255));
        lblVerRegistros3.setText("Ver Registros");

        javax.swing.GroupLayout panBorrarRegistroTop5Layout = new javax.swing.GroupLayout(panBorrarRegistroTop5);
        panBorrarRegistroTop5.setLayout(panBorrarRegistroTop5Layout);
        panBorrarRegistroTop5Layout.setHorizontalGroup(
            panBorrarRegistroTop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerRegistros3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panBorrarRegistroTop5Layout.setVerticalGroup(
            panBorrarRegistroTop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerRegistros3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panVerRegistros6.setBackground(new java.awt.Color(255, 255, 255));

        btnBorrarRegistroQuin.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarRegistroQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBorrarRegistroQuin.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarRegistroQuin.setText("Borrar");
        btnBorrarRegistroQuin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarRegistroQuinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarRegistroQuinMouseExited(evt);
            }
        });
        btnBorrarRegistroQuin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegistroQuinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVerRegistros6Layout = new javax.swing.GroupLayout(panVerRegistros6);
        panVerRegistros6.setLayout(panVerRegistros6Layout);
        panVerRegistros6Layout.setHorizontalGroup(
            panVerRegistros6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVerRegistros6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrarRegistroQuin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        panVerRegistros6Layout.setVerticalGroup(
            panVerRegistros6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVerRegistros6Layout.createSequentialGroup()
                .addComponent(btnBorrarRegistroQuin)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));

        lblActualizarRegistro3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblActualizarRegistro3.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizarRegistro3.setText("Actualizar Registro");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarRegistro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarRegistro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnVerRegistrosQuin.setBackground(new java.awt.Color(0, 0, 0));
        btnVerRegistrosQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerRegistrosQuin.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRegistrosQuin.setText("Ver");
        btnVerRegistrosQuin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerRegistrosQuinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerRegistrosQuinMouseExited(evt);
            }
        });
        btnVerRegistrosQuin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistrosQuinActionPerformed(evt);
            }
        });

        btnActualizarQuin.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarQuin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnActualizarQuin.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarQuin.setText("Actualizar");
        btnActualizarQuin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarQuinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarQuinMouseExited(evt);
            }
        });
        btnActualizarQuin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarQuinActionPerformed(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));

        lblBorrarRegistro5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBorrarRegistro5.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrarRegistro5.setText("Borrar Registro");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarRegistro5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrarRegistro5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panBorrarRegistro6Layout = new javax.swing.GroupLayout(panBorrarRegistro6);
        panBorrarRegistro6.setLayout(panBorrarRegistro6Layout);
        panBorrarRegistro6Layout.setHorizontalGroup(
            panBorrarRegistro6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBorrarRegistroTop5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panVerRegistros6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBorrarRegistro6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panBorrarRegistro6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerRegistrosQuin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarQuin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
        );
        panBorrarRegistro6Layout.setVerticalGroup(
            panBorrarRegistro6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorrarRegistro6Layout.createSequentialGroup()
                .addComponent(panBorrarRegistroTop5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerRegistrosQuin)
                .addGap(13, 13, 13)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarQuin)
                .addGap(14, 14, 14)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panVerRegistros6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panRealizarReservacion3Layout = new javax.swing.GroupLayout(panRealizarReservacion3);
        panRealizarReservacion3.setLayout(panRealizarReservacion3Layout);
        panRealizarReservacion3Layout.setHorizontalGroup(
            panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarReservacion3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panRealizarReservacion3Layout.createSequentialGroup()
                            .addComponent(lblHabitacionRealizar3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHabitacionRegistroQuin))
                        .addGroup(panRealizarReservacion3Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTelefonoRealizar3)
                                .addComponent(lblNocheRealizar3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator34)
                                .addComponent(txtNochesRegistroQuin, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator33)
                                .addComponent(txtTelefonoRegistroQuin, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panRealizarReservacion3Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(lblNombreRealizar3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreRegistroQuin, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRealizarReservacion3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresarRegistroQuin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addComponent(panBorrarRegistro6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panRealizarReservacion3Layout.setVerticalGroup(
            panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarReservacion3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHabitacionRealizar3)
                    .addComponent(txtHabitacionRegistroQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreRegistroQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreRealizar3))
                .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRealizarReservacion3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panRealizarReservacion3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefonoRealizar3)
                            .addComponent(txtTelefonoRegistroQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRealizarReservacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNocheRealizar3)
                    .addComponent(txtNochesRegistroQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarRegistroQuin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBorrarRegistro6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtConsultaRegistrosQuin.setBackground(new java.awt.Color(255, 255, 153));
        JtConsultaRegistrosQuin.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        JtConsultaRegistrosQuin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitacion", "Nombre", "Telefono", "Noches", "Fecha"
            }
        ));
        jScrollPane5.setViewportView(JtConsultaRegistrosQuin);

        javax.swing.GroupLayout panJTIRealizarReservacionLayout = new javax.swing.GroupLayout(panJTIRealizarReservacion);
        panJTIRealizarReservacion.setLayout(panJTIRealizarReservacionLayout);
        panJTIRealizarReservacionLayout.setHorizontalGroup(
            panJTIRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIRealizarReservacionLayout.createSequentialGroup()
                .addComponent(panRealizarReservacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        panJTIRealizarReservacionLayout.setVerticalGroup(
            panJTIRealizarReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panRealizarReservacion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5)
        );

        javax.swing.GroupLayout panJTQuintanaRooLayout = new javax.swing.GroupLayout(panJTQuintanaRoo);
        panJTQuintanaRoo.setLayout(panJTQuintanaRooLayout);
        panJTQuintanaRooLayout.setHorizontalGroup(
            panJTQuintanaRooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTQuintanaRooLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panJTQuintanaRooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panJTQuintanaRooLayout.createSequentialGroup()
                        .addComponent(panJTIQuintTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panJTInicioTopCenter10, javax.swing.GroupLayout.PREFERRED_SIZE, 305, Short.MAX_VALUE))
                    .addComponent(panJTIQuintMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTQuintTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTIRealizarReservacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panJTQuintanaRooLayout.setVerticalGroup(
            panJTQuintanaRooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTQuintanaRooLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(panJTQuintTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panJTQuintanaRooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panJTIQuintTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTInicioTopCenter10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panJTIQuintMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTIRealizarReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpManejoHoteles.addTab("QuintanaRoo", panJTQuintanaRoo);

        panJTIQuintMedio1.setBackground(new java.awt.Color(51, 51, 51));
        panJTIQuintMedio1.setForeground(new java.awt.Color(102, 102, 102));

        panJTQuintTopMedio2.setBackground(new java.awt.Color(51, 51, 51));
        panJTQuintTopMedio2.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panJTQuintTopMedio2Layout = new javax.swing.GroupLayout(panJTQuintTopMedio2);
        panJTQuintTopMedio2.setLayout(panJTQuintTopMedio2Layout);
        panJTQuintTopMedio2Layout.setHorizontalGroup(
            panJTQuintTopMedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        panJTQuintTopMedio2Layout.setVerticalGroup(
            panJTQuintTopMedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblRealizarReservacion4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRealizarReservacion4.setForeground(new java.awt.Color(255, 255, 255));
        lblRealizarReservacion4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRealizarReservacion4.setText("Realizar Registro De Evento");

        javax.swing.GroupLayout panJTIQuintMedio1Layout = new javax.swing.GroupLayout(panJTIQuintMedio1);
        panJTIQuintMedio1.setLayout(panJTIQuintMedio1Layout);
        panJTIQuintMedio1Layout.setHorizontalGroup(
            panJTIQuintMedio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIQuintMedio1Layout.createSequentialGroup()
                .addComponent(lblRealizarReservacion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panJTQuintTopMedio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(263, 263, 263))
        );
        panJTIQuintMedio1Layout.setVerticalGroup(
            panJTIQuintMedio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTQuintTopMedio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRealizarReservacion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTIQuintTop1.setBackground(new java.awt.Color(255, 255, 255));
        panJTIQuintTop1.setForeground(new java.awt.Color(102, 102, 102));

        lblImagenHotelQuint1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenHotelQuint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rock-1771916_1920.jpg"))); // NOI18N
        lblImagenHotelQuint1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panJTIQuintTop1Layout = new javax.swing.GroupLayout(panJTIQuintTop1);
        panJTIQuintTop1.setLayout(panJTIQuintTop1Layout);
        panJTIQuintTop1Layout.setHorizontalGroup(
            panJTIQuintTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenHotelQuint1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panJTIQuintTop1Layout.setVerticalGroup(
            panJTIQuintTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenHotelQuint1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE)
        );

        panJTQuintTop2.setBackground(new java.awt.Color(51, 51, 51));
        panJTQuintTop2.setForeground(new java.awt.Color(102, 102, 102));

        panJTQuintTopCenter1.setBackground(new java.awt.Color(51, 51, 51));
        panJTQuintTopCenter1.setForeground(new java.awt.Color(102, 102, 102));

        lblJTQuint1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTQuint1.setForeground(new java.awt.Color(255, 255, 255));
        lblJTQuint1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTQuint1.setText("Eventos");

        javax.swing.GroupLayout panJTQuintTopCenter1Layout = new javax.swing.GroupLayout(panJTQuintTopCenter1);
        panJTQuintTopCenter1.setLayout(panJTQuintTopCenter1Layout);
        panJTQuintTopCenter1Layout.setHorizontalGroup(
            panJTQuintTopCenter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTQuint1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTQuintTopCenter1Layout.setVerticalGroup(
            panJTQuintTopCenter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTQuint1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTQuintTop2Layout = new javax.swing.GroupLayout(panJTQuintTop2);
        panJTQuintTop2.setLayout(panJTQuintTop2Layout);
        panJTQuintTop2Layout.setHorizontalGroup(
            panJTQuintTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTQuintTop2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(panJTQuintTopCenter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        panJTQuintTop2Layout.setVerticalGroup(
            panJTQuintTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTQuintTopCenter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTIRealizarReservacion1.setBackground(new java.awt.Color(255, 255, 255));
        panJTIRealizarReservacion1.setForeground(new java.awt.Color(102, 102, 102));

        panRealizarEvento.setBackground(new java.awt.Color(255, 255, 255));
        panRealizarEvento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panRealizarEvento.setForeground(new java.awt.Color(255, 255, 255));

        txtNombreEvento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreEvento.setBorder(null);

        lblNombreEvento.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNombreEvento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEvento.setText("Nombre del evento:");

        txtFechaInicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFechaInicio.setBorder(null);
        txtFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioActionPerformed(evt);
            }
        });

        lblFechaEvento.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblFechaEvento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFechaEvento.setText("Fecha del evento:");

        btnIngresarEvento.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresarEvento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarEvento.setText("Ingresar");
        btnIngresarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarEventoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarEventoMouseExited(evt);
            }
        });
        btnIngresarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEventoActionPerformed(evt);
            }
        });

        lblEnHotel.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblEnHotel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnHotel.setText("En hotel:");

        lstHoteles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lstHoteles.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "CDMX", "Acapulco", "La Paz", "Quintana Roo", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(lstHoteles);

        javax.swing.GroupLayout panRealizarEventoLayout = new javax.swing.GroupLayout(panRealizarEvento);
        panRealizarEvento.setLayout(panRealizarEventoLayout);
        panRealizarEventoLayout.setHorizontalGroup(
            panRealizarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarEventoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panRealizarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNombreEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblEnHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panRealizarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRealizarEventoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnIngresarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRealizarEventoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panRealizarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator40)
                            .addComponent(jSeparator35)
                            .addComponent(txtNombreEvento)
                            .addComponent(txtFechaInicio)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addGap(183, 183, 183))))
        );
        panRealizarEventoLayout.setVerticalGroup(
            panRealizarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRealizarEventoLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(panRealizarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEvento)
                    .addComponent(txtNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panRealizarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRealizarEventoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblEnHotel))
                    .addGroup(panRealizarEventoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(panRealizarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnIngresarEvento)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        panJTEventos.setBackground(new java.awt.Color(0, 153, 255));
        panJTEventos.setForeground(new java.awt.Color(0, 0, 153));
        panJTEventos.setMinimumSize(new java.awt.Dimension(455, 750));
        panJTEventos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floreseven.jpeg"))); // NOI18N
        jLabel13.setText("jLabel1");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panJTEventos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 160, 110));

        optMesa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        optMesa.setForeground(new java.awt.Color(255, 255, 255));
        optMesa.setText("Mesas de vidrio");
        panJTEventos.add(optMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 179, -1));

        optMantel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        optMantel.setForeground(new java.awt.Color(255, 255, 255));
        optMantel.setText("Manteles");
        panJTEventos.add(optMantel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 180, -1));

        optCentro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        optCentro.setForeground(new java.awt.Color(255, 255, 255));
        optCentro.setText("Centros de mesa");
        panJTEventos.add(optCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 180, -1));

        optLuces.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        optLuces.setForeground(new java.awt.Color(255, 255, 255));
        optLuces.setText("Luces Led");
        panJTEventos.add(optLuces, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 179, -1));

        optFlores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        optFlores.setForeground(new java.awt.Color(255, 255, 255));
        optFlores.setText("Flores");
        panJTEventos.add(optFlores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 179, -1));

        jSeparator36.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator36.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panJTEventos.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, 10));

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        panJTEventos.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 220, 10));

        jSeparator37.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator37.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        panJTEventos.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 220, 10));

        jSeparator38.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator38.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        panJTEventos.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 220, 10));

        jSeparator39.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator39.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        panJTEventos.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 710, 220, 10));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa.jpeg"))); // NOI18N
        jLabel14.setText("jLabel1");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panJTEventos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 160, 110));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/centromesa.jpg"))); // NOI18N
        jLabel15.setText("jLabel1");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panJTEventos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 110));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manteles.jpg"))); // NOI18N
        jLabel16.setText("jLabel1");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panJTEventos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 160, 110));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lucesled.jpg"))); // NOI18N
        jLabel17.setText("jLabel1");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panJTEventos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 160, 110));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Solicitar Elementos:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel18))
        );

        panJTEventos.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 430, 30));

        jtSolicitarEventos.setViewportView(panJTEventos);

        javax.swing.GroupLayout panJTIRealizarReservacion1Layout = new javax.swing.GroupLayout(panJTIRealizarReservacion1);
        panJTIRealizarReservacion1.setLayout(panJTIRealizarReservacion1Layout);
        panJTIRealizarReservacion1Layout.setHorizontalGroup(
            panJTIRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIRealizarReservacion1Layout.createSequentialGroup()
                .addComponent(panRealizarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtSolicitarEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        panJTIRealizarReservacion1Layout.setVerticalGroup(
            panJTIRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panRealizarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jtSolicitarEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTEventoLayout = new javax.swing.GroupLayout(panJTEvento);
        panJTEvento.setLayout(panJTEventoLayout);
        panJTEventoLayout.setHorizontalGroup(
            panJTEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panJTEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panJTIQuintMedio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTQuintTop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTIRealizarReservacion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTIQuintTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panJTEventoLayout.setVerticalGroup(
            panJTEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTEventoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(panJTQuintTop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTIQuintTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTIQuintMedio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTIRealizarReservacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpManejoHoteles.addTab("Solicitar", panJTEvento);

        javax.swing.GroupLayout panContenedorTJLayout = new javax.swing.GroupLayout(panContenedorTJ);
        panContenedorTJ.setLayout(panContenedorTJLayout);
        panContenedorTJLayout.setHorizontalGroup(
            panContenedorTJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpManejoHoteles)
        );
        panContenedorTJLayout.setVerticalGroup(
            panContenedorTJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpManejoHoteles)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panLogoMontage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panBarraTop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panContenedorTJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panLogoMontage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panBarraTop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panContenedorTJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnInicioMouseEntered
        panBtnInicio.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_lblBtnInicioMouseEntered

    private void panBtnCDMXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnCDMXMouseEntered
        panBtnCDMX.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_panBtnCDMXMouseEntered

    private void panBtnCDMXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnCDMXMouseExited
        panBtnCDMX.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panBtnCDMXMouseExited

    private void panBtnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnInicioMouseEntered
        panBtnInicio.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_panBtnInicioMouseEntered

    private void lblBtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnInicioMouseExited
        panBtnInicio.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_lblBtnInicioMouseExited

    private void panBtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnInicioMouseExited
        panBtnInicio.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panBtnInicioMouseExited

    private void lblBtnCDMXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCDMXMouseEntered
        panBtnCDMX.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_lblBtnCDMXMouseEntered

    private void lblBtnCDMXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCDMXMouseExited
        panBtnCDMX.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_lblBtnCDMXMouseExited

    private void lblBtnAcapulcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAcapulcoMouseEntered
        panBtnAcapulco.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_lblBtnAcapulcoMouseEntered

    private void lblBtnAcapulcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAcapulcoMouseExited
        panBtnAcapulco.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_lblBtnAcapulcoMouseExited

    private void panBtnAcapulcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnAcapulcoMouseEntered
        panBtnAcapulco.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_panBtnAcapulcoMouseEntered

    private void panBtnAcapulcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnAcapulcoMouseExited
        panBtnAcapulco.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panBtnAcapulcoMouseExited

    private void lblBtnLaPazMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnLaPazMouseEntered
        panBtnLaPaz.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_lblBtnLaPazMouseEntered

    private void lblBtnLaPazMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnLaPazMouseExited
        panBtnLaPaz.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_lblBtnLaPazMouseExited

    private void panBtnLaPazMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnLaPazMouseEntered
        panBtnLaPaz.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_panBtnLaPazMouseEntered

    private void panBtnLaPazMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnLaPazMouseExited
        panBtnLaPaz.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panBtnLaPazMouseExited

    private void lblBtnQuintanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnQuintanaMouseEntered
        panBtnQuintana.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_lblBtnQuintanaMouseEntered

    private void lblBtnQuintanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnQuintanaMouseExited
        panBtnQuintana.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_lblBtnQuintanaMouseExited

    private void panBtnQuintanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnQuintanaMouseEntered
        panBtnQuintana.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_panBtnQuintanaMouseEntered

    private void panBtnQuintanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnQuintanaMouseExited
        panBtnQuintana.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panBtnQuintanaMouseExited
       
    private void lblBtnSalirLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSalirLoginMouseEntered
        panSalirLogin.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_lblBtnSalirLoginMouseEntered

    private void lblBtnSalirLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSalirLoginMouseExited
        panSalirLogin.setBackground(new Color(204,0,51));
    }//GEN-LAST:event_lblBtnSalirLoginMouseExited

    private void lblBtnSalirLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSalirLoginMouseClicked
        // Boton salir a login
        Login salir = new Login();
        salir.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lblBtnSalirLoginMouseClicked

    private void lblBtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnInicioMouseClicked
        // boton mostrar panel inicio
        tpManejoHoteles.setSelectedComponent(panJTInicio);
    }//GEN-LAST:event_lblBtnInicioMouseClicked

    private void lblBtnCDMXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCDMXMouseClicked
        // boton mostrar panel CDMX
        tpManejoHoteles.setSelectedComponent(panJTCDMX);
    }//GEN-LAST:event_lblBtnCDMXMouseClicked

    private void lblBtnAcapulcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAcapulcoMouseClicked
        // boton mostrar panel Acapulco
        tpManejoHoteles.setSelectedComponent(panJTAcapulco);
    }//GEN-LAST:event_lblBtnAcapulcoMouseClicked

    private void lblBtnLaPazMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnLaPazMouseClicked
        // boton mostrar panel La Paz
        tpManejoHoteles.setSelectedComponent(panJTLaPaz);
    }//GEN-LAST:event_lblBtnLaPazMouseClicked

    private void lblBtnQuintanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnQuintanaMouseClicked
        // boton mostrar panel Quintana Roo
        tpManejoHoteles.setSelectedComponent(panJTQuintanaRoo);
    }//GEN-LAST:event_lblBtnQuintanaMouseClicked

    private void btnActualizarQuinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarQuinActionPerformed
        // Boton para actualizar registro quintana roo
        conBD.conectarBase(); // Conectar a la base de datos
        Connection conn = conBD.cn; // Obtener la conexión desde conBD
        PreparedStatement pstmt = null; // Preparar la declaración

        try {
            // Consulta SQL para actualizar los datos en la base de datos
            String sql = "UPDATE t_quintana SET Nombre = ?, Telefono = ?, Noches = ?, Fecha = ? WHERE Habitacion = ?";

            // Preparar la declaración
            pstmt = conn.prepareStatement(sql);

            // Obtener los datos modificados desde la tabla
            DefaultTableModel modeloDatos = (DefaultTableModel) JtConsultaRegistrosQuin.getModel();
            int rowCount = modeloDatos.getRowCount();

            for (int fila = 0; fila < rowCount; fila++) {
                // Obtener los datos de la fila actual
                String nombre = modeloDatos.getValueAt(fila, 1).toString();
                String telefono = modeloDatos.getValueAt(fila, 2).toString();
                int noches = Integer.parseInt(modeloDatos.getValueAt(fila, 3).toString());
                String fecha = modeloDatos.getValueAt(fila, 4).toString();
                int habitacion = Integer.parseInt(modeloDatos.getValueAt(fila, 0).toString());

                // Establecer los parámetros de la declaración
                pstmt.setString(1, nombre);
                pstmt.setString(2, telefono);
                pstmt.setInt(3, noches);
                pstmt.setString(4, fecha);
                pstmt.setInt(5, habitacion);

                // Ejecutar la actualización
                pstmt.executeUpdate();
            }

            // Cerrar PreparedStatement
            pstmt.close();

            // Actualizar la tabla en la interfaz gráfica si es necesario
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente en la base de datos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos en la base de datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                // No es necesario cerrar `conn` aquí si estás utilizando una conexión compartida
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnActualizarQuinActionPerformed

    private void btnActualizarQuinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarQuinMouseExited
        btnActualizarQuin.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnActualizarQuinMouseExited

    private void btnActualizarQuinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarQuinMouseEntered
        btnActualizarQuin.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnActualizarQuinMouseEntered

    private void btnVerRegistrosQuinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistrosQuinActionPerformed
        // Boton para ver registros Quintana Roo
        try {
            conBD.conectarBase();//llamada a metodo conectar
            //Objeto Almacenanamiento logico de datos modelo de datos ----------
            DefaultTableModel modeloDatos = new  DefaultTableModel();
            JtConsultaRegistrosQuin.setModel(modeloDatos); // Esto manda a imprimir a la table

            conBD.rs=conBD.stmt.executeQuery("select * from t_quintana");

            ResultSetMetaData rsmd = conBD.rs.getMetaData(); // mandamos a imprimir a la tabla
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Habitacion");
            modeloDatos.addColumn("Nombre");
            modeloDatos.addColumn("Telefono");
            modeloDatos.addColumn("Noches");
            modeloDatos.addColumn("Fecha");

            //imprimir registros
            while(conBD.rs.next()){
                Object fila [] = new Object[cantidadColumnas]; // almacen de un arreglo objeto
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=conBD.rs.getObject(i+1);
                }//termina for
                modeloDatos.addRow(fila);
            }//termina while
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 1 de BD al generar Alta\nVerifica\n"+e);
        }
    }//GEN-LAST:event_btnVerRegistrosQuinActionPerformed

    private void btnVerRegistrosQuinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRegistrosQuinMouseExited
        btnVerRegistrosQuin.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnVerRegistrosQuinMouseExited

    private void btnVerRegistrosQuinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRegistrosQuinMouseEntered
        btnVerRegistrosQuin.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnVerRegistrosQuinMouseEntered

    private void btnBorrarRegistroQuinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegistroQuinActionPerformed
        // boton borrar registro Quintana Roo
        // Conectar a la base de datos
        conBD.conectarBase(); // conexión a la base de datos

        // Verificar que hay una fila seleccionada
        if (JtConsultaRegistrosQuin.getSelectedRow() >= 0) {
            // Obtener el modelo de la tabla
            DefaultTableModel modeloDatos = (DefaultTableModel) JtConsultaRegistrosQuin.getModel();

            // Obtener el identificador único del registro (suponiendo que está en la primera columna)
            int selectedRow = JtConsultaRegistrosQuin.getSelectedRow();
            int idHabitacion = (int) modeloDatos.getValueAt(selectedRow, 0); // Ajusta el índice según tu tabla

            // Confirmar eliminación
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el registro?", "Sistema POO", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    // Eliminar el registro de la base de datos
                    String sql = "DELETE FROM t_quintana WHERE Habitacion = " + idHabitacion;
                    int confirmarBaja = conBD.stmt.executeUpdate(sql);

                    // Verificar si la eliminación fue exitosa
                    if (confirmarBaja == 1) {
                        // Eliminar la fila del JTable
                        modeloDatos.removeRow(selectedRow);
                        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar el registro.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error de base de datos al eliminar: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila.", "Sistema", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarRegistroQuinActionPerformed

    private void btnBorrarRegistroQuinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarRegistroQuinMouseExited
        btnBorrarRegistroQuin.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnBorrarRegistroQuinMouseExited

    private void btnBorrarRegistroQuinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarRegistroQuinMouseEntered
        btnBorrarRegistroQuin.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnBorrarRegistroQuinMouseEntered

    private void btnIngresarRegistroQuinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarRegistroQuinActionPerformed
        // boton ingresa registro Quintana Roo
        conBD.conectarBase(); // llamada a metodo conectar
        // Captura de datos desde formulario para el objeto hotelR
        hotelR.setIdHabitacion(Integer.parseInt(txtHabitacionRegistroQuin.getText()));
        hotelR.setNombre(txtNombreRegistroQuin.getText());
        hotelR.setTelefono(txtTelefonoRegistroQuin.getText());
        hotelR.setNoches(Integer.parseInt(txtNochesRegistroQuin.getText()));

        // variable objeto para insertar datos a la tabla
        String altaReserva = "INSERT into t_quintana values ('"+hotelR.getIdHabitacion()+"','"+hotelR.getNombre()+"','"+hotelR.getTelefono()+"','"+hotelR.getNoches()+"', '"+lblFecha.getText()+"')"; // las ' indica sql y " para java

        // estructura de tratamiento de errores
        try {
            conBD.stmt.executeUpdate(altaReserva); // conecion conBD y ejecucion de instruccion stmt
            JOptionPane.showMessageDialog(null, "Registro exitoso de nueva reserva\n\nActualiza datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos Alta reserva\n\nVerifica");
        }
    }//GEN-LAST:event_btnIngresarRegistroQuinActionPerformed

    private void btnIngresarRegistroQuinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarRegistroQuinMouseExited
        btnIngresarRegistroQuin.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnIngresarRegistroQuinMouseExited

    private void btnIngresarRegistroQuinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarRegistroQuinMouseEntered
        btnIngresarRegistroQuin.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnIngresarRegistroQuinMouseEntered

    private void txtTelefonoRegistroQuinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoRegistroQuinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoRegistroQuinActionPerformed

    private void btnVerificarReservacionQuinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarReservacionQuinActionPerformed
        // boton busqueda reserva Quintana Roo
        conBD.conectarBase();

        try {
            // campo distintivo para buscar nombre y fecha
            hotelR.setNombre(txtNombreVerifiQuin.getText());
            hotelR.setFecha(txtFechaVerifiQuin.getText());

            // Construcción de la consulta SQL correcta
            String sql = "SELECT * FROM t_quintana WHERE Nombre = '" + hotelR.getNombre() + "' AND Fecha = '" + hotelR.getFecha() + "'";
            conBD.rs = conBD.stmt.executeQuery(sql);

            // Mensaje de búsqueda
            JOptionPane.showMessageDialog(null, "Buscando reserva, por favor espere... \nGracias");

            if (conBD.rs.next()) { // si encontró datos
                DefaultTableModel modeloDatos = new DefaultTableModel();
                JtConsultaRegistrosQuin.setModel(modeloDatos);

                ResultSetMetaData rsmd = conBD.rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();
                modeloDatos.addColumn("Habitacion");
                modeloDatos.addColumn("Nombre");
                modeloDatos.addColumn("Telefono");
                modeloDatos.addColumn("Noches");
                modeloDatos.addColumn("Fecha");

                do {
                    Object[] fila = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = conBD.rs.getObject(i + 1);
                    }
                    modeloDatos.addRow(fila);
                } while (conBD.rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron reservas con los datos proporcionados.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva en la base de datos. Verifica\n" + e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnVerificarReservacionQuinActionPerformed

    private void btnVerificarReservacionQuinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarReservacionQuinMouseExited
        btnVerificarReservacionQuin.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnVerificarReservacionQuinMouseExited

    private void btnVerificarReservacionQuinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarReservacionQuinMouseEntered
        btnVerificarReservacionQuin.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnVerificarReservacionQuinMouseEntered

    private void btnActualizarLpzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLpzActionPerformed
        // Boton para actualizar registro La paz
        conBD.conectarBase(); // Conectar a la base de datos
        Connection conn = conBD.cn; // Obtener la conexión desde conBD
        PreparedStatement pstmt = null; // Preparar la declaración

        try {
            // Consulta SQL para actualizar los datos en la base de datos
            String sql = "UPDATE t_lapaz SET Nombre = ?, Telefono = ?, Noches = ?, Fecha = ? WHERE Habitacion = ?";

            // Preparar la declaración
            pstmt = conn.prepareStatement(sql);

            // Obtener los datos modificados desde la tabla
            DefaultTableModel modeloDatos = (DefaultTableModel) JtConsultaRegistrosLpz.getModel();
            int rowCount = modeloDatos.getRowCount();

            for (int fila = 0; fila < rowCount; fila++) {
                // Obtener los datos de la fila actual
                String nombre = modeloDatos.getValueAt(fila, 1).toString();
                String telefono = modeloDatos.getValueAt(fila, 2).toString();
                int noches = Integer.parseInt(modeloDatos.getValueAt(fila, 3).toString());
                String fecha = modeloDatos.getValueAt(fila, 4).toString();
                int habitacion = Integer.parseInt(modeloDatos.getValueAt(fila, 0).toString());

                // Establecer los parámetros de la declaración
                pstmt.setString(1, nombre);
                pstmt.setString(2, telefono);
                pstmt.setInt(3, noches);
                pstmt.setString(4, fecha);
                pstmt.setInt(5, habitacion);

                // Ejecutar la actualización
                pstmt.executeUpdate();
            }

            // Cerrar PreparedStatement
            pstmt.close();

            // Actualizar la tabla en la interfaz gráfica si es necesario
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente en la base de datos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos en la base de datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                // No es necesario cerrar `conn` aquí si estás utilizando una conexión compartida
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnActualizarLpzActionPerformed

    private void btnActualizarLpzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLpzMouseExited
        btnActualizarLpz.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnActualizarLpzMouseExited

    private void btnActualizarLpzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLpzMouseEntered
        btnActualizarLpz.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnActualizarLpzMouseEntered

    private void btnVerRegistrosLpzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistrosLpzActionPerformed
        // Boton para ver registros La Paz
        try {
            conBD.conectarBase();//llamada a metodo conectar
            //Objeto Almacenanamiento logico de datos modelo de datos ----------
            DefaultTableModel modeloDatos = new  DefaultTableModel();
            JtConsultaRegistrosLpz.setModel(modeloDatos); // Esto manda a imprimir a la table

            conBD.rs=conBD.stmt.executeQuery("select * from t_lapaz");

            ResultSetMetaData rsmd = conBD.rs.getMetaData(); // mandamos a imprimir a la tabla
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Habitacion");
            modeloDatos.addColumn("Nombre");
            modeloDatos.addColumn("Telefono");
            modeloDatos.addColumn("Noches");
            modeloDatos.addColumn("Fecha");

            //imprimir registros
            while(conBD.rs.next()){
                Object fila [] = new Object[cantidadColumnas]; // almacen de un arreglo objeto
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=conBD.rs.getObject(i+1);
                }//termina for
                modeloDatos.addRow(fila);
            }//termina while
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 1 de BD al generar Alta\nVerifica\n"+e);
        }
    }//GEN-LAST:event_btnVerRegistrosLpzActionPerformed

    private void btnVerRegistrosLpzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRegistrosLpzMouseExited
        btnVerRegistrosLpz.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnVerRegistrosLpzMouseExited

    private void btnVerRegistrosLpzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRegistrosLpzMouseEntered
        btnVerRegistrosLpz.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnVerRegistrosLpzMouseEntered

    private void btnBorrarRegistroLpzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegistroLpzActionPerformed
        // boton borrar registro La Paz
        // Conectar a la base de datos
        conBD.conectarBase(); // conexión a la base de datos

        // Verificar que hay una fila seleccionada
        if (JtConsultaRegistrosLpz.getSelectedRow() >= 0) {
            // Obtener el modelo de la tabla
            DefaultTableModel modeloDatos = (DefaultTableModel) JtConsultaRegistrosLpz.getModel();

            // Obtener el identificador único del registro (suponiendo que está en la primera columna)
            int selectedRow = JtConsultaRegistrosLpz.getSelectedRow();
            int idHabitacion = (int) modeloDatos.getValueAt(selectedRow, 0); // Ajusta el índice según tu tabla

            // Confirmar eliminación
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el registro?", "Sistema POO", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    // Eliminar el registro de la base de datos
                    String sql = "DELETE FROM t_lapaz WHERE Habitacion = " + idHabitacion;
                    int confirmarBaja = conBD.stmt.executeUpdate(sql);

                    // Verificar si la eliminación fue exitosa
                    if (confirmarBaja == 1) {
                        // Eliminar la fila del JTable
                        modeloDatos.removeRow(selectedRow);
                        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar el registro.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error de base de datos al eliminar: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila.", "Sistema", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarRegistroLpzActionPerformed

    private void btnBorrarRegistroLpzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarRegistroLpzMouseExited
        btnBorrarRegistroLpz.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnBorrarRegistroLpzMouseExited

    private void btnBorrarRegistroLpzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarRegistroLpzMouseEntered
        btnBorrarRegistroLpz.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnBorrarRegistroLpzMouseEntered

    private void btnIngresarRegistroLpzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarRegistroLpzActionPerformed
        // boton ingresa registro La Paz
        conBD.conectarBase(); // llamada a metodo conectar
        // Captura de datos desde formulario para el objeto hotelR
        hotelR.setIdHabitacion(Integer.parseInt(txtHabitacionRegistroLpz.getText()));
        hotelR.setNombre(txtNombreRegistroLpz.getText());
        hotelR.setTelefono(txtTelefonoRegistroLpz.getText());
        hotelR.setNoches(Integer.parseInt(txtNochesRegistroLpz.getText()));

        // variable objeto para insertar datos a la tabla
        String altaReserva = "INSERT into t_lapaz values ('"+hotelR.getIdHabitacion()+"','"+hotelR.getNombre()+"','"+hotelR.getTelefono()+"','"+hotelR.getNoches()+"', '"+lblFecha.getText()+"')"; // las ' indica sql y " para java

        // estructura de tratamiento de errores
        try {
            conBD.stmt.executeUpdate(altaReserva); // conecion conBD y ejecucion de instruccion stmt
            JOptionPane.showMessageDialog(null, "Registro exitoso de nueva reserva\n\nActualiza datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos Alta reserva\n\nVerifica");
        }
    }//GEN-LAST:event_btnIngresarRegistroLpzActionPerformed

    private void btnIngresarRegistroLpzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarRegistroLpzMouseExited
        btnIngresarRegistroLpz.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnIngresarRegistroLpzMouseExited

    private void btnIngresarRegistroLpzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarRegistroLpzMouseEntered
        btnIngresarRegistroLpz.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnIngresarRegistroLpzMouseEntered

    private void txtTelefonoRegistroLpzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoRegistroLpzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoRegistroLpzActionPerformed

    private void btnVerificarReservacionLpzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarReservacionLpzActionPerformed
        // boton busqueda reserva La Paz
        conBD.conectarBase();

        try {
            // campo distintivo para buscar nombre y fecha
            hotelR.setNombre(txtNombreVerifiLpz.getText());
            hotelR.setFecha(txtFechaVerifiLpz.getText());

            // Construcción de la consulta SQL correcta
            String sql = "SELECT * FROM t_lapaz WHERE Nombre = '" + hotelR.getNombre() + "' AND Fecha = '" + hotelR.getFecha() + "'";
            conBD.rs = conBD.stmt.executeQuery(sql);

            // Mensaje de búsqueda
            JOptionPane.showMessageDialog(null, "Buscando reserva, por favor espere... \nGracias");

            if (conBD.rs.next()) { // si encontró datos
                DefaultTableModel modeloDatos = new DefaultTableModel();
                JtConsultaRegistrosLpz.setModel(modeloDatos);

                ResultSetMetaData rsmd = conBD.rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();
                modeloDatos.addColumn("Habitacion");
                modeloDatos.addColumn("Nombre");
                modeloDatos.addColumn("Telefono");
                modeloDatos.addColumn("Noches");
                modeloDatos.addColumn("Fecha");

                do {
                    Object[] fila = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = conBD.rs.getObject(i + 1);
                    }
                    modeloDatos.addRow(fila);
                } while (conBD.rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron reservas con los datos proporcionados.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva en la base de datos. Verifica\n" + e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnVerificarReservacionLpzActionPerformed

    private void btnVerificarReservacionLpzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarReservacionLpzMouseExited
        btnVerificarReservacionLpz.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnVerificarReservacionLpzMouseExited

    private void btnVerificarReservacionLpzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarReservacionLpzMouseEntered
        btnVerificarReservacionLpz.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnVerificarReservacionLpzMouseEntered

    private void btnActualizarAcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAcaActionPerformed
        // Boton para actualizar registro Acapulco
        conBD.conectarBase(); // Conectar a la base de datos
        Connection conn = conBD.cn; // Obtener la conexión desde conBD
        PreparedStatement pstmt = null; // Preparar la declaración

        try {
            // Consulta SQL para actualizar los datos en la base de datos
            String sql = "UPDATE t_acapulco SET Nombre = ?, Telefono = ?, Noches = ?, Fecha = ? WHERE Habitacion = ?";

            // Preparar la declaración
            pstmt = conn.prepareStatement(sql);

            // Obtener los datos modificados desde la tabla
            DefaultTableModel modeloDatos = (DefaultTableModel) JtConsultaRegistrosAca.getModel();
            int rowCount = modeloDatos.getRowCount();

            for (int fila = 0; fila < rowCount; fila++) {
                // Obtener los datos de la fila actual
                String nombre = modeloDatos.getValueAt(fila, 1).toString();
                String telefono = modeloDatos.getValueAt(fila, 2).toString();
                int noches = Integer.parseInt(modeloDatos.getValueAt(fila, 3).toString());
                String fecha = modeloDatos.getValueAt(fila, 4).toString();
                int habitacion = Integer.parseInt(modeloDatos.getValueAt(fila, 0).toString());

                // Establecer los parámetros de la declaración
                pstmt.setString(1, nombre);
                pstmt.setString(2, telefono);
                pstmt.setInt(3, noches);
                pstmt.setString(4, fecha);
                pstmt.setInt(5, habitacion);

                // Ejecutar la actualización
                pstmt.executeUpdate();
            }

            // Cerrar PreparedStatement
            pstmt.close();

            // Actualizar la tabla en la interfaz gráfica si es necesario
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente en la base de datos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos en la base de datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                // No es necesario cerrar `conn` aquí si estás utilizando una conexión compartida
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnActualizarAcaActionPerformed

    private void btnActualizarAcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAcaMouseExited
        btnActualizarAca.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnActualizarAcaMouseExited

    private void btnActualizarAcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAcaMouseEntered
        btnActualizarAca.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnActualizarAcaMouseEntered

    private void btnVerRegistrosAcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistrosAcaActionPerformed
        // Boton para ver registros Acapulco
        try {
            conBD.conectarBase();//llamada a metodo conectar
            //Objeto Almacenanamiento logico de datos modelo de datos ----------
            DefaultTableModel modeloDatos = new  DefaultTableModel();
            JtConsultaRegistrosAca.setModel(modeloDatos); // Esto manda a imprimir a la table

            conBD.rs=conBD.stmt.executeQuery("select * from t_acapulco");

            ResultSetMetaData rsmd = conBD.rs.getMetaData(); // mandamos a imprimir a la tabla
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Habitacion");
            modeloDatos.addColumn("Nombre");
            modeloDatos.addColumn("Telefono");
            modeloDatos.addColumn("Noches");
            modeloDatos.addColumn("Fecha");

            //imprimir registros
            while(conBD.rs.next()){
                Object fila [] = new Object[cantidadColumnas]; // almacen de un arreglo objeto
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=conBD.rs.getObject(i+1);
                }//termina for
                modeloDatos.addRow(fila);
            }//termina while
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 1 de BD al generar Alta\nVerifica\n"+e);
        }
    }//GEN-LAST:event_btnVerRegistrosAcaActionPerformed

    private void btnVerRegistrosAcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRegistrosAcaMouseExited
        btnVerRegistrosAca.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnVerRegistrosAcaMouseExited

    private void btnVerRegistrosAcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRegistrosAcaMouseEntered
        btnVerRegistrosAca.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnVerRegistrosAcaMouseEntered

    private void btnBorrarRegistroAcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegistroAcaActionPerformed
        // boton borrar registro La Acapulco
        // Conectar a la base de datos
        conBD.conectarBase(); // conexión a la base de datos

        // Verificar que hay una fila seleccionada
        if (JtConsultaRegistrosAca.getSelectedRow() >= 0) {
            // Obtener el modelo de la tabla
            DefaultTableModel modeloDatos = (DefaultTableModel) JtConsultaRegistrosAca.getModel();

            // Obtener el identificador único del registro (suponiendo que está en la primera columna)
            int selectedRow = JtConsultaRegistrosAca.getSelectedRow();
            int idHabitacion = (int) modeloDatos.getValueAt(selectedRow, 0); // Ajusta el índice según tu tabla

            // Confirmar eliminación
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el registro?", "Sistema POO", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    // Eliminar el registro de la base de datos
                    String sql = "DELETE FROM t_acapulco WHERE Habitacion = " + idHabitacion;
                    int confirmarBaja = conBD.stmt.executeUpdate(sql);

                    // Verificar si la eliminación fue exitosa
                    if (confirmarBaja == 1) {
                        // Eliminar la fila del JTable
                        modeloDatos.removeRow(selectedRow);
                        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar el registro.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error de base de datos al eliminar: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila.", "Sistema", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarRegistroAcaActionPerformed

    private void btnBorrarRegistroAcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarRegistroAcaMouseExited
        btnBorrarRegistroAca.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnBorrarRegistroAcaMouseExited

    private void btnBorrarRegistroAcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarRegistroAcaMouseEntered
        btnBorrarRegistroAca.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnBorrarRegistroAcaMouseEntered

    private void btnIngresarRegistroAcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarRegistroAcaActionPerformed
        // boton ingresa registro Acapulco
        conBD.conectarBase(); // llamada a metodo conectar
        // Captura de datos desde formulario para el objeto hotelR
        hotelR.setIdHabitacion(Integer.parseInt(txtHabitacionRegistroAca.getText()));
        hotelR.setNombre(txtNombreRegistroAca.getText());
        hotelR.setTelefono(txtTelefonoRegistroAca.getText());
        hotelR.setNoches(Integer.parseInt(txtNochesRegistroAca.getText()));

        // variable objeto para insertar datos a la tabla
        String altaReserva = "INSERT into t_acapulco values ('"+hotelR.getIdHabitacion()+"','"+hotelR.getNombre()+"','"+hotelR.getTelefono()+"','"+hotelR.getNoches()+"', '"+lblFecha.getText()+"')"; // las ' indica sql y " para java

        // estructura de tratamiento de errores
        try {
            conBD.stmt.executeUpdate(altaReserva); // conecion conBD y ejecucion de instruccion stmt
            JOptionPane.showMessageDialog(null, "Registro exitoso de nueva reserva\n\nActualiza datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos Alta reserva\n\nVerifica");
        }
    }//GEN-LAST:event_btnIngresarRegistroAcaActionPerformed

    private void btnIngresarRegistroAcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarRegistroAcaMouseExited
        btnIngresarRegistroAca.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnIngresarRegistroAcaMouseExited

    private void btnIngresarRegistroAcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarRegistroAcaMouseEntered
        btnIngresarRegistroAca.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnIngresarRegistroAcaMouseEntered

    private void txtTelefonoRegistroAcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoRegistroAcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoRegistroAcaActionPerformed

    private void btnVerificarReservacionAcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarReservacionAcaActionPerformed
        // boton busqueda reserva Acapulco
        conBD.conectarBase();

        try {
            // campo distintivo para buscar nombre y fecha
            hotelR.setNombre(txtNombreVerifiAca.getText());
            hotelR.setFecha(txtFechaVerifiAca.getText());

            // Construcción de la consulta SQL correcta
            String sql = "SELECT * FROM t_acapulco WHERE Nombre = '" + hotelR.getNombre() + "' AND Fecha = '" + hotelR.getFecha() + "'";
            conBD.rs = conBD.stmt.executeQuery(sql);

            // Mensaje de búsqueda
            JOptionPane.showMessageDialog(null, "Buscando reserva, por favor espere... \nGracias");

            if (conBD.rs.next()) { // si encontró datos
                DefaultTableModel modeloDatos = new DefaultTableModel();
                JtConsultaRegistrosAca.setModel(modeloDatos);

                ResultSetMetaData rsmd = conBD.rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();
                modeloDatos.addColumn("Habitacion");
                modeloDatos.addColumn("Nombre");
                modeloDatos.addColumn("Telefono");
                modeloDatos.addColumn("Noches");
                modeloDatos.addColumn("Fecha");

                do {
                    Object[] fila = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = conBD.rs.getObject(i + 1);
                    }
                    modeloDatos.addRow(fila);
                } while (conBD.rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron reservas con los datos proporcionados.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva en la base de datos. Verifica\n" + e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnVerificarReservacionAcaActionPerformed

    private void btnVerificarReservacionAcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarReservacionAcaMouseExited
        btnVerificarReservacionAca.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnVerificarReservacionAcaMouseExited

    private void btnVerificarReservacionAcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarReservacionAcaMouseEntered
        btnVerificarReservacionAca.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnVerificarReservacionAcaMouseEntered

    private void JtConsultaRegistrosCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtConsultaRegistrosCDMouseClicked
        // Tabla actualizar datos CDMX
        /* conBD.conectarBase();
        int seleccion=JtConsultaRegistrosCD.getSelectedRow();
        txtNombre.setText(JtConsultaRegistrosCD.getValueAt(seleccion, 0).toString());
        txtApellido.setText(JtConsultaRegistrosCD.getValueAt(seleccion, 1).toString());
        txtTelefono.setText(JtConsultaRegistrosCD.getValueAt(seleccion, 2).toString());
        fila=seleccion;

        try {
            hotelR.setNombre(txtNombreMod.getText()); // traemos al objeto libroN
            hotelR.setPrecio(Float.parseFloat(txtPrecioMod.getText()));
            hotelR.setAutor(txtAutorMod.getText());

            JOptionPane.showMessageDialog(null, "Datos libro actualizado \nConsulta tus datos");
            String actualizarLibro = "UPDATE t_cdmx SET Habitacion = '" + hotelR.getIdHabitacion() + "', Nombre = '" + hotelR.getNombre() + "', Telefono = '" + hotelR.getTelefono()+ "', Noches = '" + hotelR.getNoches()+ "', Fecha = '" + hotelR.getFecha()+ "'  WHERE Habitacion = '" + hotelR.getIdHabitacion()+ "'";  // Variable actualizador de datos con update
            conBD.stmt.executeUpdate(actualizarLibro); // ejecutamos variable con stmt.executeUpdate

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos al ejecutar la edicion \nVerifica");
        }*/
    }//GEN-LAST:event_JtConsultaRegistrosCDMouseClicked

    private void btnActualizarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCDActionPerformed
        // Boton para actualizar registro CDMX
        conBD.conectarBase(); // Conectar a la base de datos
        Connection conn = conBD.cn; // Obtener la conexión desde conBD
        PreparedStatement pstmt = null; // Preparar la declaración

        try {
            // Consulta SQL para actualizar los datos en la base de datos
            String sql = "UPDATE t_cdmx SET Nombre = ?, Telefono = ?, Noches = ?, Fecha = ? WHERE Habitacion = ?";

            // Preparar la declaración
            pstmt = conn.prepareStatement(sql);

            // Obtener los datos modificados desde la tabla
            DefaultTableModel modeloDatos = (DefaultTableModel) JtConsultaRegistrosCD.getModel();
            int rowCount = modeloDatos.getRowCount();

            for (int fila = 0; fila < rowCount; fila++) {
                // Obtener los datos de la fila actual
                String nombre = modeloDatos.getValueAt(fila, 1).toString();
                String telefono = modeloDatos.getValueAt(fila, 2).toString();
                int noches = Integer.parseInt(modeloDatos.getValueAt(fila, 3).toString());
                String fecha = modeloDatos.getValueAt(fila, 4).toString();
                int habitacion = Integer.parseInt(modeloDatos.getValueAt(fila, 0).toString());

                // Establecer los parámetros de la declaración
                pstmt.setString(1, nombre);
                pstmt.setString(2, telefono);
                pstmt.setInt(3, noches);
                pstmt.setString(4, fecha);
                pstmt.setInt(5, habitacion);

                // Ejecutar la actualización
                pstmt.executeUpdate();
            }

            // Cerrar PreparedStatement
            pstmt.close();

            // Actualizar la tabla en la interfaz gráfica si es necesario
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente en la base de datos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos en la base de datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                // No es necesario cerrar `conn` aquí si estás utilizando una conexión compartida
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnActualizarCDActionPerformed

    private void btnActualizarCDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarCDMouseExited
        btnActualizarCD.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnActualizarCDMouseExited

    private void btnActualizarCDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarCDMouseEntered
        btnActualizarCD.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnActualizarCDMouseEntered

    private void btnVerRegistrosCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistrosCDActionPerformed
        // Boton para ver registros CDMX
        try {
            conBD.conectarBase();//llamada a metodo conectar
            //Objeto Almacenanamiento logico de datos modelo de datos ----------
            DefaultTableModel modeloDatos = new  DefaultTableModel();
            JtConsultaRegistrosCD.setModel(modeloDatos); // Esto manda a imprimir a la table

            conBD.rs=conBD.stmt.executeQuery("select * from t_cdmx");

            ResultSetMetaData rsmd = conBD.rs.getMetaData(); // mandamos a imprimir a la tabla
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Habitacion");
            modeloDatos.addColumn("Nombre");
            modeloDatos.addColumn("Telefono");
            modeloDatos.addColumn("Noches");
            modeloDatos.addColumn("Fecha");

            //imprimir registros
            while(conBD.rs.next()){
                Object fila [] = new Object[cantidadColumnas]; // almacen de un arreglo objeto
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=conBD.rs.getObject(i+1);
                }//termina for
                modeloDatos.addRow(fila);
            }//termina while
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 1 de BD al generar Alta\nVerifica\n"+e);
        }
    }//GEN-LAST:event_btnVerRegistrosCDActionPerformed

    private void btnVerRegistrosCDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRegistrosCDMouseExited
        btnVerRegistrosCD.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnVerRegistrosCDMouseExited

    private void btnVerRegistrosCDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRegistrosCDMouseEntered
        btnVerRegistrosCD.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnVerRegistrosCDMouseEntered

    private void btnBorrarRegistroCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegistroCDActionPerformed
        // boton borrar registro CDMX
        // Conectar a la base de datos
        conBD.conectarBase(); // conexión a la base de datos

        // Verificar que hay una fila seleccionada
        if (JtConsultaRegistrosCD.getSelectedRow() >= 0) {
            // Obtener el modelo de la tabla
            DefaultTableModel modeloDatos = (DefaultTableModel) JtConsultaRegistrosCD.getModel();

            // Obtener el identificador único del registro (suponiendo que está en la primera columna)
            int selectedRow = JtConsultaRegistrosCD.getSelectedRow();
            int idHabitacion = (int) modeloDatos.getValueAt(selectedRow, 0); // Ajusta el índice según tu tabla

            // Confirmar eliminación
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el registro?", "Sistema POO", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    // Eliminar el registro de la base de datos
                    String sql = "DELETE FROM t_cdmx WHERE Habitacion = " + idHabitacion;
                    int confirmarBaja = conBD.stmt.executeUpdate(sql);

                    // Verificar si la eliminación fue exitosa
                    if (confirmarBaja == 1) {
                        // Eliminar la fila del JTable
                        modeloDatos.removeRow(selectedRow);
                        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar el registro.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error de base de datos al eliminar: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila.", "Sistema", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarRegistroCDActionPerformed

    private void btnBorrarRegistroCDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarRegistroCDMouseExited
        btnBorrarRegistroCD.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnBorrarRegistroCDMouseExited

    private void btnBorrarRegistroCDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarRegistroCDMouseEntered
        btnBorrarRegistroCD.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnBorrarRegistroCDMouseEntered

    private void btnIngresarRegistroCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarRegistroCDActionPerformed
        // boton ingresa registro CDMX
        conBD.conectarBase(); // llamada a metodo conectar
        // Captura de datos desde formulario para el objeto hotelR
        hotelR.setIdHabitacion(Integer.parseInt(txtHabitacionRegistroCD.getText()));
        hotelR.setNombre(txtNombreRegistroCD.getText());
        hotelR.setTelefono(txtTelefonoRegistroCD.getText());
        hotelR.setNoches(Integer.parseInt(txtNochesRegistroCD.getText()));

        // variable objeto para insertar datos a la tabla
        String altaReserva = "INSERT into t_cdmx values ('"+hotelR.getIdHabitacion()+"','"+hotelR.getNombre()+"','"+hotelR.getTelefono()+"','"+hotelR.getNoches()+"', '"+lblFecha.getText()+"')"; // las ' indica sql y " para java

        // estructura de tratamiento de errores
        try {
            conBD.stmt.executeUpdate(altaReserva); // conecion conBD y ejecucion de instruccion stmt
            JOptionPane.showMessageDialog(null, "Registro exitoso de nueva reserva\n\nActualiza datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos Alta reserva\n\nVerifica");
        }
    }//GEN-LAST:event_btnIngresarRegistroCDActionPerformed

    private void btnIngresarRegistroCDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarRegistroCDMouseExited
        btnIngresarRegistroCD.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnIngresarRegistroCDMouseExited

    private void btnIngresarRegistroCDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarRegistroCDMouseEntered
        btnIngresarRegistroCD.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnIngresarRegistroCDMouseEntered

    private void txtTelefonoRegistroCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoRegistroCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoRegistroCDActionPerformed

    private void btnVerificarReservacionCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarReservacionCDActionPerformed
        // boton busqueda reserva CDMX
        conBD.conectarBase();

        try {
            // campo distintivo para buscar nombre y fecha
            hotelR.setNombre(txtNombreVerifiCD.getText());
            hotelR.setFecha(txtFechaVerifiCD.getText());

            // Construcción de la consulta SQL correcta
            String sql = "SELECT * FROM t_cdmx WHERE Nombre = '" + hotelR.getNombre() + "' AND Fecha = '" + hotelR.getFecha() + "'";
            conBD.rs = conBD.stmt.executeQuery(sql);

            // Mensaje de búsqueda
            JOptionPane.showMessageDialog(null, "Buscando reserva, por favor espere... \nGracias");

            if (conBD.rs.next()) { // si encontró datos
                DefaultTableModel modeloDatos = new DefaultTableModel();
                JtConsultaRegistrosCD.setModel(modeloDatos);

                ResultSetMetaData rsmd = conBD.rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();
                modeloDatos.addColumn("Habitacion");
                modeloDatos.addColumn("Nombre");
                modeloDatos.addColumn("Telefono");
                modeloDatos.addColumn("Noches");
                modeloDatos.addColumn("Fecha");

                do {
                    Object[] fila = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = conBD.rs.getObject(i + 1);
                    }
                    modeloDatos.addRow(fila);
                } while (conBD.rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron reservas con los datos proporcionados.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva en la base de datos. Verifica\n" + e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnVerificarReservacionCDActionPerformed

    private void btnVerificarReservacionCDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarReservacionCDMouseExited
        btnVerificarReservacionCD.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnVerificarReservacionCDMouseExited

    private void btnVerificarReservacionCDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarReservacionCDMouseEntered
        btnVerificarReservacionCD.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnVerificarReservacionCDMouseEntered

    private void btnIngresarEventoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarEventoMouseEntered
        btnIngresarEvento.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnIngresarEventoMouseEntered

    private void btnIngresarEventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarEventoMouseExited
        btnIngresarEvento.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnIngresarEventoMouseExited

    private void btnIngresarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEventoActionPerformed
    // Botón Ingresar Evento
    conBD.conectarBase(); // llamada a método conectar

    String nombreEvento = txtNombreEvento.getText();
    String hotelLugar = lstHoteles.getSelectedValue(); // Obtenemos el valor seleccionado
    String fechaInicio = txtFechaInicio.getText();
    String mesa = optMesa.isSelected() ? "Requiere" : "No es necesario";
    String centroMesa = optCentro.isSelected() ? "Requiere" : "No es necesario";
    String mantel = optMantel.isSelected() ? "Requiere" : "No es necesario";
    String lucesLed = optLuces.isSelected() ? "Requiere" : "No es necesario";
    String flores = optFlores.isSelected() ? "Requiere" : "No es necesario";

    // Validar datos importantes antes de continuar
    if (hotelLugar == null || hotelLugar.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un hotel.");
        return;
    }

    // Construcción de la consulta SQL
    String altaEvento = "INSERT INTO eventos (NombreEvento, HotelLugar, FechaInicio, Mesas, CentroMesa, Mantel, LucesLed, Flores) " +
                        "VALUES ('" + nombreEvento + "','" +
                                      hotelLugar + "','" +
                                      fechaInicio + "','" +
                                      mesa + "','" +
                                      centroMesa + "','" +
                                      mantel + "','" +
                                      lucesLed + "','" +
                                      flores + "')";

    // Imprimir la consulta SQL para depuración
    System.out.println("Consulta SQL: " + altaEvento);

    // Estructura de tratamiento de errores
    try {
        conBD.stmt.executeUpdate(altaEvento); // Ejecuta la instrucción SQL
        JOptionPane.showMessageDialog(null, "Registro exitoso de evento.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error de base de datos al registrar el evento.\n\nVerifica la conexión.");
        e.printStackTrace(); // Para depuración
    }
    }//GEN-LAST:event_btnIngresarEventoActionPerformed

    private void txtFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInicioActionPerformed

    private void lblBtnEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEventosMouseClicked
        tpManejoHoteles.setSelectedComponent(panJTEvento);
    }//GEN-LAST:event_lblBtnEventosMouseClicked

    private void lblBtnEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEventosMouseEntered
        //
        panBtnEventos.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_lblBtnEventosMouseEntered

    private void lblBtnEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnEventosMouseExited
        panBtnEventos.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_lblBtnEventosMouseExited

    private void panBtnEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnEventosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panBtnEventosMouseEntered

    private void panBtnEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnEventosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panBtnEventosMouseExited
     
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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtConsultaRegistrosAca;
    private javax.swing.JTable JtConsultaRegistrosCD;
    private javax.swing.JTable JtConsultaRegistrosLpz;
    private javax.swing.JTable JtConsultaRegistrosQuin;
    private javax.swing.JButton btnActualizarAca;
    private javax.swing.JButton btnActualizarCD;
    private javax.swing.JButton btnActualizarLpz;
    private javax.swing.JButton btnActualizarQuin;
    private javax.swing.JButton btnBorrarRegistroAca;
    private javax.swing.JButton btnBorrarRegistroCD;
    private javax.swing.JButton btnBorrarRegistroLpz;
    private javax.swing.JButton btnBorrarRegistroQuin;
    private javax.swing.JButton btnIngresarEvento;
    private javax.swing.JButton btnIngresarRegistroAca;
    private javax.swing.JButton btnIngresarRegistroCD;
    private javax.swing.JButton btnIngresarRegistroLpz;
    private javax.swing.JButton btnIngresarRegistroQuin;
    private javax.swing.JButton btnVerRegistrosAca;
    private javax.swing.JButton btnVerRegistrosCD;
    private javax.swing.JButton btnVerRegistrosLpz;
    private javax.swing.JButton btnVerRegistrosQuin;
    private javax.swing.JButton btnVerificarReservacionAca;
    private javax.swing.JButton btnVerificarReservacionCD;
    private javax.swing.JButton btnVerificarReservacionLpz;
    private javax.swing.JButton btnVerificarReservacionQuin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JScrollPane jtSolicitarEventos;
    private javax.swing.JLabel lblActualizarRegistro;
    private javax.swing.JLabel lblActualizarRegistro1;
    private javax.swing.JLabel lblActualizarRegistro2;
    private javax.swing.JLabel lblActualizarRegistro3;
    private javax.swing.JLabel lblBorrarRegistro;
    private javax.swing.JLabel lblBorrarRegistro1;
    private javax.swing.JLabel lblBorrarRegistro4;
    private javax.swing.JLabel lblBorrarRegistro5;
    private javax.swing.JLabel lblBtnAcapulco;
    private javax.swing.JLabel lblBtnCDMX;
    private javax.swing.JLabel lblBtnEventos;
    private javax.swing.JLabel lblBtnInicio;
    private javax.swing.JLabel lblBtnLaPaz;
    private javax.swing.JLabel lblBtnQuintana;
    private javax.swing.JLabel lblBtnSalirLogin;
    private javax.swing.JLabel lblBuscarReservacion;
    private javax.swing.JLabel lblBuscarReservacion1;
    private javax.swing.JLabel lblBuscarReservacion2;
    private javax.swing.JLabel lblBuscarReservacion3;
    private javax.swing.JLabel lblCapacidad20;
    private javax.swing.JLabel lblCapacidad25;
    private javax.swing.JLabel lblCapacidad30;
    private javax.swing.JLabel lblCapacidad40;
    private javax.swing.JLabel lblEnHotel;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaBuscar;
    private javax.swing.JLabel lblFechaBuscar1;
    private javax.swing.JLabel lblFechaBuscar2;
    private javax.swing.JLabel lblFechaBuscar3;
    private javax.swing.JLabel lblFechaEvento;
    private javax.swing.JLabel lblHabitacionRealizar;
    private javax.swing.JLabel lblHabitacionRealizar1;
    private javax.swing.JLabel lblHabitacionRealizar2;
    private javax.swing.JLabel lblHabitacionRealizar3;
    private javax.swing.JLabel lblImagenHotelAcapulco;
    private javax.swing.JLabel lblImagenHotelCDMX;
    private javax.swing.JLabel lblImagenHotelLaPaz;
    private javax.swing.JLabel lblImagenHotelQuint;
    private javax.swing.JLabel lblImagenHotelQuint1;
    private javax.swing.JLabel lblJTAcapulco;
    private javax.swing.JLabel lblJTCDMX;
    private javax.swing.JLabel lblJTGranti;
    private javax.swing.JLabel lblJTHotelRamada;
    private javax.swing.JLabel lblJTHotelSinupa;
    private javax.swing.JLabel lblJTLaPaz;
    private javax.swing.JLabel lblJTQuint;
    private javax.swing.JLabel lblJTQuint1;
    private javax.swing.JLabel lblJTinicio;
    private javax.swing.JLabel lblJTinicio1;
    private javax.swing.JLabel lblJTinicio3;
    private javax.swing.JLabel lblJTinicio5;
    private javax.swing.JLabel lblJTinicio6;
    private javax.swing.JLabel lblLogoMontageTopLeft;
    private javax.swing.JLabel lblLogoRight;
    private javax.swing.JLabel lblLogoRight1;
    private javax.swing.JLabel lblLogoRight2;
    private javax.swing.JLabel lblLogoRight3;
    private javax.swing.JLabel lblNocheRealizar;
    private javax.swing.JLabel lblNocheRealizar1;
    private javax.swing.JLabel lblNocheRealizar2;
    private javax.swing.JLabel lblNocheRealizar3;
    private javax.swing.JLabel lblNombreBuscar;
    private javax.swing.JLabel lblNombreBuscar1;
    private javax.swing.JLabel lblNombreBuscar2;
    private javax.swing.JLabel lblNombreBuscar3;
    private javax.swing.JLabel lblNombreEvento;
    private javax.swing.JLabel lblNombreRealizar;
    private javax.swing.JLabel lblNombreRealizar1;
    private javax.swing.JLabel lblNombreRealizar2;
    private javax.swing.JLabel lblNombreRealizar3;
    private javax.swing.JLabel lblRealizarReservacion;
    private javax.swing.JLabel lblRealizarReservacion1;
    private javax.swing.JLabel lblRealizarReservacion2;
    private javax.swing.JLabel lblRealizarReservacion3;
    private javax.swing.JLabel lblRealizarReservacion4;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JLabel lblTelefonoRealizar;
    private javax.swing.JLabel lblTelefonoRealizar1;
    private javax.swing.JLabel lblTelefonoRealizar2;
    private javax.swing.JLabel lblTelefonoRealizar3;
    private javax.swing.JLabel lblVerRegistros;
    private javax.swing.JLabel lblVerRegistros1;
    private javax.swing.JLabel lblVerRegistros2;
    private javax.swing.JLabel lblVerRegistros3;
    private javax.swing.JList<String> lstHoteles;
    private javax.swing.JCheckBox optCentro;
    private javax.swing.JCheckBox optFlores;
    private javax.swing.JCheckBox optLuces;
    private javax.swing.JCheckBox optMantel;
    private javax.swing.JCheckBox optMesa;
    private javax.swing.JPanel panBarraTop;
    private javax.swing.JPanel panBarraTop2;
    private javax.swing.JPanel panBorrarRegistro;
    private javax.swing.JPanel panBorrarRegistro4;
    private javax.swing.JPanel panBorrarRegistro5;
    private javax.swing.JPanel panBorrarRegistro6;
    private javax.swing.JPanel panBorrarRegistroTop;
    private javax.swing.JPanel panBorrarRegistroTop1;
    private javax.swing.JPanel panBorrarRegistroTop4;
    private javax.swing.JPanel panBorrarRegistroTop5;
    private javax.swing.JPanel panBtnAcapulco;
    private javax.swing.JPanel panBtnCDMX;
    private javax.swing.JPanel panBtnEventos;
    private javax.swing.JPanel panBtnInicio;
    private javax.swing.JPanel panBtnLaPaz;
    private javax.swing.JPanel panBtnQuintana;
    private javax.swing.JPanel panContenedorTJ;
    private javax.swing.JPanel panJTAcapulco;
    private javax.swing.JPanel panJTAcapulcoMedio;
    private javax.swing.JPanel panJTAcapulcoTop;
    private javax.swing.JPanel panJTAcapulcoTop1;
    private javax.swing.JPanel panJTAcapulcoTopCenter;
    private javax.swing.JPanel panJTBuscarReservacion;
    private javax.swing.JPanel panJTCDMX;
    private javax.swing.JPanel panJTCDMXTopCenter;
    private javax.swing.JPanel panJTCDMXTopMedio;
    private javax.swing.JPanel panJTCDMXTopMedio1;
    private javax.swing.JPanel panJTCDMXTopMedio2;
    private javax.swing.JPanel panJTEvento;
    private javax.swing.JPanel panJTEventos;
    private javax.swing.JPanel panJTIAcapulcoTop;
    private javax.swing.JPanel panJTICDMXMedio;
    private javax.swing.JPanel panJTICDMXTop;
    private javax.swing.JPanel panJTICDMXTop1;
    private javax.swing.JPanel panJTICDMXTop3;
    private javax.swing.JPanel panJTILaPazMedio;
    private javax.swing.JPanel panJTILaPazTop;
    private javax.swing.JPanel panJTILaPazTop1;
    private javax.swing.JPanel panJTILaPazTop2;
    private javax.swing.JPanel panJTIQuintMedio;
    private javax.swing.JPanel panJTIQuintMedio1;
    private javax.swing.JPanel panJTIQuintTop;
    private javax.swing.JPanel panJTIQuintTop1;
    private javax.swing.JPanel panJTIRealizarReservacion;
    private javax.swing.JPanel panJTIRealizarReservacion1;
    private javax.swing.JPanel panJTInicio;
    private javax.swing.JPanel panJTInicioTop;
    private javax.swing.JPanel panJTInicioTop3;
    private javax.swing.JPanel panJTInicioTop5;
    private javax.swing.JPanel panJTInicioTopCenter;
    private javax.swing.JPanel panJTInicioTopCenter10;
    private javax.swing.JPanel panJTInicioTopCenter3;
    private javax.swing.JPanel panJTInicioTopCenter5;
    private javax.swing.JPanel panJTInicioTopCenter7;
    private javax.swing.JPanel panJTInicioTopCenter9;
    private javax.swing.JPanel panJTLaPaz;
    private javax.swing.JPanel panJTLaPazTopCenter;
    private javax.swing.JPanel panJTQuintTop1;
    private javax.swing.JPanel panJTQuintTop2;
    private javax.swing.JPanel panJTQuintTopCenter;
    private javax.swing.JPanel panJTQuintTopCenter1;
    private javax.swing.JPanel panJTQuintTopMedio1;
    private javax.swing.JPanel panJTQuintTopMedio2;
    private javax.swing.JPanel panJTQuintanaRoo;
    private javax.swing.JPanel panLogoMontage;
    private javax.swing.JPanel panMenuLeft;
    private javax.swing.JPanel panRealizarEvento;
    private javax.swing.JPanel panRealizarReservacion;
    private javax.swing.JPanel panRealizarReservacion1;
    private javax.swing.JPanel panRealizarReservacion2;
    private javax.swing.JPanel panRealizarReservacion3;
    private javax.swing.JPanel panRightImagen;
    private javax.swing.JPanel panRightImagen1;
    private javax.swing.JPanel panRightImagen2;
    private javax.swing.JPanel panRightImagen3;
    private javax.swing.JPanel panSalirLogin;
    private javax.swing.JPanel panTJInicio2;
    private javax.swing.JPanel panVerRegistros;
    private javax.swing.JPanel panVerRegistros4;
    private javax.swing.JPanel panVerRegistros5;
    private javax.swing.JPanel panVerRegistros6;
    private javax.swing.JTabbedPane tpManejoHoteles;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtFechaVerifiAca;
    private javax.swing.JTextField txtFechaVerifiCD;
    private javax.swing.JTextField txtFechaVerifiLpz;
    private javax.swing.JTextField txtFechaVerifiQuin;
    private javax.swing.JTextField txtHabitacionRegistroAca;
    private javax.swing.JTextField txtHabitacionRegistroCD;
    private javax.swing.JTextField txtHabitacionRegistroLpz;
    private javax.swing.JTextField txtHabitacionRegistroQuin;
    private javax.swing.JTextField txtNochesRegistroAca;
    private javax.swing.JTextField txtNochesRegistroCD;
    private javax.swing.JTextField txtNochesRegistroLpz;
    private javax.swing.JTextField txtNochesRegistroQuin;
    private javax.swing.JTextField txtNombreEvento;
    private javax.swing.JTextField txtNombreRegistroAca;
    private javax.swing.JTextField txtNombreRegistroCD;
    private javax.swing.JTextField txtNombreRegistroLpz;
    private javax.swing.JTextField txtNombreRegistroQuin;
    private javax.swing.JTextField txtNombreVerifiAca;
    private javax.swing.JTextField txtNombreVerifiCD;
    private javax.swing.JTextField txtNombreVerifiLpz;
    private javax.swing.JTextField txtNombreVerifiQuin;
    private javax.swing.JTextField txtTelefonoRegistroAca;
    private javax.swing.JTextField txtTelefonoRegistroCD;
    private javax.swing.JTextField txtTelefonoRegistroLpz;
    private javax.swing.JTextField txtTelefonoRegistroQuin;
    // End of variables declaration//GEN-END:variables
}
