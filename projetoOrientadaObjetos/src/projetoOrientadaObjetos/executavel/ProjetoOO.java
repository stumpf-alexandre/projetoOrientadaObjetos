package projetoOrientadaObjetos.executavel;

import projetoOrientadaObjetos.classes.Aluno;

public class ProjetoOO {
	public static void main(String[] args) {
		
		/*Aluno aluno1;//desta forma o objeto ainda n�o existe na mem�ria*/
		
		//chama o construtor na classe do objeto
		Aluno aluno = new Aluno();//assim agora temos um objeto real na mem�ria
		
		Aluno aluno4 = new Aluno("Maria");//passando Maria para o construtor
		
		Aluno aluno5 = new Aluno("Jose", 15);
	}
}
