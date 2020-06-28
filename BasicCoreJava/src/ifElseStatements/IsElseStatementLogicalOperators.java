package ifElseStatements;

public class IsElseStatementLogicalOperators {
 public static void main(String[] args)
 {//And operator
	 int age=25;
	 boolean voterID=true;
	 if(age>=18 && voterID)
	 {
		 System.out.println("You are eligible");
	 }else {
		 System.out.println("You are not eligible"); 
	 }
	 //OR Operator
	 boolean panCard=true;
	 boolean AAdharCard=true;
	 if(panCard || AAdharCard)
	 {
		 System.out.println("You are eligible");
	 }else {
		 System.out.println("You are not eligible");
	 }
	 
 }
}
