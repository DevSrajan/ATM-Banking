package app;
import app.screen.Progress;
import app.screen.screenscreen;
public class ATM_Mgmt_System {
    /**
     * @param args the  command line arguments
     */
    public static void main(String[] args) {
         Progress Splash=new Progress();
    
              Splash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(25);
                Splash.load.setText(Integer.toString(i)+"%");
                Splash.loadbar.setValue(i);
                
           }
            Thread.sleep(500);
           Splash.setVisible(false); 
        } catch (Exception e) {
        }  
        new Home().setVisible(true);
 
    }
    
}
