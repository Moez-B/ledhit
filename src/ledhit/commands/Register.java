package ledhit.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ledhit.LEDHit;

public class Register implements CommandExecutor {
	
	LEDHit plugin;
	
	public Register(LEDHit p) {
		this.plugin = p;	
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		this.plugin.participant = (Player)sender;
		Bukkit.broadcastMessage(((Player)sender).getName() + " is now the participant.");
		return true;
	}

}
