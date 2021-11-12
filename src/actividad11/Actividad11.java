/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Actividad11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String operacion, shape;

        Figuras.Circle circle = new Figuras.Circle();
        Figuras.Square square = new Figuras.Square();
        Figuras.Triangule triangule = new Figuras.Triangule();

        System.out.println("Seleccionar propiedad a calcular \n A = área \n P = perímetro.");
        Scanner propiedad = new Scanner(System.in);
        operacion = propiedad.nextLine();

        if ("A".equals(operacion)) {
            System.out.println("Haz elegido la propiedad Area");
            System.out.println("Seleccione una figura");
            System.out.println("1. Circulo\n2. Cuadrado\n3. Triangulo");
            Scanner figuraA = new Scanner(System.in);
            shape = figuraA.nextLine();

            if (null != shape) {
                switch (shape) {
                    case "1":
                        circle.getArea();
                        break;
                    case "2":
                        square.getArea();
                        break;
                    case "3":
                        triangule.getArea();
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        return;

                }

            }
        } else if ("P".equals(operacion)) {
            System.out.println("Haz elegido la propiedad Perimetro");
            System.out.println("Seleccione una figura");
            System.out.println("1. Circulo \n2. Cuadrado \n3. Triangulo");
            Scanner figuraP = new Scanner(System.in);
            shape = figuraP.nextLine();

            if (null != shape) {
                switch (shape) {
                    case "1":
                        circle.getPerimeter();
                        break;
                    case "2":
                        square.getPerimeter();
                        break;
                    case "3":
                        triangule.getPerimeter();
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;

                }
            }
        }
    }
}
