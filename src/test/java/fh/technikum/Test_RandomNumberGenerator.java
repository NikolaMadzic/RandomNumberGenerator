package fh.technikum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_RandomNumberGenerator {

    @Test
    public void testRandomNumber(){
        RandomNumberGenerator r = new RandomNumberGenerator();
        int result = r.calcRandomNumber();
        //https://www.guru99.com/junit-assert.html für das Assertions.assertEquals
        Assertions.assertEquals(true,result >= 500 && result <= 600);
        //UNVOLLSTÄNDIG - ... System.out.println("true");
    }

}
