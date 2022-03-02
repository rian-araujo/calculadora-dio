public class Main {

	public static void main(String[] args) {

		double a = 2;
		double b = 3;

		// CALCULADORA

		System.out.println("> Exercício calculadora\n");
		double soma = Calc.soma(a, b);
		double multiplicacao = Calc.multiplicacao(a, b);
		double subtracao = Calc.subtracao(a, b);
		double divisao = Calc.divisao(a, b);
		System.out.println("soma: " + a + " + " + b + " = " + soma);
		System.out.println("subtracao: " + a + " - " + b + " = " + subtracao);
		System.out.println("multiplicacao: " + a + " * " + b + " = " + multiplicacao);
		System.out.println("divisao: " + a + " / " + b + " = " + divisao);

		// MENSAGEM BOM DIA, TARDE OU NOITE

		System.out.println("\n\n> Exercício mensagem\n");
		Mensagem.verMsg(10);
		Mensagem.verMsg(15);
		Mensagem.verMsg(20);
		Mensagem.verMsg(25);

		// EMPRESTIMO
		System.out.println("\n\n> Exercício empréstimo\n");
		Emprestimo.calculaEmprestimo(1000, 0.15, 10);
		Emprestimo.calculaEmprestimo(1000, 0.30, 20);
	}

}
