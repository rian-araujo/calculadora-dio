public class Mensagem {
	public static void verMsg(int hora) {
		if (5 <= hora && hora <= 12) {
			mensagemCompleta("dia");
		}
		if (12 < hora && hora <= 17) {
			mensagemCompleta("tarde");
		}
		if ((17 < hora && hora <= 24) || (0 <= hora && hora < 5)) {
			mensagemCompleta("noite");
		}
		if (24 < hora || hora < 0) {
			System.out.println("Hora inválida!");
		}

	}

	public static void mensagemCompleta(String args) {
		if (args == "dia")
			System.out.println("Bom " + args);
		else
			System.out.println("Boa " + args);
	}

}
