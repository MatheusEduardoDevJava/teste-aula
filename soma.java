package soma;

import java.util.Locale;
import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ys = 6+5+9*5+5*3;
		
		System.out.println(ys);
		
		double x, y, m;
		byte w, z;
		double calculo, a, b, c;
		x = 5.0;
		z = 16;
		w = -16;
		m = 2.0;
		y = 3.0;
		calculo = Math.pow(x, y);
		b = Math.pow(x, m);
		System.out.printf("%.0f\n", b);
		
		if(z>0) {	
	       System.out.print("test estrutura condicional ");
	       System.out.printf("test "+"%.0f\n", calculo);
		}
		
		Scanner sx = new Scanner (System.in);
		
		int hora = sx.nextInt();
		
		if (hora<12) {
			System.out.println("Bom dia");
			
		}
		else {
			System.out.println("Boa tarde");
		}
		
		
		a = Math.sqrt(z);
		System.out.printf("%.0f\n", a);
		System.out.printf("Raiz quadrada de " + z + " = " + "%.0f\n", a);

		b = Math.abs(w);
		c = Math.abs(z);
		System.out.println(c);
		System.out.println(b);

		double preço, largura, comprimento;
		double area, valor;

		largura = 10.0;
		comprimento = 30.0;
		preço = 200.0;
		area = largura * comprimento;
		System.out.println("area do terreno: " + area);
		valor = area * preço;
		System.out.println("valor do terreno: " + valor);

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);

		double ar, lar, com, preç, res;
		lar = sc.nextDouble();
		com = sc.nextDouble();
		preç = sc.nextDouble();
		ar = lar * com;
		res = ar * preç;
		System.out.println("largura do terreno: " + lar);
		System.out.println("comprimento do terreno: " + com);
		System.out.printf("preço do metro quadrado do terreno: " + "%.2f\n", preç);
		System.out.printf("medida da area do terreno: " + "%.2f\n", ar);
		System.out.printf("preço do terreno inteiro: " + "%.2f\n", res);
		sc.close();
		
		
		String s2 = "abc vive"; 	
		
		String s3 = s2.replace(" ", "");
		System.out.println(s3);

	}

}
