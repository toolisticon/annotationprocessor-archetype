#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.processor;

import ${package}.api.${annotationName};

import io.toolisticon.aptk.tools.AbstractAnnotationProcessor;
import io.toolisticon.aptk.tools.ElementUtils;
import io.toolisticon.aptk.tools.FilerUtils;
import io.toolisticon.aptk.tools.MessagerUtils;
import io.toolisticon.aptk.tools.corematcher.AptkCoreMatchers;
import io.toolisticon.aptk.tools.fluentvalidator.FluentElementValidator;
import io.toolisticon.aptk.tools.generators.SimpleJavaWriter;
import io.toolisticon.aptk.tools.wrapper.TypeElementWrapper;
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

        if (!roundEnv.processingOver()) {
            // process Services annotation
            for (Element element : roundEnv.getElementsAnnotatedWith(${annotationName}.class)) {

                TypeElementWrapper wrappedTypeElement = TypeElementWrapper.wrap((TypeElement) element);
                ${annotationName}Wrapper annotation = ${annotationName}Wrapper.wrap(wrappedTypeElement.unwrap());

                if (validateUsage(wrappedTypeElement, annotation)) {
                    processAnnotation(wrappedTypeElement, annotation);
                }

            }

        } else {

            // ProcessingOver round

        }
        return false;

    }

    void processAnnotation(TypeElementWrapper wrappedTypeElement, ${annotationName}Wrapper annotation) {

        // ----------------------------------------------------------
        // TODO: replace the following code by your business logic
        // ----------------------------------------------------------

        createClass(wrappedTypeElement, annotation);

    }


    boolean validateUsage(TypeElementWrapper wrappedTypeElement, ${annotationName}Wrapper annotation) {

        // ----------------------------------------------------------
        // TODO: replace the following code by your business logic
        // ----------------------------------------------------------

        // Some example validations : Annotation may only be applied on Classes with Noarg constructor.
        boolean result = wrappedTypeElement.validateWithFluentElementValidator()
            .is(AptkCoreMatchers.IS_CLASS)
            .applyValidator(AptkCoreMatchers.HAS_PUBLIC_NOARG_CONSTRUCTOR)
            .validateAndIssueMessages();

        if(annotation.value().isEmpty()) {
            wrappedTypeElement.compilerMessage().asError().write(${annotationName}ProcessorMessages.ERROR_VALUE_MUST_NOT_BE_EMPTY);
            result = false;
        }
        return result;

    }

    /**
     * Generates a class.
     *
     * Example how to use the templating engine.
     *
     * TODO: remove this
     *
     * @param wrappedTypeElement           The TypeElement representing the annotated class
     * @param annotation The ${annotationName} annotation
     */
    private void createClass(TypeElementWrapper wrappedTypeElement, ${annotationName}Wrapper annotation) {


        // Now create class
        String packageName = wrappedTypeElement.getPackageName();
        String className = annotation.value();

        // Fill Model
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("packageName", packageName);
        model.put("className", className);

        // create the class
        String filePath = packageName + "." + className;
        try {
            SimpleJavaWriter javaWriter = FilerUtils.createSourceFile(filePath, wrappedTypeElement.unwrap());
            javaWriter.writeTemplate("/${annotationName}.tpl", model);
            javaWriter.close();
        } catch (IOException e) {
            wrappedTypeElement.compilerMessage().asError().write(${annotationName}ProcessorMessages.ERROR_COULD_NOT_CREATE_CLASS, filePath, e.getMessage());
        }
    }

}
