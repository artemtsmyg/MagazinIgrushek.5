package org.example.МагазинИгрушек7;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys = new ArrayList<>();

    public void addToy(int id, String name, int quantity, double weight) {
        toys.add(new Toy(id, name, quantity, weight));
    }

    public void changeToyWeight(int toyId, double newWeight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(newWeight);
                return;
            }
        }
        System.out.println("Игрушка с ID " + toyId + " не найдена.");
    }

    public void drawToys() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        double randomValue = Math.random() * totalWeight;
        double currentWeight = 0;

        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (randomValue <= currentWeight) {
                System.out.println("Поздравляем! Вы выиграли игрушку: " + toy.getName());
                return;
            }
        }
    }
}

