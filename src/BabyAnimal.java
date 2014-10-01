/**
 * Created by elyseturner on 9/29/14.
 */
public class BabyAnimal extends Animal{
    private String furColor;
    private String eyeColor;

    public BabyAnimal (String furColor, String eyeColor, String Species, String size, String gender) {
        super(Species, size, gender);
        this.eyeColor = eyeColor;
        this.furColor = furColor;

    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String babyAnimalInformation(){
        return "Species: " + getSpecies() + " Size: " + getSize() + " Gender: "+ getGender() + " Fur color: "+ getFurColor() + " Eye color: " + getEyeColor();
    }
}
