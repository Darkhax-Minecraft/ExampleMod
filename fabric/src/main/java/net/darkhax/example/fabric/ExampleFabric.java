package net.darkhax.example.fabric;

import net.darkhax.example.common.ExampleCommon;
import net.fabricmc.api.ModInitializer;

public class ExampleFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ExampleCommon.LOG.info("Hello from Fabric");
    }
}