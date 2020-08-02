package patterns.interpreter;

public class Client {
    //规则：Robert和John是男性
    public static Expression getMaleExpression(){
        Expression man = new TerminalExpression("man");
        Expression boy = new TerminalExpression("boy");
        return new OrExpression(man,boy);
    }
    //规则：Julie是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression women = new TerminalExpression("women");
        Expression married = new TerminalExpression("married");
        return new AndExpression(women, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is man? " + isMale.interpret("John is man"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Julie is a married women"));
    }

}
