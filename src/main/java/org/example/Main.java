package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


       /* try{
            System.out.println("Entrez votre nombre afin de convertir : ");
            String numberChaine = scanner.nextLine();

            int number = Integer.parseInt(numberChaine);
            System.out.println(number);
        } catch (NumberFormatException e) {
             e.printStackTrace();
        }*/

        /*for (int i = 0; i < 5; i++){
            try{
                System.out.println("Entrez votre nombre positif : ");
                int positif = scanner.nextInt();
                double calculate = Math.sqrt(positif);

                if (positif < 0){
                    System.out.println("Veuillez rééssayez : ");
                    int positif1 = scanner.nextInt();
                    double calculate2 = Math.sqrt(positif);
                    System.out.println(calculate2);
                }else {
                    System.out.println(calculate);
                }
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }*/

        /* Faire la même chose que le code précèdent mais en utilisant une boucle while */

        /*try {
            System.out.println("Entrez votre nombre entier positif : ");
                while(true){
                    int positif = scanner.nextInt();
                    double calculate = Math.sqrt(positif);

                    if (positif < 0){
                        System.out.println("Veuillez saisir un nombre entier positif : ");
                    }else {
                        System.out.println(calculate);
                        break;
                    }

                }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }*/

        /*try{
            int[] tableau = {1, 2, 3, 4, 5};
            System.out.println(tableau[3]);
            System.out.println(tableau[5]);


        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }*/




        try{
            List<Student> studentsList = new ArrayList<>();


            while(true){

                System.out.println("=== Menu ====");
                System.out.println("1. Show list");
                System.out.println("2. Create a student");
                System.out.println("3. Quitter");

                int choice;
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("###### List d'étudiant ######");
                    System.out.println(studentsList);
                    break;
                }else if (choice == 2){
                    System.out.println("Entrez un nom : \n");
                    String name = scanner.next();
                    if (name != null){
                        System.out.println("Entrez un âge : ");
                        int age = scanner.nextInt();
                        studentsList.add(new Student(name, age));
                    }
                }else if (choice == 3) {
                    System.out.println(" Au revoir !!!!!");
                    break;
                }else {
                    System.out.println("Saisissez la bonne option, retour au menu principal");
                }


            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


    }
}