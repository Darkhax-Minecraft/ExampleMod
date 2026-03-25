package net.darkhax.example.common;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleCommon {

    public static final String MOD_ID = "example";
    public static final String MOD_NAME = "Example";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void printBlockName() {
        for (Block block : BuiltInRegistries.BLOCK) {
            System.out.println(block.getName());
        }
    }
}