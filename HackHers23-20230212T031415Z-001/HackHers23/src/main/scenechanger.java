package main;

public class scenechanger {
	GameManager gm;
	public scenechanger(GameManager gm) {
		
		this.gm = gm; 	
	}
	public void showScreen1() {
		
		gm.ui.bgPanel[1].setVisible(true);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.messageText.setText("continue in life");
	}
	public void showScreen2() {
		
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.messageText.setText("2");
	}
	public void showScreen3() {
		gm.ui.bgPanel[3].setVisible(true);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.messageText.setText("3");
	}
	public void showScreen4() {
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(true);
		gm.ui.messageText.setText("4");
	}
	public void showScreen5() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.messageText.setText("5");
	}
	public void showScreen6() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.messageText.setText("6");
	}
	public void showScreen7() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.messageText.setText("7");
	}
	public void showScreen8() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.messageText.setText("8");
	}
	
}
