package day04;

public interface InterfaceTest<T, S, U> {

    T method( T t, S s, U u);
}

abstract class GenericClass<T>{

    abstract void medthod(T t);
}
class SubGenericClass<T> extends GenericClass<T>{

    @Override
    void medthod(T t) {

    }
}
