#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.beanbuilderap${artifactId};

import ${package}.${rootArtifactId}.api.BeanBuilder;
import lombok.Data;

@BeanBuilder(packageName = "${package}.murks")
@Data
public class CustomPackageTestBean {
    private Long longField;
    private String stringField;
}
