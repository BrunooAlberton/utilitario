package bruno.ensino.instituição;

public class Aluno {

    int ra;
    String nome;
    float notaG1;
    float notaG2;
    Turma turma;
    
    public Aluno(String nome, int ra, float g1, float g2){
        this.nome=nome;
        this.ra=ra;
        this.notaG1 = g1;
        this.notaG2 = g2;
    }

    public int getRa() {
        return ra;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaG1() {
        return notaG1;
    }

    public void setNotaG1(float notaG1) {
        this.notaG1 = notaG1;
    }

    public float getNotaG2() {
        return notaG2;
    }

    public void setNotaG2(float notaG2) {
        this.notaG2 = notaG2;
    }

  
    
    public float calculaMediaAluno(){
       return ( notaG1*1+notaG2*2)/3;
    }
    
}
