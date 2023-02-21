package calculoImc;

import java.util.Scanner;



/**
 * @author Ricardo Cassiano
 * 
 * Programa de console para calcular o IMC (índice de massa corporal).
 * 
 * Basta informar sua altura e seu peso que será mostrado
 * seu índice, dirá se está acima do peso ou abaixo e o
 * quanto precisa perder ou ganhar para ficar no peso ideal.
 * */


public class CalculoImc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double peso = 0.0;
		double pesoIdeal = 0.0;
		double altura = 0.0;
		double imc = 0.0;
		double fatorAltura = 0.0;
		double imcDesejado = 0.0;
		
		
		System.out.print("Digite seu peso (exemplo 78,60): ");
		peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura (exemplo 1,70): ");
		altura = entrada.nextDouble();
		
		System.out.print("O imc normal fica entre 18,50 e 24,99.\n"
				+ "Diga a sua meta de imc: ");
		imcDesejado = entrada.nextDouble();
				
		fatorAltura = Math.pow(altura, 2);		
		imc = peso / fatorAltura;
		pesoIdeal = imcDesejado * fatorAltura;		

		if (imc < 17) {
			System.out.println("Você está muito abaixo do peso.");					
		} else if (imc >= 17 && imc <= 18.49) {
			System.out.println("Você está abaixo do peso.");					
		} else if (imc >= 18.5 && imc <= 24.99) {
			System.out.println("Você está no peso normal.");					
		} else if (imc >= 25 && imc <= 29.99) {
			System.out.println("Você está acima do peso.");						
		} else if (imc >= 30 && imc <= 34.99) {
			System.out.println("Você está no nível Obesidade I.");					
		} else if (imc >= 35 && imc <= 39.99) {
			System.out.println("Você está no nível Obesidade II (severa).");					
		} else {
			System.out.println("Você está no nível Obesidade III (mórbida).");					
		}

		
		System.out.printf("Seu imc é: %,.2f%n",imc);
		System.out.printf("Para ter um imc igual a %,.2f "
				+ "você deve pesar %,.2f kg ", imcDesejado, pesoIdeal);
		if (peso > pesoIdeal) {
			System.out.printf("(Precisa perder %,.2f kg)", (pesoIdeal - peso) * (-1));
		} else {
			System.out.printf("(Precisa engordar %,.2f kg)", (peso - pesoIdeal) * (-1));
		}
		
		
		entrada.close();
		

	}

}
