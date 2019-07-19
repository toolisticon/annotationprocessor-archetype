#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.integrationtest;

public class TestBean {

    private String fieldA;
    private Long fieldB;

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public Long getFieldB() {
        return fieldB;
    }

    public void setFieldB(Long fieldB) {
        this.fieldB = fieldB;
    }
}
