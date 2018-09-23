package br.com.uri.gastocombustivel;

import java.util.Scanner;

public class GastoCombustivel {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        float x_total, x_speed, x_amount; float x_time = 0;
        int x_switch;
        
        System.out.println("Type \"1\" for Minutes o'clock or \"2\" for Hour: ");
        x_switch = input.nextInt();
        
        switch (x_switch) {
        
        case 1:
	        System.out.println("Type the TIME foreseen on the trip: (Minutes)");
	        x_time = input.nextFloat();

	        x_time = x_time / 60;
	        
	        break;
	    case 2:
	    	System.out.println("Type the TIME foresen on the trip: (Hour)");
	    	x_time = input.nextFloat();
	    	
	    	break;
	    default:
	    	extracted(x_switch);
        }
        
        System.out.println("Type the SPEED mean foreseen: (Km)");
        x_speed = input.nextFloat();

        System.out.println("Type the amount of liter by fuel to car: (L)");
        x_amount = input.nextFloat();

        x_total = (x_speed * x_time) / x_amount;



        System.out.printf("It will be necessary to supply %.2f liter of the fuel\n", x_total);
        input.close();
	}

	private static void extracted(int x_switch) {
		throw new IllegalArgumentException("Unknown choice: " + x_switch);
	}

}
