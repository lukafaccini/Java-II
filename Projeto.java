package projeto;
import javax.swing.JOptionPane;

public class Projeto {

    public static void main(String[] args) {
        String first = JOptionPane.showInputDialog ("Digite o primeiro dígito");
        String second = JOptionPane.showInputDialog ("Digite o segundo dígito");
        
        int n1 = Integer.parseInt(first);
        int n2 = Integer.parseInt(second);
        
        int soma = n1+n2;
        JOptionPane.showMessageDialog(null, "A soma é "+soma,"Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
