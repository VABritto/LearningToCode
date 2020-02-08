package fundamentos.operadores;

public class DesafiosAritmeticos {
	public static void main(String[] args) {
		double num1 = 6 * (3 + 2);
		double num1Quad = Math.pow(num1, 2);
		double div1 = 3 * 2;
		double result1 = num1Quad / div1;
		System.out.println(result1);

		double num2 = (1 - 5) * (2 - 7);
		double div2 = 2;
		double num2Div = num2 / div2;
		double result2 = Math.pow(num2Div, 2);
		System.out.println(result2);

		double num3 = result1 - result2;
		System.out.println(num3);
		double result3 = Math.pow(num3, 3);
		double resultDiv = Math.pow(10, 3);
		double resultFinal = result3 / resultDiv;
		System.out.println(resultFinal);

	}
}
