/*
 * @copyright Copyright (c) 2010 Laboratório de Educação Cerebral. (http://www.educacaocerebral.com.br)
 *
 * This file is part of SoftVFC.
 *
 * SoftVFC is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SoftVFC is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SoftVFC.  If not, see <http://www.gnu.org/licenses/>.
 *
 * *********************
 *
 * Este arquivo é parte do programa SoftVFC.
 *
 * SoftVFC é um software livre; você pode redistribui-lo e/ou
 * modifica-lo dentro dos termos da Licença Pública Geral GNU como
 * publicada pela Fundação do Software Livre (FSF); na versão 3 da
 * Licença.
 *
 * Este programa é distribuido na esperança que possa ser util,
 * mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUAÇÂO a qualquer
 * MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a
 * Licença Pública Geral GNU para maiores detalhes.
 *
 * Você deve ter recebido uma cópia da Licença Pública Geral GNU
 * junto com este programa, se não, acesse no website oficial:
 * http://www.gnu.org/licenses/gpl.html
 *
 */
/**
 *
 * @author Diego Schmaedech Martins (schmaedech@gmail.com)
 * @version 29/07/2010
 */

package com.sdk.connector.settings;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.util.logging.Logger;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import org.openide.util.ImageUtilities;
import org.netbeans.api.settings.ConvertAsProperties;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//com.sdk.connector.settings//Settings//EN",
autostore = false)
public final class SettingsTopComponent extends TopComponent {

    private static SettingsTopComponent instance;
    /** path to the icon used by the component and its open action */
    static final String ICON_PATH = "com/sdk/connector/settings/gnome-settings.png";
    private static final String PREFERRED_ID = "SettingsTopComponent";

    public SettingsTopComponent() {
        initComponents();
        setName(NbBundle.getMessage(SettingsTopComponent.class, "CTL_SettingsTopComponent"));
        setToolTipText(NbBundle.getMessage(SettingsTopComponent.class, "HINT_SettingsTopComponent"));
        setIcon(ImageUtilities.loadImage(ICON_PATH, true));

         FFTSettingsPanel fftPanel = new FFTSettingsPanel();
        FFTPanel.setLayout(new GridLayout(0,1));
        FFTPanel.add(fftPanel);

        LombSettingsPanel lombPanel = new LombSettingsPanel();
        LombPanel.setLayout(new GridLayout(0,1));
        LombPanel.add(lombPanel);

        MemseSettingsPanel arPanel = new MemseSettingsPanel();
        ARPanel.setLayout(new GridLayout(0,1));
        ARPanel.add(arPanel);

        CoherenceSettingsPanel coerencePanel = new CoherenceSettingsPanel();
        CoerencePanel.setLayout(new GridLayout(0,1));
        CoerencePanel.add(coerencePanel);

        RRBCSettingsPanel rrbcPanel = new RRBCSettingsPanel();
        RRBCPanel.setLayout(new GridLayout(0,1));
        RRBCPanel.add(rrbcPanel);
    }

    private Color color1 = new Color(250,255,255);
    private Color color2 = color1.brighter();
    @Override
    protected void paintComponent( Graphics g ) {
        if ( !isOpaque( ) ) {
            super.paintComponent( g );
            return;
        }
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth( );
        int h = getHeight( );
        GradientPaint gp = new GradientPaint(
            0, 0, color1,
            0, h, color2 );

        g2d.setPaint( gp );
        g2d.fillRect( 0, 0, w, h );
        Dimension d = getSize();

        g2d.drawImage(new javax.swing.ImageIcon(getClass().getResource("/com/sdk/connector/resources/background.png")).getImage(), 0, 0,d.width,d.height, null);
        setOpaque( false );
        super.paintComponent( g );
        setOpaque( true );
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        FFTPanel = new javax.swing.JPanel();
        ARPanel = new javax.swing.JPanel();
        LombPanel = new javax.swing.JPanel();
        CoerencePanel = new javax.swing.JPanel();
        RRBCPanel = new javax.swing.JPanel();

        setOpaque(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                resized(evt);
            }
        });

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        FFTPanel.setOpaque(false);

        javax.swing.GroupLayout FFTPanelLayout = new javax.swing.GroupLayout(FFTPanel);
        FFTPanel.setLayout(FFTPanelLayout);
        FFTPanelLayout.setHorizontalGroup(
            FFTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        FFTPanelLayout.setVerticalGroup(
            FFTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(SettingsTopComponent.class, "SettingsTopComponent.FFTPanel.TabConstraints.tabTitle"), FFTPanel); // NOI18N

        ARPanel.setOpaque(false);

        javax.swing.GroupLayout ARPanelLayout = new javax.swing.GroupLayout(ARPanel);
        ARPanel.setLayout(ARPanelLayout);
        ARPanelLayout.setHorizontalGroup(
            ARPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        ARPanelLayout.setVerticalGroup(
            ARPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(SettingsTopComponent.class, "SettingsTopComponent.ARPanel.TabConstraints.tabTitle"), ARPanel); // NOI18N

        LombPanel.setOpaque(false);

        javax.swing.GroupLayout LombPanelLayout = new javax.swing.GroupLayout(LombPanel);
        LombPanel.setLayout(LombPanelLayout);
        LombPanelLayout.setHorizontalGroup(
            LombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        LombPanelLayout.setVerticalGroup(
            LombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(SettingsTopComponent.class, "SettingsTopComponent.LombPanel.TabConstraints.tabTitle"), LombPanel); // NOI18N

        CoerencePanel.setOpaque(false);

        javax.swing.GroupLayout CoerencePanelLayout = new javax.swing.GroupLayout(CoerencePanel);
        CoerencePanel.setLayout(CoerencePanelLayout);
        CoerencePanelLayout.setHorizontalGroup(
            CoerencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        CoerencePanelLayout.setVerticalGroup(
            CoerencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(SettingsTopComponent.class, "SettingsTopComponent.CoerencePanel.TabConstraints.tabTitle"), CoerencePanel); // NOI18N

        RRBCPanel.setOpaque(false);

        javax.swing.GroupLayout RRBCPanelLayout = new javax.swing.GroupLayout(RRBCPanel);
        RRBCPanel.setLayout(RRBCPanelLayout);
        RRBCPanelLayout.setHorizontalGroup(
            RRBCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        RRBCPanelLayout.setVerticalGroup(
            RRBCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(SettingsTopComponent.class, "SettingsTopComponent.RRBCPanel.TabConstraints.tabTitle"), RRBCPanel); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_resized
        repaint();
    }//GEN-LAST:event_resized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ARPanel;
    private javax.swing.JPanel CoerencePanel;
    private javax.swing.JPanel FFTPanel;
    private javax.swing.JPanel LombPanel;
    private javax.swing.JPanel RRBCPanel;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link #findInstance}.
     */
    public static synchronized SettingsTopComponent getDefault() {
        if (instance == null) {
            instance = new SettingsTopComponent();
        }
        return instance;
    }

    /**
     * Obtain the SettingsTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized SettingsTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(SettingsTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof SettingsTopComponent) {
            return (SettingsTopComponent) win;
        }
        Logger.getLogger(SettingsTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID
                + "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }

    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    Object readProperties(java.util.Properties p) {
        if (instance == null) {
            instance = this;
        }
        instance.readPropertiesImpl(p);
        return instance;
    }

    private void readPropertiesImpl(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    @Override
    protected String preferredID() {
        return PREFERRED_ID;
    }
}
