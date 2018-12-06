import java.awt.TextArea;
import java.awt.TextField;

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
		
		JPanel panel2 = new JPanel();
		addTab("Load Documents",  panel2);
		
		panel2.setLayout(null);
		// text box
		JLabel loadLabel1 = new JLabel("Text File: ");
		loadLabel1.setBounds(10, 30, 100, 30);
		panel2.add(loadLabel1);
		
		JTextField loadField1 = new JTextField();
		loadField1.setBounds(110, 30, 750, 30);
		panel2.add(loadField1);
		
		
		
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
