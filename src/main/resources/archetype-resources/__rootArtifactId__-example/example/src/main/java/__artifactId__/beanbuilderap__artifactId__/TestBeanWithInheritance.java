#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.beanbuilderap${artifactId};

import ${package}.${rootArtifactId}.api.BeanBuilder;
import lombok.Data;

@BeanBuilder
@Data
public class TestBeanWithInheritance extends TestBean{
    private String myField;
    private String stringField;
}
