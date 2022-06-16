


public class Root {
	public static int digitRoot(long n) {
		// https://www.javatpoint.com/java-long-to-string
		String str = String.valueOf(n);

		if (str.length() == 1){
			return Integer.valueOf(str);
		}

		int sum = 0;
		
		for (int i=0; i<str.length(); i++){
			char s = str.charAt(i);
			sum += Character.getNumericValue(s);
		}



		return digitRoot(sum);

	}
	public static void main(String[] args) {
		System.out.println(digitRoot(123339393333L));
	}
}