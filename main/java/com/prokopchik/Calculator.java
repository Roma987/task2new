package main.java.com.prokopchik;

public class Calculator {
    public static void main(String[] args) {
        Input input = new Input();
        Logic logic = new Logic();
        View view = new View();

        view.showFalseOrTrue(logic.sumFirstAndlLastTwo(input.consoleInputOneParameter()));

        view.showFormula(logic.calculateFormula(input.consoleInputThreeParameters(),
                input.consoleInputThreeParameters(), input.consoleInputThreeParameters()));

        double kateta = input.consoleInputTwoParameters();
        double katetb = input.consoleInputTwoParameters();
        view.showPerimeter(logic.calculatePerimeter(kateta, katetb));
        view.showSquare(logic.calculateSquare(kateta, katetb));
    }
}