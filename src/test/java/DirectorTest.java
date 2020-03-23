import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Steven", 2054493, 13000.00, "Home", 200000);
    }

    @Test
    public void directorHasName() {
        assertEquals("Steven", director.getName());
    }

    @Test
    public void directorHasNINumber(){
        assertEquals(2054493, director.getNiNumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(13000.00, director.getSalary(), 0.01);
    }

    @Test
    public void directorHasDeptName(){
        assertEquals("Home", director.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(1000.00);
        assertEquals(14000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(260.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(200000, director.getBudget(), 0.01);
    }

    @Test
    public void canChangeName(){
        director.setName("Niall");
        assertEquals("Niall", director.getName());
    }

    @Test
    public void cannotEnterNull(){
        assertEquals("Please Enter a Name!", director.setName(null));
    }

    @Test
    public void cannotEnterZeroForIncreaseSalary(){
        assertEquals("Please Enter an Amount Greater than Zero!", director.raiseSalary(0));
    }

    @Test
    public void cannotEnterValueLessThanZeroForIncreaseSalary(){
        assertEquals("Please Enter an Amount Greater than Zero!", director.raiseSalary(-100));
    }

}
