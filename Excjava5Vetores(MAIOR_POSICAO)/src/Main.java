import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números vai digitar: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		int maior = 0;
		int casa = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			if(vect[i] > maior) {
				maior = (int) vect[i];
				casa = i;
			}
		}
		
		System.out.println();
		System.out.print("MAIOR VALOR: " + maior);
		System.out.print("\nPOSIÇÃO DO MAIOR VALOR: " + casa);
		
		
		
		sc.close();

	}

}
