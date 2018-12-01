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
    
    private void setupMenu()
    {
    	setJMenuBar(createMenuBar());
    }
    
    public JMenuBar createMenuBar()
    {
    	JMenuBar menuBar;
    	JMenu menu;
    	JMenuItem menuItem;
    	
    	//Creates the Menu Bar
    	menuBar = new JMenuBar();
    	
    	//Creates the File Menu
    	menu = new JMenu("File");
        menu.getAccessibleContext().setAccessibleDescription("Dealing with Files");
        menuBar.add(menu);
        
        //Save Query (Doesn't actually Save)
        menuItem = new JMenuItem("Save Query");
        menu.add(menuItem);
        
        //Load Query (Doesn't actually Load)
        menuItem = new JMenuItem("Load Query");
        menu.add(menuItem);
        
        //Export (Doesn't actually Export)
        menuItem = new JMenuItem("Export");
        menu.add(menuItem);
        
        //Exit (Actually Works)
        menuItem = new JMenuItem("Exit");
        menuItem.addActionListener((event) -> System.exit(0));
        menu.add(menuItem);
              
    	return menuBar;
    }
}
