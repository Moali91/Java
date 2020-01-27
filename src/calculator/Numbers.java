package calculator;

public final class Numbers {
    private int number;

    public Numbers(int number){
        this.number = number;
    }

    public Numbers add(Numbers number) {
        int num = this.number+number.number;
        return this;
    }
}
