package main;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UI {
    GameManager gm;
    JFrame window;

    public JTextArea messageText; 

    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];


    public UI(GameManager gm){
        this.gm = gm; 

        createMainFeild();
        
        generateScreen();
        window.setVisible(true);

    }
    public void createMainFeild(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.darkGray);
        window.setLayout(null);

        messageText = new JTextArea("welcome to the deep blue, aka the ocean, aka most of Earth. Click on the animals above to learn more about them!");
        messageText.setBounds(50,500,700,50);
        messageText.setBackground(Color.blue);
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("arial", Font.PLAIN, 18));
        window.add(messageText);
    }
    public void createBackground(int bgNum, String bgFilename){
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50,50,700,500);
        bgPanel[bgNum].setBackground(Color.red);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[bgNum]);

        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0,700,500);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFilename));
        
        bgLabel[bgNum].setIcon(bgIcon);
        
        
    }
    public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String objFilename,
    		String choice1, String choice2, String choice1command, String choice2command) {
    	//creates pop menu
    	JPopupMenu popMenu = new JPopupMenu();
    	//creates pop menu items 
    	JMenuItem menuItem[] = new JMenuItem[3];
    	menuItem[1] = new JMenuItem(choice1);
    	menuItem[1].addActionListener(gm.aHandler);
    	menuItem[1].setActionCommand(choice1command);
    	popMenu.add(menuItem[1]);
    	
    	menuItem[2] = new JMenuItem(choice2);
    	menuItem[2].addActionListener(gm.aHandler);
    	menuItem[2].setActionCommand(choice2command);
    	popMenu.add(menuItem[2]);
    	
    	JLabel objectLabel = new JLabel();
    	//objectLabel.setBounds(objx,objy,objWidth,objHeight);
		objectLabel.setBounds(objx, objy, objWidth, objHeight);
    	
    	ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFilename));
    	objectLabel.setIcon(objectIcon);
    	
    	objectLabel.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				if(SwingUtilities.isLeftMouseButton(e)){
					popMenu.show(objectLabel, e.getX(), e.getY());
				}
			}
			public void mousePressed(MouseEvent e) {
				/*if(SwingUtilities.isRightMouseButton(e)) {
					popMenu.show(objectLabel, e.getX(),e.getY());
	
				}*/
			}
			public void mouseReleased(MouseEvent e) {	
			}
			public void mouseEntered(MouseEvent e) {	
			}
			public void mouseExited(MouseEvent e) {
				
			}
    		
    	});
    	
    	bgPanel[bgNum].add(objectLabel);
    	

    }
    public void createArrowButton(int bgNum, int x, int y, int width, int height, String arrowFileName, String command){
    	ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource(arrowFileName));
    	
    	JButton arrowButton = new JButton();
    	arrowButton.setBounds(x,y,width,height);
    	arrowButton.setBackground(null);
    	arrowButton.setContentAreaFilled(false);
    	arrowButton.setFocusPainted(false);
    	arrowButton.setIcon(arrowIcon);
    	arrowButton.addActionListener(gm.aHandler);
    	arrowButton.setActionCommand(command);
    	arrowButton.setBorderPainted(false);
    	
    	bgPanel[bgNum].add(arrowButton);
	
    }
    public void generateScreen() {
    	//screen 1
    	createBackground(1,"ocean.jpg");
		//createObject(1, 100, 100, 700, 300, "elasmosaurus.png", "bio", "fun fact", "option1", "option2");
    	createObject(1, 600, 250, 200, 200, "download-removebg-preview.png", "bio", "fun fact", "option3", "option4");
		createObject(1, 200, 250, 300, 300, "octopus.png", "bio", "fun fact", "option5", "option6");
		createObject(1, 200, 100, 400, 100, "titanic.png", "bio", "fun fact", "option7"  , "option8");
		createObject(1, 100, 30, 100, 200, "seahorse.png", "bio", "fun fact", "option9", "option10");
		createObject(1, 399, 210, 400, 100, "jellyfish.png", "bio", "fun fact", "option11", "option12");
		createObject(1, 50, 120, 300, 400, "shark.png", "bio", "fun fact", "option13", "option14");
		//createObject(1,10,10,700,500,"png-woman-doctor-transparent-woman-doctor-images-40.png","talk","question", "option1", "option2");  
		//createArrowButton(1,650,150,50,50, "transparentarrow.png", "goscene2");
    	bgPanel[1].add(bgLabel[1]);



    	/* 
    	//screen 2 
    	createBackground(2,"babyroom.jpg");
    	createObject(2,10,50,800,800,"crib.png","sleep","stay awake", "option3", "option4");
    	createArrowButton(2,650,150,50,50, "transparentarrow.png", "goscene3");
    	createArrowButton(2,1,150,50,50, "transparentarrowleft.png", "goscene1");
    	bgPanel[2].add(bgLabel[2]);

    	//screen3
    	createBackground(3,"babyroom.jpg");
    	createArrowButton(3,650,150,50,50, "transparentarrow.png", "goscene4");
    	createArrowButton(3,1,150,50,50, "transparentarrowleft.png", "goscene2");
    	bgPanel[3].add(bgLabel[3]);
    	
    	//screen4
    	createBackground(4,"babyroom.jpg");
    	createArrowButton(4,650,150,50,50, "transparentarrow.png", "goscene5");
    	createArrowButton(4,1,150,50,50, "transparentarrowleft.png", "goscene3");
    	bgPanel[4].add(bgLabel[4]);
*/
    }
   
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}