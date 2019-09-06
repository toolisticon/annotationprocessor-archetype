#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor;

import io.toolisticon.annotationprocessortoolkit.tools.MessagerUtils;
import io.toolisticon.annotationprocessortoolkit.tools.corematcher.CoreMatcherValidationMessages;
import io.toolisticon.compiletesting.CompileTestBuilder;
import io.toolisticon.compiletesting.JavaFileObjectUtils;
import org.junit.Before;
import org.junit.Test;

import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;


/**
 * Tests of {@link ${package}.api.${annotationName}}.
 *
 * TODO: replace the example testcases with your own testcases
 */

public class ${annotationName}ProcessorTest {


    CompileTestBuilder.CompilationTestBuilder compileTestBuilder;

    @Before
    public void init() {
        MessagerUtils.setPrintMessageCodes(true);

        compileTestBuilder = CompileTestBuilder
                .compilationTest()
                .addProcessors(${annotationName}Processor.class);
    }


    @Test
    public void test_valid_usage() {

        compileTestBuilder
                .addSources(JavaFileObjectUtils.readFromResource("testcases/TestcaseValidUsage.java"))
                .compilationShouldSucceed()
                .testCompilation();
    }

    @Test
    public void test_invalid_usage_with_empty_value() {

        compileTestBuilder
                .addSources(JavaFileObjectUtils.readFromResource("testcases/TestcaseInvalidUsageWithEmptyValue.java"))
                .compilationShouldFail()
                .expectedErrorMessages(${annotationName}ProcessorMessages.ERROR_VALUE_MUST_NOT_BE_EMPTY.getCode())
                .testCompilation();
    }

    @Test
    public void test_invalid_usage_on_enum() {

        compileTestBuilder
                .addSources(JavaFileObjectUtils.readFromResource("testcases/TestcaseInvalidUsageOnEnum.java"))
                .compilationShouldFail()
                .expectedErrorMessages(CoreMatcherValidationMessages.IS_CLASS.getCode())
                .testCompilation();
    }

    @Test
    public void test_Test_invalid_usage_on_interface() {

        compileTestBuilder
                .addSources(JavaFileObjectUtils.readFromResource("testcases/TestcaseInvalidUsageOnInterface.java"))
                .compilationShouldFail()
                .expectedErrorMessages(CoreMatcherValidationMessages.IS_CLASS.getCode())
                .testCompilation();
    }



}