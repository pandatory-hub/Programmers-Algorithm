import java.util.*;

class Q1 {
    public int Q1(int bridge_length, int weight, int[] truck_weights) {
        int[] endTime = new int[truck_weights.length];
        
        Queue<Integer> onBridge = new LinkedList<>();
        int time = 0, i = 0;
        while(true) {
            if(!onBridge.isEmpty() && endTime[onBridge.peek()] == time)
                weight += truck_weights[onBridge.poll()];
            
            if(i < truck_weights.length && truck_weights[i] <= weight) {
                onBridge.add(i);
                endTime[i] = time + bridge_length;
                weight -= truck_weights[i];
                i++;
            }
            
            time++;
            if(onBridge.isEmpty())
                break;
        }
        return time;
    }
}