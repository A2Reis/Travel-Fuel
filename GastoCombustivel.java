package br.com.uri.gastocombustivel;

import java.util.Scanner;

public class GastoCombustivel {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        float x_total, x_speed, x_amount; float x_time = 0;
        int x_switch;
        
        System.out.println("Digite \"1\" para minutos ou \"2\" para horas: ");
        x_switch = input.nextInt();
        
        switch (x_switch) {
        
        case 1:
	        System.out.println("Digite o tempo previsto na viagem: (Minutos)");
	        x_time = input.nextFloat();

	        x_time = x_time / 60;
	        
	        break;
	    case 2:
	    	System.out.println("Digite o tempo previsto na viagem: (Horas)");
	    	x_time = input.nextFloat();
	    	
	    	break;
	    default:
	    	extracted(x_switch);
        }
        
        System.out.println("Digite a velocidade: (Km)");
        x_speed = input.nextFloat();

        System.out.println("Digite a quantidade de litros que o carro faz: (L)");
        x_amount = input.nextFloat();

        x_total = (x_speed * x_time) / x_amount;



        System.out.printf("Será necessario %.2f litros de combustivel\n", x_total);
        input.close();
	}

	private static void extracted(int x_switch) {
		throw new IllegalArgumentException("Escolha não disponivel!: " + x_switch);
	}

}
