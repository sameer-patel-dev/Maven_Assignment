import com.smu.mscda.CapitalizeAndGenerateMD5Hex;
import org.junit.Assert;
import org.junit.Test;

public class CapitalizeAndGenerateMD5HexTest {
    private String INPUT = "sameer is a mcda student";

    @Test
    public void testCapitalized(){
        Assert.assertEquals("Sameer is a mcda student", CapitalizeAndGenerateMD5Hex.Capitalize(INPUT));
    }

    @Test
    public void testGenerateMD5Hex(){
        Assert.assertEquals("6dff4d4d8e5f76779e3a56259877be4f",CapitalizeAndGenerateMD5Hex.GenerateMD5hex(INPUT));
    }
}
