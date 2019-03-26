package interview;

public class YHSJ {
    private static int i;

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++){
            System.out.print("");
        }
        for (int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
/*public static int num (int x, int y){
    if (y == 1 || y == x){
        return 1;
    }
    int c = num(x - 1,y - 1) + num(x -1, y);
    return c;*/
}
