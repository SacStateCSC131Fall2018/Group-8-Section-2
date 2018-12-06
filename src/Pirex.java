/**
 * The main class for the CashMachine application
 */
public class Pirex
{
    /**
     * The entry point of the application
     *
     * @param args   The command-line arguments
     */
    public static void main(String[] args)
    {
        PirexWindow         window;
        
        window = new PirexWindow();
        window.setTitle("Pirex");        
        window.setBounds(100, 100, 990, 620); //set window size
        window.setVisible(true);
    }
}
