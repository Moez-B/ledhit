package ledhit;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import ledhit.arduino.SerialConnection;
import ledhit.commands.Toggle;

public class LEDHit extends JavaPlugin { 
	
	public boolean state;
	public Player participant;
	public SerialConnection led;
	
	@Override
	public void onEnable() {
		this.state = false;
		this.participant = null;
		this.led = new SerialConnection();
		
		this.getCommand("toggle").setExecutor(new Toggle(this));
	}
	
	@Override
	public void onDisable() {
		
	}

}
