package net.tytan007.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tytan007.tutorialmod.TutorialMod;
import net.tytan007.tutorialmod.item.custom.FuelItem;
import net.tytan007.tutorialmod.item.custom.VapausItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

    public static final DeferredItem<Item> DORO = ITEMS.register("doro",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DORO_HD = ITEMS.register("doro_hd",
            ()  -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VAPAUS = ITEMS.register("vapaus",
            () -> new VapausItem(new Item.Properties().durability(32)));

    public static final DeferredItem<Item> CORE = ITEMS.register("core",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORE)));

    public static final DeferredItem<Item> GEM = ITEMS.register("gem",
            () -> new FuelItem(new Item.Properties(), 800));
    public static final DeferredItem<Item> CUSTOM_MODULE = ITEMS.register("custom_module",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
