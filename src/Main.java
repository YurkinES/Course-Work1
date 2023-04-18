public class Main {
    public static void main(String[] args) {
    EmployeeBook employeeBook = new EmployeeBook();
    employeeBook.addEmployee(13543,"Иванов Петр Алексеевич", 5, 56000);
    employeeBook.addEmployee(13544,"Исакова Виктория Александровна", 5, 53800);
    employeeBook.addEmployee(12223,"Савельева Любовь Дмитреевна", 5, 54900);
    employeeBook.addEmployee(13422,"Парамонов Степан Владимирович", 5, 52600);
    employeeBook.addEmployee(12333,"Степанова Наталья Ивановна", 4, 76000);
    employeeBook.addEmployee(12332,"Романов Виктор Анатольевич", 4, 76000);
    employeeBook.addEmployee(12331,"Самойлов Анатолий Владимирович", 4, 79000);
    employeeBook.addEmployee(12330,"Коротких Анна Викторовна", 3, 96800);
    employeeBook.addEmployee(11221,"Марков Филипп Сергеевич", 3, 97200);
    employeeBook.addEmployee(11220,"Константинова Ольга Эдуардовна", 2, 117000);
    employeeBook.addEmployee(11011,"Семенов Игорь Анатольевич", 1, 176000);
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