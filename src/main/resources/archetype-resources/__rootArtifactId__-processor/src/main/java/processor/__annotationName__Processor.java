#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor;

import ${package}.api.${annotationName};

import io.toolisticon.aptk.tools.AbstractAnnotationProcessor;
import io.toolisticon.aptk.tools.ElementUtils;
import io.toolisticon.aptk.tools.FilerUtils;
import io.toolisticon.aptk.tools.MessagerUtils;
import io.toolisticon.aptk.tools.corematcher.CoreMatchers;
import io.toolisticon.aptk.tools.fluentvalidator.FluentElementValidator;
import io.toolisticon.aptk.tools.generators.SimpleJavaWriter;
import io.toolisticon.spiap.api.SpiService;

import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Annotation Processor for {@link ${package}.api.${annotationName}}.
 *
 * This demo processor does some validations and creates a class.
 */

@SpiService(Processor.class)
public class ${annotationName}Processor extends AbstractAnnotationProcessor {

    private final static Set<String> SUPPORTED_ANNOTATIONS = createSupportedAnnotationSet(${annotationName}.class);

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return SUPPORTED_ANNOTATIONS;
    }

    @Override
    public boolean processAnnotations(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        // process Services annotation
        for (Element element : roundEnv.getElementsAnnotatedWith(${annotationName}.class)) {

            // ----------------------------------------------------------
            // TODO: replace the following code by your business logic
            // ----------------------------------------------------------

            // Some example validations : Annotation may only be applied on Classes with Noarg constructor.
            FluentElementValidator.createFluentElementValidator(element)
                    .is(CoreMatchers.IS_CLASS)
                    .applyValidator(CoreMatchers.HAS_PUBLIC_NOARG_CONSTRUCTOR)
                    .validateAndIssueMessages();



            // It's safe to cast to TypeElement now
            TypeElement typeElement = (TypeElement) element;

            // get annotation
            ${annotationName}Wrapper annotation = ${annotationName}Wrapper.wrap(typeElement);

            if(annotation.value().isEmpty()) {
                MessagerUtils.error(typeElement, ${annotationName}ProcessorMessages.ERROR_VALUE_MUST_NOT_BE_EMPTY);
                continue;
            }

            // Now get all attributes
            createClass(typeElement, annotation);

        }

        return false;

    }


    /**
     * Generates a class.
     *
     * Example how to use the templating engine.
     *
     * TODO: remove this
     *
     * @param typeElement           The TypeElement representing the annotated class
     * @param annotation The ${annotationName} annotation
     */
    private void createClass(TypeElement typeElement, ${annotationName}Wrapper annotation) {


        // Now create class
        String packageName = ((PackageElement) ElementUtils.AccessEnclosingElements.getFirstEnclosingElementOfKind(typeElement, ElementKind.PACKAGE)).getQualifiedName().toString();
        String className = annotation.value();

        // Fill Model
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("packageName", packageName);
        model.put("className", className);

        // create the class
        String filePath = packageName + "." + className;
        try {
            SimpleJavaWriter javaWriter = FilerUtils.createSourceFile(filePath, typeElement);
            javaWriter.writeTemplate("/${annotationName}.tpl", model);
            javaWriter.close();
        } catch (IOException e) {
            MessagerUtils.error(typeElement, ${annotationName}ProcessorMessages.ERROR_COULD_NOT_CREATE_CLASS, filePath, e.getMessage());
        }
    }

}
