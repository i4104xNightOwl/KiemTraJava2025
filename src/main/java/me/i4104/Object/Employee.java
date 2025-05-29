package me.i4104.Object;

import java.util.Scanner;

public class Employee extends Person {
    private String EmployeeId;
    private float Score;

    public Employee() {
        super();
    }

    @Override
    public void init(Scanner scanner) {
        try {
            System.out.print("Nhap ma nhan vien: ");
            this.EmployeeId = scanner.nextLine();

            System.out.print("Nhap ma diem: ");
            this.Score = scanner.nextFloat();

            System.out.print("Nhap ten: ");
            this.name = scanner.nextLine();

            System.out.print("Nhap tuoi: ");
            this.age = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Du lieu nhap vao khong hop le!");
        }
    }

    @Override
    public void show() {
        System.out.print("|----------------------------------|");
        System.out.print("| ID: " + this.EmployeeId + " |");
        System.out.print("| Score: " + this.Score + " |");
        System.out.print("| Name: " + this.name + "|");
        System.out.print("| Age: " + this.age + " |");
        System.out.print("|----------------------------------|");
    }
}
