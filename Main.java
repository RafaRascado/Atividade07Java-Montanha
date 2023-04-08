// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.lang.Math;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Informe a medida dos lados do quadrado");
    Scanner teclado = new Scanner(System.in);
    double areaDoQuadrado = teclado.nextDouble(); 

    double resultado = Math.pow(areaDoQuadrado, 2);

    double resutaldoTotal = Math.pow(resultado, 2);

    System.out.println("O dobro da área do quadrado informado é: " + resutaldoTotal);
  }
}