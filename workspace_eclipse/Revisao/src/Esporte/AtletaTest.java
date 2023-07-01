package Esporte;

import org.junit.jupiter.api.Test;

public class AtletaTest {

	@Test

	void testarConstrutor() {
		Pessoa pessoaRyan = new Pessoa("Ryan", 40);

		System.out.println(pessoaRyan.nome);
		System.out.println(pessoaRyan.idade);

		Atleta atletaJoao = new Atleta("Joao", 21, 80, false);

		System.out.println(atletaJoao.nome);
		System.out.println(atletaJoao.idade);
		System.out.println(atletaJoao.peso);
		System.out.println(atletaJoao.aposentado);

	}

}
