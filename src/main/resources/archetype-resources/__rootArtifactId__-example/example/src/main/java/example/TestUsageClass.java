#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.beanbuilderap${artifactId};

import ${package}.murks.CustomPackageTestBeanBuilder;

public class TestUsageClass {

    public static void main(String[] args) {

        GeneratedClass instance = new GeneratedClass();

        System.out.println(instance.getClass().getCanonicalName());


    }


}
