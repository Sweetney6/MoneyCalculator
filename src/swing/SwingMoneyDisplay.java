/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import model.Money;
import view.MoneyDisplay;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Usuario
 */
public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {

    private Money money;

    @Override
    public void display(Money money) {
        this.money = money;
        this.removeAll();
        this.add(amount());
        this.add(currency());
        this.updateUI();
    }

    private Component currency() {
        return new JLabel(String.valueOf(money.getAmount()));
    }

    private Component amount() {
        return new JLabel(String.valueOf(money.getCurrency().getCode()));
    }
}