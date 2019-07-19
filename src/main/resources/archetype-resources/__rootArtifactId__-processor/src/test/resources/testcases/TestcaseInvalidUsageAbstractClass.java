#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor.tests;

import ${package}.api.BeanBuilder;

@BeanBuilder
public abstract class TestcaseInvalidUsageAbstractClass {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}