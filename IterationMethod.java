public class IterationMethod {
    double a ;
    double b;

    public IterationMethod(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double evaluation(double x)
    {
        return 1/(Math.pow((x+1),0.5));
    }


    public double iteration(){
        double e = 0.00000001;
        double xr=(a+b)/2;
        int iteration=0;
        System.out.println("Xo :"+xr);
        while(true){
            iteration++;
           a=evaluation(xr);
           if(Math.abs(xr-a)<=e){
               break;
           }
           xr=a;

        }
        System.out.println("Iteration :"+iteration);
        return xr;
    }
}
