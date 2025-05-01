package net.Bartix.endbase.Item;

import net.Bartix.endbase.EndBase;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EndBase.MOD_ID);

    public static final DeferredItem<Item> ENDER_STICK = ITEMS.register("ender_stick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDER_SHARD = ITEMS.register("ender_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COOKED_CHORUS_FRUIT = ITEMS.register("cooked_chorus_fruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_CHORUS_FRUIT)));




    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
