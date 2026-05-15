package br.senac.sistema.modelo.entidade.pessoa;
import br.senac.sistema.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.SobrenomeInvalidoException;

public abstract class Pessoa {
	private String nome;
	private String sobrenome;
	private String cpf;

	protected Pessoa(String nome, String sobrenome, String cpf)
			throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super();

		if (nome.isEmpty())
			throw new NomeInvalidoException("O valor " + nome + " é invalido");

		if (sobrenome.isEmpty())
			throw new SobrenomeInvalidoException("O valor " + sobrenome + " é invalido");

		if (cpf.isEmpty())
			throw new CpfInvalidoException("O valor " + cpf + " é invalido");

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public String getNome() {return nome;}
	public void setNome(String nome) throws NomeInvalidoException {
		
		if(nome.isEmpty())
			throw new NomeInvalidoException("O valor " + nome + " é invalido");
		
		this.nome = nome;
	}

	public String getSobrenome() {return sobrenome;}
	public void setSobrenome(String sobrenome) throws SobrenomeInvalidoException {
		
		if(sobrenome.isEmpty())
			throw new SobrenomeInvalidoException("O valor " + sobrenome + " é invalido");
		
		this.sobrenome = sobrenome;
	}

	public String getCpf() {return cpf;}
	public void setCpf(String cpf) throws CpfInvalidoException {
		
		if(cpf.isEmpty())
			throw new CpfInvalidoException("O valor " + cpf + " é invalido");
		
		this.cpf = cpf;
	}

}
