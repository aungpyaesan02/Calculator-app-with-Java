package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calcul {

  private JFrame frame;
  private JTextField textField;

  double first;
  double second;
  double result;
  String operation;
  String answer;
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          calcul window = new calcul();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public calcul() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 288, 441);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    textField = new JTextField();
    textField.setBounds(12, 25, 250, 54);
    frame.getContentPane().add(textField);
    textField.setColumns(10);
    
    JButton btn0 = new JButton("0");
    btn0.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
              String number = textField.getText() + btn0.getText();
              textField.setText(number);
      }
    });
    btn0.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn0.setBounds(12, 338, 62, 54);
    frame.getContentPane().add(btn0);
    
    JButton btnDot = new JButton(".");
    btnDot.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
              String number = textField.getText() + btnDot.getText();
              textField.setText(number);
      }
    });
    btnDot.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btnDot.setBounds(74, 338, 62, 54);
    frame.getContentPane().add(btnDot);
    
    JButton btnEqual = new JButton("=");
    btnEqual.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                    String answer;
                    second = Double.parseDouble(textField.getText());
                    switch(operation) {
                         case "+":
                              result = first + second;
                              answer = String.format("%.2f", result);
                              textField.setText(answer);
                              break;
                              
                          case "-":
                              result = first - second;
                              answer = String.format("%.2f", result);
                              textField.setText(answer);
                              break;
                              
                          case "*":
                            result = first * second;
                            answer = String.format("%.2f", result);
                            textField.setText(answer);
                            break;
                            
                          case "/":
                            result = first / second;
                            answer = String.format("%.2f", result);
                            textField.setText(answer);
                            
                          case "%":
                            result = first % second;
                            answer = String.format("%.2f", result);
                            textField.setText(answer);
                      
                    }
      }
    });
    btnEqual.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btnEqual.setBounds(137, 338, 62, 54);
    frame.getContentPane().add(btnEqual);
    
    JButton btn1 = new JButton("1");
    btn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                      String  number = textField.getText() + btn1.getText();
                      textField.setText(number);
      }
    });
    btn1.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn1.setBounds(12, 283, 62, 54);
    frame.getContentPane().add(btn1);
    
    JButton btn2 = new JButton("2");
    btn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                   String number = textField.getText() + btn2.getText();
                   textField.setText(number);
      }
    });
    btn2.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn2.setBounds(74, 283, 62, 54);
    frame.getContentPane().add(btn2);
    
    JButton btn3 = new JButton("3");
    btn3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                      String number = textField.getText() + btn3.getText();
                       textField.setText(number);
      }
    });
    btn3.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn3.setBounds(137, 283, 62, 54);
    frame.getContentPane().add(btn3);
    
    JButton btn4 = new JButton("4");
    btn4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                  String number = textField.getText() + btn4.getText();
                  textField.setText(number);
      }
    });
    btn4.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn4.setBounds(12, 226, 62, 54);
    frame.getContentPane().add(btn4);
    
    JButton btn5 = new JButton("5");
    btn5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                  String number = textField.getText() + btn5.getText();
                   textField.setText(number);
      }
    });
    btn5.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn5.setBounds(74, 226, 62, 54);
    frame.getContentPane().add(btn5);
    
    JButton btn6 = new JButton("6");
    btn6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                 String number = textField.getText() + btn6.getText();
                 textField.setText(number);
      }
    });
    btn6.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn6.setBounds(137, 226, 62, 54);
    frame.getContentPane().add(btn6);
    
    JButton btn7 = new JButton("7");
    btn7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btn7.getText();
                textField.setText(number);
      }
    });
    btn7.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn7.setBounds(12, 171, 62, 54);
    frame.getContentPane().add(btn7);
    
    JButton btn8 = new JButton("8");
    btn8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                    String number = textField.getText() + btn8.getText();
                    textField.setText(number); 
      }
    });
    btn8.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn8.setBounds(74, 171, 62, 54);
    frame.getContentPane().add(btn8);
    
    JButton btn9 = new JButton("9");
    btn9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                    String number = textField.getText() + btn9.getText();
                    textField.setText(number);
      }
    });
    btn9.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn9.setBounds(137, 171, 62, 54);
    frame.getContentPane().add(btn9);
    
    JButton btnBack = new JButton("B");
    btnBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                String backSpace = null;
                if(textField.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(textField.getText());
                    str.deleteCharAt(textField.getText().length() - 1);
                    backSpace = str.toString();
                    textField.setText(backSpace);
                }
      }
    });
    btnBack.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btnBack.setBounds(12, 117, 62, 54);
    frame.getContentPane().add(btnBack);
    
    JButton btnClear = new JButton("C");
    btnClear.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                  textField.setText(null);
      }
    });
    btnClear.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btnClear.setBounds(74, 117, 62, 54);
    frame.getContentPane().add(btnClear);
    
    JButton btn00 = new JButton("00");
    btn00.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btn00.getText();
                textField.setText(number);
      }
    });
    btn00.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btn00.setBounds(137, 117, 62, 54);
    frame.getContentPane().add(btn00);
    
    JButton btnPlus = new JButton("+");
    btnPlus.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "+";
      }
    });
    btnPlus.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btnPlus.setBounds(200, 117, 62, 54);
    frame.getContentPane().add(btnPlus);
    
    JButton btnSub = new JButton("-");
    btnSub.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
              first = Double.parseDouble(textField.getText());
              textField.setText("");
              operation = "-";
      }
    });
    btnSub.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btnSub.setBounds(200, 171, 62, 54);
    frame.getContentPane().add(btnSub);
    
    JButton btnMulti = new JButton("*");
    btnMulti.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "*";
      }
    });
    btnMulti.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btnMulti.setBounds(200, 226, 62, 54);
    frame.getContentPane().add(btnMulti);
    
    JButton btnDiv = new JButton("/");
    btnDiv.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "/";
      }
    });
    btnDiv.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btnDiv.setBounds(200, 283, 62, 54);
    frame.getContentPane().add(btnDiv);
    
    JButton btnPercent = new JButton("%");
    btnPercent.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
              first = Double.parseDouble(textField.getText());
              textField.setText("");
              operation = "%";
      }
    });
    btnPercent.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
    btnPercent.setBounds(200, 338, 62, 54);
    frame.getContentPane().add(btnPercent);
  }
}
