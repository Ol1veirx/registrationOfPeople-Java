package application;

import entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar: ");
        int n = sc.nextInt();

        Person[] pessoas = new Person[n];

        for (int i = 0; i < pessoas.length; i++){
            System.out.printf("Dados da %d° pessoa: ", i + 1);
            System.out.println();
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            pessoas[i] = new Person(name, age, height);
            System.out.println("=====================================================");
        }

        double totalHeight = 0.0;
        for (Person pessoa : pessoas) {
            totalHeight += pessoa.getHeight();
        }

        int ageUnderSixteen = 0;
        System.out.print("Nome (menor que 16): ");
        for (Person pessoa : pessoas) {
            if (pessoa.getAge() < 16) {
                ageUnderSixteen++;
                System.out.print(pessoa.getName() + " ");
            }
        }
        System.out.println();
        System.out.println("Quantidade de pessoas menores que 16: " + ageUnderSixteen);

        double avgHeight = totalHeight / n;
        System.out.printf("Altura media das pessoas: %.2f", avgHeight);
    }
}
