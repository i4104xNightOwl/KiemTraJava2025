package me.i4104.Object;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    public void init(Scanner scanner) {
        try {
            System.out.print("Nhap ten: ");
            this.name = scanner.nextLine();

            System.out.print("Nhap tuoi: ");
            this.age = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Du lieu nhap vao khong hop le!");
        }
    }

    public void show() {
        System.out.println("|-------------------------------------|");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("|-------------------------------------|");
    }
}
