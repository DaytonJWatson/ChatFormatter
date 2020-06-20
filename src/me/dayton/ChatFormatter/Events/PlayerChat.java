package me.dayton.ChatFormatter.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.dayton.ChatFormatter.Config.ConfigUtil;

public class PlayerChat implements Listener {
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		
		String format = ConfigUtil.getChatFormat();
		format = format.replace("<player>", p.getName());
		format = format.replace("<message>", e.getMessage());
		
		e.setFormat(format);
	}
}
