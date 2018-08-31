package de.technicalonions.ts3bot.main;

import java.util.logging.Level;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.TS3Query.FloodRate;

public class Load {

	public static final TS3Config config = new TS3Config();
	public static final TS3Query query = new TS3Query();
	public static final TS3Api api = new TS3Api(query);
	
	
	public static void main(String[] args) {
		System.out.println("Der Bot wird gestartet...");
		config.setHost("technicalonions.de");
		config.setFloodRate(FloodRate.UNLIMITED);
		config.setDebugLevel(Level.ALL);
		query.connect();
		
		/*api.login("QueryLogin", "1234");
		api.selectVirtualServerByPort(9992);
		api.setNickname("Administration Bot");*/
		
		System.out.println("Der Bot wurde gestartet.");
	}

}
