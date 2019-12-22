package main.java.com.mkudriavtsev.patterns.behavioral.interpreter;

public class OrExpression implements Expression {
    Expression expressionLeft;
    Expression expressionRight;

    public OrExpression(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context) | expressionRight.interpret(context);
    }
}
