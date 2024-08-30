
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


public class Proveedores extends javax.swing.JFrame {
    ConexionBD conBD = new ConexionBD();
    RegistrosHoteles hotelR = new RegistrosHoteles();


    
    public Proveedores() {
        initComponents();
        
        // Obtención y formateo de la fecha actual
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formato.format(fechaActual);
        
        // agrego la fecha a mi lblFecha
        lblFecha.setText(fechaFormateada);
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
        panBtnSolicitudes = new javax.swing.JPanel();
        lblBtnSolicitudes = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
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
        panJTEvento = new javax.swing.JPanel();
        panJTIQuintTop1 = new javax.swing.JPanel();
        lblImagenRock = new javax.swing.JLabel();
        panJTIEnveMedio = new javax.swing.JPanel();
        panJTEvenTopMedio2 = new javax.swing.JPanel();
        lblSolicitudes = new javax.swing.JLabel();
        panJTEvenTop = new javax.swing.JPanel();
        panJTEvenTopCenter = new javax.swing.JPanel();
        lblJTSolicitudesDeHote = new javax.swing.JLabel();
        panJTIRealizarReservacion1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtConsultaEventos = new javax.swing.JTable();
        panJTIEvenMedio = new javax.swing.JPanel();
        panJTEvenTopMedio = new javax.swing.JPanel();
        btnTraerSolicitudes = new javax.swing.JButton();

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

        panBtnSolicitudes.setBackground(new java.awt.Color(0, 0, 0));
        panBtnSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panBtnSolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panBtnSolicitudesMouseExited(evt);
            }
        });

        lblBtnSolicitudes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnSolicitudes.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnSolicitudes.setText("Solicitudes");
        lblBtnSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnSolicitudesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnSolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnSolicitudesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panBtnSolicitudesLayout = new javax.swing.GroupLayout(panBtnSolicitudes);
        panBtnSolicitudes.setLayout(panBtnSolicitudesLayout);
        panBtnSolicitudesLayout.setHorizontalGroup(
            panBtnSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnSolicitudesLayout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(lblBtnSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBtnSolicitudesLayout.setVerticalGroup(
            panBtnSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnSolicitudes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha");

        javax.swing.GroupLayout panMenuLeftLayout = new javax.swing.GroupLayout(panMenuLeft);
        panMenuLeft.setLayout(panMenuLeftLayout);
        panMenuLeftLayout.setHorizontalGroup(
            panMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBtnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBtnSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panMenuLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panMenuLeftLayout.setVerticalGroup(
            panMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLeftLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panBtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBtnSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(lblJTinicio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        lblJTinicio6.setText("Area de Proveedor");

        javax.swing.GroupLayout panJTInicioTopCenter5Layout = new javax.swing.GroupLayout(panJTInicioTopCenter5);
        panJTInicioTopCenter5.setLayout(panJTInicioTopCenter5Layout);
        panJTInicioTopCenter5Layout.setHorizontalGroup(
            panJTInicioTopCenter5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTinicio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panJTInicioTopCenter5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJTinicio6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panJTInicioTopCenter5Layout.setVerticalGroup(
            panJTInicioTopCenter5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTopCenter5Layout.createSequentialGroup()
                .addComponent(lblJTinicio5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJTinicio6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panJTInicioTop5Layout = new javax.swing.GroupLayout(panJTInicioTop5);
        panJTInicioTop5.setLayout(panJTInicioTop5Layout);
        panJTInicioTop5Layout.setHorizontalGroup(
            panJTInicioTop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTop5Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(panJTInicioTopCenter5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        panJTInicioTop5Layout.setVerticalGroup(
            panJTInicioTop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTInicioTop5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panJTInicioTopCenter5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(347, Short.MAX_VALUE))
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

        panJTIQuintTop1.setBackground(new java.awt.Color(255, 255, 255));
        panJTIQuintTop1.setForeground(new java.awt.Color(102, 102, 102));

        lblImagenRock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenRock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rock-1771916_1920.jpg"))); // NOI18N
        lblImagenRock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panJTIEnveMedio.setBackground(new java.awt.Color(51, 51, 51));
        panJTIEnveMedio.setForeground(new java.awt.Color(102, 102, 102));

        panJTEvenTopMedio2.setBackground(new java.awt.Color(51, 51, 51));
        panJTEvenTopMedio2.setForeground(new java.awt.Color(102, 102, 102));

        lblSolicitudes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSolicitudes.setForeground(new java.awt.Color(255, 255, 255));
        lblSolicitudes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSolicitudes.setText("Solicitudes:");

        javax.swing.GroupLayout panJTEvenTopMedio2Layout = new javax.swing.GroupLayout(panJTEvenTopMedio2);
        panJTEvenTopMedio2.setLayout(panJTEvenTopMedio2Layout);
        panJTEvenTopMedio2Layout.setHorizontalGroup(
            panJTEvenTopMedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTEvenTopMedio2Layout.setVerticalGroup(
            panJTEvenTopMedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSolicitudes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTIEnveMedioLayout = new javax.swing.GroupLayout(panJTIEnveMedio);
        panJTIEnveMedio.setLayout(panJTIEnveMedioLayout);
        panJTIEnveMedioLayout.setHorizontalGroup(
            panJTIEnveMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIEnveMedioLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(panJTEvenTopMedio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(263, 263, 263))
        );
        panJTIEnveMedioLayout.setVerticalGroup(
            panJTIEnveMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTEvenTopMedio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTIQuintTop1Layout = new javax.swing.GroupLayout(panJTIQuintTop1);
        panJTIQuintTop1.setLayout(panJTIQuintTop1Layout);
        panJTIQuintTop1Layout.setHorizontalGroup(
            panJTIQuintTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenRock, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(panJTIEnveMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTIQuintTop1Layout.setVerticalGroup(
            panJTIQuintTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIQuintTop1Layout.createSequentialGroup()
                .addComponent(lblImagenRock, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTIEnveMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panJTEvenTop.setBackground(new java.awt.Color(51, 51, 51));
        panJTEvenTop.setForeground(new java.awt.Color(102, 102, 102));

        panJTEvenTopCenter.setBackground(new java.awt.Color(51, 51, 51));
        panJTEvenTopCenter.setForeground(new java.awt.Color(102, 102, 102));

        lblJTSolicitudesDeHote.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJTSolicitudesDeHote.setForeground(new java.awt.Color(255, 255, 255));
        lblJTSolicitudesDeHote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJTSolicitudesDeHote.setText("Solicitudes De Hoteleria");

        javax.swing.GroupLayout panJTEvenTopCenterLayout = new javax.swing.GroupLayout(panJTEvenTopCenter);
        panJTEvenTopCenter.setLayout(panJTEvenTopCenterLayout);
        panJTEvenTopCenterLayout.setHorizontalGroup(
            panJTEvenTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTSolicitudesDeHote, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        panJTEvenTopCenterLayout.setVerticalGroup(
            panJTEvenTopCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJTSolicitudesDeHote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTEvenTopLayout = new javax.swing.GroupLayout(panJTEvenTop);
        panJTEvenTop.setLayout(panJTEvenTopLayout);
        panJTEvenTopLayout.setHorizontalGroup(
            panJTEvenTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTEvenTopLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(panJTEvenTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        panJTEvenTopLayout.setVerticalGroup(
            panJTEvenTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTEvenTopCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panJTIRealizarReservacion1.setBackground(new java.awt.Color(255, 255, 255));
        panJTIRealizarReservacion1.setForeground(new java.awt.Color(102, 102, 102));

        JtConsultaEventos.setBackground(new java.awt.Color(255, 204, 102));
        JtConsultaEventos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JtConsultaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdEvento", "Nombre Eve", "Hotel Lugar", "Fecha", "Mesas Vidrio", "Centros Mesa", "Manteles", "Luces Led", "Floreros"
            }
        ));
        jScrollPane1.setViewportView(JtConsultaEventos);

        panJTIEvenMedio.setBackground(new java.awt.Color(51, 51, 51));
        panJTIEvenMedio.setForeground(new java.awt.Color(102, 102, 102));

        panJTEvenTopMedio.setBackground(new java.awt.Color(51, 51, 51));
        panJTEvenTopMedio.setForeground(new java.awt.Color(102, 102, 102));

        btnTraerSolicitudes.setBackground(new java.awt.Color(0, 0, 0));
        btnTraerSolicitudes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTraerSolicitudes.setForeground(new java.awt.Color(255, 255, 255));
        btnTraerSolicitudes.setText("Traer Solicitudes");
        btnTraerSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTraerSolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTraerSolicitudesMouseExited(evt);
            }
        });
        btnTraerSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraerSolicitudesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panJTEvenTopMedioLayout = new javax.swing.GroupLayout(panJTEvenTopMedio);
        panJTEvenTopMedio.setLayout(panJTEvenTopMedioLayout);
        panJTEvenTopMedioLayout.setHorizontalGroup(
            panJTEvenTopMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTraerSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTEvenTopMedioLayout.setVerticalGroup(
            panJTEvenTopMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panJTEvenTopMedioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTraerSolicitudes))
        );

        javax.swing.GroupLayout panJTIEvenMedioLayout = new javax.swing.GroupLayout(panJTIEvenMedio);
        panJTIEvenMedio.setLayout(panJTIEvenMedioLayout);
        panJTIEvenMedioLayout.setHorizontalGroup(
            panJTIEvenMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIEvenMedioLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(panJTEvenTopMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(263, 263, 263))
        );
        panJTIEvenMedioLayout.setVerticalGroup(
            panJTIEvenMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJTEvenTopMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panJTIRealizarReservacion1Layout = new javax.swing.GroupLayout(panJTIRealizarReservacion1);
        panJTIRealizarReservacion1.setLayout(panJTIRealizarReservacion1Layout);
        panJTIRealizarReservacion1Layout.setHorizontalGroup(
            panJTIRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(panJTIEvenMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panJTIRealizarReservacion1Layout.setVerticalGroup(
            panJTIRealizarReservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTIRealizarReservacion1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTIEvenMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panJTEventoLayout = new javax.swing.GroupLayout(panJTEvento);
        panJTEvento.setLayout(panJTEventoLayout);
        panJTEventoLayout.setHorizontalGroup(
            panJTEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panJTEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panJTEvenTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTIRealizarReservacion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panJTIQuintTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panJTEventoLayout.setVerticalGroup(
            panJTEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJTEventoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(panJTEvenTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panJTIQuintTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panJTIRealizarReservacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpManejoHoteles.addTab("Solicitud Elementos", panJTEvento);

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

    private void panBtnSolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnSolicitudesMouseEntered
        panBtnSolicitudes.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_panBtnSolicitudesMouseEntered

    private void panBtnSolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnSolicitudesMouseExited
        panBtnSolicitudes.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panBtnSolicitudesMouseExited

    private void panBtnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnInicioMouseEntered
        panBtnInicio.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_panBtnInicioMouseEntered

    private void lblBtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnInicioMouseExited
        panBtnInicio.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_lblBtnInicioMouseExited

    private void panBtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBtnInicioMouseExited
        panBtnInicio.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panBtnInicioMouseExited

    private void lblBtnSolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSolicitudesMouseEntered
        panBtnSolicitudes.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_lblBtnSolicitudesMouseEntered

    private void lblBtnSolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSolicitudesMouseExited
        panBtnSolicitudes.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_lblBtnSolicitudesMouseExited
       
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

    private void lblBtnSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSolicitudesMouseClicked
        tpManejoHoteles.setSelectedComponent(panJTEvento);
        
    }//GEN-LAST:event_lblBtnSolicitudesMouseClicked

    private void btnTraerSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraerSolicitudesActionPerformed
        // Boton para ver registros de Eventos
try {
    conBD.conectarBase(); // llamada a método conectar
    // Objeto almacenamiento lógico de datos modelo de datos
    DefaultTableModel modeloDatos = new DefaultTableModel();
    JtConsultaEventos.setModel(modeloDatos); // Esto manda a imprimir a la tabla

    // Ejecutar la consulta SQL para seleccionar todos los registros de la tabla eventos
    conBD.rs = conBD.stmt.executeQuery("SELECT * FROM eventos");

    // Obtener los metadatos del ResultSet para determinar el número de columnas
    ResultSetMetaData rsmd = conBD.rs.getMetaData();
    int cantidadColumnas = rsmd.getColumnCount();

    // Agregar las columnas al modelo de la tabla
    modeloDatos.addColumn("id");
    modeloDatos.addColumn("NombreEvento");
    modeloDatos.addColumn("HotelLugar");
    modeloDatos.addColumn("FechaInicio");
    modeloDatos.addColumn("Mesas");
    modeloDatos.addColumn("CentroMesa");
    modeloDatos.addColumn("Mantel");
    modeloDatos.addColumn("LucesLed");
    modeloDatos.addColumn("Flores");

    // Imprimir registros en la tabla
    while (conBD.rs.next()) {
        Object fila[] = new Object[cantidadColumnas]; // almacen de un arreglo objeto
        for (int i = 0; i < cantidadColumnas; i++) {
            fila[i] = conBD.rs.getObject(i + 1);
        }
        modeloDatos.addRow(fila);
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error 1 de BD al generar Alta\nVerifica\n" + e);
}
    }//GEN-LAST:event_btnTraerSolicitudesActionPerformed

    private void btnTraerSolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraerSolicitudesMouseEntered
        btnTraerSolicitudes.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnTraerSolicitudesMouseEntered

    private void btnTraerSolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraerSolicitudesMouseExited
        btnTraerSolicitudes.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnTraerSolicitudesMouseExited
     
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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtConsultaEventos;
    private javax.swing.JButton btnTraerSolicitudes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblBtnInicio;
    private javax.swing.JLabel lblBtnSalirLogin;
    private javax.swing.JLabel lblBtnSolicitudes;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblImagenRock;
    private javax.swing.JLabel lblJTSolicitudesDeHote;
    private javax.swing.JLabel lblJTinicio;
    private javax.swing.JLabel lblJTinicio3;
    private javax.swing.JLabel lblJTinicio5;
    private javax.swing.JLabel lblJTinicio6;
    private javax.swing.JLabel lblLogoMontageTopLeft;
    private javax.swing.JLabel lblSolicitudes;
    private javax.swing.JPanel panBarraTop;
    private javax.swing.JPanel panBarraTop2;
    private javax.swing.JPanel panBtnInicio;
    private javax.swing.JPanel panBtnSolicitudes;
    private javax.swing.JPanel panContenedorTJ;
    private javax.swing.JPanel panJTEvenTop;
    private javax.swing.JPanel panJTEvenTopCenter;
    private javax.swing.JPanel panJTEvenTopMedio;
    private javax.swing.JPanel panJTEvenTopMedio2;
    private javax.swing.JPanel panJTEvento;
    private javax.swing.JPanel panJTIEnveMedio;
    private javax.swing.JPanel panJTIEvenMedio;
    private javax.swing.JPanel panJTIQuintTop1;
    private javax.swing.JPanel panJTIRealizarReservacion1;
    private javax.swing.JPanel panJTInicio;
    private javax.swing.JPanel panJTInicioTop;
    private javax.swing.JPanel panJTInicioTop3;
    private javax.swing.JPanel panJTInicioTop5;
    private javax.swing.JPanel panJTInicioTopCenter;
    private javax.swing.JPanel panJTInicioTopCenter3;
    private javax.swing.JPanel panJTInicioTopCenter5;
    private javax.swing.JPanel panLogoMontage;
    private javax.swing.JPanel panMenuLeft;
    private javax.swing.JPanel panSalirLogin;
    private javax.swing.JPanel panTJInicio2;
    private javax.swing.JTabbedPane tpManejoHoteles;
    // End of variables declaration//GEN-END:variables
}
