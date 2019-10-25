package dataTypes;

public class OnlineStatisticsTest {
    public static void main(String[] args) {

        OnlineStatistics stat = new OnlineStatistics();

        stat.addValue(1);
        System.out.println(stat.getSum()+ ", expected 1");
        System.out.println(stat.getAverage()+", expected 1.0");
        System.out.println(stat.getMin()+", expected 1");
        System.out.println(stat.getMax()+ ", expected 1");

        stat.addValue(5);
        stat.addValue(0);
        System.out.println(stat.getSum()+", expected 6");
        System.out.println(stat.getAverage()+", expected 2.0");
        System.out.println(stat.getMin()+", expected 0");
        System.out.println(stat.getMax()+", expected 5");

        stat.addValue(-2);
        stat.addValue(6);
        System.out.println(stat.getSum()+",expected 10");
        System.out.println(stat.getAverage()+", expected 2.0");
        System.out.println(stat.getMin()+", expected -2");
        System.out.println(stat.getMax()+", expected 6");

        stat.reset();
        stat.addValue(42);
        System.out.println(stat.getSum()+",42");
        System.out.println(stat.getAverage()+", expected 42.0");
        System.out.println(stat.getMin()+", expected 42");
        System.out.println(stat.getMax()+", expected 42");
    }
}
