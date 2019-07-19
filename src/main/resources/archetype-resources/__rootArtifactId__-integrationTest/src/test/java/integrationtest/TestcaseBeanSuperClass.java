#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.integrationtest;

public class TestcaseBeanSuperClass {

    private String inheritedField;

    public String getInheritedField() {
        return inheritedField;
    }

    public void setInheritedField(String inheritedField) {
        this.inheritedField = inheritedField;
    }
}
