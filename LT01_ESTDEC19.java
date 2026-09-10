import javax.swing.JOptionPane;
public class LT01_ESTDEC19 {
    public static void main(String args[]){
        double x, y, maior;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        if (x > y){
            maior = x;
            JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
        }
        else{
            maior = y;
            JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
        }
    }
    
}
