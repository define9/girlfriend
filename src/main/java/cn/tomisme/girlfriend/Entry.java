package cn.tomisme.girlfriend;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

public final class Entry extends JavaPlugin {

    public Entry() {
        super(new JvmPluginDescriptionBuilder("cn.tomisme", "0.1.0")
                .name("getfriend_gradle")
                .author("define9")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
    }
}
