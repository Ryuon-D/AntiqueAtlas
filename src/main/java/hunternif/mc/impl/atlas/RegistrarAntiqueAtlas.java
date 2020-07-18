package hunternif.mc.impl.atlas;

import hunternif.mc.impl.atlas.item.AtlasItem;
import hunternif.mc.impl.atlas.item.ItemEmptyAtlas;
import hunternif.mc.impl.atlas.item.RecipeAtlasCloning;
import hunternif.mc.impl.atlas.item.RecipeAtlasCombining;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistrarAntiqueAtlas {
    public static final ItemEmptyAtlas EMPTY_ATLAS = new ItemEmptyAtlas(new Item.Settings().group(ItemGroup.MISC));
    public static final AtlasItem ATLAS = new AtlasItem(new Item.Settings().maxCount(1));

    public static void register() {
        // TODO FABRIC
        // if (SettingsConfig.gameplay.itemNeeded) {
        //}
        Registry.register(Registry.ITEM, new Identifier("antiqueatlas:empty_antique_atlas"), EMPTY_ATLAS);
        Registry.register(Registry.ITEM, new Identifier("antiqueatlas:antique_atlas"), ATLAS);

        Registry.register(Registry.RECIPE_SERIALIZER, "antiqueatlas:atlas_clone", RecipeAtlasCloning.SERIALIZER);
        Registry.register(Registry.RECIPE_SERIALIZER, "antiqueatlas:atlas_combine", RecipeAtlasCombining.SERIALIZER);

        /* if (SettingsConfig.gameplay.itemNeeded) {
            event.getRegistry().register(new ShapelessOreRecipe(new Identifier(AntiqueAtlasMod.ID, "atlas"), new ItemStack(EMPTY_ATLAS), aud.XX_1_13_2_aS_XX, aud.XX_1_13_2_aX_XX).setRegistryName("atlas_blank"));
            event.getRegistry().register(new RecipeAtlasCloning().setRegistryName("atlas_clone"));
            event.getRegistry().register(new RecipeAtlasCombining().setRegistryName("atlas_combine"));
        } */
    }
}
