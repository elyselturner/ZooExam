/**
 * Created by elyseturner on 9/29/14.
 */
import java.util.Scanner;
public class ZooInterface {
    public static void welcomeWagon() {
        System.out.println("Welcome to ZooBase where we help you keep tabs on your zoo so nothing runs wild: \n" +
                "Choose 1 if you would like to add an animal\n" +
                "Choose 2 if you would like to add a baby animal\n" +
                "Choose 3 if you would like to remove an animal" +
                "choose 4 if you would like to remove a baby animal\n" +
                "choose 5 if you would like to add a new pen to your zoo\n" +
                "choose 6 if you would like to remove a pen from your zoo \n"+
                "choose 7 if you would like to display animals in a pen \n"+
                "Choose 8 if you would like to display all of the animals in the zoo");
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

    public static BabyAnimal makeNewBabyAnimal(){
        Scanner babyAnimalMaker = new Scanner(System.in);

        System.out.println("What is the animals species?");
        String species = (babyAnimalMaker.nextLine());
        System.out.println("What is the size of the animal?");
        String size = (babyAnimalMaker.nextLine());
        System.out.println("What is the gender of the animal?");
        String gender = (babyAnimalMaker.nextLine());
        System.out.println("What is the fur color of the animal?");
        String furColor = (babyAnimalMaker.nextLine());
        System.out.println("What is the eye color of the animal?");
        String eyeColor = (babyAnimalMaker.nextLine());

        BabyAnimal babyAnimalToAdd = new BabyAnimal(species, size, gender, furColor, eyeColor);

        return babyAnimalToAdd;
    }

    public static String animalToRemove() {
        Scanner scanForAnimalToRemove = new Scanner(System.in);
        System.out.println("Please enter the species of animal that you would like to remove:");
        String animalToDelete = scanForAnimalToRemove.nextLine();

        return animalToDelete;
    }

    public static String babyAnimalToRemove() {
        Scanner scanForBabyAnimalToRemove = new Scanner(System.in);
        System.out.println("Please enter the species of baby animal that you would like to remove:");
        String babyAnimalToDelete = scanForBabyAnimalToRemove.nextLine();

        return babyAnimalToRemove();
    }

    public static int penToRemove() {

        System.out.println();
        Scanner scanForPenToRemove = new Scanner(System.in);
        System.out.println("Please enter the index of the pen that you would like to remove: ");
        int penToRemove = scanForPenToRemove.nextInt();

        return penToRemove();
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
