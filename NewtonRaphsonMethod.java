public class NewtonRaphsonMethod implements Expression{
    private double x0=5.00000012;
    private double e=0.000001;
    @Override
    public double evaluation(double x) {
        return x*x*x+x*x-1;
    }
    public double firstDef(double x) {
        return 3*x*x+2*x;
    }
    public double Root() {
        int iteration=0;
        double x1 = x0 - evaluation(x0) / firstDef(x0);
        while(Math.abs(x0-x1)>e){
            iteration++;
            x0=x1;
            x1= x0 - evaluation(x0) / firstDef(x0);
        }
        System.out.println("Iteration :"+iteration);
        return x1;
    }
}
