import javax.swing.JOptionPane;

public class HolaMundo {

    public static void main(String[] args) {
        // HOLA MUNDO
        System.out.println("HOLA MUNDO SOY RONAL");
        
        // Suma de dos numeros
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        double suma = n1 + n2;
        
        System.out.println("La suma es: " + suma);
    }
}



