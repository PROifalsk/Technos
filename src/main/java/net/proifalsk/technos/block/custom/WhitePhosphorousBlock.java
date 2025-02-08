package net.proifalsk.technos.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class WhitePhosphorousBlock extends Block {
    @Override
    public void onDestroyedByExplosion(ServerWorld world, BlockPos pos, Explosion explosion) {
        world.createExplosion(
                null,
                Explosion.createDamageSource(world, null),
                null,
                pos.getX(),
                pos.getY(),
                pos.getZ(),
                16.0F,
                true,
                World.ExplosionSourceType.BLOCK
        );

        super.onDestroyedByExplosion(world, pos, explosion);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects() && entity instanceof LivingEntity) {
            entity.serverDamage(world.getDamageSources().hotFloor(), 6.0F);
            entity.setFireTicks(300);
        }

        super.onSteppedOn(world, pos, state, entity);
    }

    public WhitePhosphorousBlock(Settings settings) {
        super(settings);
    }
}
