package br.senac.sistema.modelo.entidade.pessoa.aluno;
import br.senac.sistema.modelo.entidade.pessoa.Pessoa;
import br.senac.sistema.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Aluno extends Pessoa {

	public Aluno(String nome, String sobrenome, String cpf) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf);
	}
	
	public boolean equals(Object objeto) {
		
		if(objeto == null)
			return false;
		
		if(this == objeto)
			return true;
		
		if(this.getClass() != objeto.getClass())
			return false;
		
		Aluno aluno = (Aluno)objeto;
		
		return this.getNome().equals(aluno.getNome()) && this.getSobrenome().equals(aluno.getSobrenome()) && this.getCpf().equals(aluno.getCpf());
		
		
	}

	public void responderChamada() {
		System.out.println(getNome() + "Professor, estou aqui.");
	}

}
