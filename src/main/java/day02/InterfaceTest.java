package day02;

// 接口
public interface InterfaceTest {
    int ONE_TWO_THREE = 123;

    void method();
}

interface A {
    void a();
}

class InterfaceTestImpl implements InterfaceTest, A {

    @Override
    public void method() {

    }

    @Override
    public void a() {

    }
}

interface B extends A, InterfaceTest {
}
