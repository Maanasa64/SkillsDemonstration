import static org.junit.Assert.*;
import org.junit.*;
public class SkillsDemonstrationTest{
    @Test
    public void addition(){
        assertEquals(2, SkillsDemonstration.add(1, 1)); //fails as expected=2 and actual=4
    }
}