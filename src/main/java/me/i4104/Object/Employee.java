package me.i4104.Object;

import java.util.Scanner;

public class Employee extends Person {
    private String EmployeeId;
    private float Score;

    public Employee() { super(); }

    public String getEmployeeId() { return EmployeeId; }
    public float getScore() { return Score; }

    @Override
    public void init(Scanner scanner) {
        try {
            System.out.print("Nhap ma nhan vien: ");
            this.EmployeeId = scanner.nextLine();

            System.out.print("Nhap ten: ");
            this.name = scanner.nextLine();

            System.out.print("Nhap tuoi: ");
            this.age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nhap diem: ");
            this.Score = scanner.nextFloat();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Du lieu nhap vao khong hop le!");
        }
    }

    @Override
    public void show() {
        System.out.println("|----------------------------------|");
        System.out.println("| ID: " + this.EmployeeId + " |");
        System.out.println("| Score: " + this.Score + " |");
        System.out.println("| Name: " + this.name + "|");
        System.out.println("| Age: " + this.age + " |");
        System.out.println("|----------------------------------|");
    }

    public void edit(Scanner scanner) {
        System.out.println("-== Chinh sua thong tin cho " + this.EmployeeId + " (bo trong de khong thay doi)");
        try {
            System.out.print("Nhap ten: ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) this.name = newName;
        } catch (Exception e) {}

        try {
            System.out.print("Nhap tuoi: ");
            String newAge = scanner.nextLine();
            if (!newAge.isEmpty()) this.age = Integer.parseInt(newAge);
        } catch (Exception e) { }

        try {
            System.out.print("Nhap diem: ");
            String get = scanner.nextLine().trim();
            if (!get.isEmpty()) this.Score = Float.parseFloat(get);
        } catch (Exception e) { }
    }
}
