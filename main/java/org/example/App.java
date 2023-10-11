package org.example;

import org.example.МагазинИгрушек7.ToyStore;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        toyStore.addToy(1, "Кукла", 10, 30);
        toyStore.addToy(2, "Мяч", 20, 20);
        toyStore.addToy(3, "Конструктор", 15, 25);

        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Выберите опцию:");
            System.out.println("1. Добавить игрушку");
            System.out.println("2. Изменить вес игрушки");
            System.out.println("3. Розыгрыш игрушек");
            System.out.println("4. Выйти");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Введите ID игрушки:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.println("Введите название игрушки:");
                    String name = scanner.nextLine();
                    System.out.println("Введите количество игрушек:");
                    int quantity = scanner.nextInt();
                    System.out.println("Введите вес игрушки (в % от 100):");
                    double weight = scanner.nextDouble();
                    toyStore.addToy(id, name, quantity, weight);
                    break;
                case 2:
                    System.out.println("Введите ID игрушки, у которой хотите изменить вес:");
                    int toyId = scanner.nextInt();
                    System.out.println("Введите новый вес (в % от 100):");
                    double newWeight = scanner.nextDouble();
                    toyStore.changeToyWeight(toyId, newWeight);
                    break;
                case 3:
                    toyStore.drawToys();
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный ввод. Пожалуйста, выберите правильную опцию.");
                    break;
            }
        } while (option != 4);
    }
}

