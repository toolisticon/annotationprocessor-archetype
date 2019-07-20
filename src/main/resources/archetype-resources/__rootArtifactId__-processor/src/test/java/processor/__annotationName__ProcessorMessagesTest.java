#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Unit test for {@link ${annotationName}ProcessorMessages}.
 */
public class ${annotationName}ProcessorMessagesTest {

    @Test
    public void test_enum() {

        MatcherAssert.assertThat(${annotationName}ProcessorMessages.ERROR_COULD_NOT_CREATE_CLASS.getCode(), Matchers.startsWith("${annotationName}"));
        MatcherAssert.assertThat(${annotationName}ProcessorMessages.ERROR_COULD_NOT_CREATE_CLASS.getMessage(), Matchers.containsString("create class"));

    }


}
