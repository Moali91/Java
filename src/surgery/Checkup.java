package surgery;

import java.time.LocalDate;

public class Checkup {
    private LocalDate date;
    private int height;
    private double weight;
    private double temperature;
    private boolean eyesightOk;

    public Checkup(LocalDate date, int height, double weight, double temperature, boolean eyesightOk) {
        this.date = date;
        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.eyesightOk = eyesightOk;
    }


}
