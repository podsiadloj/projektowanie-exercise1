package pr1;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        System.out.println(quadraticEquation(1, 3, 1));
    }

    static Vector<Double> quadraticEquation(double a, double b, double c){
        Vector<Double> result = new Vector<>();
        double delta = (b * b) - (4 * a * c);
        if(delta == 0){
            result.add(-b / (2*a));
        } else if(delta > 0) {
            result.add((-b - Math.sqrt(delta)) / (2*a));
            result.add((-b + Math.sqrt(delta)) / (2*a));
        }
        return result;
    }
}
