package br.senac.sistema.modelo.entidade.pessoa.funcionario.diretor;
import br.senac.sistema.modelo.entidade.pessoa.funcionario.Funcionario;
import br.senac.sistema.modelo.entidade.pessoa.funcionario.gestao.RH;
import br.senac.sistema.modelo.enumeracao.empregado.StatusFuncionario;
import br.senac.sistema.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.SobrenomeInvalidoException;

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
