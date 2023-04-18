import com.sun.nio.file.ExtendedWatchEventModifier;

import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employeesBook;
    private int size;
    Counter id = new Counter();
    public EmployeeBook(){
        this.employeesBook = new Employee[15];
    }
    public void addEmployee( String name, int departmentNumber, int salary){
        if (size >= employeesBook.length) {
            System.out.println("Книга сотрудников заполнена");
        }
        Employee newEmployee = new Employee(id, name, departmentNumber, salary);
        employeesBook[size++] = newEmployee;
    }
    public void removeEmployee(String name, Counter id){
        for (int i = 0; i < employeesBook.length; i++) {
            if ((employeesBook[i].getName().equals(name)) || (employeesBook[i].getId() == id)) {
                System.out.println("Информация о сотруднике " + employeesBook[i].getName() + " удалена");
                System.arraycopy(employeesBook, i + 1, employeesBook, i, size - i - 1);
                employeesBook[size - 1] = null;
                size--;
                return;
            }
        }
    }
    public void findEmployee(String name, Counter id){
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            if(employee.getName().equals(name) || employee.getId() == id){
                System.out.println(employee);
            }
            }
        }
    public void printAllBook(){
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            System.out.println(employee);

        }
    }
    public void sumSalary(){
        float sumSalary = 0f;
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            sumSalary = employee.getSalary() + sumSalary;
        }
        System.out.println("Суммарная трата за месяц на заработную плату: " + sumSalary);
    }
    public void smallestSalary(){
        float smallestSalary = 100000000f;
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            if(smallestSalary >= employee.getSalary()){
                smallestSalary = employee.getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            if(smallestSalary == employee.getSalary()){
                System.out.println("Сотрудник с наименьшей зарплатой: " + employee);
            }
        }
    }
    public void biggestSalary(){
        float biggestSalary = 0f;
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            if (biggestSalary <= employee.getSalary()){
                biggestSalary = employee.getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            if(biggestSalary == employee.getSalary()){
                System.out.println("Сотрудник с наибольшей зарплатой: " + employee);
            }
        }
    }
    public void middleSalary(){
        float middleSalary = 0f;
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            middleSalary = employee.getSalary() + middleSalary;
        }
        middleSalary = middleSalary / size;
        System.out.println("Среднее значение зароботной платы: " + middleSalary);
    }
    public void indexSalary(float percentIndex){
        float salary = 0f;
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            salary = employee.getSalary() + (employee.getSalary() * percentIndex) / 100;
            employee.setSalary(salary);
        }
    }
    public void smallestSalaryInDepartment(int departmentNumber){
        if (departmentNumber > 0 && departmentNumber <= 5) {
        float smallestSalary = 100000000f;
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            if(departmentNumber == employee.getDepartmentNumber() && smallestSalary >= employee.getSalary()){
                smallestSalary = employee.getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            if(smallestSalary == employee.getSalary()){
                System.out.println("Самая низкая зарплата в отделе№ " + employee.getDepartmentNumber()+ " "
                        + employee.getId() + " " + employee.getName());
            }
        }
        } else {
            System.out.println("Данного отдела не существует");
        }
    }
    public void biggestSalaryInDepartment(int departmentNumber){
        if (departmentNumber > 0 && departmentNumber <= 5) {
            float biggestSalary = 0f;
            for (int i = 0; i < size; i++) {
                Employee employee = employeesBook[i];
                if(departmentNumber == employee.getDepartmentNumber() && biggestSalary <= employee.getSalary()){
                    biggestSalary = employee.getSalary();
                }
            }
            for (int i = 0; i < size; i++) {
                Employee employee = employeesBook[i];
                if(biggestSalary == employee.getSalary()){
                    System.out.println("Самая высокая зарплата в отделе№ " + employee.getDepartmentNumber()+ " "
                            + employee.getId() + " " + employee.getName());
                }
            }
        } else {
            System.out.println("Данного отдела не существует");
        }
    }
    public void sumSalaryInDepartment(int departmentNumber){
        if(departmentNumber > 0 && departmentNumber <= 5) {
            float sumSalaryInDepartment = 0f;
            int count = 0;
            for (int i = 0; i < size; i++) {
                Employee employee = employeesBook[i];
                if(departmentNumber == employee.getDepartmentNumber()){
                    sumSalaryInDepartment = sumSalaryInDepartment + employee.getSalary();
                    count++;
                }
            }
            sumSalaryInDepartment = sumSalaryInDepartment / count;
            System.out.println("Средняя зарплата в отделе № " + departmentNumber + " = " + sumSalaryInDepartment);
        }
     else {
        System.out.println("Данного отдела не существует");
    }
    }
    public void indexSalaryInDepartment(float indexPercent, int departmentNumber) {
        float salary = 0f;
        if (departmentNumber > 0 && departmentNumber <= 5) {
            for (int i = 0; i < size; i++) {
                Employee employee = employeesBook[i];
                if (departmentNumber == employee.getDepartmentNumber()) {
                    salary = employee.getSalary() + (employee.getSalary() * indexPercent) / 100;
                    employee.setSalary(salary);
                }
            }
        } else {
            System.out.println("Данного отдела не существует");
        }
    }
    public void printDepartmentEmployees(int departmentNumber) {
        if(departmentNumber > 0 && departmentNumber <= 5){
            for (int i = 0; i < size; i++) {
                Employee employee = employeesBook[i];
                if(departmentNumber == employee.getDepartmentNumber()) {
                    System.out.println( employee.id + " " + employee.getName() + " " + employee.getSalary());
                }
            }
        } else {
            System.out.println("Данного отдела не существует");
        }
    }
    public void employeesBiggestSalary(float salary){
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            if(employee.getSalary() >= salary){
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }
    public void emploteesSmallestSalary(float salary){
        for (int i = 0; i < size; i++) {
            Employee employee = employeesBook[i];
            if (employee.getSalary() < salary){
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }
    //public void editEmployee(String name){
    //    for (int i = 0; i < size; i++) {
    //      Employee employee = employeesBook[i];
    //    if (employee.getName().equals(name)){
    //      employee.setSalary();
    //    employee.setDepartmentNumber();
    //   }
    // }
    //}
    public int getCurrentSize(){
        return size;
    }
    }

