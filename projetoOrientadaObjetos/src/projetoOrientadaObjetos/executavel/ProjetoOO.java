package projetoOrientadaObjetos.executavel;

import projetoOrientadaObjetos.classes.Aluno;

public class ProjetoOO {
	public static void main(String[] args) {
		
		/*Aluno aluno1;//desta forma o objeto ainda não existe na memória*/
		
		//chama o construtor na classe do objeto
		Aluno aluno = new Aluno();//assim agora temos um objeto real na memória
		
		Aluno aluno4 = new Aluno("Maria");//passando Maria para o construtor
		
		Aluno aluno5 = new Aluno("Jose", 15);
	}
}
