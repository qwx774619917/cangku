package szys;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Frame extends JFrame{
	static double rn=0;
	public static Histroy hs = new Histroy();
	Timer timer = new Timer();
	public static QA_List hh = new QA_List();
    double tot=hh.i;
    public List<JTextField> Field_list=new ArrayList<JTextField>();
	public Frame() {
		super("Myapp");
		hs.Histroy_create();
        initComponents();
        if(Test_Number.l==1){
        	Set_qusetion.setText("開始");
        	jLabel2.setText("計時：");
        	jLabel1.setText("正確率：");
        	jLabel3.setText("用時：");
        	Review.setText("複習");
        	jLabel4.setText("正確：");
        	jLabel6.setText("全部：");
        }
        if(Test_Number.l==2){
        	Set_qusetion.setText("Start");
        	jLabel2.setText("Timing:");
        	jLabel1.setText("Correct rate:");
        	jLabel3.setText("Time cost:");
        	Review.setText("Review");
        	jLabel4.setText("Right:");
        	jLabel6.setText("All:");
        }
        jLabel7.setText(""+hs.tot);
		jLabel5.setText(""+hs.rn);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        qusetion1 = new javax.swing.JLabel();
        qusetion2 = new javax.swing.JLabel();
        qusetion3 = new javax.swing.JLabel();
        qusetion4 = new javax.swing.JLabel();
        qusetion5 = new javax.swing.JLabel();
        qusetion6 = new javax.swing.JLabel();
        qusetion7 = new javax.swing.JLabel();
        qusetion8 = new javax.swing.JLabel();
        qusetion9 = new javax.swing.JLabel();
        answer1 = new javax.swing.JTextField();
        answer2 = new javax.swing.JTextField();
        answer3 = new javax.swing.JTextField();
        answer4 = new javax.swing.JTextField();
        answer5 = new javax.swing.JTextField();
        answer6 = new javax.swing.JTextField();
        answer7 = new javax.swing.JTextField();
        answer8 = new javax.swing.JTextField();
        answer9 = new javax.swing.JTextField();
        qusetion10 = new javax.swing.JLabel();
        answer10 = new javax.swing.JTextField();
        Tip2 = new javax.swing.JLabel();
        Tip1 = new javax.swing.JLabel();
        Tip3 = new javax.swing.JLabel();
        Tip4 = new javax.swing.JLabel();
        Tip6 = new javax.swing.JLabel();
        Tip5 = new javax.swing.JLabel();
        Tip8 = new javax.swing.JLabel();
        Tip7 = new javax.swing.JLabel();
        Tip10 = new javax.swing.JLabel();
        Tip9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Right_answer1 = new javax.swing.JLabel();
        Right_answer2 = new javax.swing.JLabel();
        Right_answer3 = new javax.swing.JLabel();
        Right_answer4 = new javax.swing.JLabel();
        Right_answer5 = new javax.swing.JLabel();
        Right_answer6 = new javax.swing.JLabel();
        Right_answer7 = new javax.swing.JLabel();
        Right_answer8 = new javax.swing.JLabel();
        Right_answer9 = new javax.swing.JLabel();
        Right_answer10 = new javax.swing.JLabel();
        Set_qusetion = new javax.swing.JButton();
        Review = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Right_percent = new javax.swing.JLabel();
        Time = new javax.swing.JTextField();
        Font font=new Font("SansSerif",Font.BOLD,20);
		 Time.setFont(font);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Time_Cost = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
        answer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer1KeyPressed(evt);
            }
        });

        answer2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer2KeyPressed(evt);
            }
        });

        answer3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer3KeyPressed(evt);
            }
        });

        answer4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer4KeyPressed(evt);
            }
        });

        answer5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer5KeyPressed(evt);
            }
        });

        answer6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer6KeyPressed(evt);
            }
        });

        answer7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer7KeyPressed(evt);
            }
        });

        answer8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer8KeyPressed(evt);
            }
        });

        answer9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer9KeyPressed(evt);
            }
        });

        answer10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answer10KeyPressed(evt);
            }
        });

        Set_qusetion.setText("开始");
        Set_qusetion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Set_qusetionMouseClicked(evt);
            }
        });

        Review.setText("复习");
        Review.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReviewMouseClicked(evt);
            }
        });

        jLabel1.setText("正确率：");

        Right_percent.setText("00.00%");

        jLabel2.setText("计时：");

        jLabel3.setText("用时：");

        Time_Cost.setText("00:00.00");

        jLabel4.setText("正确：");

        jLabel6.setText("全部：");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Right_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Time_Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Review, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qusetion2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qusetion3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Tip5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Right_answer5))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Tip6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Right_answer6))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Tip4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Right_answer4))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Tip3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Right_answer3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Tip8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel29)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Right_answer8))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Tip7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Right_answer7))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tip2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Right_answer2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(qusetion9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(qusetion8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(qusetion4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qusetion5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qusetion6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qusetion7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qusetion10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(answer9)
                                            .addComponent(answer4)
                                            .addComponent(answer5)
                                            .addComponent(answer6)
                                            .addComponent(answer7)
                                            .addComponent(answer8)
                                            .addComponent(answer10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tip10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Tip9, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(qusetion1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tip1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Right_answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Right_answer9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Right_answer10)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Set_qusetion, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {answer1, answer10, answer2, answer3, answer4, answer5, answer6, answer7, answer8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Review, Set_qusetion});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Right_answer1, Right_answer10, Right_answer2, Right_answer3, Right_answer4, Right_answer5, Right_answer6, Right_answer7, Right_answer8, Right_answer9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Tip1, Tip10, Tip2, Tip3, Tip4, Tip5, Tip6, Tip7, Tip8, Tip9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {qusetion10, qusetion2, qusetion3, qusetion4, qusetion5, qusetion6, qusetion7, qusetion8, qusetion9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel28, jLabel29, jLabel30, jLabel31});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Set_qusetion)
                            .addComponent(jLabel2)
                            .addComponent(Time))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qusetion1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tip1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Right_answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qusetion2)
                    .addComponent(Tip2)
                    .addComponent(jLabel23)
                    .addComponent(Right_answer2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tip3)
                    .addComponent(qusetion3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(Right_answer3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qusetion4)
                            .addComponent(Tip4)
                            .addComponent(jLabel25)
                            .addComponent(Right_answer4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qusetion5)
                            .addComponent(Tip5)
                            .addComponent(jLabel26)
                            .addComponent(Right_answer5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(answer6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qusetion6)
                                .addComponent(Tip6)
                                .addComponent(jLabel27))
                            .addComponent(Right_answer6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(answer7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qusetion7)
                                .addComponent(Tip7)
                                .addComponent(jLabel28))
                            .addComponent(Right_answer7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(answer8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qusetion8)
                                .addComponent(Tip8)
                                .addComponent(jLabel29))
                            .addComponent(Right_answer8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(answer9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qusetion9)
                                .addComponent(Tip9)
                                .addComponent(jLabel30))
                            .addComponent(Right_answer9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answer10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qusetion10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tip10)
                            .addComponent(jLabel31)))
                    .addComponent(Right_answer10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time_Cost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Review)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Right_percent, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Right_percent, jLabel1});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Right_answer1, Right_answer10, Right_answer2, Right_answer3, Right_answer4, Right_answer5, Right_answer6, Right_answer7, Right_answer8, Right_answer9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Review, Set_qusetion});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Tip1, Tip10, Tip2, Tip3, Tip4, Tip5, Tip6, Tip7, Tip8, Tip9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {qusetion1, qusetion10, qusetion2, qusetion4, qusetion5, qusetion6, qusetion7, qusetion8, qusetion9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel28, jLabel29, jLabel30, jLabel31});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void Set_qusetionMouseClicked(java.awt.event.MouseEvent evt) { 
    	
        qusetion1.setText(hh.Qusetion.get(0));
        qusetion2.setText(hh.Qusetion.get(1));
        qusetion3.setText(hh.Qusetion.get(2));
        qusetion4.setText(hh.Qusetion.get(3));
        qusetion5.setText(hh.Qusetion.get(4));
        qusetion6.setText(hh.Qusetion.get(5));
        qusetion7.setText(hh.Qusetion.get(6));
        qusetion8.setText(hh.Qusetion.get(7));
        qusetion9.setText(hh.Qusetion.get(8));
        qusetion10.setText(hh.Qusetion.get(9));
        Time.setText("00:00.00");
		timer.schedule(new Work_Time(), 10, 10);
		Field_list.add(answer1);
		Field_list.add(answer2);
		Field_list.add(answer3);
		Field_list.add(answer4);
		Field_list.add(answer5);
		Field_list.add(answer6);
		Field_list.add(answer7);
		Field_list.add(answer8);
		Field_list.add(answer9);
		Field_list.add(answer10);
		Hide();
    }                                         

    private void ReviewMouseClicked(java.awt.event.MouseEvent evt) {
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test_Number().setVisible(true);
            }
        });
    	
    	this.dispose();
    }                                   

    private void answer1KeyPressed(java.awt.event.KeyEvent evt) {                                   
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
	           KeyPressed(Tip1, Right_answer1, jLabel22,0, answer1);
	       }
    }                                  

    private void answer2KeyPressed(java.awt.event.KeyEvent evt) {                                   
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    		KeyPressed(Tip2, Right_answer2, jLabel23,1, answer2);
	       }
    }                                  

    private void answer3KeyPressed(java.awt.event.KeyEvent evt) {                                   
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    		KeyPressed(Tip3, Right_answer3,jLabel24 ,2, answer3);
	       }
    }                                  

    private void answer4KeyPressed(java.awt.event.KeyEvent evt) {                                   
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    		KeyPressed(Tip4, Right_answer4, jLabel25,3, answer4);
	       }
    }                                  

    private void answer5KeyPressed(java.awt.event.KeyEvent evt) {                                   
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    		KeyPressed(Tip5, Right_answer5, jLabel26,4, answer5);
	       }
    }                                  

    private void answer6KeyPressed(java.awt.event.KeyEvent evt) {                                   
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    		KeyPressed(Tip6, Right_answer6,jLabel27, 5, answer6);
	       }
    }                                  

    private void answer7KeyPressed(java.awt.event.KeyEvent evt) {                                   
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    		KeyPressed(Tip7, Right_answer7,jLabel28, 6, answer7);
	       }
    }                                  

    private void answer8KeyPressed(java.awt.event.KeyEvent evt) {                                   
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    		KeyPressed(Tip8, Right_answer8, jLabel29,7, answer8);
	       }
    }                                  

    private void answer9KeyPressed(java.awt.event.KeyEvent evt) {                                   
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
    		KeyPressed(Tip9, Right_answer9,jLabel30, 8, answer9);
	       }
    }                                  

    private void answer10KeyPressed(java.awt.event.KeyEvent evt) {                                    
    	if(evt.getKeyCode() == KeyEvent.VK_ENTER){
	           Tip10.setText(Tip(answer10.getText(),9));
	           Right_answer10.setText(hh.Answer.get(9));
	           if(Test_Number.l==1){
	        	   jLabel31.setText("答案：");
	           }
	           if(Test_Number.l==2){
	        	   jLabel31.setText("answer：");
	           }
	           if(Test_Number.l==0){
	        	   jLabel31.setText("答案：");
	           }
	           timer.cancel();
	           Time_Cost.setText(Time.getText());
        	   Right_percent.setText(rn/tot*100+"%");
        	   Time.setText("00:00.00");
        	   hs.scan2((int)(tot+hs.tot), (int)(rn+hs.rn));
        	   hs.Histroy_saveNum();
            	   
	       }
    }
    private void KeyPressed(JLabel i,JLabel j,JLabel l,int x,JTextField k){
    	i.setText(Tip(k.getText(),x));
        j.setText(hh.Answer.get(x));
        if(Test_Number.l==1){
        	l.setText("答案：");
        }
        if(Test_Number.l==2){
        	l.setText("answer：");
        }
        if(Test_Number.l==0){
        	l.setText("答案：");
        }
        if(hh.Answer.get(x+1).equals("")){
     	   timer.cancel();
     	   Time_Cost.setText(Time.getText());
     	   DecimalFormat w = new DecimalFormat("#.##");
     	   double get_percent = Double.parseDouble(w.format(rn/tot*100));
     	   Right_percent.setText(get_percent+"%");
     	   Time.setText("00:00.00");
     	   hs.scan2((int)(tot+hs.tot), (int)(rn+hs.rn));
     	   hs.Histroy_saveNum();
     	   
        }
    }
    private void Hide(){
    	for(int i=0;i<10;i++){
    		if(hh.Answer.get(i+1).equals("")){
	    		for(int r = 0;r<(10-i);r++){
	    			Field_list.get(r+i+1).setEditable(false);
	    		}
    		}
    	}
    	
    }
    

    

 // Variables declaration - do not modify                     
    
    public static javax.swing.JTextField Time;
    private javax.swing.JButton Review;
    private javax.swing.JLabel Right_answer1;
    private javax.swing.JLabel Right_answer10;
    private javax.swing.JLabel Right_answer2;
    private javax.swing.JLabel Right_answer3;
    private javax.swing.JLabel Right_answer4;
    private javax.swing.JLabel Right_answer5;
    private javax.swing.JLabel Right_answer6;
    private javax.swing.JLabel Right_answer7;
    private javax.swing.JLabel Right_answer8;
    private javax.swing.JLabel Right_answer9;
    private javax.swing.JLabel Right_percent;
    private javax.swing.JButton Set_qusetion;
    private javax.swing.JLabel Time_Cost;
    private javax.swing.JLabel Tip1;
    private javax.swing.JLabel Tip10;
    private javax.swing.JLabel Tip2;
    private javax.swing.JLabel Tip3;
    private javax.swing.JLabel Tip4;
    private javax.swing.JLabel Tip5;
    private javax.swing.JLabel Tip6;
    private javax.swing.JLabel Tip7;
    private javax.swing.JLabel Tip8;
    private javax.swing.JLabel Tip9;
    private javax.swing.JTextField answer1;
    private javax.swing.JTextField answer10;
    private javax.swing.JTextField answer2;
    private javax.swing.JTextField answer3;
    private javax.swing.JTextField answer4;
    private javax.swing.JTextField answer5;
    private javax.swing.JTextField answer6;
    private javax.swing.JTextField answer7;
    private javax.swing.JTextField answer8;
    private javax.swing.JTextField answer9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel qusetion1;
    private javax.swing.JLabel qusetion10;
    private javax.swing.JLabel qusetion2;
    private javax.swing.JLabel qusetion3;
    private javax.swing.JLabel qusetion4;
    private javax.swing.JLabel qusetion5;
    private javax.swing.JLabel qusetion6;
    private javax.swing.JLabel qusetion7;
    private javax.swing.JLabel qusetion8;
    private javax.swing.JLabel qusetion9;
    public String Tip (String answer,int i) {
    	if(answer.equals(hh.Answer.get(i)))
        {
            rn++;
            if(Test_Number.l==1){
            	return "(≧▽≦)正確";
            }
            if(Test_Number.l==2){
            	return "(≧▽≦)right";
            }
            return "(≧▽≦)正确";
        }
        else
        {
        	hs.scan(hh.Answer.get(i),hh.Qusetion.get(i) );
        	hs.Histroy_save();
        	if(Test_Number.l==1){
            	return "(＞﹏＜）錯誤";
            }
            if(Test_Number.l==2){
            	return "(＞﹏＜）wrong";
            }
        	return "(＞﹏＜）错误";
        }
    	
    }
   

}
