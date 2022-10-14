package org.example;

import org.example.form.LoadingForm;
import org.example.frame.MainFrame;
import org.example.util.ConfigUtil;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static ConfigUtil config = ConfigUtil.getInstance();

    public static MainFrame mainFrame;

    public static oshi.SystemInfo si;
    public static void main(String[] args) {
        mainFrame = new MainFrame();
        mainFrame.init();
        JPanel loadingPanel = new LoadingForm().getLoadingPanel();
        mainFrame.add(loadingPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        if (config.isDefaultMaxWindow() || screenSize.getWidth() <= 1366) {
            // The window is automatically maximized at low resolution
            mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }

        //UpgradeUtil.smoothUpgrade();

        mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        si = new oshi.SystemInfo();

        //Init.initGlobalFont();
        //mainFrame.setContentPane(MainWindow.getInstance().getMainPanel());
        //MainWindow.getInstance().init();
        //Init.initAllTab();
        //Init.initOthers();
        mainFrame.remove(loadingPanel);
    }
}