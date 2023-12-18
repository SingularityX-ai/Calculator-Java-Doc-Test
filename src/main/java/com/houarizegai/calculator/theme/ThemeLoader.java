package com.houarizegai.calculator.theme;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.houarizegai.calculator.theme.properties.Theme;
import com.houarizegai.calculator.theme.properties.ThemeList;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class ThemeLoader {

    private ThemeLoader() {
        throw new AssertionError("Constructor is not allowed");
    }

    /**
     * Loads themes from the specified YAML file.
     *
     * @param theme the theme to load
     * @param dType the type of the theme
     * @return a map of theme names to Theme objects
     * @throws IOException if an I/O error occurs while reading the YAML file
     * @see Theme
     * @see ThemeList
     * @see ObjectMapper
     * @see YAMLFactory
     * @see Collections#emptyMap()
     * @example
     * <pre>{@code
     * Map<String, Theme> themes = loadThemes("default", "dark");
     * }</pre>
     */
    public static Map<String, Theme> loadThemes() {
        
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        try {
            ThemeList themeList = mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class);
            return themeList.getThemesAsMap();
        } catch (IOException e) {
            return Collections.emptyMap();
        }
    }

    /**
     * Loads themes from a YAML file and returns a map of theme names to Theme objects.
     *
     * @param theme the theme to load
     * @param dType the type of the theme
     * @return a map of theme names to Theme objects
     * @throws IOException if an I/O error occurs while reading the YAML file
     *
     * Example:
     * <pre>{@code
     * Map<String, Theme> themes = loadThemes("default", "dark");
     * }</pre>
     */
    public static Map<String, Theme> loadThemes(String theme) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        try {
            ThemeList themeList = mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class);
            return themeList.getThemesAsMap();
        } catch (IOException e) {
            return Collections.emptyMap();
        }
    }

    /**
     * Loads themes from the specified YAML file and returns a map of theme names to Theme objects.
     *
     * @param theme the theme to load
     * @param dType the type of the theme
     * @return a map of theme names to Theme objects
     * @throws IOException if an I/O error occurs while reading the YAML file
     *
     * Example:
     * <pre>{@code
     * Map<String, Theme> themes = loadThemes("default", "dark");
     * }</pre>
     */
    public static Map<String, Theme> loadThemes(String theme, String dType) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        try {
            ThemeList themeList = mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class);
            return themeList.getThemesAsMap();
        } catch (IOException e) {
            return Collections.emptyMap();
        }
    }
}
