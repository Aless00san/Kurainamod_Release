package net.fabricmc.kurainamod.utils;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.kurainamod.entity.KurainaEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntity {
    public static final EntityType<KurainaEntity> KURAINA = Registry.register(Registry.ENTITY_TYPE,
            new Identifier("kurainamod", "kuraina"),
            FabricEntityTypeBuilder.<KurainaEntity>create(SpawnGroup.CREATURE, KurainaEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 2.6F)).fireImmune().trackRangeBlocks(90)
                    .trackedUpdateRate(4).build());

}
