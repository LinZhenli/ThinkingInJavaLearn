package test.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        /**
         * ��ȡTargetObject���Class�����Ҵ���TargetObject��ʵ��
         */
        Class<?> tagetClass = Class.forName("test.reflection.TargetObject");
        TargetObject targetObject = (TargetObject) tagetClass.newInstance();
        /**
         * ��ȡ�����������ж���ķ���
         */
        Method[] methods = tagetClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        /**
         * ��ȡָ������������
         */
        Method publicMethod = tagetClass.getDeclaredMethod("publicMethod",
                String.class);

        publicMethod.invoke(targetObject, "JavaGuide");
        /**
         * ��ȡָ���������Բ��������޸�
         */
        Field field = tagetClass.getDeclaredField("value");
        //Ϊ�˶����еĲ��������޸�����ȡ����ȫ���
        field.setAccessible(true);
        field.set(targetObject, "JavaGuide");
        /**
         * ���� private ����
         */
        Method privateMethod = tagetClass.getDeclaredMethod("privateMethod");
        //Ϊ�˵���private��������ȡ����ȫ���
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}

