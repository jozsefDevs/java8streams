package java8katas;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static List<String> transform(List<String> list){
		return list.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
	public static List<String> transformShouldFilterCollectionLessThan4Characters(List<String> list){
		return list.stream().filter(x -> x.length() < 4).collect(Collectors.toList());
	}
	public static List<String> flatten(List<List<String>> list){
		return list.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
	}
}
