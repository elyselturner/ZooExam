/**
 * Created by elyseturner on 9/29/14.
 */
import java.util.Scanner;
public class ZooInterface {
    public static void welcomeWagon() {
        System.out.println("Welcome to ZooBase where we help you keep tabs on your zoo so nothing runs wild: \n" +
                "Choose 1 if you would like to set up a new pen\n" +
                "Choose 2 if you would like to remove a previously made pen\n" +
                "Choose 3 if you would like to add an animal to an existing pen" +
                "choose 4 if you would like to remove animals and baby animals from a pen\n" +
                "choose 5 if you would like to display animals in a specific pen \n" +
                "Choose 6 if you would like to display all of teh animals in the zoo");
    }

    public static Animal makeNewAnimal(){
        Scanner animalMaker = new Scanner(System.in);

        System.out.println("What is the animals species?");
        String species = (animalMaker.nextLine());
        System.out.println("What is the size of the animal?");
        String size = (animalMaker.nextLine());
        System.out.println("What is the gender of the animal?");
        String gender = (animalMaker.nextLine());

        Animal AnimalToAdd = new Animal(species, size, gender);

        return AnimalToAdd;
    }

    public static String animalToRemove() {
        Scanner scanForAnimalToRemove = new Scanner(System.in);
        System.out.println("Please enter the species of animal that you would like to remove:");
        String animalToDelete = scanForAnimalToRemove.nextLine();

        return animalToDelete;
    }
//
//    public void displayItemNotFound() {
//        System.out.println("Book not found!");
//    }
//
    public static void displayItemFound() {
        System.out.println("I have located the animal for removal");
    }


}
