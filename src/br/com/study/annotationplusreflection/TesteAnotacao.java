package br.com.study.annotationplusreflection;

import java.lang.reflect.Field;

import static java.lang.System.out;

public class TesteAnotacao {

    @Deprecated
    public static int value = 1;

    public static void main(String[] args ) throws Exception {
        Field field = TesteAnotacao.class.getField("value");

        if(field.isAnnotationPresent(Deprecated.class)){
            out.println("Campo anotado com Deprecated");
        }else{
            out.println("Campo não anotado com Deprecated");
        }
    }
}
