package net.fabricmc.kurainamod.client.models.mobs;

import net.fabricmc.kurainamod.KurainaMod;
import net.fabricmc.kurainamod.entity.KurainaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class KurainaMobModel extends AnimatedTickingGeoModel<KurainaEntity> {

    @Override
    public Identifier getModelLocation(KurainaEntity object) {
        return new Identifier("kurainamod", "geo/kuraina.geo.json");
    }

    @Override
    public Identifier getTextureLocation(KurainaEntity object) {
        return new Identifier("kurainamod", "textures/entity/kuraina_texture.png");
    }

    @Override
    public Identifier getAnimationFileLocation(KurainaEntity animatable) {
        return new Identifier("kurainamod", "animations/kuraina.animation.json");
    }
}
