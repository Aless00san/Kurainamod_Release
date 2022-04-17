package net.fabricmc.kurainamod.client.model;

import net.fabricmc.kurainamod.entity.KurainaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class KurainaModel extends AnimatedTickingGeoModel<KurainaEntity> {

    public KurainaModel(){

    }

    @Override
    public Identifier getModelLocation(KurainaEntity object) {
        return new Identifier("kurainamod", "geo/kuraina.geo.json");
    }

    @Override
    public Identifier getTextureLocation(KurainaEntity object) {
        return new Identifier("kurainamod", "textures/entity/kuraina.png");
    }

    @Override
    public Identifier getAnimationFileLocation(KurainaEntity animatable) {
        return new Identifier("kurainamod", "animations/kuraina_animation.json");
    }
}
