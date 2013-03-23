package bruno.ensino.instituição;

import java.util.Scanner;

public class App {

    public static void main(String args[]) {
        
        System.out.println("digite o nome do aluno ");
        Scanner sc = new Scanner(System.in);
        String nome=sc.next();
        
        System.out.println("digite o ra do aluno");
        Scanner l= new Scanner (System.in);
        int ra=l.nextInt();
        
        System.out.println("digite nota g1 ");
        l= new Scanner (System.in);
        float g1=l.nextFloat();   

        System.out.println("digite nota g2 ");
        l= new Scanner (System.in);
        float g2= l.nextFloat();         
        
        
        Aluno al=new Aluno(nome,ra,g1,g2);
        Aluno bl=new Aluno(nome,ra,g1,g2);
        Turma tur = new Turma(12, "turma");
        tur.matricula(al);
        tur.matricula(bl);
       
        
       
       
     
        
        
        
       
       
        
    
        
        

    }
}
