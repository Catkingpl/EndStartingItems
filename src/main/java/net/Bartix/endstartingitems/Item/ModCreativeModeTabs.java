package net.Bartix.endstartingitems.Item;

import net.Bartix.endstartingitems.EndStartingItems;
import net.Bartix.endstartingitems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndStartingItems.MOD_ID);

    public static final Supplier<CreativeModeTab> END_STARTING_ITEMS = CREATIVE_MODE_TAB.register("end_starting_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDER_SHARD.get()))
                    .title(Component.translatable("creativetab.endstartingitems.enditems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ENDER_SHARD);
                        output.accept(ModItems.ENDER_STICK);
                        output.accept(ModBlocks.ENDER_PEAR_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
