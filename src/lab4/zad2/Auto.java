package lab4.zad2;

import java.util.Random;

public class Auto {

    private float[] przebieg;

    public Auto() {
        przebieg = new float[12];
        Random r = new Random();
        for (int i = 0; i < 12; i++) {
            przebieg[i] = r.nextInt();
        }
    }

    public float srPrzebieg() {
        float srednia = 0;
        for (float miesiac : przebieg
        ) {
            srednia += miesiac;
        }
        return srednia / przebieg.length;
    }
}
