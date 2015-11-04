package java8katas;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Implementing enlightening katas from: http://technologyconversations.com/2014/11/04/java-8-streams-micro-katas/
 */
public class StreamTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(Stream.upperCaseCollection(collection)).hasSameElementsAs(expected);
    }
    
    @Test
    public void transformShouldFilterCollectionLessThan4Characters() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(Stream.filterLessThanCharacters(collection, 4)).hasSameElementsAs(expected);
    }
    
    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(Stream.flatten(collection)).hasSameElementsAs(expected);
    }
    
    private Map<String, Object> createPerson(String name, int age){
	   Map<String, Object> newPerson = new HashMap<String, Object>();
	   newPerson.put("name", name);
	   newPerson.put("age", age);
       return newPerson;
    }
    
    @Test
    public void transformShouldReturnOldestPerson() {
    	Map<String, Object> eva = createPerson("Eva", 42);
    	List<Map<String, Object>> collection = asList(createPerson("Sara", 38), eva, createPerson("Viktor", 40));
        assertThat(Stream.getOldestPerson(collection)).isEqualTo(eva);
    }
    
    @Test
    public void transformToSum() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(Stream.toSum(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }
}
