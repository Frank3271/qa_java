import.org.junit.Test;
import com.example.Feline;
import org.junit.Test;

import static org.Assert*;


public class FelineTest {

    @Test
    public void getFamilyReturnsCorrectString() {
        Feline feline = new Feline()();
        assertEquals("Хищник", feline.getFamily());
    }


}
