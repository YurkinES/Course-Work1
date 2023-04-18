public class Main {
    public static void main(String[] args) {
    EmployeeBook employeeBook = new EmployeeBook();
    employeeBook.addEmployee("Иванов Петр Алексеевич", 5, 56000);
    employeeBook.addEmployee("Исакова Виктория Александровна", 5, 53800);
    employeeBook.addEmployee("Савельева Любовь Дмитреевна", 5, 54900);
    employeeBook.addEmployee("Парамонов Степан Владимирович", 5, 52600);
    employeeBook.addEmployee("Степанова Наталья Ивановна", 4, 76000);
    employeeBook.addEmployee("Романов Виктор Анатольевич", 4, 76000);
    employeeBook.addEmployee("Самойлов Анатолий Владимирович", 4, 79000);
    employeeBook.addEmployee("Коротких Анна Викторовна", 3, 96800);
    employeeBook.addEmployee("Марков Филипп Сергеевич", 3, 97200);
    employeeBook.addEmployee("Константинова Ольга Эдуардовна", 2, 117000);
    employeeBook.addEmployee("Семенов Игорь Анатольевич", 1, 176000);
    employeeBook.printAllBook();
    employeeBook.sumSalary();
    employeeBook.smallestSalary();
    employeeBook.biggestSalary();
    employeeBook.middleSalary();
    employeeBook.indexSalary(5);
    employeeBook.printAllBook();
    employeeBook.smallestSalaryInDepartment(5);
    employeeBook.biggestSalaryInDepartment(5);
    employeeBook.sumSalaryInDepartment(4);
    employeeBook.indexSalaryInDepartment(10, 5);
    employeeBook.printDepartmentEmployees(5);
    employeeBook.emploteesSmallestSalary(92000);
    employeeBook.employeesBiggestSalary(130000);

    }
}