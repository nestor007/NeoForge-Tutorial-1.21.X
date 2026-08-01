package net.tytan007.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tytan007.tutorialmod.TutorialMod;
import net.tytan007.tutorialmod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);


    public static final Supplier<CreativeModeTab> DORO_ITEMS_TAB = CREATIVE_MODE_TAB.register("doro_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DORO_HD.get()))
                    .title(Component.translatable("creativetab.tytan007tutorialmod.doro_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DORO);
                        output.accept(ModItems.DORO_HD);
                        output.accept(ModItems.VAPAUS);
                        output.accept(ModItems.CORE);
                        output.accept(ModItems.GEM);
                        output.accept(ModItems.CUSTOM_MODULE);
                    }).build());

    public static final Supplier<CreativeModeTab> DORO_BLOCKS_TAB = CREATIVE_MODE_TAB.register("doro_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DORO_HD_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "doro_items_tab"))
                    .title(Component.translatable("creativetab.tytan007tutorialmod.doro_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DORO_BLOCK);
                        output.accept(ModBlocks.DORO_DEEPSLATE_BLOCK);
                        output.accept(ModBlocks.DORO_HD_BLOCK);
                        output.accept(ModBlocks.HARMONY_CUBE_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
