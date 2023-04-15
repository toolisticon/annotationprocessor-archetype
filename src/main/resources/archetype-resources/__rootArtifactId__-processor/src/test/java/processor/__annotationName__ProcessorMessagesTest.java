#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Unit test for {@link ${annotationName}ProcessorMessages}.
 *
 * TODO: replace the example testcases with your own testcases
 *
 */
public class ${annotationName}ProcessorMessagesTest {

    @Test
    public void test_enum() {

        MatcherAssert.assertThat(${annotationName}ProcessorCompilerMessages.ERROR_COULD_NOT_CREATE_CLASS.getCode(), Matchers.startsWith("${annotationName}"));
        MatcherAssert.assertThat(${annotationName}ProcessorCompilerMessages.ERROR_COULD_NOT_CREATE_CLASS.getMessage(), Matchers.containsString("create class"));

    }


}
