package decisionsAndLoops;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        int result = 1;

//        while (n>=1){
//            result = result*n;
//            n--;
//        }
        // oder wir können mit for loop machen
        for(int i = n; i>1; i-- ){
            result=result*i;
        }

        System.out.println("The factorial of is "+ result);
    }
}
