#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor.tests;

import ${package}.api.BeanBuilder;
import ${package}.processor.TestcaseBeanSuperClass;

@BeanBuilder
public class TestcaseValidUsageWithInheritance extends TestcaseBeanSuperClass {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}