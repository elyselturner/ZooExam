/**
 * Created by elyseturner on 9/29/14.
 */
public class Animal {

        private String species;
        private String size;
        private String gender;

        public Animal(String species, String size, String gender ){
            this.species = species;
            this.size = size;
            this.gender = gender;

        }


        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }


        public String animalInformation(){
            return "Species: " + getSpecies() + " Size: " + getSize() + " Gender: "+ getGender();
        }
}

