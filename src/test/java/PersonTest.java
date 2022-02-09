import Person.Person;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("Greg", 10) {
        };
    }

    @Test
    public void hasName(){
        assertEquals("Greg", person.getName());
    }


    @Test
    public void hasNiNumber(){
        assertEquals(10, person.getNiNumber());
    }


    @Test
    public void canChangeName(){
        person.setName("John");
        assertEquals("John", person.getName());
    }

    @Test
    public void cannotChangeName(){
        person.setName(null);
        assertEquals("Greg", person.getName());
    }
}