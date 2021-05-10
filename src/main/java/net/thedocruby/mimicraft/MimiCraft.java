package net.thedocruby.mimicraft;

import net.fabricmc.api.ModInitializer;
import net.thedocruby.mimicraft.block.MimicraftBlocks;
import net.thedocruby.mimicraft.item.MimicraftItems;

public class MimiCraft implements ModInitializer {
	@Override
	public void onInitialize() {
		MimicraftBlocks.registerBlocks();
		MimicraftItems.registerItems();
		System.out.println("Hello Fabric world! This is MimiCraft!");
	}
}
