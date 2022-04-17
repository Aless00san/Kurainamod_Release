package net.fabricmc.kurainamod.client.geo;


import net.fabricmc.kurainamod.client.models.mobs.KurainaMobModel;
import net.fabricmc.kurainamod.entity.KurainaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class KurainaMobRenderer extends GeoEntityRenderer<KurainaEntity> {

    public KurainaMobRenderer(EntityRendererFactory.Context renderManagerIn) {
        super(renderManagerIn, new KurainaMobModel());
        this.shadowRadius = 6.8F;
    }
}
