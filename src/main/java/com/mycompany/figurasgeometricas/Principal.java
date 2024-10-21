package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = sc.nextLine();

        System.out.println("Seleccione el tipo de figura (1: Circulo, 2: Rectangulo, 3: Triangulo):");
        int opcion = sc.nextInt();

        FiguraGeometrica figura = null;

        switch(opcion) {
            case 1:
                System.out.println("Ingrese el radio del circulo:");
                double radio = sc.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;

            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectangulo:");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectangulo:");
                double lado2 = sc.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;

            case 3:
                System.out.println("Ingrese el valor de la base del triangulo:");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo:");
                double altura = sc.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;

            default:
                System.out.println("Opcion no valida.");
                break;
        }

        if (figura != null) {
            System.out.println("El area de " + figura.getNombre() + " es: " + figura.obtenerArea());
            System.out.println("El perimetro de " + figura.getNombre() + " es: " + figura.obtenerPerimetro());
        }

        sc.close();
    }
}
