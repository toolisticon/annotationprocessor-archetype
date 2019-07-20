#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.integrationtest;

import ${package}.api.${annotationName};

@${annotationName}("GeneratedClass")
public class TestcaseValidUsage {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}