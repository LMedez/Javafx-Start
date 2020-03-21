package org.luc.assets;
import java.net.URL;

/* Clase de soporte para cargar archivos de la carpeta resources
* Example:
* button.getStyle.add(LoadResources.load("css/style.css"))
* los recursos deben estar almacenados en la carpeta resources con la misma ruta que esta clase resources/org/luc/assets
* de aca en mas podra tener subcarpetas css/controls etc. */

public class LoadResources {
    public static URL load(String path) {
        return LoadResources.class.getResource(path);
    }

    private LoadResources() {}
}
