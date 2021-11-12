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
public class Figuras {

    public static class Circle implements Shape {

        double diamentro, area, perimetro, radio;
        int PI = (int) 3.1416;

        @Override
        public void getArea() {
            System.out.println("Haz elegido el Area del Circulo");
            System.out.println("Favor de escribir el diametro del circulo");
            Scanner AreaC = new Scanner(System.in);
            diamentro = AreaC.nextDouble();
            radio = (diamentro / 2);
            area = ((radio * radio) * 3.1416);
            System.out.println("El area del circulo es " + area);

        }

        @Override
        public void getPerimeter() {
            System.out.println("Haz elegido el Perimetro del Circulo");
            System.out.println("Favor de escribir el diametro del circulo");
            Scanner PerimetroC = new Scanner(System.in);
            diamentro = PerimetroC.nextDouble();
            perimetro = (diamentro * 3.1416);
            System.out.println("El perimetro del circulo es " + perimetro);
        }
    }

    public static class Square implements Shape {

        double lado, area, perimetro;

        @Override
        public void getArea() {
            System.out.println("Haz elegido el Area del Cuadrado");
            System.out.println("Favor de escribir la medida del lado del circulo");
            Scanner AreaS = new Scanner(System.in);
            lado = AreaS.nextDouble();
            area = (lado * lado);
            System.out.println("El area del cuadradro es " + area);
        }

        @Override
        public void getPerimeter() {
            System.out.println("Haz elegido el Perimetro del Cuadrado");
            System.out.println("Favor de escribir la medida del lado del circulo");
            Scanner PerimetroS = new Scanner(System.in);
            lado = PerimetroS.nextDouble();
            perimetro = (lado + lado + lado + lado);
            System.out.println("El perimetro del cuadrado es " + perimetro);
        }
    }

    public static class Triangule implements Shape {

        double area, perimetro, altura, base, lado1, lado2, lado3;

        @Override
        public void getArea() {
            System.out.println("Haz elegido el Area del Triangualo");
            System.out.println("Favor de escribir la altura del triangulo");
            Scanner AlturaT = new Scanner(System.in);
            altura = AlturaT.nextDouble();
            System.out.println("Favor de escribir la base del triangulo");
            Scanner BaseT = new Scanner(System.in);
            base = BaseT.nextDouble();
            area = ((base * altura) / 2);
            System.out.println("El area del tringaulo es " + area);
        }

        @Override
        public void getPerimeter() {
            System.out.println("Haz elegido el Perimetro del Triangualo");
            System.out.println("Favor de escribir los tres lados del triangulo");
            Scanner L1 = new Scanner(System.in);
            lado1 = L1.nextDouble();
            Scanner L2 = new Scanner(System.in);
            lado2 = L2.nextDouble();
            Scanner L3 = new Scanner(System.in);
            lado3 = L3.nextDouble();
            perimetro = (lado1 + lado2 + lado3);
            System.out.println("El perimetro del triangulo es " + perimetro);

        }
    }
}
