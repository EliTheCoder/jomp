package com.elithecoder.jomp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LonchBlock extends Block {
	public LonchBlock(Settings settings) {
		super(settings);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
			BlockHitResult hit) {
		double yaw = Math.toRadians(player.getYaw(0)) + Math.PI / 2;
		player.addVelocity(Math.cos(yaw) / 8, 0, Math.sin(yaw) / 8);
		player.jump();
		return ActionResult.SUCCESS;

	}
}
