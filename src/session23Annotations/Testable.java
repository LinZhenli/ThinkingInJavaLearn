package session23Annotations;

import org.junit.Test;

import java.sql.SQLOutput;

public class Testable {
    public void execute(){
        System.out.println("Executing..");

    }
    @Test
    public void testExecute(){execute();}
}
