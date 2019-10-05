package dataTypes;

public class OnlineStatistics {

    private int sum=0;
    private int valuesNum = 0;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;


    public void addValue(int value){
        sum += value;
        valuesNum++;
        min = Math.min(min,value);
        max = Math.max(max,value);
    }

    public int getSum(){
        return sum;
    }

    public double getAverage(){
        return ((double)sum)/valuesNum;
    }

    public int getMax(){
        return max;
    }

    public int getMin(){
        return min;
    }

    public void reset(){
        sum =0;
        valuesNum =0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
    }

}
