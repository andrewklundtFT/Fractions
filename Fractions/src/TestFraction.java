public class TestFraction {
    public static void main(String[] args) throws Exception {
        Fraction f1 = new Fraction(1, 3); 
        Fraction f2 = new Fraction(1, 6); 
        
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2)); 
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2)); 

        f1 = new Fraction(1,4);
        f2 = new Fraction(3,6);

        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2)); 
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2)); 

        f1 = new Fraction(3,8);
        f2 = new Fraction(2,5);

        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2)); 
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2)); 
    }
}