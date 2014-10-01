import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by elyseturner on 9/29/14.
 */
public class ZooIndex {
    public void routeEverything() {
        Animal adultAnimal = new Animal("Dog", "medium", "female");
        BabyAnimal baby = new BabyAnimal("brown", "grey", "Dog", "medium", "male");
        Pen animalPen = new Pen();
        Zoo bigZoo = new Zoo();


        Scanner newScanner = new Scanner(System.in);

        String choice;

        do {
            ZooInterface.welcomeWagon();

            choice = newScanner.nextLine();

            if (choice.equals("1")) {
                Animal animalToAdd = ZooInterface.makeNewAnimal();
                animalPen.addNewAdultAnimal(animalToAdd);
                routeEverything();
            } else if (choice.equals("2")) {
                BabyAnimal babyAnimalToAdd = ZooInterface.makeNewBabyAnimal();
                animalPen.addNewBabyAnimal(babyAnimalToAdd);
                routeEverything();
            } else if (choice.equals("3")) {
                String animalToDelete = ZooInterface.animalToRemove();
                Animal someAnimal = animalPen.searchForAnimalBySpecies(animalToDelete);
                animalPen.removeAdultAnimal(someAnimal);
                routeEverything();
            } else if (choice.equals("4")) {
                String babyAnimalToDelete = ZooInterface.babyAnimalToRemove();
                BabyAnimal someAnimal = animalPen.searchForBabyAnimalBySpecies(babyAnimalToDelete);
                animalPen.removeBabyAnimal(someAnimal);
                routeEverything();
            } else if (choice.equals("5")) {
                bigZoo.addPen(animalPen);
                routeEverything();
            } else if (choice.equals("6")) {
                bigZoo.listOutPenIndex();
                bigZoo.removePen(ZooInterface.penToRemove());
                routeEverything();
            } else if (choice.equals("7")) {
                animalPen.printOutBabyAnimalsInThisPen();
                System.out.println();
                animalPen.printOutAdultAnimalsInThisPen();
                routeEverything();
            } else if (choice.equals("8")) {
                bigZoo.printOutZoo();
                routeEverything();
            }

            while (!choice.equals("9")) ;

        } while (!choice.equals("9"));
    }
}

