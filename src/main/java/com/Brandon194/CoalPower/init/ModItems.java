package com.Brandon194.CoalPower.init;

/**
 * Created by BRANDON194 on 9/11/2016.
 */

import com.Brandon194.CoalPower.items.ItemRefractoredCoal;
import com.Brandon194.CoalPower.reference.Names;
import com.Brandon194.CoalPower.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemRefractoredCoal refractoredCoal = new ItemRefractoredCoal();

    public static void init(){
        GameRegistry.registerItem(refractoredCoal, Names.Items.REFRACTORED_COAL);
    }
}
