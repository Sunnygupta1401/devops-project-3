package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	private NumberWordsApplication numberWordsApplication;
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
		numberWordsApplication=new NumberWordsApplication();
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 1000 ) ) ;
		
	}
	
	//@Test
	//public void convertToWordsLessThanTwentyValidResult() {
		//Assert.assertEquals( "7", "Seven", numberWords.toWords( 7 ) ) ;
		
//	}
	
	//@Test
	//public void convertToWordsLessThanHundredGreaterThanNineteenValidResult() {
		//Assert.assertEquals( "55", "Fifty Five", numberWords.toWords( 55 ) ) ;
		
	//}
	
	//@Test
	//public void convertToWordsLessThanThousandGreaterThanNinetyNineValidResult() {
		//Assert.assertEquals( "177", "One Hundred Seventy Seven", numberWords.toWords( 177 ) ) ;
		
	//}
}
