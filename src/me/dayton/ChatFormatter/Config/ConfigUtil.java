package me.dayton.ChatFormatter.Config;

import me.dayton.ChatFormatter.Main;
import me.dayton.ChatFormatter.Utils;

public class ConfigUtil {
	public static String getFirstJoinMessage() {
		return Utils.chat(Main.getConfiguration().getString("loginSettings.first-join.message"));
	}
	
	public static boolean getFirstJoinEnabled() {
		return Main.getConfiguration().getBoolean("loginSettings.first-join.enabled");
	}
	
	public static String getJoinMessage() {
		return Utils.chat(Main.getConfiguration().getString("loginSettings.join.message"));
	}
	
	public static boolean getJoinEnabled() {
		return Main.getConfiguration().getBoolean("loginSettings.join.enabled");
	}
	
	public static String getQuitMessage() {
		return Utils.chat(Main.getConfiguration().getString("loginSettings.quit.message"));
	}
	
	public static boolean getQuitEnabled() {
		return Main.getConfiguration().getBoolean("loginSettings.quit.enabled");
	}
	
	public static String getChatFormat() {
		return Utils.chat(Main.getConfiguration().getString("chatSettings.format.playerChat"));
	}
	
	public static boolean getChatFormatEnabled() {
		return Main.getConfiguration().getBoolean("chatSettings.format.enabled");
	}
	
	public static String getHeaderMessage() {
		return Utils.chat(Main.getConfiguration().getString("headerSettings.header.message"));
	}
	
	public static boolean getHeaderEnabled() {
		return Main.getConfiguration().getBoolean("headerSettings.header.enabled");
	}
	
	public static String getFooterMessage() {
		return Utils.chat(Main.getConfiguration().getString("headerSettings.footer.message"));
	}
	
	public static boolean getFooterEnabled() {
		return Main.getConfiguration().getBoolean("footerSettings.footer.enabled");
	}
}