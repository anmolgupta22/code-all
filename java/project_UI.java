import jdk.swing.interop.LightweightContentWrapper;
import org.apache.groovy.parser.antlr4.GroovyLexer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;



public class project_UI extends JFrame
{

    public static void main(String agr[])

    {

JLabel label1;
 JLabel label2;
 JLabel label3;
 JLabel label4;
 JLabel label5;
 JLabel label6 ;
 JLabel label7;
 JLabel label8;
 JLabel label9;
 JLabel label10;
 JLabel label11,label12,label13, label14,label15,label16,label17,
         label18,label19,label20, label21,label22,label23,label24,label25,label26,label27,label28,label29,label30 ;

 JLabel title;



 JTextField Text1;
        JTextField Text2;
        JTextField Text3;
        JTextField Text4;
        JTextField Text5;
        JTextField Text6;
        JTextField Text7;
        JTextField Text8;
        JTextField Text9;
        JTextField Text10;
        JTextField Text11,Text12,Text13,Text14, Text15;


        JTextField bamountf;
JPanel panel;

        JFrame frame = new JFrame("JFrame Example");



        panel = new JPanel();
        title = new JLabel("Find Electronic Devices Bills");
        title.setFont(new Font("Arial", Font.PLAIN, 25));
        title.setBounds(500,20,400, 30);

        label1 = new JLabel("Enter the electric Bills amount                =");
        label1.setBounds(50,50,1000,50);
        label1.setFont(new Font("", Font.BOLD, 17));



        label2 = new JLabel("Enter the electric unit                             =");
        label2.setBounds(50,85,1000,50);
        label2.setFont(new Font("", Font.BOLD, 17));

        label3 = new JLabel("How many fans are there                        =");
        label3.setBounds(50,120,1000,50);
        label3.setFont(new Font("", Font.BOLD, 17));

        label21 = new JLabel("How long does run in average(hours)     =");
        label21.setBounds(50,155,1000,50);
        label21.setFont(new Font("", Font.BOLD, 17));


        label4 = new JLabel("How many electric lights are there          =");
        label4.setBounds(50,190,1000,50);
        label4.setFont(new Font("", Font.BOLD, 17));

        label22 = new JLabel("How long does run in average(hours)     =");
        label22.setBounds(50,225,1000,50);
        label22.setFont(new Font("", Font.BOLD, 17));


        label5 = new JLabel("How many Air Conditioner(Ac) are there =");
        label5.setBounds(50,260,1000,50);
        label5.setFont(new Font("", Font.BOLD, 17));


        label23 = new JLabel("How long does run in average(hours)     =");
        label23.setBounds(50,295,1000,50);
        label23.setFont(new Font("", Font.BOLD, 17));

        label7 = new JLabel("Enter average Ac temperature                =");
        label7.setBounds(50,330,1000,50);
        label7.setFont(new Font("", Font.BOLD, 17));

        label8 = new JLabel("How many cooler are there                     =");
        label8.setBounds(50,365,1000,50);
        label8.setFont(new Font("", Font.BOLD, 17));

        label24 = new JLabel("How long does run in average(hours)     =");
        label24.setBounds(50,400,1000,50);
        label24.setFont(new Font("", Font.BOLD, 17));

        label9 = new JLabel("How many refrigerator                            =");
        label9.setBounds(50,435,1000,50);
        label9.setFont(new Font("", Font.BOLD, 17));


        label10 = new JLabel("Enter Area temperature                          =");
        label10.setBounds(50,470,1000,50);
        label10.setFont(new Font("", Font.BOLD, 17));

        label11 = new JLabel("");
        label11.setBounds(50,505,1000,50);
        label11.setFont(new Font("", Font.BOLD, 17));

        Text1 = new JTextField();
        Text1.setBounds(400,65,300,25);

        Text2 = new JTextField();
        Text2.setBounds(400,100,300,25);

        Text3 = new JTextField();
        Text3.setBounds(400,135,300,25);

        Text10 = new JTextField();
        Text10.setBounds(400,170,300,25);

        Text4 = new JTextField();
        Text4.setBounds(400,205,300,25);

        Text11 = new JTextField();
        Text11.setBounds(400,240,300,25);

        Text5 = new JTextField();
        Text5.setBounds(400,275,300,25);

        Text12 = new JTextField();
        Text12.setBounds(400,310,300,25);

        Text6 = new JTextField();
        Text6.setBounds(400,345,300,25);

        Text7 = new JTextField();
        Text7.setBounds(400,380,300,25);

        Text13 = new JTextField();
        Text13.setBounds(400,415,300,25);


        Text8 = new JTextField();
        Text8.setBounds(400, 450,300,25);

        Text9 = new JTextField();
        Text9.setBounds(400,485,300,25);


        Text14 = new JTextField();
        Text14.setBounds(730,475,0,25);


//        Text11 = new JTextField();
//        Text11.setBounds(730,605,600,25);


        label6 = new JLabel(" ");
        label12 =new JLabel("");
        label13 =new JLabel("");
        label14 =new JLabel("");
        label15 =new JLabel("");
        label16=new JLabel("");
        label17 =new JLabel("");
        label18 =new JLabel("");
        label19 =new JLabel("");
        label25=new JLabel("");
label30=new JLabel("");
        label26=new JLabel("");
        label27=new JLabel("");
        label28=new JLabel("");
        label29=new JLabel("");








        Text1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text1.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' ||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text1.setEditable(true);
                    label6.setText("");
                } else {
                    Text1.setEditable(false);
                    label6.setText("* Enter only numeric digits(0-9)");
                    label6.setForeground(Color.red);
                    label6.setBounds(400,82,300,25);
                    label6.setFont(new Font("Verdana", Font.PLAIN, 10));
                }
            }
        });


        Text2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text2.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text2.setEditable(true);
                    label12.setText("");
                } else {
                    Text2.setEditable(false);
                    label12.setText("* Enter only numeric digits(0-9)");
                    label12.setForeground(Color.red);
                    label12.setBounds(400,117,300,25);
                    label12.setFont(new Font("Verdana", Font.PLAIN, 10));

                }
            }
        });

        Text3.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text3.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text3.setEditable(true);
                    label13.setText("");
                } else {
                    Text3.setEditable(false);
                    label13.setText("* Enter only numeric digits(0-9)");
                    label13.setForeground(Color.red);
                    label13.setBounds(400,152,300,25);
                    label13.setFont(new Font("Verdana", Font.PLAIN, 10));


                }
            }
        });

        Text10.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text10.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text10.setEditable(true);
                    label25.setText("");
                } else {
                    Text10.setEditable(false);
                    label25.setText("* Enter only numeric digits(0-9)");
                    label25.setForeground(Color.red);
                    label25.setBounds(400,187,300,25);
                    label25.setFont(new Font("Verdana", Font.PLAIN, 10));


                }
            }
        });




        Text4.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text4.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text4.setEditable(true);
                    label14.setText("");
                } else {
                    Text4.setEditable(false);
                    label14.setText("* Enter only numeric digits(0-9)");
                    label14.setForeground(Color.red);
                    label14.setBounds(400,222,300,25);
                    label14.setFont(new Font("Verdana", Font.PLAIN, 10));

                }
            }
        });
        Text11.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text11.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text11.setEditable(true);
                    label26.setText("");
                } else {
                    Text11.setEditable(false);
                    label26.setText("* Enter only numeric digits(0-9)");
                    label26.setForeground(Color.red);
                    label26.setBounds(400,257,300,25);
                    label26.setFont(new Font("Verdana", Font.PLAIN, 10));


                }
            }
        });


        Text5.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text5.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text5.setEditable(true);
                    label15.setText("");
                } else {
                    Text5.setEditable(false);
                    label15.setText("* Enter only numeric digits(0-9)");
                    label15.setForeground(Color.red);
                    label15.setBounds(400,292,300,25);
                    label15.setFont(new Font("Verdana", Font.PLAIN, 10));

                }
            }
        });

        Text12.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text12.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text12.setEditable(true);
                    label27.setText("");
                } else {
                    Text12.setEditable(false);
                    label27.setText("* Enter only numeric digits(0-9)");
                    label27.setForeground(Color.red);
                    label27.setBounds(400,327,300,25);
                    label27.setFont(new Font("Verdana", Font.PLAIN, 10));


                }
            }
        });


        Text6.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text6.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text6.setEditable(true);
                    label16.setText("");
                } else {
                    Text6.setEditable(false);
                    label16.setText("* Enter only numeric digits(0-9)");
                    label16.setForeground(Color.red);
                    label16.setBounds(400,362,300,25);
                    label16.setFont(new Font("Verdana", Font.PLAIN, 10));

                }
            }
        });

        Text7.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text7.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text7.setEditable(true);
                    label17.setText("");
                } else {
                    Text7.setEditable(false);
                    label17.setText("* Enter only numeric digits(0-9)");
                    label17.setForeground(Color.red);
                    label17.setBounds(400,397,300,25);
                    label17.setFont(new Font("Verdana", Font.PLAIN, 10));
                }
            }
        });

        Text13.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text13.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text13.setEditable(true);
                    label28.setText("");
                } else {
                    Text13.setEditable(false);
                    label28.setText("* Enter only numeric digits(0-9)");
                    label28.setForeground(Color.red);
                    label28.setBounds(400,432,300,25);
                    label28.setFont(new Font("Verdana", Font.PLAIN, 10));


                }
            }
        });



        Text8.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text8.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text8.setEditable(true);
                    label18.setText("");
                } else {
                    Text8.setEditable(false);
                    label18.setText("* Enter only numeric digits(0-9)");
                    label18.setForeground(Color.red);
                    label18.setBounds(400,467,300,25);
                    label18.setFont(new Font("Verdana", Font.PLAIN, 10));
                }
            }
        });


        Text9.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text9.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text9.setEditable(true);
                    label19.setText("");
                } else {
                    Text9.setEditable(false);
                    label19.setText("* Enter only numeric digits(0-9)");
                    label19.setForeground(Color.red);
                    label19.setBounds(400,515,300,25);
                    label19.setFont(new Font("Verdana", Font.PLAIN, 10));
                }
            }
        });
        Text14.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text14.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text14.setEditable(true);
                    label29.setText("");
                } else {
                    Text14.setEditable(false);
                    label29.setText("* Enter only numeric digits(0-9)");
                    label29.setForeground(Color.red);
                    label29.setBounds(400,515,300,25);
                    label29.setFont(new Font("Verdana", Font.PLAIN, 10));
                }
            }
        });

        JButton jb1;
        jb1 = new JButton("Generator");
        jb1.setBounds(400, 520, 100, 30);
        JLabel lbl,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;
        lbl = new JLabel("Result:");
        lbl.setBounds(730, 60, 10000, 30);
        lbl.setFont(new Font("", Font.PLAIN, 18));

        lbl1 = new JLabel("Result:");
        lbl1.setBounds(730, 110, 10000, 30);
        lbl1.setFont(new Font("", Font.PLAIN, 18));

        lbl2 = new JLabel("Result:");
        lbl2.setBounds(730, 160, 10000, 30);
        lbl2.setFont(new Font("", Font.PLAIN, 18));

        lbl3 = new JLabel("Result:");
        lbl3.setBounds(730, 210, 10000, 30);
        lbl3.setFont(new Font("", Font.PLAIN, 18));

        lbl4 = new JLabel("Result:");
        lbl4.setBounds(730, 260, 10000, 30);
        lbl4.setFont(new Font("", Font.PLAIN, 18));

        lbl5 = new JLabel("Result:");
        lbl5.setBounds(730, 310, 10000, 30);
        lbl5.setFont(new Font("", Font.PLAIN, 18));

        lbl6 = new JLabel("Result:");
        lbl6.setBounds(730, 360, 10000, 30);
        lbl6.setFont(new Font("", Font.PLAIN, 18));


        Text9.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = Text9.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' ||ke.getKeyChar() == '.'|| ke.getKeyChar()==KeyEvent.VK_BACK_SPACE || ke.getKeyChar()==KeyEvent.VK_SPACE) {
                    Text9.setEditable(true);
                    label19.setText("");
                } else {
                    Text9.setEditable(false);
                    label19.setText("* Enter only numeric digits(0-9)");
                    label19.setForeground(Color.red);
                    label19.setBounds(730,362,600,25);
                    label19.setFont(new Font("Verdana", Font.PLAIN, 10));
                }
            }
        });



        jb1.addActionListener(e -> {
                    float bill_Amount = Float.parseFloat(Text1.getText());
            float unit = Float.parseFloat(Text2.getText());
            float fans = Float.parseFloat(Text3.getText());
            float fans_long = Float.parseFloat(Text10.getText());
            float light = Float.parseFloat(Text4.getText());
            float light_long = Float.parseFloat(Text11.getText());
            float acI = Float.parseFloat(Text5.getText());
            float ac_long = Float.parseFloat(Text12.getText());
            float ac_temp = Float.parseFloat(Text6.getText());
            float cooler = Float.parseFloat(Text7.getText());
            float cooler_long = Float.parseFloat(Text13.getText());
            float refrigerator = Float.parseFloat(Text8.getText());
                    //int refrigerator_long = Integer.parseInt(Text8.getText());
                    float area_temp = Float.parseFloat(Text9.getText());


                    float fan, fans_watt = 0.06f, Light, light_watt = 0.012f, Ac, ac_unit = 0, Cooler, cooler_watt = 0.2f,
                            refri, refri_watt = 0, total, day2 = 25, day = 30, day1 = 27, day3 = 28, day4_ac = 23;
                    // per unit charge
                    float unit_charge = bill_Amount / unit;
// fans logic
                    fan = fans * fans_long; //12*4.6=55.2
                    fan = fan * fans_watt;//55.2*0.06=3.312
                    fan = fan * day2;//3.312*25
                    fan = fan * unit_charge;//82.8*7.42=615

//Light logic
                    Light = light * light_long;
                    Light = Light * light_watt;
                    Light = Light * day;
                    Light = Light * unit_charge;
// ac logic

                    if (ac_long >= 1 && ac_long <= 1.5) {
                        if (ac_temp >= 18 && ac_temp <= 25) {
                            ac_unit = 1.7f;
                        } else if (ac_temp == 26) {
                            ac_unit = 1.5f;
                        } else if (ac_temp == 27) {
                            ac_unit = 1f;
                        } else if (ac_temp == 28) {
                            ac_unit = 0.8f;
                        } else if (ac_temp == 29 || ac_temp == 30) {
                            ac_unit = 0.5f;
                        } else {
                            ac_unit = 0f;
                        }
                    } else if (ac_long >= 1.6 && ac_long <= 3) {
                        if (ac_temp >= 18 && ac_temp <= 22) {
                            ac_unit = 2.8f;
                        } else if (ac_temp >= 23 && ac_temp <= 25) {
                            ac_unit = 2.5f;
                        } else if (ac_temp == 26) {
                            ac_unit = 2.2f;
                        } else if (ac_temp == 27) {
                            ac_unit = 2f;
                        } else if (ac_temp == 28) {
                            ac_unit = 1.7f;
                        } else if (ac_temp == 29 || ac_temp == 30) {
                            ac_unit = 1f;
                        } else {
                            ac_unit = 0f;
                        }
                    } else if (ac_long > 3.1 && ac_long <= 4) {
                        if (ac_temp >= 18 && ac_temp <= 22) {
                            ac_unit = 3.5f;
                        } else if (ac_temp >= 23 && ac_temp <= 25) {
                            ac_unit = 3f;
                        } else if (ac_temp == 26) {
                            ac_unit = 2.5f;
                        } else if (ac_temp == 27) {
                            ac_unit = 2.2f;
                        } else if (ac_temp == 28) {
                            ac_unit = 1.9f;
                        } else if (ac_temp == 29 || ac_temp == 30) {
                            ac_unit = 1.4f;
                        } else {
                            ac_unit = 0f;
                        }
                    } else if (ac_long >= 4.1 && ac_long <= 5) {
                        if (ac_temp >= 18 && ac_temp <= 22) {
                            ac_unit = 4f;
                        } else if (ac_temp >= 23 && ac_temp <= 25) {
                            ac_unit = 3.7f;
                        } else if (ac_temp == 26) {
                            ac_unit = 3f;
                        } else if (ac_temp == 27) {
                            ac_unit = 2.5f;
                        } else if (ac_temp == 28) {
                            ac_unit = 2.1f;
                        } else if (ac_temp == 29 || ac_temp == 30) {
                            ac_unit = 1.7f;
                        } else {
                            ac_unit = 0f;
                        }
                    } else if (ac_long >= 5.1 && ac_long <= 7) {
                        if (ac_temp >= 18 && ac_temp <= 22) {
                            ac_unit = 5.5f;
                        } else if (ac_temp >= 23 && ac_temp <= 25) {
                            ac_unit = 4.7f;
                        } else if (ac_temp == 26) {
                            ac_unit = 4f;
                        } else if (ac_temp == 27) {
                            ac_unit = 3.5f;
                        } else if (ac_temp == 28) {
                            ac_unit = 2.7f;
                        } else if (ac_temp == 29 || ac_temp == 30) {
                            ac_unit = 2.1f;
                        } else {
                            ac_unit = 0f;
                        }
                    } else if (ac_long >= 7.1 && ac_long <= 10) {
                        if (ac_temp >= 18 && ac_temp <= 22) {
                            ac_unit = 8f;
                        } else if (ac_temp >= 23 && ac_temp <= 25) {
                            ac_unit = 7f;
                        } else if (ac_temp == 26) {
                            ac_unit = 6f;
                        } else if (ac_temp == 27) {
                            ac_unit = 4.5f;
                        } else if (ac_temp == 28) {
                            ac_unit = 3.2f;
                        } else if (ac_temp == 29 || ac_temp == 30) {
                            ac_unit = 2.8f;
                        } else {
                            ac_unit = 0f;
                        }
                    } else if (ac_long >= 10.1 && ac_long <= 15) {
                        if (ac_temp >= 18 && ac_temp <= 22) {
                            ac_unit = 12f;
                        } else if (ac_temp >= 23 && ac_temp <= 25) {
                            ac_unit = 9f;
                        } else if (ac_temp == 26) {
                            ac_unit = 7.5f;
                        } else if (ac_temp == 27) {
                            ac_unit = 6f;
                        } else if (ac_temp == 28) {
                            ac_unit = 4.7f;
                        } else if (ac_temp == 29 || ac_temp == 30) {
                            ac_unit = 3.7f;
                        } else {
                            ac_unit = 0f;
                        }
                    } else if (ac_long >= 15.1 && ac_long <= 20) {
                        if (ac_temp >= 18 && ac_temp <= 22) {
                            ac_unit = 15f;
                        } else if (ac_temp >= 23 && ac_temp <= 25) {
                            ac_unit = 12f;
                        } else if (ac_temp == 26) {
                            ac_unit = 9.5f;
                        } else if (ac_temp == 27) {
                            ac_unit = 8f;
                        } else if (ac_temp == 28) {
                            ac_unit = 6.7f;
                        } else if (ac_temp == 29 || ac_temp == 30) {
                            ac_unit = 5f;
                        } else {
                            ac_unit = 0f;
                        }
                    } else if (ac_long >= 20.1 && ac_long <= 24) {
                        if (ac_temp >= 18 && ac_temp <= 22) {
                            ac_unit = 15f;
                        } else if (ac_temp >= 23 && ac_temp <= 25) {
                            ac_unit = 12f;
                        } else if (ac_temp == 26) {
                            ac_unit = 9.5f;
                        } else if (ac_temp == 27) {
                            ac_unit = 8f;
                        } else if (ac_temp == 28) {
                            ac_unit = 6.7f;
                        } else if (ac_temp == 29 || ac_temp == 30) {
                            ac_unit = 5f;
                        } else {
                            ac_unit = 0f;
                        }
                    } else {
                        ac_unit = 0;
                    }

                    Ac = acI * ac_unit;
                    Ac = Ac * day4_ac;
                    Ac = Ac * unit_charge;

                    //cooler logic
                    Cooler = cooler * cooler_long;
                    Cooler = Cooler * cooler_watt;
                    Cooler = Cooler * day1;
                    Cooler = Cooler * unit_charge;
                    //refrigerator logic
                    if (area_temp >= -10 && area_temp <= 0) {
                        refri_watt = 0.015f;
                    } else if (area_temp >= 1 && area_temp <= 5) {
                        refri_watt = 0.030f;
                    } else if (area_temp >= 6 && area_temp <= 10) {
                        refri_watt = 0.040f;
                    } else if (area_temp >= 10 && area_temp <= 15) {
                        refri_watt = 0.045f;
                    } else if (area_temp >= 16 && area_temp <= 20) {
                        refri_watt = 0.050f;
                    } else if (area_temp >= 21 && area_temp <= 25) {
                        refri_watt = 0.070f;
                    } else if (area_temp >= 26 && area_temp < 30) {
                        refri_watt = 0.080f;
                    } else if (area_temp >= 31 && area_temp <= 35) {
                        refri_watt = 0.095f;
                    } else if (area_temp >= 36 && area_temp <= 40) {
                        refri_watt = 0.107f;
                    } else if (area_temp >= 41 && area_temp <= 45) {
                        refri_watt = 0.118f;
                    } else if (area_temp >= 46 && area_temp <= 50) {
                        refri_watt = 0.125f;
                    } else if (area_temp == 0) {
                        refri_watt = 0f;
                    } else {
                        System.out.println("Enter Refrigerator temperature very high in this condition refrigerator can not survive");
                    }

                    refri = refrigerator * 24;
                    refri = refri * refri_watt;
                    refri = refri * day3;
                    refri = refri * unit_charge;




                    total = 0;
                    if (e.getSource().equals(jb1)) {
                        float a = fan;
                        float b = Light;
                        float c = Ac;
                        float d = Cooler;
                        float e1 = refri;
                        total = fan + Light + Ac + Cooler + refri;

                        lbl.setText("fans bills                                                                                       =" + a);
                        lbl1.setText("Light bills                                                                                      =" + b);
                        lbl2.setText("Ac bills                                                                                          =" + c);
                        lbl3.setText("Cooler bills                                                                                    =" + d);
                        lbl4.setText("Refrigerator bills                                                                           =" + e1);
                        lbl5.setText("Approximately Total bills amount depend on enter all the details ="+total);

                    }
                    });

            frame.add(jb1);
            frame.add(lbl);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(lbl4);
        frame.add(lbl5);
        //frame.add(lbl6);




            panel.add(title);
            panel.add(label1);
            frame.add(title);
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label21);
            frame.add(label4);
            frame.add(label22);
            frame.add(label5);

            frame.add(label23);
            frame.add(label7);
            frame.add(label8);
            frame.add(label24);
            frame.add(label9);
            frame.add(label10);
            frame.add(label11);


            frame.add(Text1);
            frame.add(Text2);
            frame.add(Text3);
            frame.add(Text4);
            frame.add(Text5);
            frame.add(Text6);
            frame.add(Text7);
            frame.add(Text8);
            frame.add(Text9);
            frame.add(Text10);
            frame.add(Text11);
            frame.add(Text12);
            frame.add(Text13);
            frame.add(Text14);
            //frame.add(Text15);


            frame.add(label6);

            frame.add(label12);
            frame.add(label13);
            frame.add(label14);
            frame.add(label15);
            frame.add(label16);
            frame.add(label17);
            frame.add(label18);
            frame.add(label19);
            // frame.add(label20);
        //frame.add(tout);


            frame.setSize(1372, 726);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setVisible(true);


        }
    }




