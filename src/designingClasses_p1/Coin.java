package designingClasses_p1;

public class Coin {
    private double value;
    private String name;

    public Coin(double value, String name){
        this.value = value;
        this.name = name;
    }
    public double getValue(){
        return this.value;
    }
}
