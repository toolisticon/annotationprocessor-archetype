#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.beanbuilderap${artifactId};


import ${package}.${rootArtifactId}.api.BeanBuilder;
import lombok.Data;

@BeanBuilder(className = "MurcksBuilder")
@Data
public class CustomClassNameTestBean {
    private Long longField;
    private String stringField;
}
