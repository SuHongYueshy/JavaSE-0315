package day04;

public class PECS<N extends Number> {  //PECS 有界类型 可以使用八个基本类型

    private void print(N n1,N n2){
        System.out.println(n1);
        System.out.println(n2);
    }

    public static void main(String[] args) {
        PECS<Integer> p1 = new PECS<>();
        p1.print(1,3);

        PECS<Double> p2 = new PECS<>();
        p2.print(1.2,3.4);

      //  PECS<String> p3 = new PECS<>();    String 不属于基本类型，所以不可以用在此处
    }
}
