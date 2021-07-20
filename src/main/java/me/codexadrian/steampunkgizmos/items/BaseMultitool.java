package me.codexadrian.steampunkgizmos.items;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import team.reborn.energy.*;

import java.util.List;

public class BaseMultitool extends Item implements EnergyHolder {
    public final int MAX_POWER;
    public final EnergyTier TIER;

    public BaseMultitool(Properties properties, int maxPower, EnergyTier tier) {
        super(properties);
        this.MAX_POWER = maxPower;
        this.TIER = tier;
    }

    @Override
    public double getMaxStoredPower() {
        return MAX_POWER;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        EnergyHandler energy = this.getEnergyStorage(itemStack);
        list.add(new TextComponent("Energy: " + energy.getEnergy()));
    }

    @Override
    public EnergyTier getTier() {
        return TIER;
    }
    public EnergyHandler getEnergyStorage(ItemStack stack) {
        return Energy.of(stack);
    }

    @Override
    public boolean canBeDepleted() {
        return true;
    }
}
