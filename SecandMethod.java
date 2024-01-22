import java.util.Random;

public class SecandMethod {
    private double a,b,increment=1,E=0.0001;
    int iteration=0;
    boolean possible=true;
    //Provide function of x;
    public double function(double x){
        return 2-Math.pow(Math.E,x);
    }
    //Calculate the root with secand method;
    public String secant(){
               generateGuess();
               if(possible) {
                   double x1 = a, x2 = b, x0;
                   while (Math.abs(x1 - x2) >= E) {
                       x0 = (x1 * function(x2) - x2 * function(x1)) / (function(x2) - function(x1));
                       x1 = x2;
                       x2 = x0;
                       iteration++;
                       if (x1 == x2) {
                           break;
                       }
                   }
                   return "The generated interval is\n" + a + " " + b + "\nThe root of the given equation is :" + String.format("%.4f", x1) + "\nNo. of iteration is :" + iteration;
               }
               else{
                   return "Sorry can't find the root for the equation";
               }
    }
    //Here the function generate guess value of a,b precise with difference 1 unit;
    private void generateGuess(){
        Random random=new Random();
        a=random.nextInt(0,10);
        b=a;
        double f1,f2;
        f1=function(a);
        b+=increment;
        f2=function(b);
        if((f1>0 && f1<f2) || (f2<0 && f1>f2)){
            increment=-increment;
        }
        while(function(a)*function(b)>0){
            a=b;
            b+=increment;
            iteration++;
            if(iteration>1000){
                possible=false;
                break;
            }
        }
        iteration=0;
    }
}
