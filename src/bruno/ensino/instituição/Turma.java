package bruno.ensino.instituição;

import java.util.ArrayList;

public class Turma {

    public double codigo;
    public String descricao;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

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

    public int quantidadeDeAlunos() {

        return alunos.size();
    }

    public int quantidadeDeAlunosAprovados() {
        int quantidade = 0;
        for (int x = 0; x < alunos.size(); x++) {

            Aluno aluno;
            aluno = alunos.get(x);
            if (aluno.calculaMediaAluno() >= 7) {
                quantidade++;


            }

        }
        return quantidade;
    }

    public int alunosReprovados() {
        int quantidade = 0;
        for (int x = 0; x < alunos.size(); x++) {

            Aluno aluno;
            aluno = alunos.get(x);

            if (aluno.calculaMediaAluno() < 7) {
                quantidade++;
            }
        }
        return quantidade;

    }

    public float porcentagemDeAlunosAprovados() {
        float quantidade;
        quantidade = (quantidadeDeAlunosAprovados() / alunos.size() * 100);
        return quantidade;





    }

    public float porcentagemDeAlunosReprovados() {

        float quantidade;
        quantidade = (alunosReprovados() / alunos.size() * 100);
        return quantidade;
    }

    public float mediaGeral() {
        //
        float somaDasMedias = 0;
        //inicio do x menor alunos.size acresenta no x
        //alunos. get x a posição
        // somaDasMedias/ quantidade de alunos
        for (int x = 0; x < alunos.size(); x++) {
            Aluno aluno = alunos.get(x);
            somaDasMedias += aluno.calculaMediaAluno();
        }
        return somaDasMedias / alunos.size();
    }

    public void matricula(Aluno aluno) {
        alunos.add(aluno);
        aluno.setTurma(this);

    }
}
