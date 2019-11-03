package dataTypes;

public class OnlineStatistics {

    private int sum = 0;
    private int numValues = 0;
    private int maxValue = Integer.MIN_VALUE;
    private int minValue = Integer.MAX_VALUE;



    public void addValue(int value){
        sum += value;
        numValues++;
        minValue = Math.min(minValue,value);
        maxValue = Math.max(maxValue,value);

    }
    public double getAverage(){
        return ((double)sum)/numValues;
    }

    public int getSum() {
        return sum;
    }

    public int getMin() {
        return minValue;
    }

    public int getMax() {
        return maxValue;
    }

    public void reset(){
        sum = 0;
        numValues = 0;
        maxValue = Integer.MIN_VALUE;
        minValue = Integer.MAX_VALUE;
    }


}
