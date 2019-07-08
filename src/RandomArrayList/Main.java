package RandomArrayList;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        RandomArrayList randomArrayList = new RandomArrayList();

        randomArrayList.add("Pesho");
        randomArrayList.add(125);
        randomArrayList.add('a');
        randomArrayList.add(new BigDecimal(2.53));

        System.out.println(randomArrayList.gerRandomElement());
        System.out.println(randomArrayList.gerRandomElement());
        System.out.println(randomArrayList.gerRandomElement());

    }
}
/*⦁	Random Array List
Create a RandomArrayList class that has all the functionality of an ArrayList.
Add additional function that returns and removes a random element from the list.
⦁	Public method: getRandomElement(): Object
*/