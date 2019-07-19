#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor.tests;

import ${package}.api.BeanBuilder;

@BeanBuilder
public enum TestcaseInvalidUsageOnEnum {
    TEST;
}