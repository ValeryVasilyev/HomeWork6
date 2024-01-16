package Iterator;

public class MyIterator {
        public Employee[] iterate(Employee[] employees) {
            Employee marriedEmployees[] = new Employee[2];
            int index = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].isMarried) {
                    System.out.println("Employee: " + employees[i].name + ", " + employees[i].age);
                    marriedEmployees[index] = employees[i];
                    index++;
                }
            }
            return marriedEmployees;
        }
}
