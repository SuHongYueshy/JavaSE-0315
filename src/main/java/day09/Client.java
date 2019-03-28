package day09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Client extends JFrame implements ActionListener {

    public Client() {
        initComponent();
    }

    private void initComponent() {
        setTitle("MySQL Client");   //设置标题
        setExtendedState(MAXIMIZED_BOTH);  //设置扩展状态为最大值
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();  //面积 定义屏幕的大小
        Font font = new Font("consolas",Font.PLAIN,24);  //设置字体

        JPanel main = new JPanel();   //主面板
        main.setLayout(new BorderLayout());

        TextArea sqlTestArea = new TextArea();
        sqlTestArea.setPreferredSize(new Dimension(dimension.width,dimension.height / 2));  //dimension 尺寸 ，面积
        sqlTestArea.setFont(font);
        sqlTestArea.setBackground(Color.WHITE);
        sqlTestArea.setBackground(Color.lightGray);

        JPanel north = new JPanel();
        north.setPreferredSize(new Dimension(dimension.width,(int) (dimension.getHeight() / 2)));

        north.add(sqlTestArea);

        TextArea outputTextArea = new TextArea();
        outputTextArea.setBackground(Color.white);
        outputTextArea.setPreferredSize(new Dimension(dimension.width / 2,dimension.height / 2));
        outputTextArea.setEditable(false);

        String[] columnNames = {"ID", "USERNAME", "PASSWORD"};
        Object[] [] rowData ={
                {1, "Tom", "123"},
                {2, "Jerry", "abc"}
        };

        JTable resultTable = new JTable(rowData, columnNames);   //结果框
        resultTable.setBackground(Color.WHITE);
        resultTable.setPreferredSize(new Dimension(dimension.width / 2, dimension.height / 2));


        JPanel south = new JPanel();
        south.setLayout(new BorderLayout());
        south.setBackground(Color.WHITE);
        south.setPreferredSize(new Dimension(dimension.width, (int) (dimension.getHeight() / 2)));

        south.add(outputTextArea, BorderLayout.WEST);
        south.add(resultTable, BorderLayout.EAST);

        main.add(north, BorderLayout.NORTH);
        main.add(south, BorderLayout.SOUTH);
        add(main);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Client();
    }
}
