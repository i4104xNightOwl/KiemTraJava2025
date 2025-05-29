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

            System.out.print("Nhap diem: ");
            this.Score = scanner.nextFloat();
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

    public void edit(Scanner scanner) {
        System.out.print("-== Chinh sua thong tin cho " + this.EmployeeId + " (bo trong de khong thay doi)");

        String newName = this.name;
        float newScore = this.Score;
        int newAge = this.age;

        try {
            System.out.print("Nhap ten: ");
            newName = scanner.nextLine();
        }
        catch (Exception e) { newName = this.name; }
        finally { this.name = newName; }

        try {
            System.out.print("Nhap tuoi: ");
            newAge = scanner.nextInt();
        }
        catch (Exception e) { newAge = this.age; }
        finally { this.age = newAge; }

        try {
            System.out.print("Nhap diem: ");
            newScore = scanner.nextFloat();
        }
        catch (Exception e) { newScore = this.Score; }
        finally { this.Score = newScore; }
    }
}
