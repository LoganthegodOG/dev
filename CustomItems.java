package me.loganthegod.Useless.Items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import me.loganthegod.Useless.Useless;
import net.md_5.bungee.api.ChatColor;

public class CustomItems implements Listener {
	private Plugin plugin = Useless.getPlugin(Useless.class);

	public void customRecipe() {
		ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.AQUA + "AXE OF ZEUS");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Used by Zeus in the great god battle");
		meta.setLore(lore);
		item.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(item);

		r.shape("#% ", "#$ ", " $ ");
		r.setIngredient('#', Material.DIAMOND);
		r.setIngredient('%', Material.IRON_INGOT);
		r.setIngredient('$', Material.STICK);

		plugin.getServer().addRecipe(r);

	}

	public void unshaped() {
		ItemStack item = new ItemStack(Material.BLAZE_POWDER, 1);

		ShapelessRecipe slr = new ShapelessRecipe(item);

		slr.addIngredient(1, Material.LAVA_BUCKET);
		slr.addIngredient(1, Material.FLINT);
		plugin.getServer().addRecipe(slr);
	}
}