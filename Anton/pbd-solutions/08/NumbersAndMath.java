public class NumbersAndMath
{
	public static void main( String[] args )
	{
		System.out.println( "I will now count my chickens:" );
//that prints what is written
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		System.out.println( "Roosters " + ( 100.0. - 25.0 * 3.0 % 4.0 ) );
//this prints what is written and separates the mathematical operations from the writing by putting it in parantheses for a function, with a the * being a multiplication symbol and 
		System.out.println( "Now I will count the eggs:" );
//this prints the statement
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
//this does the stated mathematical expression, dividing once by four and once with the reminders
		System.out.println( "Is it true that 3.0 + 2.0 < 5.0 - 7.0?" );
//this prints what is written without performing the function, because it is part of what is printed
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
//this prints the statement
		System.out.println("What is 3.0 + 2.0? " + ( 3.0 + 2.0 ) );
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
//these two print what is written, whilst also performing the written functions by isolating them with the brackets
		System.out.println( "Oh, that's why it's false." );
//this prints what is written
		System.out.println("How about some more." );
//this also prints what is written 
		System.out.println("Is it greater? " + ( 5.0 > -2.0 ) );
		System.out.println("Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		System.out.println("Is it less or equal? " + ( 5.0 <= -2.0 ) );
//this uses the greater than and equal to the written numbers to print more additions to the "story." Floating point is decimal
	}
}
