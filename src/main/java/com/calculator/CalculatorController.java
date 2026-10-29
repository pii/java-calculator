package com.calculator;


import com.calculator.operations.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Panagiotis (pii@hotmail.gr)
 * Discord: @nothappy
 * 10/29/2026 / 2:25 PM
 * java-calculator / com.calculator
 */


public class CalculatorController {

    @FXML
    private TextField textField;
    @FXML
    private ListView<String> list;

    private final Map<String, Operation> operations = new HashMap<>();

    private String input = "";
    private Double stored = null;
    private Operation pending = null;
    private boolean justEvaluated = false;

    public CalculatorController() {
        for (Operation op : List.of(
                new Plus(),
                new Subtraction(),
                new Multiplication(),
                new Division(),
                new Power())
        ) {
            operations.put(op.symbol(), op);
        }
    }

    @FXML
    private void initialize() {
        updateDisplay();
    }

    @FXML
    private void onButton(ActionEvent event) {
        String key = ((Button) event.getSource()).getText();

        if (key.matches("[0-9]")) {
            digit(key);
        } else if (key.equals(".")) {
            dot();
        } else if (key.equals("C")) {
            clear();
        } else if (key.equals("=")) {
            // calculate function
        } else if (operations.containsKey(key)) {
            // operator function
        }
    }

    private void digit(String d) {
        if (justEvaluated) {
            clear();
        }
        input = input.equals("0") ? d : input + d;
        updateDisplay();
    }

    private void dot() {
        if (justEvaluated) {
            clear();
        }
        if (!input.contains(".")) {
            input = (input.isEmpty() ? "0" : input) + ".";
        }
        updateDisplay();
    }

    private void clear() {
        input = "";
        stored = null;
        pending = null;
        justEvaluated = false;
        updateDisplay();
    }

    private void updateDisplay() {
        StringBuilder sb = new StringBuilder();
        if (stored != null) {
            sb.append(format(stored));
        }
        if (pending != null) {
            sb.append(' ').append(pending.symbol()).append(' ');
        }
        sb.append(input);
        textField.setText(sb.isEmpty() ? "0" : sb.toString());
    }

    private static String format(double v) {
        return BigDecimal.valueOf(v).stripTrailingZeros().toPlainString();
    }

}
