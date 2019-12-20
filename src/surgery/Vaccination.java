package surgery;

import java.time.LocalDate;

public class Vaccination {
    private String name;
    private LocalDate vaccinationDate;
    private LocalDate expiryDate;

    public Vaccination(String name, LocalDate vaccinationDate, LocalDate expiryDate) {
        this.name = name;
        this.vaccinationDate = vaccinationDate;
        this.expiryDate = expiryDate;
    }

    public boolean isExpired(){
        return true;
    }
}
