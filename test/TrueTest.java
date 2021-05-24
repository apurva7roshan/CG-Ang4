
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Assignment1Q1Test {

    @Test
    public void armstrongCheckTrue() {
        int num = 153;
        ArmstrongOrNot armstrongOrNot = new ArmstrongOrNot();
        boolean result = armstrongOrNot.armstrongCheck(num);
        assertEquals(result,true);
    }
  
}