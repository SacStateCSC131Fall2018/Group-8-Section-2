import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MainTabs extends JTabbedPane{
	public MainTabs() {
		JTextArea panelFiller = new JTextArea(200, 200);
		
		JPanel panel1 = new JPanel();
		panel1.add(panelFiller);
		addTab("Search for Documents",  panel1);
		
		JPanel panel2 = new JPanel();
		addTab("Load Documents",  panel2);
		
		JPanel panel3 = new JPanel();
		addTab("Summarize Documents",  panel3);
		
		setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}
	
}
