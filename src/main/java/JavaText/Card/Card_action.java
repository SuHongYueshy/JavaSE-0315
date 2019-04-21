package JavaText.Card;



import java.sql.SQLException;
import java.util.Scanner;

public class Card_action {
    public static void addCard1() throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("饭卡管理欢迎您的使用！！！");
        Meal_Card card = new Meal_Card();
        while (true) {
            System.out.print("请输入您的学号:");
            String id = input.nextLine();
            CardDao cd = new CardDao();
            Meal_Card tempcard = cd.findCard(id);
            if (id.equals("0")) {
                System.out.println("输入不合法，请重新输入");
            } else if (tempcard.getId().equals("-1")) {
                card.setId(id);
                break;
            } else {
                System.out.println("用户学号已存在，请重新输入");
            }
        }
        System.out.print("请输入您的姓名:");
        card.setName(input.nextLine());
        System.out.print("请输入您的班级名称:");
        card.setClass_name(input.nextLine());
        System.out.print("请输入您的密码（---重要----）:");
        card.setPassword(input.nextLine());
        CardDao cd = new CardDao();
        cd.addCard2(card);
        System.out.println();
    }

    public static void addMoney01(Meal_Card card) throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您要充值的金额");
        int numOfMoney = in.nextInt();
        CardDao cd = new CardDao();
        cd.addMoney(card, numOfMoney);
    }

    public static void queryCardMoney(Meal_Card card) {
        System.out.println("饭卡余额:" + card.getMoney());
    }

    public static void queryCard(Meal_Card card) {
        System.out.println("您饭卡的完整信息为：");
        System.out.println("班级：" + card.getClass_name());
        System.out.println("学号：" + card.getId());
        System.out.println("姓名：" + card.getName());
    }

    public static Meal_Card find(String id) throws SQLException {
        CardDao cd = new CardDao();
        return cd.findCard(id);
    }


    public static void costCard(Meal_Card card) throws SQLException {
        Scanner in = new Scanner(System.in);

        {
            String thing = "铅笔";
        if (thing == "铅笔")
            System.out.println("1元一支");
        else if (thing == "本子")
            System.out.println("2元一个");
        else if (thing == "圆珠笔")
            System.out.println("2.5元一支");
        }
        System.out.println("请输入您要购买的商品：");
        double cost = in.nextDouble();
        CardDao cd = new CardDao();
        cd.costCard(card, cost);
    }

    public static void queryBankCard(Meal_Card card) {
        System.out.println("银行卡余额为：" + card.getNumOfBankCard());
    }
}