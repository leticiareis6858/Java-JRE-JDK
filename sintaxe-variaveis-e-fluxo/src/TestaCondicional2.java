public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade=16;
		int quantidadePessoas=3;
		boolean acompanhado=quantidadePessoas>=2;
		
		System.out.println("quantidade de acompanhantes="+acompanhado);
		if(idade >=18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}
		else
			System.out.println("Infelizmente voce nao pode entrar");
		}
	}
	

