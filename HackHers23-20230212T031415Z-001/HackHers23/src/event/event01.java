package event;

import main.GameManager;

public class event01 {

	GameManager gm; 
	
	public event01(GameManager gm) {
		this.gm = gm; 
	}
	public void option1() {
		gm.ui.messageText.setText("Elasmosaurus is a genus of plesiosaur that lived in North America during the Campanian stage of the Late Cretaceous period, about 80.5 million years ago.");
	}
	public void option2() {
		gm.ui.messageText.setText("Elasmosaurus: 'The water you drink today probably has some of my piss in it. Thats just how the water cycle works!'");
	}
	public void option3() {
		gm.ui.messageText.setText("Symphysodon, known as discus, is a genus of cichlids native to the Amazon river basin.");
	}
	public void option4() {
		gm.ui.messageText.setText("Discus: 'I'm actually a freshwater fish, so whatever idiot programmer coded me here doesn't know I will die in this saltwater'");
	}
	public void option5(){
		gm.ui.messageText.setText("octopus, plural octopuses or octopi, in general, any eight-armed cephalopod (octopod) mollusk of the order Octopoda.");
	}
	public void option6() {
		gm.ui.messageText.setText("160,000 tons of octopi are eaten in Japan every year!" +" \n"+ "Nihon wa nenkan 160 man-ton no tako o shōhi shite imasu!");
	}
	public void option7() {
		gm.ui.messageText.setText("Wait a second! This is the sunken ship of the Titanic! What are you doing here!");
	}
	public void option8() {
		gm.ui.messageText.setText("There are no fun facts about the Titanic. It was a tragedy.");
	}
	public void option9() {
		gm.ui.messageText.setText("A seahorse is any small marine fish in the genus Hippocampus. 'Hippocampus' Greek for 'horse' and kámpos meaning 'sea monster' or 'sea animal'.");
	}
	public void option10() {
		gm.ui.messageText.setText("The seahorse is a devout feminist and takes over certain terms of pregnancy so the wife can have a life too.");
	}
	public void option11() {
		gm.ui.messageText.setText("Jellyfish and sea jellies are the common names given to the medusa-phase of certain gelatinous members of the subphylum Medusozoa, a major part of the phylum Cnidaria.");
	}
	public void option12() {
		gm.ui.messageText.setText("You actually dont have to use urine as a method to treat jellyfish stings. I mean you COULD and it is RECOMMENDED but no one will FORCE you to. Gross");
	}
	public void option13() {
		gm.ui.messageText.setText("Based on fossils, scientists believe sharks have been around more than 400 million years—long before the dinosaurs. Sharks have evolved into roughly 500 species ");
	}
	public void option14() {
		gm.ui.messageText.setText("On December 20, 2020, Steven Speilberg the director of Jaws said: “I truly, and to this day, regret the decimation of the shark population because of the book and the film.”");
	}
}
