import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveTest {
    @Test
    //fara @Test, nu ar fi aparut sageti ca derulare
    public void testCheckIsPositive(){
IsPositive isPositive=new IsPositive();
boolean result=isPositive.checkIsPositive(6);
Assertions.assertTrue(result);


    }

    @Test
    public void testCheckIsNegative(){
        //mergem pe ramura False
        IsPositive isNegative=new IsPositive();
        //IsPositive isNegative2=new IsPositive();
        boolean result=isNegative.checkIsPositive(-7);
        //boolean result2=isNegative.checkIsPositive(7);
        //un test nu e complet fara assert
        Assertions.assertFalse(result);
        //Assertions.assertFalse(result2);sau//Assertions.assertTrue(result2)

    }

}
