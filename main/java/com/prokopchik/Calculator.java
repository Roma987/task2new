package main.java.com.prokopchik;

public class Calculator {
    public static void main(String[] args) {
        Input input = new Input();
        Logic logic = new Logic();
        View view = new View();

        view.showFalseOrTrue(logic.sumFirstAndlLastTwo(input.consoleInputOneParameter()));

        input.consoleInputThreeParameters();
        view.showFormula(logic.calculateFormula(input.b,input.c,input.d));

        input.consoleInputTwoParameters();
        view.showPerimeter(logic.calculatePerimeter(input.b,input.c));
        view.showSquare(logic.calculateSquare(input.b,input.c));
    }
}
