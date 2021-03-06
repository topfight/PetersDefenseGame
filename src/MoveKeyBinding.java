import java.awt.event.KeyEvent;

import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class MoveKeyBinding {
	static InputMap im ;
    static ActionMap am ;
    
    
    public static void keyBind(GamePanel p){
    	im = p.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        am = p.getActionMap();
        
    	im.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "RightArrow");
    	im.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "LeftArrow");
    	im.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "UpArrow");
    	im.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "DownArrow");
    	im.put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0), "WKey");
    	im.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0), "AKey");
    	im.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), "SKey");
    	im.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), "DKey");
    	
    	
        am.put("RightArrow", new MovingComponent("RightArrow"));
        am.put("LeftArrow", new MovingComponent("LeftArrow"));
        am.put("UpArrow", new MovingComponent("UpArrow"));
        am.put("DownArrow", new MovingComponent("DownArrow"));
        am.put("WKey", new MovingComponent("WKey"));
        am.put("AKey", new MovingComponent("AKey"));
        am.put("SKey", new MovingComponent("SKey"));
        am.put("DKey", new MovingComponent("DKey"));
    	
    	
    }
    
}