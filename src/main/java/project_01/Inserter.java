package project_01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class Inserter {

    public static Stack<TimingNode> timingTest(List<Integer> list, int maxN, int interval) {

        //Map<Integer, Long> timingMap = new HashMap<>();

        Stack<TimingNode> stack = new Stack<TimingNode>();

        for (int i = 1; i < maxN; i+=interval) {
            Random random = new Random();
            long startTime = System.nanoTime();
            for (int j = 0; j < i; j++) {
                int index = list.size() / 2;
                list.add(index, random.nextInt());
            }
            long endTime = System.nanoTime();

            long time = endTime - startTime;
            TimingNode timingNode = new TimingNode(i, time);
            stack.push(timingNode);
            //timingMap.put(i, time);
            list.clear();
        }
        return stack;
    }
}



