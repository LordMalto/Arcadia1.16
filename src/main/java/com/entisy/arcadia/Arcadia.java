package com.entisy.arcadia;

import com.entisy.arcadia.core.init.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("arcadia")
public class Arcadia {
    public static final String MOD_ID = "arcadia";

    public Arcadia() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
//        ModTileEntityTypes.TILE_ENTITY_TYPES.register(bus);
//        ModContainerTypes.CONTAINER_TYPES.register(bus);
//        ModRecipes.RECIPE_SERIALIZERS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
