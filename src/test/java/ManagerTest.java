import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Keith", 100000.00, 2, "Accounting") {
        };
    }

    @Test
    public void hasName(){
        assertEquals("Keith", manager.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void hasNiNumber(){
        assertEquals(2, manager.getNiNumber());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2000);
        assertEquals(102000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(101000.00, manager.getSalary(), 0.00);
    }
}