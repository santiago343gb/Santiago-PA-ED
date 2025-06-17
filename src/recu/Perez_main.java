package recu;

/**Santiago Perez
 * version 3 creo
 * Ejecuta la clase para calcular el area
 */
public class Perez_main {

   
    private static final double RADIO_CIRCULO_1 = 5.0;
    private static final double RADIO_CIRCULO_2 = 3.0;

    private static final double LADO_A_RECTANGULO_1 = 4.0;
    private static final double LADO_B_RECTANGULO_1 = 6.0;

    private static final double LADO_A_RECTANGULO_2 = 2.0;
    private static final double LADO_B_RECTANGULO_2 = 2.0;

    public static void main(String[] args) {
        
        
        Perez_circulo circulo1 = new Perez_circulo(1, "Circulo1", RADIO_CIRCULO_1, "Rojo");
        Perez_circulo circulo2 = new Perez_circulo(2, "Circulo2", RADIO_CIRCULO_2, "Azul");

        Perez_rectangulo rectangulo1 = new Perez_rectangulo(1, LADO_A_RECTANGULO_1, LADO_B_RECTANGULO_1, "Verde");
        Perez_rectangulo rectangulo2 = new Perez_rectangulo(2, LADO_A_RECTANGULO_2, LADO_B_RECTANGULO_2, "Amarillo"); 

        double areaCirculo1 = Math.PI * circulo1.getRadio() * circulo1.getRadio();
        double areaCirculo2 = Math.PI * circulo2.getRadio() * circulo2.getRadio();

        double areaRectangulo1 = rectangulo1.getLadoA() * rectangulo1.getLadoB();
        double areaRectangulo2 = rectangulo2.getLadoA() * rectangulo2.getLadoB();

        extracted2(circulo1, circulo2, areaCirculo1, areaCirculo2, areaRectangulo1, areaRectangulo2);
        extracted(circulo1, rectangulo1, areaCirculo1, areaRectangulo2);
    }

    private static void extracted2(Perez_circulo circulo1, Perez_circulo circulo2, double areaCirculo1,
            double areaCirculo2, double areaRectangulo1, double areaRectangulo2) {
        System.out.println("Área del " + circulo1.getNombre() + ": " + areaCirculo1);
        System.out.println("Área del " + circulo2.getNombre() + ": " + areaCirculo2);
        System.out.println("Área del Rectángulo 1: " + areaRectangulo1);
        System.out.println("Área del Rectángulo 2: " + areaRectangulo2);
    }

    private static void extracted(Perez_circulo circulo1, Perez_rectangulo rectangulo1, double areaCirculo1,
            double areaRectangulo2) {
        double diferenciaAreas = Math.abs(areaCirculo1 - areaRectangulo2);
        System.out.println("Diferencia de áreas entre " + circulo1.getNombre() + " y el cuadrado: " + diferenciaAreas);

        System.out.println("Perímetro de " + circulo1.getNombre() + ": " + calcularPerimetroCirculo(circulo1));
        System.out.println("Perímetro del Rectángulo 1: " + calcularPerimetroRectangulo(rectangulo1));
    }

    private static double calcularPerimetroCirculo(Perez_circulo c) {
        return 2 * Math.PI * c.getRadio();
    }

    private static double calcularPerimetroRectangulo(Perez_rectangulo r) {
        return 2 * r.getLadoA() + 2 * r.getLadoB();
 
    //guardado numeros magicos
    }
}
