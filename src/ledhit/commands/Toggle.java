package ledhit.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ledhit.LEDHit;

public class Toggle implements CommandExecutor {
	
	public LEDHit plugin;
	
	public Toggle(LEDHit p) {
		this.plugin = p;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		if(plugin.state) {
			((Player)sender).sendMessage("LEDHit turned off.");
		}
		else {
			((Player)sender).sendMessage("LEDHit turned on.");
			
		}
		this.plugin.state = !this.plugin.state;
		return true;
	}

}
