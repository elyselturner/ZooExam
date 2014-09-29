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
}
