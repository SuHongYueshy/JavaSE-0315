package interview;

public class nine {
    public static void main(String[] args) {
       printCFB(9);
    }
    public static void printCFB(int num){
        for (int x = 1; x<= 9;x++){
            for(int y = 1;y <= x;y++){
                System.out.println(y + "*" + x + "=" + y*x+"\t");
            }
            System.out.println();
        }
    }
}
