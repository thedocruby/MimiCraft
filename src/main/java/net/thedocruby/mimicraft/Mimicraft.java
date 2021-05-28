package net.thedocruby.mimicraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import net.thedocruby.mimicraft.block.MimicraftBlocks;
import net.thedocruby.mimicraft.block.entity.MimicreamBlockEntity;
import net.thedocruby.mimicraft.item.MimicraftItems;

public class Mimicraft implements ModInitializer {
	public static BlockEntityType<MimicreamBlockEntity> MIMICREAM_BLOCK_ENTITY;

	@Override
	public void onInitialize() {
		MIMICREAM_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mimicraft:mimicream_block_entity", BlockEntityType.Builder.create(MimicreamBlockEntity::new, MimicraftBlocks.MIMICREAM_BLOCK).build(null));
		MimicraftBlocks.registerBlocks();
		MimicraftItems.registerItems();
		System.out.println("Hello Fabric world! This is MimiCraft!");
	}
}
