package ledhit.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import ledhit.LEDHit;

public class PlayerDamageEventHandler implements Listener {

	LEDHit plugin;
	
	public PlayerDamageEventHandler(LEDHit p) {
		this.plugin = p;
		Bukkit.getPluginManager().registerEvents(this, p);
	}
	
	public void onDamageEvent(EntityDamageEvent e) {
		if(e.getEntity() instanceof Player) {
			if(((Player)e.getEntity()) == this.plugin.participant) {
				this.plugin.led.flicker();
			}
		}
	}
}
