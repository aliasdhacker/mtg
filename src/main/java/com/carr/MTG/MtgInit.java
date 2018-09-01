package com.carr.MTG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.carr.MTG.domain.CockatriceCard;
import com.carr.MTG.domain.CockatriceSet;
import com.carr.MTG.domain.StandardCard;

public class MtgInit {

	public CockatriceCard[] loadStandardCardDatabase(JdbcTemplate dbTemplate) {
		ArrayList<CockatriceCard> standardCardList = new ArrayList<>();
		CockatriceCard[] standardCards = null;

		dbTemplate.query("SELECT * FROM card_standard_type", new CockatriceCardMapper());

		return standardCards;
	}

	public void LoadCardDatabase(File file) throws Exception {
		if (file == null || !file.exists()) {
			throw new FileNotFoundException("Loading card database failed, card database not found.");
		}

		FileReader fileReader = new FileReader(file);

		BufferedReader br = new BufferedReader(fileReader);

		String line = "";
		int count = 0;
		boolean iscockatriceFile = false;
		while (line != null && count < 2) {
			line = br.readLine();
			if (line.contains("cockatrice")) {
				iscockatriceFile = true;
			}
			count++;
		}

		ArrayList<CockatriceCard> cCards = new ArrayList<>();
		ArrayList<CockatriceSet> cSets = new ArrayList<>();

		if (!iscockatriceFile) {
			throw new Exception("Unknown card database loaded, last line read: " + line);
		} else {
			while (line != null) {
				line = br.readLine();
				if (line.contains("<sets>")) {
					ArrayList<String> allSetLines = new ArrayList<>();
					allSetLines.add(new String(line));
					do {
						line = br.readLine();
						allSetLines.add(line);
					} while (!(line.contains("</sets>")));
					for(int i = 0; i < allSetLines.size(); i++) {
						if(allSetLines.get(i).equals("<set>")){
							CockatriceSet set = new CockatriceSet();
							while(!allSetLines.get(i).equals("</set>")){
								i= i+1;
								if(allSetLines.get(i).
							}
							set.setId(id);
							set.setLongName(longName);
							set.setName(name);
							set.setReleaseDate(releaseDate);
							set.setSetType(setType);
						}
					}
				} else if (line.contains("<cards>")) {
					ArrayList<String> allCardLines = new ArrayList<>();
					allCardLines.add(new String(line));
					do {
						line = br.readLine();
						allCardLines.add(line);
					} while (line != "</cards>");
				}
			}
		}
	}
}
