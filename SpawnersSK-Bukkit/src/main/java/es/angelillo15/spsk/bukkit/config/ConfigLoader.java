package es.angelillo15.spsk.bukkit.config;

import es.angelillo15.configmanager.ConfigManager;
import es.angelillo15.spsk.bukkit.SpawnersSK;
import ru.vyarus.yaml.updater.YamlUpdater;

import java.io.File;
import java.util.Objects;

public class ConfigLoader {
    private static ConfigManager config;

    public void load() {
        get("config.yml", true);
    }

    private ConfigManager get(String path, boolean merge){
        ConfigManager c = new ConfigManager(SpawnersSK.getInstance()
                .getDataFolder().toPath(), "bukkit/"+path, path);

        c.registerConfig();
        if(merge) {
            YamlUpdater.create(new File(SpawnersSK.getInstance().getDataFolder().toPath().toString() + File.separator + "config.yml"),
                    Objects.requireNonNull(SpawnersSK.getInstance().getResource("bukkit/"+path))
            );
        }
        SpawnersSK.getInstance().getPLogger().debug(path + " loaded");
        return c;
    }

    private ConfigManager get(String path){
        return get(path, false);
    }

}
