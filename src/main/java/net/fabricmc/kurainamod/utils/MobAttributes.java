package net.fabricmc.kurainamod.utils;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.kurainamod.entity.KurainaEntity;

public class MobAttributes {
    public static void init(){
        //we initialize attributes
        FabricDefaultAttributeRegistry.register(ModEntity.KURAINA, KurainaEntity.createMobAttributes());
    }
}
