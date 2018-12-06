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
        setupIcon();
        setupLayout();
        setupMenu();
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    
    private void setupIcon()
    {
    	this.setIconImage(new ImageIcon(getClass().getResource("Pirex_Icon.png")).getImage());
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
    	JMenu menu, menuFile, menuOption;
    	JMenuItem menuItem;
    	
    	//Creates the Menu Bar
    	menuBar = new JMenuBar();
    	
    	//Creates the File Menu
    	menu = new JMenu("File");
        menu.getAccessibleContext().setAccessibleDescription("Dealing with Files");
        menuBar.add(menu);
        
        //Creates the Help Menu Tab
    	menuFile = new JMenu("Help");
        menuFile.getAccessibleContext().setAccessibleDescription("Help user with navagation of Pirex");
        menuBar.add(menuFile);
        
        //Creates the Option Menu Tab
    	menuOption = new JMenu("Menu");
        menuOption.getAccessibleContext().setAccessibleDescription("Gives the user option for interacting with documents");
        menuBar.add(menuOption);
        
        //Shows Sources (Doesn't actually show you the Sources)
        menuItem = new JMenuItem("Option");
        menuOption.add(menuItem);
        
        //Shows Documents
        menuItem = new JMenuItem("Documents");
        menuOption.add(menuItem);
        
        //Shows Index (Doesn't actually show you the Index)
        menuItem = new JMenuItem("Index");
        menuFile.add(menuItem);
        
        //Shows About (Doesn't show anything)
        menuItem = new JMenuItem("About");
        menuFile.add(menuItem);
        
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
