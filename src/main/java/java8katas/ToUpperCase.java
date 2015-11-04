package java8katas;

import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
	public static List<String> transform(List<String> list){
		return list.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
}
