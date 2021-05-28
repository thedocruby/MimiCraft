package net.thedocruby.mimicraft.block.entity;

import net.fabricmc.fabric.api.block.entity.BlockEntityClientSerializable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Identifier;
import net.thedocruby.mimicraft.Mimicraft;

public class MimicreamBlockEntity extends BlockEntity implements BlockEntityClientSerializable {
    private Identifier TOP = new Identifier("minecraft:block/furnace_top");
    private Identifier BOTTOM = new Identifier("minecraft:block/furnace_top");
    private Identifier NORTH = new Identifier("minecraft:block/furnace_top");
    private Identifier SOUTH = new Identifier("minecraft:block/furnace_top");
    private Identifier EAST = new Identifier("minecraft:block/furnace_top");
    private Identifier WEST = new Identifier("minecraft:block/furnace_top");

    public MimicreamBlockEntity(){
        super(Mimicraft.MIMICREAM_BLOCK_ENTITY);
    }

    @Override
    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);

        tag.putString("TOP", this.TOP.toString());
        tag.putString("BOTTOM", this.BOTTOM.toString());
        tag.putString("NORTH", this.NORTH.toString());
        tag.putString("SOUTH", this.SOUTH.toString());
        tag.putString("EAST", this.EAST.toString());
        tag.putString("WEST", this.WEST.toString());

        return tag;
    }
    @Override
    public CompoundTag toClientTag(CompoundTag tag) {
        tag.putString("TOP", this.TOP.toString());
        tag.putString("BOTTOM", this.BOTTOM.toString());
        tag.putString("NORTH", this.NORTH.toString());
        tag.putString("SOUTH", this.SOUTH.toString());
        tag.putString("EAST", this.EAST.toString());
        tag.putString("WEST", this.WEST.toString());

        return tag;
    }

    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        this.TOP = new Identifier(tag.getString("TOP"));
        this.BOTTOM = new Identifier(tag.getString("BOTTOM"));
        this.NORTH = new Identifier(tag.getString("NORTH"));
        this.SOUTH = new Identifier(tag.getString("SOUTH"));
        this.EAST = new Identifier(tag.getString("EAST"));
        this.WEST = new Identifier(tag.getString("WEST"));
    }

    @Override
    public void fromClientTag(CompoundTag tag) {
        this.TOP = new Identifier(tag.getString("TOP"));
        this.BOTTOM = new Identifier(tag.getString("BOTTOM"));
        this.NORTH = new Identifier(tag.getString("NORTH"));
        this.SOUTH = new Identifier(tag.getString("SOUTH"));
        this.EAST = new Identifier(tag.getString("EAST"));
        this.WEST = new Identifier(tag.getString("WEST"));
    }
}
