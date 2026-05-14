import java.util.ArrayList; 

public class Curso {
	private String nome;
	private String codigo;
	private short cargaHoraria;
	private Professor professor;
	private List<Aluno> alunos;

	public Curso(String nome, String codigo, short cargaHoraria) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		alunos = new ArrayList<>();
	}

	public Curso(String nome, String codigo, short cargaHoraria, Professor professor) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
		alunos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public short getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(short cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Professor getprofessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Aluno>getAluno(){
		return alunos;
	}
	
	public boolean inserirAlunos(Aluno aluno) {
		return alunos.add(aluno);
	}
	public boolean removerAlunos(Aluno aluno) {
		return alunos.remove(aluno);
	}

}
