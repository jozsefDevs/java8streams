package java8katas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
	public static List<String> upperCaseCollection(List<String> list){
		return list.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
	public static List<String> filterLessThanCharacters(List<String> list, Integer i){
		return list.stream().filter(x -> x.length() < i).collect(Collectors.toList());
	}
	public static List<String> flatten(List<List<String>> list){
		return list.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
	}
	public static Map<String, Object> getOldestPerson(List<Map<String, Object>> list){
		return list.stream().reduce( (x, y) -> (int)x.get("age") >= (int)y.get("age") ? x : y).get();
	}
}
