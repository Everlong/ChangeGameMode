package uk.co.uk.jordanmcqueen.ChangeGameMode;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ChangeGameMode extends JavaPlugin {
	public static ChangeGameMode plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled.");
	}
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info( pdfFile.getName() + " version " + pdfFile.getVersion() + " is now disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		readCommand((Player) sender, commandLabel);
		return false;	
	}
	
	public void readCommand(Player player, String command) {
		if(command.equalsIgnoreCase("creative") && player.isOp()) {
			player.setGameMode(GameMode.CREATIVE);
			player.sendMessage("Now entering " + ChatColor.GOLD + "creative mode");
			}
		else if(command.equalsIgnoreCase("survival") && player.isOp()) {
			player.setGameMode(GameMode.SURVIVAL);
			player.sendMessage("Now entering " + ChatColor.GOLD + "survival mode");
			}
		}
}
// Jordan McQueen - www.tech-land.org - System Administrator