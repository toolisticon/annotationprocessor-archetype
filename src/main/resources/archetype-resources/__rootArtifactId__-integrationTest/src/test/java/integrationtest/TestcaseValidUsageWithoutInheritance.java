#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.integrationtest;

import ${package}.api.BeanBuilder;

@BeanBuilder(inheritFields = false)
public class TestcaseValidUsageWithoutInheritance extends TestcaseBeanSuperClass {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}