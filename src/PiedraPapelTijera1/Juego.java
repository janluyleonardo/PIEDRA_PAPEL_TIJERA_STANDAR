package PiedraPapelTijera1;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    PiedraPapelTijera ppt = new PiedraPapelTijera();
    Icon normalDer = new ImageIcon("src/PiedraPapelTijera/Imagenes/normalDer.png");
    Icon normalIzq = new ImageIcon("src/PiedraPapelTijera/Imagenes/normalIzq.png");
    Icon piedraDer = new ImageIcon("src/PiedraPapelTijera/Imagenes/piedraDer.png");
    Icon piedraIzq = new ImageIcon("src/PiedraPapelTijera/Imagenes/piedraIzq.png");
    Icon papelDer = new ImageIcon("src/PiedraPapelTijera/Imagenes/papelDer.png");
    Icon papelIzq = new ImageIcon("src/PiedraPapelTijera/Imagenes/papelIzq.png");
    Icon tijeraDer = new ImageIcon("src/PiedraPapelTijera/Imagenes/tijeraDer.png");
    Icon tijeraIzq = new ImageIcon("src/PiedraPapelTijera/Imagenes/tijeraIzq.png");
    Icon AZulgana = new ImageIcon ("src/piedraPapelTijera/Imagenes/AZULGANA.png");
    Icon Rojogana = new ImageIcon ("src/piedraPapelTijera/Imagenes/ROJO GANA.png");
    Icon Empate = new ImageIcon ("src/piedraPapelTijera/Imagenes/EMPATE.png");
    int opcion;
    
    public Juego() {
        initComponents();
        ppt.generarJugada();
        this.jugarPartida.setEnabled(false);
        this.setLocationRelativeTo(this);
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manoJ1icon = new javax.swing.JLabel();
        manoCPUicon = new javax.swing.JLabel();
        piedrabtn = new javax.swing.JButton();
        papelbtn = new javax.swing.JButton();
        tijerabtn = new javax.swing.JButton();
        jugarPartida = new javax.swing.JButton();
        eleccionJ1 = new javax.swing.JLabel();
        eleccionCPU = new javax.swing.JLabel();
        nombreJugador = new javax.swing.JLabel();
        nombreCPU = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        manoJ1icon1 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manoJ1icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/normalIzq.png"))); // NOI18N

        manoCPUicon.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        manoCPUicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/normalDer.png"))); // NOI18N

        piedrabtn.setBackground(new java.awt.Color(204, 204, 255));
        piedrabtn.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 11)); // NOI18N
        piedrabtn.setText("PIEDRA");
        piedrabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piedrabtnActionPerformed(evt);
            }
        });

        papelbtn.setText("PAPEL");
        papelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelbtnActionPerformed(evt);
            }
        });

        tijerabtn.setText("TIJERA");
        tijerabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijerabtnActionPerformed(evt);
            }
        });

        jugarPartida.setText("Jugar Partida");
        jugarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarPartidaActionPerformed(evt);
            }
        });

        eleccionJ1.setBackground(new java.awt.Color(255, 255, 255));
        eleccionJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eleccionJ1.setOpaque(true);

        eleccionCPU.setBackground(new java.awt.Color(255, 255, 255));
        eleccionCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eleccionCPU.setOpaque(true);

        nombreJugador.setBackground(new java.awt.Color(255, 255, 51));
        nombreJugador.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        nombreJugador.setForeground(new java.awt.Color(255, 255, 51));
        nombreJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJugador.setText("Player 1");

        nombreCPU.setFont(new java.awt.Font("Yu Mincho Light", 1, 11)); // NOI18N
        nombreCPU.setForeground(new java.awt.Color(255, 255, 51));
        nombreCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreCPU.setText("CPU");

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        manoJ1icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/K.png"))); // NOI18N

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/fondo-azul-blue-cuadros-fotorecurso-bell.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(manoJ1icon, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(manoCPUicon, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tijerabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(papelbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(piedrabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jugarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(eleccionJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manoJ1icon1)
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eleccionCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nombreCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreCPU, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eleccionCPU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eleccionJ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manoJ1icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manoCPUicon, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manoJ1icon, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jugarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(piedrabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(papelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(tijerabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Fondo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void piedrabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piedrabtnActionPerformed
        ppt.setJugadaPlayer(ppt.PIEDRA);
        eleccionJ1.setText(ppt.getJugadaPlayer1());
        this.jugarPartida.setEnabled(true);
    }//GEN-LAST:event_piedrabtnActionPerformed

    private void papelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelbtnActionPerformed
        ppt.setJugadaPlayer(ppt.PAPEL);
        eleccionJ1.setText(ppt.getJugadaPlayer1());
        this.jugarPartida.setEnabled(true);
    }//GEN-LAST:event_papelbtnActionPerformed

    private void tijerabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tijerabtnActionPerformed
        ppt.setJugadaPlayer(ppt.TIJERA);
        eleccionJ1.setText(ppt.getJugadaPlayer1());
        this.jugarPartida.setEnabled(true);
    }//GEN-LAST:event_tijerabtnActionPerformed

    private void jugarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarPartidaActionPerformed

        ppt.comparaJugada();

        switch (ppt.getJugadaPlayer()) {
            case 1:
            manoJ1icon.setIcon(piedraIzq);
            break;
            case 2:
            manoJ1icon.setIcon(papelIzq);
            break;
            case 3:
            manoJ1icon.setIcon(tijeraIzq);
            break;
        }
        switch (ppt.getIntJugadaCPU()) {
            case 1:
            manoCPUicon.setIcon(piedraDer);
            break;
            case 2:
            manoCPUicon.setIcon(papelDer);
            break;
            case 3:
            manoCPUicon.setIcon(tijeraDer);
            break;
        }
        this.piedrabtn.setEnabled(false);
        this.papelbtn.setEnabled(false);
        this.tijerabtn.setEnabled(false);
        

        eleccionCPU.setText(ppt.getJugadaCPU());
        jugarPartida.setEnabled(false);

    }//GEN-LAST:event_jugarPartidaActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        ppt.generarJugada();
        eleccionJ1.setText(null);
        eleccionCPU.setText(null);
        this.piedrabtn.setEnabled(true);
        this.papelbtn.setEnabled(true);
        this.tijerabtn.setEnabled(true);

        manoJ1icon.setIcon(normalIzq);
        manoCPUicon.setIcon(normalDer);
    }//GEN-LAST:event_siguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel eleccionCPU;
    private javax.swing.JLabel eleccionJ1;
    private javax.swing.JButton jugarPartida;
    private javax.swing.JLabel manoCPUicon;
    private javax.swing.JLabel manoJ1icon;
    private javax.swing.JLabel manoJ1icon1;
    private javax.swing.JLabel nombreCPU;
    private javax.swing.JLabel nombreJugador;
    private javax.swing.JButton papelbtn;
    private javax.swing.JButton piedrabtn;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton tijerabtn;
    // End of variables declaration//GEN-END:variables
}
