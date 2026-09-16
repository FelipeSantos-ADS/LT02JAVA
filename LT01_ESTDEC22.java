import javax.swing.JOptionPane;
public class LT01_ESTDEC22 {
    public static void main (String args[]){
        int x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        if (x < y){
            JOptionPane.showMessageDialog(null, "Em ordem crescente: " + x + ", " + y);
        }
        else{
            JOptionPane.showMessageDialog(null, "Em ordem crescente: " + y + ", " + x);
        }
    }
    
}
