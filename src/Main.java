public class Main {
    public static void main(String[] args) {
        System.out.print(" ");
        Employee employee1 = new Employee("Иванов Иван Иванович", 1, 30);
        Employee employee2 = new Employee("Косолапов Михаил Михайлович", 1, 35);
        Employee employee3 = new Employee("Степанова Светлана Степановна", 2, 33);
        Employee employee4 = new Employee("Гений Гена Генадьевич", 2, 31);
        Employee employee5 = new Employee("Гений Галя Генадьевна", 3, 40);
        Employee employee6 = new Employee("Серов Сергей Сергеевич", 3, 42);
        Employee employee7 = new Employee("Рыжова Рина Романовна", 4, 57);
        Employee employee8 = new Employee("Краснов Кирил Кирилович", 4, 55);
        Employee employee9 = new Employee("Незабудкин Штакрымзяк Абдулмеджидович", 5, 150);
        Employee employee10 = new Employee("Приезжалова Ынчжу Пак", 5, 175);
        Employee[] employeeBook = new Employee[10];
        employeeBook[0] = employee1;
        employeeBook[1] = employee2;
        employeeBook[2] = employee3;
        employeeBook[3] = employee4;
        employeeBook[4] = employee5;
        employeeBook[5] = employee6;
        employeeBook[6] = employee7;
        employeeBook[7] = employee8;
        employeeBook[8] = employee9;
        employeeBook[9] = employee10;
        printEmployee(employeeBook);
        System.out.print("Затраты на зп " + calculateSum(employeeBook));
        System.out.println();
        avgSallary(employeeBook);
        System.out.println();
        printEmplyeeMaxSallary(employeeBook);
        System.out.println();
        printEmplyeeMinSallary(employeeBook);
        System.out.println();
    }

    public static int calculateSum(Employee[] employeeBook) {
        int sum = 0;
        for (Employee employee : employeeBook) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void printEmployee(Employee[] employeeBook) {
        for (Employee employee : employeeBook) {
            System.out.println(employee);
            System.out.println();
        }
    }

    public static void avgSallary(Employee[] employeeBook) {
        double avgSum = (double) calculateSum(employeeBook) / employeeBook.length;
        System.out.println("Средняя зп + " + avgSum);
    }
    public static void printEmplyeeMinSallary(Employee[] employeeBook) {
        Employee x = employeeBook[0];
        for (Employee employee : employeeBook) {
            if (employee.getSalary() < x.getSalary()) {
               x = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зп - " + x);
        System.out.println();

    }

    public static void printEmplyeeMaxSallary(Employee[] employeeBook) {
        Employee x = employeeBook[0];
        for (Employee employee : employeeBook) {
            if (employee.getSalary() > x.getSalary()) {
                x = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зп - " + x);
        System.out.println();


    }
}
