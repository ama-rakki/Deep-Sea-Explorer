package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionhandle implements ActionListener{
	GameManager gm;
	
	public actionhandle(GameManager gm) {
		this.gm = gm;
	}
	public void actionPerformed(ActionEvent e) {
		//make a choice 
		String yourChoice = e.getActionCommand();
		switch(yourChoice) {
		case "option1" : gm.ev1.option1();  break; 
		case "option2" : gm.ev1.option2(); break; 
		case "option3" : gm.ev1.option3();  break; 
		case "option4" : gm.ev1.option4(); break; 
		case "option5" : gm.ev1.option5(); break;
		case "option6" : gm.ev1.option6(); break;
		case "option7" : gm.ev1.option7(); break;
		case "option8" : gm.ev1.option8(); break;
		case "option9" : gm.ev1.option9(); break;
		case "option10" : gm.ev1.option10(); break;
		case "option11" : gm.ev1.option11(); break;
		case "option12" : gm.ev1.option12(); break;
		case "option13" : gm.ev1.option13(); break;
		case "option14" : gm.ev1.option14(); break;

		//change scene
		case "goscene1" : gm.schanger.showScreen1(); break;
		case "goscene2" : gm.schanger.showScreen2(); break;
		case "goscene3" : gm.schanger.showScreen3(); break;
		case "goscene4" : gm.schanger.showScreen4(); break;
		case "goscene5" : gm.schanger.showScreen5(); break;
		case "goscene6" : gm.schanger.showScreen6(); break;
		case "goscene7" : gm.schanger.showScreen7(); break;
		case "goscene8" : gm.schanger.showScreen8(); break;
		//case "goscene9" : gm.schanger.showScreen9(); break;
		//case "goscene10" : gm.schanger.showScreen10(); break;
		
		}
	}
	
	
	
}
