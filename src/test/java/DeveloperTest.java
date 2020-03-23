import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Steven", 2054493, 13000.00);
    }

    @Test
    public void developerHasName() {
        assertEquals("Steven", developer.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals(2054493, developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(13000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(1000.00);
        assertEquals(14000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(130.00, developer.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        developer.setName("Niall");
        assertEquals("Niall", developer.getName());
    }

    @Test
    public void cannotEnterNull(){
        assertEquals("Please Enter a Name!", developer.setName(null));
    }

    @Test
    public void cannotEnterZeroForIncreaseSalary(){
        assertEquals("Please Enter an Amount Greater than Zero!", developer.raiseSalary(0));
    }

    @Test
    public void cannotEnterValueLessThanZeroForIncreaseSalary(){
        assertEquals("Please Enter an Amount Greater than Zero!", developer.raiseSalary(-100));
    }

}
