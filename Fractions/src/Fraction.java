public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction () {
        numerator = 0;
        denominator = 1;
    }

    public Fraction (int num, int den) {
        numerator = num;
        denominator = den;
    }

    public Fraction add(Fraction other) {
        Fraction result = new Fraction(numerator, denominator);
        if (denominator != other.denominator) {
            int lcm = lcm(numerator, denominator);
            result.denominator *= (lcm/denominator) + (other.denominator * (lcm/other.denominator));
        }
        return result;
    }

    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction(numerator * other.numerator, denominator * other.denominator);
        result.reduce();
        return result;
    }

    private void reduce () {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    static int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    public String toString () {
        return numerator + "/" + denominator;
    }
}
