package com.ricoanimale.stoopid_monkey;

import com.ricoanimale.stoopid_monkey.lib.SMReference;
import com.ricoanimale.stoopid_monkey.proxy.CommonProxy;
import com.ricoanimale.stoopid_monkey.utility.SMLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SMReference.MOD_ID, name = SMReference.MOD_NAME, version = SMReference.VERSION)
public class StoopidMonkey {

    @Mod.Instance(SMReference.MOD_ID)
    public static StoopidMonkey instance;

    @SidedProxy(clientSide = SMReference.CLIENT_PROXY_CLASS, serverSide = SMReference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit();

        SMLog.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init();

        SMLog.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit();

        SMLog.info("Post Initialization Complete!");
    }
}
