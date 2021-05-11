package net.thedocruby.mimicraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MimicraftBlocks {
    public static final MimicreamBlock MIMICREAM_BLOCK = new MimicreamBlock(
            FabricBlockSettings
                    .of(Material.ORGANIC_PRODUCT)
                    .strength(0.2f, 2.5f)
                    .jumpVelocityMultiplier(0.2f)
                    .slipperiness(1.2f)
                    .sounds(BlockSoundGroup.SLIME)
    );

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier("mimicraft", "mimicream_block"), MIMICREAM_BLOCK);
    }
}
