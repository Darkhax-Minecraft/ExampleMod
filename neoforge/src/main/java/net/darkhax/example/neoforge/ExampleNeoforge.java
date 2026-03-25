package net.darkhax.example.neoforge;

import net.darkhax.example.common.ExampleCommon;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.fml.common.Mod;

@Mod(ExampleCommon.MOD_ID)
public class ExampleNeoforge {

    public ExampleNeoforge() {
        ExampleCommon.LOG.info("Hello from NeoForge.");
    }

    public static void printItemName() {
        for (Item item : BuiltInRegistries.ITEM) {
            System.out.println(item.getName(item.getDefaultInstance()));
        }
    }
}