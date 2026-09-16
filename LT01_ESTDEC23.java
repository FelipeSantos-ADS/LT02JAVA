import javax.swing.JOptionPane;
public class LT01_ESTDEC23 {
    public static void main (String args[]){
        double n1, n2, n3, n4;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3° número: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 4° número: "));
        
        if(n1 < n2 && n2 < n3){
            
        if(n4 < n1){
            JOptionPane.showMessageDialog(null, "Em ordem crescente: "+ n4+ ", " + n1 + ", "+n2+ ", " +n3);
        }
        else if(n4 < n2){
            JOptionPane.showMessageDialog(null, "Em ordem crescente: "+ n1+ ", " + n4 + ", "+n2+ ", " +n3);
        }
        else if(n4 < n3){
            JOptionPane.showMessageDialog(null, "Em ordem crescente: "+ n1+ ", " + n2 + ", "+n4+ ", " +n3);
        }
        else{
            JOptionPane.showMessageDialog(null, "Em ordem crescente: "+ n1+ ", " + n2 + ", "+n3+ ", " +n4);    
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Os números não são crescentes");
        }
    
    }
    
}
