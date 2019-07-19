#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor.tests;

import ${package}.api.BeanBuilder;

@BeanBuilder(className = "CustomTestBeanBuilder")
public class TestcaseValidUsageWithCustomClassName {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}