package com.amoddev.mor_ores.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

public class KeyboardHandler {
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingAlt(){
        return InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(),GLFW.GLFW_KEY_LEFT_ALT);
    }
}
