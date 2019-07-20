#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * BeanBuilder annotation.
 * Can be used to create builder of annotated class.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(value = {ElementType.TYPE})
@Documented
public @interface ${annotationName} {
    /**
     * Value must not be empty String.
     *
     * @return the value
     */
    String value();


}
