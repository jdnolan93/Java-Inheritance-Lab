import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void before() {
        admin = new DatabaseAdmin("Steve", 10000.00, 5630) {
        };
    }

    @Test
    public void hasName(){
        assertEquals("Steve", admin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(10000.00, admin.getSalary(), 0.00);
    }

    @Test
    public void hasNiNumber(){
        assertEquals(5630, admin.getNiNumber());
    }

    @Test
    public void canRaiseSalary(){
        admin.raiseSalary(2000);
        assertEquals(12000.00, admin.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        admin.payBonus();
        assertEquals(10100.00, admin.getSalary(), 0.00);
    }
}
