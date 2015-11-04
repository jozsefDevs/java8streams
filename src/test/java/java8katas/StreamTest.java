package java8katas;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Test;

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
}
