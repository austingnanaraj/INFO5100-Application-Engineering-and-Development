/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stock;

import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class StockDirectory {

    ArrayList<Stock> stockDirectory;

    public StockDirectory() {
        stockDirectory = new ArrayList<>();
    }

    public ArrayList<Stock> getStockDirectory() {
        return stockDirectory;
    }

    public void setStockDirectory(ArrayList<Stock> stockDirectory) {
        this.stockDirectory = stockDirectory;
    }

    public Stock addStock() {
        Stock s = new Stock();
        stockDirectory.add(s);
        return s;
    }

    public void removeStock(Stock s) {
        stockDirectory.remove(s);
    }
}
