#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor.tests;

import ${package}.api.${annotationName};

@${annotationName}("")
public class TestcaseInvalidUsageWithEmptyValue {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}