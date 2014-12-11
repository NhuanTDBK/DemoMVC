/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Nhuan
 */
public class Controller  implements ActionListener,ChangeListener{

    Model model;
    View view;
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Controller: The " + e.getActionCommand()+"butoon is click"+"with e param string"+e.paramString());
        if("jButton1".equals(e.getActionCommand()))
            model.incrementalValue();
        else
        {
            JSlider s = (JSlider)view.getComponent(e.getActionCommand());
            int value = s.getValue();
            
        }
    }
    public void addModel(Model m)
    {
        this.model = m;
        
    }
    public void addView(View v)
    {
        this.view = v;
    }
    public void initModel(int x)
    {
        model.setCounter(x);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        JSlider slider = (JSlider)e.getSource();
        model.setCounter(slider.getValue());
    }
}
