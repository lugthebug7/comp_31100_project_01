package project_01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Inserter {

    public static Map<Integer, Long> timingTest(List<Integer> list, int maxN) {

        Map<Integer, Long> timingMap = new HashMap<>();

        for (int i = 1; i < maxN; i+=1000) {
            Random random = new Random();
            long startTime = System.nanoTime();
            for (int j = 0; j < i; j++) {
                int index = list.size() / 2;
                list.add(index, random.nextInt());
            }
            long endTime = System.nanoTime();

            long time = endTime - startTime;
            timingMap.put(i, time);
            list.clear();
        }
        return timingMap;
    }
}

