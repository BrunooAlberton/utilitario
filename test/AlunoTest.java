

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class AlunoTest {
    Aluno al;
    
    @Before
    public void init(){
        al = new Aluno (1,"");
        al.setNotaG1 (1);
        al.setNotaG2 (10);
    }
    @Test
    public void media(){
        assertEquals(7, al.getMedia(), 0);
        
    }     
    
    @Test 
    public void nomeNullo(){
        assertEquals(" ", al.getNome());
        assertEquals(1, al.getRa());
    }
   
}

    
   

