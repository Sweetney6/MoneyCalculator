/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator;

import control.CalculateCommand;
import persistence.CurrencyListLoader;
import persistence.ExchangeRateLoader;
import persistence.FileCurrencyListLoader;
import persistence.RestExchangeRateLoader;

/**
 *
 * @author Usuario
 */
public class Moneycalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CurrencyListLoader currencyLoader = new FileCurrencyListLoader("currencies");
        ExchangeRateLoader exchangeRateLoader = new RestExchangeRateLoader();
        MainFrame mainFrame = new MainFrame(currencyLoader.currencies());
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDialog(), mainFrame.getMoneyDisplay(), exchangeRateLoader));
    }
    
}
