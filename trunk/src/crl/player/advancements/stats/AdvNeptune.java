package crl.player.advancements.stats;

import crl.player.Player;
import crl.player.advancements.Advancement;

public class AdvNeptune extends Advancement{
	public String getName(){
		return "Neptune Spirit";
	}
	
	public String[] getRequirements() {
		return NO_REQUIREMENTS;
	}
	
	private int getIncrement(Player p){
		int increment = 3;
		if (p.getPlayerLevel() > 40)
			increment = 11;
		else if (p.getPlayerLevel() > 30)
			increment = 9;
		else if (p.getPlayerLevel() > 20)
			increment = 7;
		else if (p.getPlayerLevel() > 10)
			increment = 5;
		return increment;
	}
	
	public void advance(Player p) {
		p.setCarryMax(p.getCarryMax()+getIncrement(p));
		p.addLastIncrement(Player.INCREMENT_CARRYING,getIncrement(p));
	}

	public String getID() {
		return "ADV_NEPTUNE";
	}

	public String getDescription(){
		return "Increases Carrying Capacity";
	}
}
