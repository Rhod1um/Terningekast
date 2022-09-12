import java.util.Random;

public class Dice {
    private int faceValue;

    void roll(){
        Random random = new Random();
        faceValue = random.nextInt(6)+1;
    }
    public int getFaceValue(){
        return faceValue;
    }

}
