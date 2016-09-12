package com.Brandon194.CoalPower.misc;

import com.Brandon194.CoalPower.init.ModItems;
import com.Brandon194.CoalPower.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by BRANDON194 on 9/11/2016.
 */
public class CreativeTabCP {

    public static final CreativeTabs CP_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.refractoredCoal;
        }
    };
}
