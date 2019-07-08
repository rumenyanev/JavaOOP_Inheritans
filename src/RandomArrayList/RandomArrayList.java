package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

class RandomArrayList extends ArrayList {

    private static final Random RANDOM;

    static {
        RANDOM = new Random();
    }
Object gerRandomElement(){
        int index = RANDOM.nextInt(super.size());
    return super.remove(index);

}

}
