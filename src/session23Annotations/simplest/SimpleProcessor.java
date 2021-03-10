package session23Annotations.simplest;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;

//A bare-bones annotation processor
@SupportedAnnotationTypes("session23Annotations.simplest.Simple")
public class SimpleProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        for (TypeElement t : annotations) {
            System.out.println(t);
        }
        for (Element el : env.getElementsAnnotatedWith(Simple.class)) {
            display(el);
        }
        return false;
    }
    private void display(Element el) {
        System.out.println("===="+el+"====");
        System.out.println(el.getKind()+":"+el.getModifiers()+":"+
                el.getSimpleName()+":"+el.asType());
        if(el.getKind().equals(ElementKind.CLASS)){
            TypeElement te=(TypeElement)el;
            System.out.println(te.getQualifiedName());
            System.out.println(te.getSuperclass());
            System.out.println(te.getEnclosedElements());
        }
        if(el.getKind().equals(ElementKind.METHOD)){
            ExecutableElement ex=(ExecutableElement)el;
            System.out.println(ex.getReturnType()+" ");
            System.out.println(ex.getSimpleName()+"(");
            System.out.println(ex.getParameters()+")");
        }
    }
}
