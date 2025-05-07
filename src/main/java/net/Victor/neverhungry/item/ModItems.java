package net.Victor.neverhungry.item;

import net.minecraft.item.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;


public final class ModItems {
    private ModItems() {
    }

    public static final Item POCKY = register("pocky", Item::new, new Item.Settings());

    public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("neverhungry", path));
        return Items.register(registryKey, factory, settings);
    }

    public static void initialize() {
    }
}