package me.dayton.ChatFormatter.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.dayton.ChatFormatter.Config.ConfigUtil;

public class PlayerJoin implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		String joinMessage = ConfigUtil.getJoinMessage();
		String firstJoinMessage = ConfigUtil.getFirstJoinMessage();
		joinMessage = joinMessage.replace("<player>", p.getName());
		firstJoinMessage = firstJoinMessage.replace("<player>", p.getName());
		
		if(p.hasPlayedBefore()) {
			if(ConfigUtil.getJoinEnabled()) {
				e.setJoinMessage(joinMessage);	
			}
		} else {
			if(ConfigUtil.getFirstJoinEnabled()) {
				e.setJoinMessage(firstJoinMessage);
			}
		}
		
		String headerMessage = ConfigUtil.getHeaderMessage();
		String footerMessage = ConfigUtil.getFooterMessage();
		headerMessage = headerMessage.replace("<player>", p.getName());
		footerMessage = footerMessage.replace("<player>", p.getName());
		
		if(ConfigUtil.getHeaderEnabled()) {
			p.setPlayerListHeader(headerMessage);
		}
		
		if(ConfigUtil.getFooterEnabled()) {
			p.setPlayerListFooter(footerMessage);
		}
	}
}