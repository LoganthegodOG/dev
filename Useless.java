package me.loganthegod.Useless;

import org.bukkit.plugin.java.JavaPlugin;

import me.loganthegod.Useless.Events.EventsClass;
import me.loganthegod.Useless.Items.CustomItems;
import net.md_5.bungee.api.ChatColor;


public class Useless extends JavaPlugin{

	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nUseless has been Enabled\n\n");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		loadConfig();

		CustomItems items = new CustomItems();
		items.customRecipe();
		items.unshaped();
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nUseless has been Disabled\n\n");
	}
	
	public void loadConfig(){
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}