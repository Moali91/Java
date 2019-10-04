package classesAndobjects.counter;

public class Counter {
    int value = 0;
    public Counter(){

    }
    public int getValue(){
        return value;
    }
    public int countUp(){
        return value++;
    }
    public int reset(){
        return value=0;
    }
}
