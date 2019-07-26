import spock.lang.*;

class CalculatorSpec extends Specification
{
	def 'The method can take comma seprated string, and will return their sum'() 
	{
		given :'Given Calculator instance'
			Calculator stringCalculator = new Calculator();
		when :'Calculator.add() method is invoked'
			def actualResult = stringCalculator.add(inputString);
		then :'It should return addition of provided CSV input'
			actualResult == expectedResult
		where:
			inputString   	|        expectedResult
			null   			|          0
			''   			|          0
			'1'   			|          1		
			'1,2'  			|          3
			'1,2,3'  		|          6
			'1,2,3,4'		|          10
	}
}