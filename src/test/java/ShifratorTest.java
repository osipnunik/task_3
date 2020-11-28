import org.junit.Assert;
import org.junit.Test;

public class ShifratorTest {

    @Test
    public void testShifrator(){
        Shifrator sh = new Shifrator();
        String binaryOutput = sh.AsciiToBinary("abc");
        Assert.assertEquals("011000010110001001100011", binaryOutput);
        Assert.assertEquals("00 0 00 0 00 000 00 0 00 0 00 00 00 00 00 0 00 00 00 0",
                sh.transform(binaryOutput));
    }

}
