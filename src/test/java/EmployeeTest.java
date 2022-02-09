import Person.Staff.Employee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Employee("Greg", 35000.00, 10) {
        };
    }

    @Test
    public void hasName(){
        assertEquals("Greg", employee.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000.00, employee.getSalary(), 0.00);
    }

    @Test
    public void hasNiNumber(){
        assertEquals(10, employee.getNiNumber());
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(2000);
        assertEquals(37000.00, employee.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        employee.payBonus();
        assertEquals(35350.00, employee.getSalary(), 0.00);
    }

    @Test
    public void canChangeName(){
        employee.setName("John");
        assertEquals("John", employee.getName());
    }

    @Test
    public void cannotChangeName(){
        employee.setName(null);
        assertEquals("Greg", employee.getName());
    }
}
