//package com.entisy.arcadia.core.init;
//
//import com.entisy.arcadia.Arcadia;
//import net.minecraft.inventory.container.ContainerType;
//import net.minecraftforge.common.extensions.IForgeContainerType;
//import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public class ModContainerTypes {
//
//    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister
//            .create(ForgeRegistries.CONTAINERS, Arcadia.MOD_ID);
//
//    public static final RegistryObject<ContainerType<ExampleContainer>> METAL_PRESS_CONTAINER_TYPE = CONTAINER_TYPES
//            .register("metal_press", () -> IForgeContainerType.create(ExampleContainer::new));
//}
