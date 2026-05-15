package br.senac.sistema.modelo.entidade.pessoa.funcionario;
import br.senac.sistema.modelo.entidade.pessoa.Pessoa;
import br.senac.sistema.modelo.enumeracao.empregado.StatusFuncionario;
import br.senac.sistema.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.SobrenomeInvalidoException;

public abstract class Funcionario extends Pessoa {

	private float salario;
	private StatusFuncionario status;

	public Funcionario(String nome, String sobrenome, String cpf, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf);
		this.salario = salario;
		this.status = StatusFuncionario.CONTRATADO;
	}

	public Funcionario(String nome, String sobrenome, String cpf, float salario, StatusFuncionario status) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf);
		this.salario = salario;
		this.status = status;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public StatusFuncionario getStatusFuncionario() {
		return status;
	}

	public void setStatusFuncionario(StatusFuncionario status) {
		this.status = status;
	}

	public abstract float calcularSalario();

	public float calcularSalario(short quantHorasTrabalhadas) {
		return getSalario() + quantHorasTrabalhadas * 10;
	}

}
