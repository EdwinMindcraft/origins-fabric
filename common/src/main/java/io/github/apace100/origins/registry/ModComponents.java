package io.github.apace100.origins.registry;

import io.github.apace100.origins.component.OriginComponent;
import me.shedaniel.architectury.annotations.ExpectPlatform;
import net.minecraft.entity.Entity;
import net.minecraft.server.network.ServerPlayerEntity;

public class ModComponents {
    @ExpectPlatform
    public static OriginComponent getOriginComponent(Entity entity) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void syncOriginComponent(Entity player) {
        throw new AssertionError();
    }
    @ExpectPlatform
    public static void syncWith(ServerPlayerEntity player, Entity provider) {
        throw new AssertionError();
    }
}
