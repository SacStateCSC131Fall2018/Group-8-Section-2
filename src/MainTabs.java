import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class MainTabs extends JTabbedPane{
	public MainTabs() {
		
		//JTextArea panelFiller = new JTextArea(200, 200);
		
		
		JPanel panel1 = new JPanel();
		//panel1.add(panelFiller);
		addTab("Search for Documents",  panel1);
		
		/*SEARCH TAB: GURJOT HANSRA*/
		
		//Search Text Field
		panel1.setLayout(null);
		TextField textField1 = new TextField();
		textField1.setBounds(100, 35, 700, 45);
		panel1.add(textField1);
				
		//Query Text
		JTextPane queryText = new JTextPane();
		queryText.setText("      QUERY:");
		queryText.setBounds(10, 35, 200, 45);
		queryText.setBackground(UIManager.getColor("Button.background")); //changes background color
		panel1.add(queryText);
				
		//Clear Button
		JButton clearButton = new JButton("CLEAR");
		clearButton.setBounds(800, 35, 150, 45);
		panel1.add(clearButton);
				
		//Upper Text Field
		JTextField textField2 = new JTextField();
		textField2.setBounds(10, 85, 940, 200);
		panel1.add(textField2);
				
		//Lower TextArea
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 300, 940, 200);
		panel1.add(textArea);
				
		/*--------------------------------------*/
		
		
		
		/*
		 * THIS IS THE NEW GRID BASED LAYOUT LOAD TAB
		 * IT'S NOT WORKING AS EXPECTED SO THERE'S ONLY 3 WIDGETS
		 * BUT HAS SOME COMMENTS
		 */
		
		// assigns the gridbaglayout required
		JPanel panel2 = new JPanel(new GridBagLayout());
		addTab("Load Documents",  panel2);
		
		// constraints object required 
        GridBagConstraints cst = new GridBagConstraints();
		
		// adds text
		JLabel loadLabel1 = new JLabel("Text File: ");
		cst.fill = GridBagConstraints.HORIZONTAL;
		//for resizing on horizontal, width change, takes from 0 to 1
		cst.weightx = 1;
		//for resizing on vertical, height change, takes from 0 to 1
		cst.weighty = 1;
		//starts on first column
        cst.gridx = 0;
        //starts on first row
        cst.gridy = 0;
        panel2.add(loadLabel1,cst);
		
        JTextField searchField = new JTextField();
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.weightx = 1;
		cst.weighty = 1;
		//supposed to make it span for 2 columns but displays same size as next widget, needs fixing... can't keep going
        cst.gridwidth = 2;
        cst.gridx = 1;
        cst.gridy = 0;
        panel2.add(searchField,cst);
        
        JButton browseButton = new JButton("Browse");
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.weightx = 1;
		cst.weighty = 1;
        cst.gridx = 3;
        cst.gridy = 0;
        panel2.add(browseButton, cst);
 
        /*
		 * END OF NEW GRID BASED LAYOUT
		 */
        
        
        
        /*
         * THIS WAS THE ORIGINAL LOAD TAB CODE
         * WITH NULL LAYOUT
         * SHOULD DELETE GRID BASED CODE
         * AND UNCOMMENT THIS ONE TO GO BACK TO NORMAL

      
        	JPanel panel2 = new JPanel(new GridBagLayout());
		addTab("Load Documents",  panel2);
		
         // Layout null..
		panel2.setLayout(null);
		
		// text box
		JLabel loadLabel1 = new JLabel("Text File: ");
		loadLabel1.setBounds(10, 30, 100, 30);
		panel2.add(loadLabel1);
         
		//BROWSE
		JButton browseButton = new JButton("Browse");
		browseButton.setBounds(800, 35, 150, 45);
		panel2.add(browseButton);
		
		//SEARCH BOX
		JTextField searchField = new JTextField();
		searchField.setBounds(100, 35, 700, 45);
		panel2.add(searchField);
		
		//UPPER BOX
		JTextPane txtFileType = new JTextPane();
		txtFileType.setText("Text File Type:");
		txtFileType.setBackground(UIManager.getColor("Button.background"));
		txtFileType.setBounds(10, 90, 100, 45);
		panel2.add(txtFileType);
		
		//CHOICE
		Choice choice = new Choice();
		choice.setBounds(150, 90, 800, 200);
		panel2.add(choice);
		
		//TITLE
		JTextPane titleText = new JTextPane();
		titleText.setText("Title:");
		titleText.setBackground(UIManager.getColor("Button.background"));
		titleText.setBounds(10, 150, 50, 45);
		panel2.add(titleText);
		
		TextField txtField = new TextField();
		txtField.setBounds(150, 150, 300, 45);
		panel2.add(txtField);
		
		//AUTHOR
		JTextPane authorText = new JTextPane();
		authorText.setText("Author:");
		authorText.setBackground(SystemColor.menu);
		authorText.setBounds(500, 150, 50, 45);
		panel2.add(authorText);
		
		TextField txtField2 = new TextField();
		txtField2.setBounds(550, 150, 300, 45);
		panel2.add(txtField2);
		
		//PROCESS
		JButton processButton = new JButton("Process");
		processButton.setBounds(10, 200, 100, 45);
		panel2.add(processButton);
		
		//MAIN TEXT FIELD
		JTextField mainTextField = new JTextField();
		mainTextField.setBounds(10, 250, 900, 250);
		panel2.add(mainTextField);
		mainTextField.setColumns(10);


		* END OF ORIGINAL LAYOUT 
		* SHOULD DELETE GRID BASED LAYOUT AND UNCOMMENT THIS ONE
		*/
        
        
		//////////////////////////////////////////////
		
        
		JPanel panel3 = new JPanel();
		addTab("Summarize Documents",  panel3);
		//Text Area for the information
		JTextArea summaryFiller = new JTextArea(32, 83);
		panel3.add(summaryFiller);
		//Adds a scroll pane for the information to be scrollable
		JScrollPane scroll = new JScrollPane();
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}
	
}
