#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor.tests;

import ${package}.api.BeanBuilder;

@BeanBuilder
public class TestcaseInvalidUsageNoNoargConstructor {

    private String field;

    public  TestcaseInvalidUsageNoNoargConstructor (String arg) {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}