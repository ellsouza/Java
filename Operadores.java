public class Main
{
	public static void main(String[] args) {

int valor1 = 10;
int valor2 = 2;

//Operadores Aritméticos 
System.out.println("Adição: " + (valor1 + valor2));
System.out.println("Subtração: " + (valor1 - valor2));
System.out.println("Multiplicação: " + (valor1 * valor2));
System.out.println("Divisão: " + (valor1/valor2));
System.out.println("Módulo ou Resto da Divisão: " + (valor1 % valor2));
System.out.println();

//Operadores de Comparação 
// > , >= , < , <= , == (IGUAL), != (DIFERENTE)
// Obs.: Toda comparação resulta em um boleano (true and false)

boolean resultado1 = valor1>valor2;
System.out.println("Resultado: " + resultado1);

boolean resultado2 = valor1 <= 3;
System.out.println("Resultado: " + resultado2);

boolean resultado3 = valor2 == 2;
System.out.println("Resultado: " + resultado3);

boolean resultado4 = valor2 !=2;
System.out.println("Resultado: " + resultado4);

System.out.println();

//Operadores Lógicos 
//E(&&) = Para o resultado ser verdadeiro, todas as comparações devem ser verdadeiras.
//OU(||) = Basta uma verdadeira para ser true.

resultado1 = (valor1>=8) && (valor2<=20) && (valor1>valor2);
System.out.println("Resultado1: " +  resultado1);

resultado2 = (valor1>=8) && (valor2<=20 && (valor1<valor2));
System.out.println("Resultado2: " + resultado2);

resultado3 = (valor1>=8) || (valor2>=20) || (valor1<valor2);
System.out.println("Resultado3: " + resultado3);

resultado4 = (valor1<=8) || (valor2>=20) || (valor1<valor2);
System.out.println("Resultado4: " + resultado4);

boolean resultado5 = valor1 * 5 > valor2 + 45 && ((70 * 2) - 6) <= valor1 * 4 || valor1 * 5 == 10;
System.out.println("Resultado5: " + resultado5);

	}
}
