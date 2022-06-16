# java-tutorials
## prep for revature 

### Install Java on mac M1
- install java with homebrew 
  - `brew install java`
- Add to java to path
  - `echo 'export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"' >> ~/.zshrc`

---

# digitRoot
##### *Create a function that takes a number and returns one digit that is the result of summing all the digits of the input number. When the sum of the digits consists of more than one digit, repeat summing until you get one digit.* [Digits Sum Root](https://edabit.com/challenge/KgR2JhEuGD7onbMLx)
---

```java
public class Root {
	public static int digitRoot(long n) {
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
}
```
---
