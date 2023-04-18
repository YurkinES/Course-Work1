public class Employee {
    private final String name;
    private int departmentNumber;
    private float salary;
    static int idCounter = 1;
    int id;
    private int personalId;

    public Employee(int personalId, String name, int departmentNumber, int salary) {
        this.id = idCounter++;
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.personalId = personalId;
    }
    public void setId(int count){this.id = id;}
    public int getPersonalId(){ return personalId;}

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
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
    public int getId(){
        return id;
    }
    public void setDepartmentNumber(){
        this.departmentNumber = departmentNumber;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public String toString(){
        return id + " "+ " ID: " + personalId+ " " + name + " отдел № " + departmentNumber + " зарплата:" + salary;
    }
}
