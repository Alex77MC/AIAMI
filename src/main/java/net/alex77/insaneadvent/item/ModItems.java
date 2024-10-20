package net.alex77.insaneadvent.item;

import net.alex77.insaneadvent.InsaneAdvent;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InsaneAdvent.MOD_ID);

    public static final RegistryObject<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ENDERITE = ITEMS.register("raw_enderite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
