import model.MathematicalOperation;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import util.Parser;

public class ParserTest {
    Parser parser = new Parser();

    @Test
    public void parse(){
        Assertions.assertEquals(new MathematicalOperation(5,"+",8,false),parser.parse("5+8"));
        Assertions.assertEquals(new MathematicalOperation(5,"-",8,false),parser.parse("5-8"));
        Assertions.assertEquals(new MathematicalOperation(5,"/",8,false),parser.parse("5/8"));
        Assertions.assertEquals(new MathematicalOperation(5,"*",8,false),parser.parse("5*8"));

        Assertions.assertEquals(new MathematicalOperation(5,"+",8,true),parser.parse("V+VIII"));
        Assertions.assertEquals(new MathematicalOperation(5,"-",8,true),parser.parse("V-VIII"));
        Assertions.assertEquals(new MathematicalOperation(5,"/",8,true),parser.parse("V/VIII"));
        Assertions.assertEquals(new MathematicalOperation(5,"*",8,true),parser.parse("V*VIII"));
    }
}

