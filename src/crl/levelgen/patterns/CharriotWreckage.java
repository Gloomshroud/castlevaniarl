package crl.levelgen.patterns;

import crl.cuts.Unleasher;
import crl.cuts.intro.Intro1;
import crl.cuts.intro.Intro2;
import crl.cuts.intro.Intro3;

public class CharriotWreckage extends StaticPattern{
	public String getMapKey(){
		return "FOREST";
	}
	
	public String getDescription() {
		return "Dark Forest";
	}

	public String getMusicKeyMorning() {
		return "";
	}

	public String getMusicKeyNoon() {
		return null;
	}

	public CharriotWreckage(){
		this.cellMap = new String [][]{{
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&F&&&&&&&&&&&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&.....+..&&&&&&&&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&...............&&&&&&&&&&&&&&",
			"&&&&&&&&...........&&&&&&&&......&&............&&&&&&&&&&&",
			"&&&&&&..........&&&&&&&.......&&&&&&&............&&&&&&&&&",
			"&&&&&&.....&&&&&&&&&&&&...........&...........&&..&&&&&&&&",
			"&&&&&...%.....&&&...&&.........&&&&&.............&&&&&&&&&",
			"&&&&&&&&.........&&&..&&&&....................&&&&&&&&&&&&",
			"&&&&&&.......&&&&&&&&&&&&&&................%....&&&&.&&&&&",
			"&&&&&&.....%........&&&&&&&.....%..........&&&&&&.....&&&&",
			"&&&&......&&....&&&&&&&&&&........................&&&&&&&&",
			"&&&&&&&&.......&&&&&&&&&&.&................&&&......&&&&&&",
			"&&&&&&&&&.........&&&&&&&.&.......%....&&&.&&........&&&&&",
			"&&&&&&&&...........&&&&&&&&......&&............&&&&..&&&&&",
			"&&&&&&..........&&&&&&&.......&&&&&&&............&&&&&&&&&",
			"&&&&&&.....&&&&&&&&&&&&&..........&...........&&&&&&&&&&&&",
			"&&&&&.........&&&&&&&&&&&&.....&&&&&............&&&&&&&&&&",
			"&&&&&&&&.........&&&&&&&&&....................&&&&&&&&&&&&",
			"&&&&&&.......&&...&&&&&&&&&.......%....&&.........&&.&&&&&",
			"&&&&&&...............&&&&&&.....%.......&&.&&&&.&.....&&&&",
			"&&&&.....&&&....&&&&&..................&&...........&&&&&&",
			"&&&&&&&&&&..%..&&&&&&&....&................&&&&.......&&&&",
			"&&&&&&&&&&...........&&&&.&.......%....&&&&&&&&&.......&&&",
			"&&&&&&&&...........&&...&&&......&&............&&&&&&..&&&",
			"&&&&&&..........&&&&&&&.........&.&&&............&&&&&.&&&",
			"&&&&&&.....&&&&&&&&&&&&&......................&&&&&&&&&&&&",
			"&&&&&.........&&&&&&&&&&&&.....&&&&.............&&&&&&&&&&",
			"&&&&&&&&.........&&&&&&&&&....................&&&&&&&&&&&&",
			"&&&&&&.......&&&&&&&&&&&&&&.....................&&&&.&&&&&",
			"&&&&&&..............&&&&&&&.....%..........&&&&&&.....&&&&",
			"&&&&.....&&&....&&&&&&&&&&........................&&&&&&&&",
			"&&&&&&&&&&.....&&&&&&&&&&.&................&&&&.....&&&&&&",
			"&&&&&&&&&&........&&&&.&&.&.......%....&&&&&&&&&....&&&&&&",
			"&&&&.&&&......&&&&...&&&&&.......%.W.....&&&&&&&&...&&&&&&",
			"&&&&...&&&&............&&&&...........&&&&&&&&&&&&.&&&&&&&",
			"&&&&..........&&&&&&&&&&&......%.....&&..C..&&&&&&.&&&&&&&",
			"&&&&&&.......%...&&&&&&........%............W.&&&&&&&&&&&&",
			"&&&..............&&&&...................S......W..&&&&&&&&",
			"&&&&&&&..........................W..............&&&&&&&&&&",
			"&&&&&&&&...............&&&.......%.............&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&...............&&&&&&&&&&&&&&&",
			"&&&.&&&&&&&&&&&&&&&&&&&&&&&&&&..........&&&&&&&&&&&&&&&&&&",
			"&&&..&&&&&&&&&&...&&&&&&&&&&....%......&&&&&&&&&&&&&&&&&&&",
			"&&...&.&&&&&&......&&&&&&&&&&&&..%................&&&&&&&&",
			"&&&&....&&&...........&&&&&&&&........&&&&&&&&&&&&&&&&&&&&",
			"&&&&.&......................&&...........&&&&&&&&&&&&&&&&&",
			"&&&&&.....&&&&&&&&&&&...&&&.................&&&&&&&&&&&&&&",
			"&&&&&&&....&&&&&&&.........&&.......%&&&&&&&&&&&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&.........&&&..%&&&&&&&&&&&&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"
		}};
		this.inhabitants= new String [][]{{
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&F&&&&&&&&&&&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&.....+..&&&&&&&&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&...............&&&&&&&&&&&&&&",
			"&&&&&&&&...........&&&&&&&&......&&............&&&&&&&&&&&",
			"&&&&&&..........&&&&&&&.......&&&&&&&............&&&&&&&&&",
			"&&&&&&.....&&&&&&&&&&&&...........&...........&&..&&&&&&&&",
			"&&&&&...%.....&&&...&&.........&&&&&.............&&&&&&&&&",
			"&&&&&&&&.........&&&ss&&&&....................&&&&&&&&&&&&",
			"&&&&&&.......&&&&&&&&&&&&&&................%....&&&&.&&&&&",
			"&&&&&&.....%........&&&&&&&.....%..........&&&&&&.....&&&&",
			"&&&&......&&....&&&&&&&&&&b.......................&&&&&&&&",
			"&&&&&&&&.......&&&&&&&&&&.&................&b&......&&&&&&",
			"&&&&&&&&&.........&&&&&&&.&.......%....&&&.&&........&&&&&",
			"&&&&&&&&...........&&&&&&&&......&&............&&&&..&&&&&",
			"&&&&&&..........&&&&&&&.......&&&&&&&............&&&&&&&&&",
			"&&&&&&.....&&&&&&&&&&&&&.....b....&...........&&&&&&&&&&&&",
			"&&&&&.........&&&&&&&&&&&&.....&&&&&............&&&&&&&&&&",
			"&&&&&&&&.........&&&&&&&&&....................&&&&&&&&&&&&",
			"&&&&&&.......&&...&&&&&&&&&.......%....&&.........&&.&&&&&",
			"&&&&&&...............&&&&&&.....%.......&&.&&&&.&.....&&&&",
			"&&&&.....&&&....&&&&&........b.........&&....b......&&&&&&",
			"&&&&&&&&&&..%..&&&&&&&....&................&&&&.......&&&&",
			"&&&&&&&&&&....ss.....&&&&.&.......%....&&&&&&&&&.......&&&",
			"&&&&&&&&......ss...&&...&&&......&&............&&&&&&..&&&",
			"&&&&&&..........&&&&&&&.........&.&&&............&&&&&.&&&",
			"&&&&&&.....&&&&&&&&&&&&&......................&&&&&&&&&&&&",
			"&&&&&.........&&&&&&&&&&&&.....&&&&.............&&&&&&&&&&",
			"&&&&&&&&.........&&&&&&&&&...b................&&&&&&&&&&&&",
			"&&&&&&.......&&&&&&&&&&&&&&.....................&&&&.&&&&&",
			"&&&&&&..............&&&&&&&.....%..........&&&&&&.....&&&&",
			"&&&&.....&&&....&&&&&&&&&&........................&&&&&&&&",
			"&&&&&&&&&&.....&&&&&&&&&&.&................&&&&.....&&&&&&",
			"&&&&&&&&&&........&&&&.&&.&.......%....&&&&&&&&&....&&&&&&",
			"&&&&.&&&......&&&&...&&&&&.......%.W.....&&&&&&&&...&&&&&&",
			"&&&&...&&&&............&&&&...........&&&&&&&&&&&&.&&&&&&&",
			"&&&&..........&&&&&&&&&&&......%.....&&..C..&&&&&&.&&&&&&&",
			"&&&&&&.......%...&&&&&&........%............W.&&&&&&&&&&&&",
			"&&&..............&&&&...................S.H....W..&&&&&&&&",
			"&&&&&&&..........................W..............&&&&&&&&&&",
			"&&&&&&&&...............&&&.......%.............&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&...............&&&&&&&&&&&&&&&",
			"&&&.&&&&&&&&&&&&&&&&&&&&&&&&&&..........&&&&&&&&&&&&&&&&&&",
			"&&&..&&&&&&&&&&...&&&&&&&&&&....%......&&&&&&&&&&&&&&&&&&&",
			"&&...&.&&&&&&......&&&&&&&&&&&&..%................&&&&&&&&",
			"&&&&....&&&..s........&&&&&&&&........&&&&&&&&&&&&&&&&&&&&",
			"&&&&.&......................&&...........&&&&&&&&&&&&&&&&&",
			"&&&&&.....&&&&&&&&&&&...&&&.................&&&&&&&&&&&&&&",
			"&&&&&&&....&&&&&&&.........&&.......%&&&&&&&&&&&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&.........&&&..%&&&&&&&&&&&&&&&&&&&&&&",
			"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"
		}};		
		inhabitantsMap.put("H", "NPC MELDUCK");
		inhabitantsMap.put("b", "MONSTER BAT");
		inhabitantsMap.put("s", "MONSTER WHITE_SKELETON");
		
		charMap.put("&", "FOREST_TREE");
		charMap.put(".", "FOREST_GRASS");
		charMap.put("%", "FOREST_DIRT");
		charMap.put("C", "WRECKED_CHARRIOT");
		charMap.put("W", "WRECKED_WHEEL");
		charMap.put("S", "FOREST_GRASS EXIT _BACK");
		charMap.put("F", "FOREST_GRASS EXIT FOREST");
		charMap.put("+", "SIGNPOST");
		
		unleashers = new Unleasher[]{
				new Intro1(),
				new Intro2(),
				new Intro3()
		};
	}
}