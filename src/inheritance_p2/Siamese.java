package inheritance_p2;

public class Siamese extends Cat {
    protected int x = 3;
    protected int y = 3;

    public int getY(){
        return y;
    }

    public void print(){
        System.out.println("Siamese x : "+ x);
        System.out.println("Siamese y : "+ y);
        System.out.println("Cat x : "+ super.x);
        System.out.println("Cat y : "+ super.getY());
        System.out.println("Animal x : "+ ((Animal1) this).x);
        System.out.println("Animal y : "+ ((Animal1)this).y);





    }
}
