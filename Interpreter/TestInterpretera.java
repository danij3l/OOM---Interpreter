public class Testinterpretera {

   //Rule: Koèa and Gordan are male
   public static Expression getMaleExpression(){
      Expression Koèa = new TerminalExpression("Koèa");
      Expression Gordan = new TerminalExpression("Gordan");
      return new OrExpression(Koèa, Gordan);		
   }

   //Rule: Anja is a married women
   public static Expression getMarriedWomanExpression(){
      Expression Anja = new TerminalExpression("Anja");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(Anja, married);		
   }

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();

      System.out.println("Gordan is male? " + isMale.interpret("Gordan"));
      System.out.println("Anja is a married women? " + isMarriedWoman.interpret("Married Anja"));
   }
}