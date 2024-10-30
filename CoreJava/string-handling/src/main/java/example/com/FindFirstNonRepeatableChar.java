package example.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * 
 * write a program : find first non repeated char, ignore special chars, ignore case sensitive
 * and O?P = c
 * 
 * String s1 = "Hello, Welcome to the Java World"; 
 */

public class FindFirstNonRepeatableChar {
	
	
	public static void main(String[] args) {
		
		
		String s1 = "Hello, Welcome to the Java World"; 
		
		
			Map.Entry<Character, Long> map =	s1.chars().mapToObj(c -> (char) c)
						.filter(Character::isLetter)
						.map(Character::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), 
						LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
							.filter(e -> e.getValue() ==1 ).findFirst().get();
			
			
		System.out.println(map);
	}

}
