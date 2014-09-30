import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by elyseturner on 9/29/14.
 */
public class ZooIndex {
    public void routeEverything(){
        Animal adultAnimal = new Animal("Dog", "medium", "female");
        BabyAnimal baby = new BabyAnimal("brown", "grey", "Dog", "medium", "male");
        Pen animalPen = new Pen();
        Zoo bigZoo = new Zoo();

        bigZoo.getPens().add(animalPen);

        bigZoo.getPens().size();

        bigZoo.getPens().remove();

        Scanner newScanner = new Scanner(System.in);

        String choice;

        do {
            ZooInterface.welcomeWagon();

            choice = newScanner.nextLine();

            if (choice.equals("1")) {
                Animal animalToAdd = ZooInterface.makeNewAnimal();
                animalPen.addNewAdultAnimal(animalToAdd);
            } else if (choice.equals("2")) {
                String animalToDelete = ZooInterface.animalToRemove();
                Animal someAnimal  = animalPen.searchForAnimalBySpecies(animalToDelete);
                animalPen.removeAdultAnimal(someAnimal);

            }
//            else if (choice.equals("3")) {
////            String searchTitle = myInterface.acceptBookTitleFromUser();
//            librarian.searchForBookByTitle(searchTitle);
//        } else if(choice.equals("4")) {
//            myLibrary.displayAllBooks();
//        } else if(choice.equals("5")) {
//            librarian.printExitMessage();
//            break;
//        } else {
//            librarian.promptForNextEntry();
//        }
//
         } while (!choice.equals("5"));
    }
 }
