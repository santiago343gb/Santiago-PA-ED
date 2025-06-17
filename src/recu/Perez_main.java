package recu;

public class Perez_main {

    public static void main(String[] args) {
        
        Perez_circulo circulo1 = new Perez_circulo(1, "Circulo1", 5.0, "Rojo");
        Perez_circulo circulo2 = new Perez_circulo(2, "Circulo2", 3.0, "Azul");

        
        Perez_rectangulo rectangulo1 = new Perez_rectangulo(1, 4.0, 6.0, "Verde");
        Perez_rectangulo rectangulo2 = new Perez_rectangulo(2, 2.0, 2.0, "Amarillo"); // cuadrado

       
        double areaCirculo1 = Math.PI * circulo1.getRadio() * circulo1.getRadio();
        double areaCirculo2 = Math.PI * circulo2.getRadio() * circulo2.getRadio();

        double areaRectangulo1 = rectangulo1.getLadoA() * rectangulo1.getLadoB();
        double areaRectangulo2 = rectangulo2.getLadoA() * rectangulo2.getLadoB();

        
        System.out.println("Área del " + circulo1.getNombre() + ": " + areaCirculo1);
        System.out.println("Área del " + circulo2.getNombre() + ": " + areaCirculo2);
        System.out.println("Área del Rectángulo 1: " + areaRectangulo1);
        System.out.println("Área del Rectángulo 2: " + areaRectangulo2);

     
        double diferenciaAreas = Math.abs(areaCirculo1 - areaRectangulo2);
        System.out.println("Diferencia de áreas entre " + circulo1.getNombre() + " y el cuadrado: " + diferenciaAreas);
    }
//jgks
  
}
