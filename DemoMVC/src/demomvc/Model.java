/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomvc;

import java.util.Observable;

/**
 *
 * @author Nhuan
 */
public class Model extends Observable {
    private int counter = 0;
    private int id = 1;
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
        System.out.println("Model init: counter = "+this.counter);
        setChanged();
        notifyObservers();
    }
    public void incrementalValue()
    {
        ++counter;
        System.out.println("Model: counter = "+counter);
        setChanged();
        notifyObservers();
        
    }
    
}
