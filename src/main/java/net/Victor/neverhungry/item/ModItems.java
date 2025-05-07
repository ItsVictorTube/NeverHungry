
package net.Victor.neverhungry.item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.Victor.neverhungry.Neverhungry;
import net.Victor.neverhungry.item.custom.*;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final ConsumableComponent POCKY_WOOD_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 20, 3), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION,20 * 20, 3), 1.0f))
            .build();
    public static final ConsumableComponent POCKY_STONE_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION, 60 * 20, 2), 1.0f))
            .build();
    public static final ConsumableComponent POCKY_IRON_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 120 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 60 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION, 120 * 20, 2), 1.0f))
            .build();
    public static final ConsumableComponent POCKY_GOLDEN_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 120 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.GLOWING, 120 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION, 120 * 20, 2), 1.0f))
            .build();
    public static final ConsumableComponent POCKY_DIAMOND_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 120 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 120 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 120 * 20, 2), 1.0f))
            .build();

    public static final FoodComponent POISON_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .build();

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
        return registeredItem;
    }

    public static final RegistryKey<Item> POCKY_WOOD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.Victor.neverhungry.Neverhungry.MOD_ID, "pocky_wood"));
    public static final Item POCKY_WOOD = register(
            new Pocky_WoodItem(new Item.Settings().registryKey(POCKY_WOOD_KEY).food(POISON_FOOD_COMPONENT, POCKY_WOOD_FOOD_CONSUMABLE_COMPONENT)),
            POCKY_WOOD_KEY
    );
    public static final RegistryKey<Item> POCKY_STONE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.Victor.neverhungry.Neverhungry.MOD_ID, "pocky_stone"));
    public static final Item POCKY_STONE = register(
            new Pocky_StoneItem(new Item.Settings().registryKey(POCKY_STONE_KEY).food(POISON_FOOD_COMPONENT, POCKY_STONE_FOOD_CONSUMABLE_COMPONENT)),
            POCKY_STONE_KEY
    );
    public static final RegistryKey<Item> POCKY_IRON_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.Victor.neverhungry.Neverhungry.MOD_ID, "pocky_iron"));
    public static final Item POCKY_IRON = register(
            new Pocky_IronItem(new Item.Settings().registryKey(POCKY_IRON_KEY).food(POISON_FOOD_COMPONENT, POCKY_IRON_FOOD_CONSUMABLE_COMPONENT)),
            POCKY_IRON_KEY
    );
    public static final RegistryKey<Item> POCKY_GOLDEN_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.Victor.neverhungry.Neverhungry.MOD_ID, "pocky_golden"));
    public static final Item POCKY_GOLDEN = register(
            new Pocky_GoldenItem(new Item.Settings().registryKey(POCKY_GOLDEN_KEY).food(POISON_FOOD_COMPONENT, POCKY_GOLDEN_FOOD_CONSUMABLE_COMPONENT)),
            POCKY_GOLDEN_KEY
    );
    public static final RegistryKey<Item> POCKY_DIAMOND_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(net.Victor.neverhungry.Neverhungry.MOD_ID, "pocky_diamond"));
    public static final Item POCKY_DIAMOND = register(
            new Pocky_DiamondItem(new Item.Settings().registryKey(POCKY_DIAMOND_KEY).food(POISON_FOOD_COMPONENT, POCKY_DIAMOND_FOOD_CONSUMABLE_COMPONENT)),
            POCKY_DIAMOND_KEY
    );

    public static void registerModItems() {
        new Item.Settings().food(new FoodComponent.Builder().build());
        net.Victor.neverhungry.Neverhungry.LOGGER.info("Registering Mod Items for " + net.Victor.neverhungry.Neverhungry.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(POCKY_WOOD);
            entries.add(POCKY_STONE);
            entries.add(POCKY_IRON);
            entries.add(POCKY_GOLDEN);
            entries.add(POCKY_DIAMOND);

        });

    }
}
