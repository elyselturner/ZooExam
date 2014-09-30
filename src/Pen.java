/**
 * Created by elyseturner on 9/29/14.
 */
import java.util.ArrayList;
public class Pen {
    private ArrayList<Animal> adult = new ArrayList<Animal>();
    private ArrayList<BabyAnimal> baby = new ArrayList<BabyAnimal>();

    public ArrayList<BabyAnimal> getBaby() {
        return baby;
    }

    public ArrayList<Animal> getAdult() {
        return adult;
    }

    public ArrayList<Animal> getAnimal() {
        return adult;
    }


    public void addNewAdultAnimal(Animal animalToAdd) {
       adult.add(animalToAdd);
    }

    public void removeAdultAnimal (Animal animalToRemove) {
        adult.remove(animalToRemove);
    }

    public  Animal searchForAnimalBySpecies(String species) {

        for (Animal searchItem : adult) {
            if (searchItem.getSpecies().equals(species)) {
                ZooInterface.displayItemFound();
                return searchItem;
            }
        }
        return null;
    }

    public int getSize(){
        int size = adult.size() + baby.size();
        return size;
    }


//
//    public void displayAllBooks() {
//        for (Book currentBook : libraryBooks) {
//            myInterface.displayInfoForBook(currentBook);
//        }
//    }


            }