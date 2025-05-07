package net.Victor.neverhungry;

import net.Victor.neverhungry.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Neverhungry implements ModInitializer {
    public static final String MOD_ID = "neverhungry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        LOGGER.info("NeverHungry has started up");

    }
}
