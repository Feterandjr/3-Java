package MiCodigo;

public class ManejaParejaNumeros {
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		ParejaNumeros misNumeros;
		int num1=3;
		int num2=5;
		misNumeros= new ParejaNumeros(num1,num2);
		System.out.println("La suma vale ");
		System.out.println(misNumeros.devuelvesuma());
		System.out.println("La resta vale ");
		System.out.println(misNumeros.devuelveResta());
		System.out.println("La multiplicacion vale ");
		System.out.println(misNumeros.devuelveMultiplicacion());
		System.out.println("La division vale ");
		System.out.print(misNumeros.devuelveDivision());
	}

}
