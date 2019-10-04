package classesAndobjects.counter;

import classesAndobjects.counter.Counter;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.getValue() + ", expected 0");
        counter.countUp();
        counter.countUp();
        System.out.println(counter.getValue() + ", expected 2");
        counter.reset();
        System.out.println(counter.getValue() + ", expected 0");
    }
}