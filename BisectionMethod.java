public class BisectionMethod implements Expression{
    public double evaluation(double x){
        return x*x*x+x*x-1;
    }
    public double bisection(){
        double e = 0.00000001;
        BisectionMethod bisectionMethod =new BisectionMethod();
        TwoVariable twoVariable =new TwoVariable(bisectionMethod);
        double a = twoVariable.getFirstVariable();
        double b = twoVariable.getSecondVariable();
        double xr=0;
        double  fx;
        int iteration=0;
        System.out.println("a :"+ a +"  b :"+ b);
        while(Math.abs(a - b)> e){
            iteration++;
            xr=(a + b)/2;
            fx= evaluation(xr);
            if(fx*evaluation(a)==0){
                break;
            }
           else if(fx*evaluation(a)<0){
                b = xr;
            }
            else{
                a = xr;
            }
        }
        System.out.println("Iteration :"+iteration);
        return xr;
    }
}
