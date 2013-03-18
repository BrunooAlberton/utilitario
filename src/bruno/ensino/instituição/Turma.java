package bruno.ensino.instituição;

import java.util.ArrayList;

public class Turma {

    public double codigo;
    public String descricao;

    public Turma(double codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    public String getDescricao() {
        return descricao;
    }
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public int quantidadeDeAlunos() {

        for (int x = 0; x < alunos.size(); x++) {

            Aluno aluno;
            aluno = alunos.get(x);

        }
    }

    public int quantidadeDeAlunosAprovados() {
        int quantidade = 0;
        for (int x = 0; x < alunos.size(); x++) {

            Aluno aluno;
            aluno = alunos.get(x);
            if (aluno.media >= 7) {
                quantidade++;


            }
            
        }
        return quantidade;
    }

    public int alunosReprovados() {
        int quantidade= 0;
        for (int x = 0; x < alunos.size(); x++) {

            Aluno aluno;
            aluno = alunos.get(x);

            if (aluno.media < 7) {
                quantidade++;
            }
        }
        return quantidade;

    }
    public float porcentagemDeAlunosAprovados(){
        int al=alunos.size();
       int quantidade=0;
        Aluno aluno;
        aluno=aluno;
        if(aluno.media<7){
            
            quantidade++;
          
                  
            
        }
          return quantidade;
    }
    
    
    public float porcentagemDeAlunosReprovados(){
        
        int bl=alunos.size();
        int quantidad=0;
                Aluno alunoA;
                alunoA=alunoA;
                if(alunoA.media<7){
                    quantidad++;
                }
                return quantidad;
    }
}
 
     
     
