public class Emprestimo {

	public static void calculaEmprestimo(double valor, double taxaMes, int qtdParcelas) {
		double valorFinal, valorParcela;

		valorParcela = (valor / qtdParcelas) + ((valor * taxaMes)/qtdParcelas);
		valorFinal = valorParcela * qtdParcelas;
		System.out.println("Valor de emprestimo: " + valor);
		System.out.println("Valor da taxa mensal: " + taxaMes * 100 + "%");
		System.out.println("Valor da parcela: " + valorParcela);
		System.out.println("Quantidade de parcelas: " + qtdParcelas);
		System.out.println("Total Final: " + valorFinal + "\n");
	}

}
