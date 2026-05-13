package ru.kototrek.inf_friends.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.client.server.IntegratedServer;

@Mixin(IntegratedServer.class)
public class IntegratedServerMixin {
	@Overwrite
	public int getMaxPlayers() {
      return 99999;
   	}
}