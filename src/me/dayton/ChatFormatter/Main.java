package me.dayton.ChatFormatter;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.dayton.ChatFormatter.Config.Config;
import me.dayton.ChatFormatter.Events.PlayerChat;
import me.dayton.ChatFormatter.Events.PlayerJoin;
import me.dayton.ChatFormatter.Events.PlayerQuit;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	public void onEnable() {
		instance = this;
		
		Config c = new Config(this);
		c.createConfig();
		
		getLogger().info("Private Plugin for Unsocial");
		
		loadCommands();
		loadEvents();
	}

	public void onDisable() {
		
	}
	
	public void loadCommands() {
		
	}
	
	public void loadEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new PlayerChat(), this);
		pm.registerEvents(new PlayerJoin(), this);
		pm.registerEvents(new PlayerQuit(), this);
	}
	
	public static FileConfiguration getConfiguration() {
		return getInstance().getConfig();
	}
	
	public static Main getInstance() {
		return instance;
	}
}
