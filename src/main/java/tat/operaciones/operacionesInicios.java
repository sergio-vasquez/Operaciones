package tat.operaciones;

import tat.operaciones.ope.Operaciones;

public class operacionesInicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones ope = new Operaciones();
		
		System.out.println("sumaaaa: 15+20 es: "+ope.sumar(15, 20) );
		System.out.println("resta: 15-20 es: "+ope.restar(15, 20) );
		System.out.println("Multi: 15*20 es: "+ope.multiplicar(15, 20) );
		System.out.println("divi: 15/20 es: "+ope.dividir(15, 20) );
		System.out.println("limite max: "+Integer.MAX_VALUE);
		System.out.println("la suma de max con max es: "+ ope.sumar(Integer.MAX_VALUE, 1));

	}

}
