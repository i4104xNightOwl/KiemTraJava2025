package me.i4104;

import me.i4104.Object.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Nhap so luong nhan vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("-== Thong tin cho nhan vien thu " + (i + 1));

            Employee employee = new Employee();
            employee.init(scanner);

            employees.add(employee);
            System.out.println("");
        }

        System.out.println("");
        System.out.print("Nhap ID cua nhan vien can sua: ");
        String employeeId = scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.getEmployeeId().contains(employeeId)) {
                employee.edit(scanner);
            }
        }

        System.out.println("");
        for (Employee employee : employees) {
            employee.show();
        }
    }
}