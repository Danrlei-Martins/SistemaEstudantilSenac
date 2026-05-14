
public class Diretor extends Funcionario implements RH {

	public Diretor(String nome, String sobrenome, String cpf, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf, salario);
	}

	public float calcularSalario() {

		return getSalario() + 3000;
	}
	
	public void demitirFuncionario(Funcionario funcionario) {
		funcionario.setStatusFuncionario(StatusFuncionario.DEMITIDO);
	}

}
