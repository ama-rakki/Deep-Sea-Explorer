package main;

//import java.awt.event.KeyEvent;

import event.event01;

public class GameManager{
	actionhandle aHandler = new actionhandle(this);
	
    public UI ui = new UI(this);
    public scenechanger schanger = new scenechanger(this);
    public event01 ev1 = new event01(this);
    
    public static void main(String[] args){
        new GameManager();
    }
    public GameManager(){
    	
    	//schanger.showScreen1();
    	//schanger.showScreen3();
    	//schanger.showScreen2();
    	//schanger.showScreen3();
    }
    
    
 }
    	
 

