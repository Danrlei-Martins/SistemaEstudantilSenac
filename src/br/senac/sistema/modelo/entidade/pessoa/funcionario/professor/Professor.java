package br.senac.sistema.modelo.entidade.pessoa.funcionario.professor;
import br.senac.sistema.modelo.entidade.curso.Curso;
import br.senac.sistema.modelo.entidade.pessoa.funcionario.Funcionario;
import br.senac.sistema.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Professor extends Funcionario {

	private Curso curso;

	public Professor(String nome, String sobrenome, String cpf, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf, salario);
	}

	public Professor(String nome, String sobrenome, String cpf, float salario, Curso curso)throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf, salario);
		this.curso = curso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void efetuarChamada() {
		System.out.println("Pessoal, vamos realizar a chamada!\n");
	}

	@Override
	public float calcularSalario() {
		
		return getSalario() + 1220;
	}

}
