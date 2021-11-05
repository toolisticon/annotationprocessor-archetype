#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * This package contains the ${rootArtifactId} annotation processor.
 */
@AnnotationWrapper(value={${annotationName}.class})
package ${package}.processor;

import ${package}.api.${annotationName};
import io.toolisticon.aptk.annotationwrapper.api.AnnotationWrapper;