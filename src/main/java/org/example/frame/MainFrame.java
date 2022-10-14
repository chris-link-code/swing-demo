package org.example.frame;

import org.example.UiConsts;
import org.example.util.ComponentUtil;

import javax.swing.*;

/**
 * Main Frame
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2021/11/08.
 */
public class MainFrame extends JFrame {

    public void init() {
        this.setName(UiConsts.APP_NAME);
        this.setTitle(UiConsts.APP_NAME);
        //setIconImages(FlatSVGUtils.createWindowIconImages("/icons/MooInfo.svg"));
        //TopMenuBar topMenuBar = TopMenuBar.getInstance();
        //topMenuBar.init();
        //setJMenuBar(topMenuBar);
        ComponentUtil.setPreferSizeAndLocateToCenter(this, 0.6, 0.8);

        //FrameListener.addListeners();
    }
}
