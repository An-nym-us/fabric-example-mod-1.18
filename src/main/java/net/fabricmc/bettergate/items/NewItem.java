package net.fabricmc.bettergate.items;
import com.ibm.icu.impl.coll.UVector64;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;


import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class NewItem extends Item {

    public NewItem(Settings settings)
    {
        super(settings);
    }



    @Override
    public TypedActionResult<ItemStack> use (World world, PlayerEntity playerEntity, Hand hand)
    {
        playerEntity.setVelocity(playerEntity.getVelocity().x,.5, playerEntity.getVelocity().z);
        playerEntity.playSound(SoundEvents.AMBIENT_NETHER_WASTES_MOOD, 1.0f, 1.0f);

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }




}
