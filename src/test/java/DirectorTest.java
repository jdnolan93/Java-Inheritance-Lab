import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Miranda", 500000.00, 1, "Upper Management", 75000000.00) {
        };
    }

    @Test
    public void hasName(){
        assertEquals("Miranda", director.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(500000.00, director.getSalary(), 0.00);
    }

    @Test
    public void hasNiNumber(){
        assertEquals(1, director.getNiNumber());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Upper Management", director.getDeptName());
    }
    @Test
    public void hasBudget(){
        assertEquals(75000000.00, director.getBudget(), 0.00);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2000);
        assertEquals(502000.00, director.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        director.payBonus();
        assertEquals(510000.00, director.getSalary(), 0.00);
    }
}