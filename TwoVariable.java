import java.util.Random;

public class TwoVariable {
    double increament = 1;
    private double firstVariable;
    private  double secondVariable;

    public TwoVariable(Expression expression) {
        Random random=new Random();
        firstVariable=random.nextInt(0,1);
        double f1=expression.evaluation(firstVariable);
        secondVariable=firstVariable+ increament;
        double f2=expression.evaluation(secondVariable);
        if(f1>0 && f2>f1){
            increament =-increament;
        }
        else if(f1<0 && f2<f1){
            increament =-increament;
        }
        System.out.println("Random :"+firstVariable+" increment :"+increament);
        while(expression.evaluation(firstVariable)*expression.evaluation(secondVariable)>0){
            firstVariable=secondVariable;
            secondVariable=secondVariable+ increament;
        }
    }
    public double getFirstVariable() {
        return firstVariable;
    }
    public double getSecondVariable() {
        return secondVariable;
    }
}
