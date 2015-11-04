package java8katas;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Test;

public class ToUpperCaseTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(ToUpperCase.transform(collection)).hasSameElementsAs(expected);
    }
}
