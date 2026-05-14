
public class Alunos extends Pessoa {

	public Alunos(String nome, String sobrenome, String cpf) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf);
	}

	public void responderChamada() {
		System.out.println(getNome() + "Professor, estou aqui.");
	}

}
