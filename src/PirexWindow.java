import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;

import javax.swing.*;

public class PirexWindow extends JFrame {
	/**
     * Default Constructor.
     */
    public PirexWindow()
    {
        super();
        setupLayout();
        setupMenu();
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    
    private void setupLayout()
    {
        add(new MainTabs(), BorderLayout.CENTER);
    }
    

}
