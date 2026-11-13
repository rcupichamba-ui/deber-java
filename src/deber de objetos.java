import javax.swing.JOptionPane;

public class deber {

    public static void main(String[] args) {
        // HOLA MUNDO INICIAL
        System.out.println("HOLA MUNDO SOY RONAL");
        
        // 0. Suma de dos numeros
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "SUMA\nIngrese el primer número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número:"));
        double suma = n1 + n2;
        System.out.println("La suma es: " + suma);
        
        // 1. Cálculo de promedio
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "1. PROMEDIO\nIngrese la primera calificación:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la segunda calificación:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tercera calificación:"));
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("1. El promedio de las tres calificaciones es: " + promedio);

        // 2. Edad de la madre al dar a luz
        int edadMadre = Integer.parseInt(JOptionPane.showInputDialog(null, "2. EDAD DE LA MADRE\nIngrese la edad actual de la madre:"));
        int edadHijo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad actual del hijo:"));
        int edadAlDarALuz = edadMadre - edadHijo;
        System.out.println("2. La madre dio a luz a los: " + edadAlDarALuz + " años");

        // 3. Conversión de unidades (Pesos colombianos a dólares)
        double pesosCOP = Double.parseDouble(JOptionPane.showInputDialog(null, "3. CONVERSIÓN COP A USD\nIngrese la cantidad en pesos colombianos:"));
        double tasaCambio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor actual de 1 dólar en pesos colombianos (ej. 4200):"));
        double dolares = pesosCOP / tasaCambio;
        System.out.println("3. " + pesosCOP + " COP equivalen a: $" + dolares + " USD");

        // 4. Cálculo del Área y perímetro de un círculo
        double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "4. CÍRCULO\nIngrese el radio del círculo:"));
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double perimetroCirculo = 2 * Math.PI * radio;
        System.out.println("4. Círculo -> Área: " + areaCirculo + " | Perímetro: " + perimetroCirculo);

        // 5. Cálculo del Área y perímetro de un rombo
        double diagMayor = Double.parseDouble(JOptionPane.showInputDialog(null, "5. ROMBO\nIngrese la diagonal mayor (D):"));
        double diagMenor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la diagonal menor (d):"));
        double ladoRombo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la medida de un lado del rombo (L):"));
        double areaRombo = (diagMayor * diagMenor) / 2;
        double perimetroRombo = 4 * ladoRombo;
        System.out.println("5. Rombo -> Área: " + areaRombo + " | Perímetro: " + perimetroRombo);
    }
}