public class CodeRunner {
    public static void main(String[] args) {
        BisectionMethod bisectionMethod=new BisectionMethod();
        System.out.println("Bisection Method :");
        System.out.printf("Root : %.4f\n\n" ,bisectionMethod.bisection());
        System.out.println("False position Method :");
        FalsePositionMethod falsePositionMethod=new FalsePositionMethod();
        System.out.printf("Root : %.4f\n\n" ,falsePositionMethod.falsi());
        System.out.println("Iteration Method :");
        IterationMethod iterationMethod = new IterationMethod(1,Math.PI);
        System.out.printf("Root : %.4f\n\n" ,iterationMethod.iteration());
        System.out.println("Newton Raphson method :");
        NewtonRaphsonMethod newtonRaphsonMethod=new NewtonRaphsonMethod();
        System.out.printf("Root : %.4f\n\n" ,newtonRaphsonMethod.Root());
    }
}

