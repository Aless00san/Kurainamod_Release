package net.fabricmc.kurainamod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimationTickable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class KurainaEntity extends PathAwareEntity implements IAnimatable, IAnimationTickable {
    private AnimationFactory factory = new AnimationFactory(this);

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.kuraina.fly", true));
        return PlayState.CONTINUE;
    }

    public KurainaEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        AnimationController<KurainaEntity> controller = new AnimationController<>(this, "controller", 0, this::predicate);
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public int tickTimer() {
        return 0;
    }
}
