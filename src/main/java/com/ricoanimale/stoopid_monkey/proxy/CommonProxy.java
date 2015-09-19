package com.ricoanimale.stoopid_monkey.proxy;

import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {

    public abstract void preInit();

    public abstract void init();

    public abstract void postInit();

    public abstract EntityPlayer getClientPlayer();
}

