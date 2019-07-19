#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.integrationtest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class ThirdPartyBeanBuilderTest {

    @Test
    public void test3rdPartyBeanBuilder() {

        TestBean testBean = TestBeanBuilder.createBuilder().withFieldA("A").withFieldB(1L).build();

        MatcherAssert.assertThat(testBean.getFieldA(), Matchers.is("A"));
        MatcherAssert.assertThat(testBean.getFieldB(), Matchers.is(1L));

    }

}
