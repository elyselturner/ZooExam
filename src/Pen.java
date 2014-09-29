/**
 * Created by elyseturner on 9/29/14.
 */
import java.util.ArrayList;
public class Pen {
    private static ArrayList<Animal> Adult = new ArrayList<Animal>();
    private ArrayList<BabyAnimal> Baby = new ArrayList<BabyAnimal>();

    public ArrayList<Animal> getAnimal() {
        return Adult;
    }

    public void setAnimal(ArrayList<Animal> Adult) {
        this.Adult = Adult;
    }

    public static void addNewAdultAnimal(Animal animalToAdd) {
       Adult.add(animalToAdd);
    }

    public static void animalRemoval (String animalToRemove) {
        Adult.remove(animalToRemove);
    }

    public static Animal searchForAnimalBySpecies(String species) {

        for (Animal searchItem : Adult) {
            if (searchItem.getSpecies().equals(species)) {
                ZooInterface.displayItemFound();
                return searchItem;
            }
        }

//
//        myInterface.displayItemNotFound();
//        return null;
//    }
//
//    public void displayAllBooks() {
//        for (Book currentBook : libraryBooks) {
//            myInterface.displayInfoForBook(currentBook);
//        }
//    }


            }