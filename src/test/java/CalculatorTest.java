import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator=new Calculator();
        int result=calculator.add(2,3);
        Assertions.assertEquals(result,5);

    }

    @Test
    public void diffTest(){
        Calculator calculator=new Calculator();
        int result=calculator.diff(3,3);
        Assertions.assertEquals(result,0);}

        public void productTest(){
            Calculator calculator=new Calculator();
            int result=calculator.product(3,3);
            Assertions.assertEquals(result,9);



            //!!!Vezi aici :)
           // private  static Calculator calculator;
            //@AfterAll
           //         public static void AfterAllMethods() {
        calculator=new Calculator();

        //BeforeAll/BeforeEach/AfterEach/AfterAll!!!-de testat

            }
            }



