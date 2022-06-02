//package com.entisy.arcadia.core.init;
//
//import com.entisy.arcadia.Arcadia;
//import net.minecraft.tileentity.TileEntityType;
//import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public class ModTileEntityTypes {
//
//    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister
//            .create(ForgeRegistries.TILE_ENTITIES, Arcadia.MOD_ID);
//
//    public static final RegistryObject<TileEntityType<ExampleTileEntity>> BLOCK_BREAKER_TILE_ENTITY_TYPE = TILE_ENTITY_TYPES
//            .register("block_breaker", () -> TileEntityType.Builder
//                    .of(ExampleTileEntity::new, ModBlocks.EXAMPLE_BLOCK.get()).build(null));
//}
