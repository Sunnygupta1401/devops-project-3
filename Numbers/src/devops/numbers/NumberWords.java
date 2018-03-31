package devops.numbers;

public class NumberWords {
	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
	public static final String[] tens = { 
			"", 		// 0
			"",		// 1
			"Twenty", 	// 2
			"Thirty", 	// 3
			"Forty", 	// 4
			"Fifty", 	// 5
			"Sixty", 	// 6
			"Seventy",	// 7
			"Eighty", 	// 8
			"Ninety" 	// 9
	};
	
	public String toWords( int number ) {
		String result = "" ;
	if(number <0 || number >999)
		result = "Number out of range";
		//throw new NumberFormatException("Number out of range");
		
		
		
		else if (number < 20) {
			result= units[number];
		}
		//else if (number < 100) {
			//return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
		//}
		//else if (number < 1000) {
			//return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") + toWords(number % 100);
	//	}

		return result.trim() ;
	}

}
