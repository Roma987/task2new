package main.java.com.prokopchik;

public class Logic {

    public boolean sumFirstAndlLastTwo(int number) {
        int numberone;
        int numbertwo;
        numberone = number % 10;
        numbertwo = number / 10 % 10;
        int sum1 = numberone + numbertwo;
        numberone = number / 100 % 10;
        numbertwo = number / 1000 % 10;
        int sum2 = numberone + numbertwo;
        if (sum1 == sum2) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateFormula(double numberone, double numbertwo, double numberthree) {
        double d = (numbertwo + Math.sqrt(Math.pow(numbertwo, 2)) + 4 * numberone * numberthree);
        double v = 2 * numberone;
        double x = Math.pow(numberone, 3) * numberthree;
        return d / v - x + Math.pow(numbertwo, -2);
    }

    public double calculatePerimeter(double numberone, double numbertwo) {
        double c = Math.sqrt(Math.pow(numberone, 2) + Math.pow(numbertwo, 2));
        return numberone + numbertwo + c;
    }

    public double calculateSquare(double numberone, double numbertwo) {
        return (numberone * numbertwo) / 2;
    }
}

