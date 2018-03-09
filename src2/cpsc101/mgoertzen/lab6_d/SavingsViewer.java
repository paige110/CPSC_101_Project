
package cpsc101.mgoertzen.lab6_d;

public class SavingsViewer {
    
    public static void main(String[] args)
    {
         Savings savings = new Savings();
         javax.swing.SwingUtilities.invokeLater(() -> {
            savings.createWindow();
        });
    }
    
}
