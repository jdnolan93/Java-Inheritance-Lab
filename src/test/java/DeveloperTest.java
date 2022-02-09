import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Barbara", 47500.00, 121) {
        };
    }

    @Test
    public void hasName(){
        assertEquals("Barbara", developer.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(47500.00, developer.getSalary(), 0.00);
    }

    @Test
    public void hasNiNumber(){
        assertEquals(121, developer.getNiNumber());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000);
        assertEquals(49500.00, developer.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(47975.00, developer.getSalary(), 0.00);
    }
}