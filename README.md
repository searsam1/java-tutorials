# java-tutorials
## prep for revature 

### Install Java on mac M1
- install java with homebrew 
  - `brew install java`
- Add to java to path
  - `echo 'export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"' >> ~/.zshrc`

---

# Conditionals 
[source](https://sites.google.com/revature.com/studyguide/java/conditional-statements)
```java
# Decision Making Structures

""" 
***Decision making structures have one or more conditions to be 
evaluated or tested by the program, along with a statement or 
statements that are to be executed if the condition is determined 
to be true, and optionally, other statements 
to be executed if the condition is determined to be false. ***
"""

*Java programming language provides following types 
of decision making statements. 

   * if statement
   * if..else statement
   * nested if statement
   * switch statement

*/

public class IfStatements {

   public static void ifs(int x) {
/* IF Statement *
   An if statement consists of a Boolean expression followed by one or more statements. 
   Syntax : 
   if(Boolean_expression) {}
*/    // Statements will execute if the Boolean expression is true

   /*
      If the Boolean expression evaluates to true then the block of code 
      inside the if statement will be executed. If not, the first set 
      of code after the end of the if statement 
      (after the closing curly brace) will be executed. 
   */

      if( x < 20 ) {
         System.out.print("x < 10\n");
      }
      if( x == 10 ) {
         System.out.print("x == 10\n");
      }
      if( x > 20 ) {
         System.out.print("x > 20\n");
      }
      if( x == 20 ) {
         System.out.print("x == 20\n");
      }
   }

   public static void elseIfs(int x) {

   /*     IF..ELSE Statement
         An if statement can be followed by an optional else statement, which executes when the Boolean expression is false. 
         Syntax : 
         if(Boolean_expression) {
            // Executes when the Boolean expression is true
         }else {
            // Executes when the Boolean expression is false
         }*/


      if( x < 20 ) {
         System.out.print("This is an if statement\n");
      }else {
         System.out.print("This is else statement\n");
      }
            }

  public static void  ifElseif(int x) {

      /*IF..ELSE IF Statement
      An if statement can be followed by an optional else if...else statement, which is very useful to test various conditions using single if...else if statement.
      When using if, else if, else statements there are a few points to keep in mind.
      An if can have zero or one else's and it must come after any else if's.
      An if can have zero to many else if's and they must come before the else.
      Once an else if succeeds, none of the remaining else if's or else's will be tested.
      Syntax : 
      if(Boolean_expression 1) {
         // Executes when the Boolean expression 1 is true
      }else if(Boolean_expression 2) {
         // Executes when the Boolean expression 2 is true
      }else if(Boolean_expression 3) {
         // Executes when the Boolean expression 3 is true
      }else {
         // Executes when the none of the above condition is true.
      }*/

      if( x == 10 ) {
         System.out.print("Value of X is 10\n");
      }else if( x == 20 ) {
         System.out.print("Value of X is 20\n");
      }else if( x == 30 ) {
         System.out.print("Value of X is 30\n");
      }else {
         System.out.print("This is else statement\n");
      }
   }

   public static void nestedIfs(int x,int y) {

         /*Nested IF Statement
         It is always legal to nest if-else statements which means you can use one if or else if statement inside another if or else if statement. 
         Syntax : 
         if(Boolean_expression 1) {
            // Executes when the Boolean expression 1 is true
            if(Boolean_expression 2) {
               // Executes when the Boolean expression 2 is true
            }
         }*/

      if( x == 30 ) {
         if( y == 10 ) {
            System.out.print("X = 30 and Y = 10");
         }
      }
   }   

      public static void switchCases(char grade) {
         /*SWITCH Statement
         A switch statement allows a variable to be tested for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case. 
         Syntax : 
         switch(expression) {
            case value :
               // Statements
               break; // optional
            
            case value :
               // Statements
               break; // optional
            
            // You can have any number of case statements.
            default : // Optional
               // Statements
         }
         Rules for SWITCH Statement
         The variable used in a switch statement can only be integers, convertible integers (byte, short, char), strings and enums.
         You can have any number of case statements within a switch. Each case is followed by the value to be compared to and a colon.
         The value for a case must be the same data type as the variable in the switch and it must be a constant or a literal.
         When the variable being switched on is equal to a case, the statements following that case will execute until a break statement is reached.
         When a break statement is reached, the switch terminates, and the flow of control jumps to the next line following the switch statement.
         Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent cases until a break is reached.
         A switch statement can have an optional default case, which must appear at the end of the switch. The default case can be used for performing a task when none of the cases is true. No break is needed in the default case.

*/      switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("\nWell done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is: " + grade);
   }

   public static void main(String args[]) {
      ifs(20);
      elseIfs(10);
      ifElseif(30);
      nestedIfs(30,10);
      switchCases('B');
   }
}
```
