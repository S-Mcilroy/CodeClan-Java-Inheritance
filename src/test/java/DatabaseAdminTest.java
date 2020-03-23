import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Steven", 2054493, 13000.00);
    }

    @Test
    public void databaseAdminHasName() {
        assertEquals("Steven", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNINumber(){
        assertEquals(2054493, databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(13000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(14000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(130.00, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Niall");
        assertEquals("Niall", databaseAdmin.getName());
    }

    @Test
    public void cannotEnterNull(){
        assertEquals("Please Enter a Name!", databaseAdmin.setName(null));
    }

    @Test
    public void cannotEnterZeroForIncreaseSalary(){
        assertEquals("Please Enter an Amount Greater than Zero!", databaseAdmin.raiseSalary(0));
    }

    @Test
    public void cannotEnterValueLessThanZeroForIncreaseSalary(){
        assertEquals("Please Enter an Amount Greater than Zero!", databaseAdmin.raiseSalary(-100));
    }

}
