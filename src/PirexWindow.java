import java.awt.BorderLayout;
import javax.swing.JFrame;

public class PirexWindow extends JFrame{
	/**
     * Default Constructor.
     */
    public PirexWindow()
    {
        super();
        setupLayout();
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    
    private void setupLayout()
    {
        add(new MainTabs(), BorderLayout.CENTER);
    }
}
