import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button add, subtract, multiply, divide, clear;

    public void init() {
        // Create and add components
        Label label1 = new Label("Number 1:");
        num1 = new TextField(10);
        Label label2 = new Label("Number 2:");
        num2 = new TextField(10);
        Label label3 = new Label("Result:");
        result = new TextField(10);
        //result.setEditable(false); // Result field should not be editable

        add = new Button("Add");
        subtract = new Button("Subtract");
        multiply = new Button("Multiply");
        divide = new Button("Divide");
        clear = new Button("Clear");

        // Add components to the applet
        add(label1);
        add(num1);
        add(label2);
        add(num2);
        add(label3);
        add(result);
        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(clear);

        // Register action listeners
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) { 
        String command = ae.getActionCommand();
        try {
            // Parse input numbers
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double res = 0;

            // Perform operation based on button clicked
            if (command.equals("Add")) {
                res = n1 + n2;
            } else if (command.equals("Subtract")) {
                res = n1 - n2;
            } else if (command.equals("Multiply")) {
                res = n1 * n2;
            } else if (command.equals("Divide")) {
                if (n2 != 0) {
                    res = n1 / n2;
                } else {
                    result.setText("Error: Divide by 0");
                    return;
                }
            } else if (command.equals("Clear")) {
                num1.setText("");
                num2.setText("");
                result.setText("");
                return;
            }

            // Display result
            result.setText(String.valueOf(res));
        } catch (NumberFormatException e) {
            result.setText("Invalid Input");
        }
    }
}

/*
<html>
<body>
<applet code="CalculatorApplet.class" width="400" height="300">
</applet>
</body>
</html>
*/