public class Testinterpretera {

   //Rule: Ko�a and Gordan are male
   public static Expression getMaleExpression(){
      Expression Ko�a = new TerminalExpression("Ko�a");
      Expression Gordan = new TerminalExpression("Gordan");
      return new OrExpression(Ko�a, Gordan);		
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