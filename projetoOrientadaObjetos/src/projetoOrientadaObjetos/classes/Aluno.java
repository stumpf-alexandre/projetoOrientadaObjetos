package projetoOrientadaObjetos.classes;

//classe/objeto que representa o aluno
public class Aluno {
	
	//dados do objeto
	String nome;
	int idade;
	String dataNascimento;
	String rg;
	String cpf;
	String nomeMae;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	//construtor do objeto
	public Aluno() {//cria os dados na memória
	}
	
	public Aluno(String nomePadrao) {
		//neste construtor se recebe o nomePadrao por parametros, ai o nome recebe do nomePadrao para gravar na memória
		nome = nomePadrao;
	}
	
	public Aluno(String nome, int idade) {
		nome = this.nome;
		idade = this.idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
}
