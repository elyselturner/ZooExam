import java.util.Scanner;

/**
 * Created by elyseturner on 9/29/14.
 */
public class ZooIndex {
    public void routeEverything(){
        Animal adultAnimal = new Animal();
        BabyAnimal baby = new BabyAnimal();
        Pen animalPen = new Pen();

        Scanner newScanner = new Scanner(System.in);

        String choice;

        do {
            ZooInterface.welcomeWagon();

            choice = newScanner.nextLine();

            if (choice.equals("1")) {
                Animal animalToAdd = ZooInterface.makeNewAnimal();
                Pen.addNewAdultAnimal(animalToAdd);
            } else if (choice.equals("2")) {
                String animalToDelete = ZooInterface.animalToRemove();
                Animal  = animalPen.searchForAnimalBySpecies(animalToDelete);
                animalPen.animalRemoval(adultAnimal);

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
//    } while (!selection.equals("5"));
//}
//            }
//        }