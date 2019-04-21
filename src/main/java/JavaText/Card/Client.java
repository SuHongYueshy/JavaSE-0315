package JavaText.Card;

import day09.Server;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

    public class Client extends JFrame {

        private final Object Card_action;
        private JTextArea sqlJTextArea, outputJTextArea;
        private JTable resultJTable;
        private JScrollPane sqlJScrollPane, outputJScrollPane, resultJScrollPane;
        private JPanel southJPanel, main;
        static DefaultTableModel defaultTableModel;



        private Client() {
            initComponent();
            initListener();
            Card_action = new Server();
        }

        /***
         * 初始化组件
         */
        private void initComponent() {
            // 1.全局布设
            setTitle("学生饭卡管理系统");   //设置标题
            setExtendedState(MAXIMIZED_BOTH);  //设置扩展状态为最大值
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();  //面积 定义屏幕的大小
            int width = dimension.width;
            int height = dimension.height;
            Font font = new Font("consolas",Font.PLAIN,24);  //设置字体

            // 2. SQL
            sqlJTextArea = new JTextArea();
            sqlJTextArea.setBackground(Color.darkGray);
            sqlJTextArea.setForeground(Color.WHITE);
            sqlJTextArea.setFont(font);
            sqlJTextArea.setCaretColor(Color.WHITE);
            sqlJTextArea.setCaretPosition(sqlJTextArea.getDocument().getLength());

            sqlJScrollPane = new JScrollPane(sqlJTextArea);
            sqlJScrollPane.setPreferredSize(new Dimension(width, height / 2));

            // 3. output
            outputJTextArea = new JTextArea();
            outputJTextArea.setBackground(Color.WHITE);
            outputJTextArea.setFont(font);
            outputJTextArea.setEditable(false);

            outputJScrollPane = new JScrollPane(outputJTextArea);
            outputJScrollPane.setPreferredSize(new Dimension(width, (int) (height / 2.5)));


            southJPanel = new JPanel();
            southJPanel.setLayout(new BorderLayout());
            southJPanel.setPreferredSize(new Dimension(width, (int) (height / 2.5)));

            southJPanel.add(outputJScrollPane, BorderLayout.WEST);

            // 4. main
            main = new JPanel();
            main.setLayout(new BorderLayout());

            main.add(sqlJScrollPane, BorderLayout.NORTH);
            main.add(southJPanel, BorderLayout.SOUTH);

            // 6. show
            add(main);

            addWindowFocusListener(new WindowAdapter() {
                @Override
                public void windowOpened(WindowEvent e) {
                    sqlJTextArea.requestFocus();
                }
            });

            setVisible(true);
        }

        /**
         * 初始化监听器
         */
        private void initListener() {
            //定义一个快捷键
            KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);
            sqlJTextArea.getInputMap().put(keyStroke, "Execute");
            sqlJTextArea.getActionMap().put("Execute", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String sql = sqlJTextArea.getSelectedText();

                    if (defaultTableModel != null){
                        resultJTable.setModel(defaultTableModel);
                    }
                }
            });
        }

        public static void main(String[] args) {
            new Client();
        }
}
