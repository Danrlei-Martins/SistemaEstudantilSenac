package br.senac.sistema.modelo.entidade.pessoa.funcionario.diretor;
import CpfInvalidoException;
import NomeInvalidoException;
import SobrenomeInvalidoException;
import StatusFuncionario;
import br.senac.sistema.modelo.entidade.pessoa.funcionario.Funcionario;
import br.senac.sistema.modelo.entidade.pessoa.funcionario.gestao.RH;

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
