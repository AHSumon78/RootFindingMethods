public class FalsePositionMethod implements Expression{
    @Override
    public double evaluation(double x) {
        return x*x*x+x*x-1;
    }
    public double falsi(){
        double e = 0.00000001;
        FalsePositionMethod falsePositionMethod =new FalsePositionMethod();
        TwoVariable twoVariable =new TwoVariable(falsePositionMethod);
        double a = twoVariable.getFirstVariable();
        double b = twoVariable.getSecondVariable();
        double xr=0;
        double  fx;
        int iteration=0;
        System.out.println("a :"+ a +"  b :"+ b);
        while(Math.abs(a - b)> e){
            iteration++;
            xr=(a*evaluation(b)-b*evaluation(a))/(evaluation(b)-evaluation(a));
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
