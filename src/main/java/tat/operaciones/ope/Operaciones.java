package tat.operaciones.ope;

public class Operaciones {

	public int sumar(int a, int b) {

//		if (a==0 || b==0) {
//			return 0;
//		}
//		
//		return a+b;

		return (a == 0 || b == 0) ? 0 : a + b;
	}

	public int restar(int a, int b) {

		return (b>a) ? 0 : a - b;
	}
	
	
	public int multiplicar(int a, int b) {

		return (b==0) ? 1 : a * b;
	}

	
	public double dividir(int a, int b) {

		return (b==0) ? 0d : (double)a / b;
	}

}
