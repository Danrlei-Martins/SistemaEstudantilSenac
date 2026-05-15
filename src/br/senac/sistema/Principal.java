package br.senac.sistema;
import br.senac.sistema.modelo.entidade.pessoa.aluno.Aluno;
import br.senac.sistema.modelo.entidade.pessoa.funcionario.Funcionario;
import br.senac.sistema.modelo.entidade.pessoa.funcionario.diretor.Diretor;
import br.senac.sistema.modelo.entidade.pessoa.funcionario.professor.Professor;
import br.senac.sistema.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.sistema.modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Principal {

	public static void main(String[] args) {
		
		try {

		Funcionario[] funcionarios = new Funcionario[3];

		funcionarios[0] = new Professor("a", "a", "a", 0);
		funcionarios[1] = new Diretor("a", "a", "a", 0);
		funcionarios[2] = new Professor("a", "a", "a", 0);

		for (Funcionario funcionario : funcionarios)
			System.out.println(funcionario.calcularSalario());
		}
		catch(NomeInvalidoException excecao) {
			System.out.println(excecao.getMessage());
		}
		catch(SobrenomeInvalidoException excecao) {
			System.out.println(excecao.getMessage());
		}
		catch(CpfInvalidoException excecao) {
			excecao.printStackTrace();
		}

		Professor professor01 = new Professor("Marco", "Polo", "123.456.789-00", 1000);
		professor01.setNome("Marcos");

		System.out.println("\n---Relatorio da turma:---\n");
		System.out.println("Professor: " + professor01.getNome() + " " + professor01.getSobrenome());
		System.out.println("CPF: " + professor01.getCpf());

		professor01.efetuarChamada();

		Aluno aluno01 = new Aluno("Danrlei", "Martins", "123.345.678-66");

		System.out.println("Aluno: " + aluno01.getNome() + " " + aluno01.getSobrenome());

		aluno01.responderChamada();
		
		/*Aluno aluno = new Aluno("a", "a", "a", 0);
		alunos.remove(aluno);
		System.out.println(alunos.size());*/

	}

}
		
