public class Employee {
    private final String name;
    private int departmentNumber;
    private float salary;
    Counter id = new Counter();
    public Employee(Counter id, String name, int departmentNumber, int salary) {
        this.id = this.id;
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getDepartmentNumber(){
        return departmentNumber;
    }
    public float getSalary(){
        return salary;
    }
    public Counter getId(){
        return id;
    }
    public void setDepartmentNumber(){
        this.departmentNumber = departmentNumber;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }

    public String toString(){
        return id + " " + name + " отдел № " + departmentNumber + " зарплата:" + salary;
    }
}
