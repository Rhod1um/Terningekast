import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        dice1.roll();
        System.out.println(dice1.getFaceValue());

        int rollNumberForStat = 100;
        int diceSides = 6;
        int[] numberStats = new int[diceSides];

        for (int i=0; i<rollNumberForStat; i++){
            dice1.roll();
            switch (dice1.getFaceValue()){
                case 1 -> numberStats[0]++;
                case 2 -> numberStats[1]++;
                case 3 -> numberStats[2]++;
                case 4 -> numberStats[3]++;
                case 5 -> numberStats[4]++;
                case 6 -> numberStats[5]++;
            }
        }
        System.out.println("Face values per 100 rolls, 1, 2, 3, 4, 5, 6: ");
        System.out.println(Arrays.toString(numberStats));
        System.out.println("1: " + numberStats[0] +
                "\n2: " + numberStats[1] +
                "\n3: " + numberStats[2] +
                "\n4: " + numberStats[3] +
                "\n5: " + numberStats[4] +
                "\n6: " + numberStats[5]);
    }
}
