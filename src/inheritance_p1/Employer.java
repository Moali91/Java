package inheritance_p1;

public class Employer extends Person {
    private String companyName;


    public Employer(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }


    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyName(){
        return companyName;
    }
}
