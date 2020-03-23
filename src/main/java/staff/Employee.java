package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public String raiseSalary(double increase){
        if (increase <= 0 ){
            return "Please Enter an Amount Greater than Zero!";
        } else {
            this.salary += increase;
            return null;
        }
    }

    public double payBonus(){
        return (this.salary/100);
    }

    public String setName(String name){
        if (name == null){
            return "Please Enter a Name!";
        } else {
            this.name = name;
            return null;
        }
    }

}
