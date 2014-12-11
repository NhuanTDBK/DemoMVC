/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomvc;

/**
 *
 * @author Nhuan
 */
public class DemoMVC {

    /**
     */
    public DemoMVC()
    {
        Model model = new Model();
        View view = new View();
        
        model.addObserver(view);
        Controller controller = new Controller();
        controller.addModel(model);
        //controller.addView(view);
        controller.initModel(10);
        
        view.addController(controller);
        view.setText(model.getCounter());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //DemoMVC main = new DemoMVC();
       Integer t = new Integer(1);
       Integer s = t;
        System.out.println("t = "+s);
    }
    
}
