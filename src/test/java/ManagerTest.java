import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Steven", 2054493, 13000.00, "Home");
    }

    @Test
    public void managerHasName() {
        assertEquals("Steven", manager.getName());
    }

    @Test
    public void managerHasNINumber(){
        assertEquals(2054493, manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(13000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("Home", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(14000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(130.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        manager.setName("Niall");
        assertEquals("Niall", manager.getName());
    }

    @Test
    public void cannotEnterNull(){
        assertEquals("Please Enter a Name!", manager.setName(null));
    }

    @Test
    public void cannotEnterZeroForIncreaseSalary(){
        assertEquals("Please Enter an Amount Greater than Zero!", manager.raiseSalary(0));
    }

    @Test
    public void cannotEnterValueLessThanZeroForIncreaseSalary(){
        assertEquals("Please Enter an Amount Greater than Zero!", manager.raiseSalary(-100));
    }

}
