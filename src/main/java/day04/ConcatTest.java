package day04;

public class ConcatTest <T>{  //T: Type Parameters
    private void concat(T t1, T t2){
        System.out.println(String.valueOf(t1) + String.valueOf(t2));
    }
    //    private static void concat(String s1, String s2) {
//        System.out.println(s1 + s2);
//    }
//
//    private static void concat(int i1, int i2) {
//        System.out.println(i1 + "" + i2);
//    }
//
//    private static void concat(boolean b1, boolean b2) {
//        System.out.println(b1 + "" + b2);
//    }
    public static void main(String [] args){
        String s1 = "Tom";
        String s2 = "LiMing";
        ConcatTest<String> c1 = new ConcatTest<>();  //利用集合的方法进行的
        c1.concat(s1, s2); //concat用于连接两个或多个数组。该方法不会改变现有的数组，而仅仅会返回被连接数组的一个副本。返回一个新的数组。

        int i1 = 22;
        int i2 = 33;
        ConcatTest<Integer> c2 = new ConcatTest<>();
        c2.concat(i1, i2);

        boolean b1 = false;
        boolean b2 = true;
        ConcatTest<Boolean> c3 = new ConcatTest<>();
        c3.concat(b1, b2);
    }
}
