package project_01;

import java.util.List;
import java.util.Random;

public class Inserter {

    private List<Integer> list;
    private int n;

    public Inserter(List<Integer> list, int n) {
        this.list = list;
        this.n = n;
        
    }

    public int timingTest(){

        int time;

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(), n/2);
        }

        return time;

    }

}
