package com.juiceybeans.juiceytech.common.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.lowdragmc.lowdraglib.gui.texture.ProgressTexture;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MULTIBLOCK;

public class JTRecipeTypes {
    public static final GTRecipeType SCULK_CHAMBER_RECIPES = GTRecipeTypes.register("sculk_chamber", MULTIBLOCK)
            .setMaxIOSize(1, 1, 1, 0)
            .setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.SOLIDIFIER_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.COMPUTATION);

    public static void init() {
    }
}
