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
     * Transforms the sign-up request data to match the backend's expected format.
     *
     * @param {SignUpRequest} signUpData - The original sign-up request data.
     *
     * @returns {Object} The transformed sign-up request data with the following changes:
     * - `firstName` is mapped to `first_name`
     * - `lastName` is mapped to `last_name`
     * - `email` is mapped to `username`
     * - All other properties remain unchanged.
     *
     * @example
     * const originalData = {
     *   firstName: 'John',
     *   lastName: 'Doe',
     *   email: 'john.doe@example.com',
     *   password: 'securePassword123'
     * };
     *
     * const transformedData = transformSignUpRequestForBackend(originalData);
     * console.log(transformedData);
     * // Outputs:
     * // {
     * //   firstName: 'John',
     * //   lastName: 'Doe',
     * //   email: 'john.doe@example.com',
     * //   password: 'securePassword123',
     * //   first_name: 'John',
     * //   last_name: 'Doe',
     * //   username: 'john.doe@example.com'
     * // }
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
     * Transforms the sign-up request data to match the backend's expected format.
     *
     * @param {SignUpRequest} signUpData - The original sign-up request data.
     *
     * @returns {Object} The transformed sign-up request data with the following changes:
     * - `firstName` is mapped to `first_name`
     * - `lastName` is mapped to `last_name`
     * - `email` is mapped to `username`
     * - All other properties remain unchanged.
     *
     * @example
     * const originalData = {
     *   firstName: 'John',
     *   lastName: 'Doe',
     *   email: 'john.doe@example.com',
     *   password: 'securePassword123'
     * };
     *
     * const transformedData = transformSignUpRequestForBackend(originalData);
     * console.log(transformedData);
     * // Outputs:
     * // {
     * //   firstName: 'John',
     * //   lastName: 'Doe',
     * //   email: 'john.doe@example.com',
     * //   password: 'securePassword123',
     * //   first_name: 'John',
     * //   last_name: 'Doe',
     * //   username: 'john.doe@example.com'
     * // }
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
     * Transforms the sign-up request data to match the backend's expected format.
     *
     * @param {SignUpRequest} signUpData - The original sign-up request data.
     *
     * @returns {Object} The transformed sign-up request data with the following changes:
     * - `firstName` is mapped to `first_name`
     * - `lastName` is mapped to `last_name`
     * - `email` is mapped to `username`
     * - All other properties remain unchanged.
     *
     * @example
     * const originalData = {
     *   firstName: 'John',
     *   lastName: 'Doe',
     *   email: 'john.doe@example.com',
     *   password: 'securePassword123'
     * };
     *
     * const transformedData = transformSignUpRequestForBackend(originalData);
     * console.log(transformedData);
     * // Outputs:
     * // {
     * //   firstName: 'John',
     * //   lastName: 'Doe',
     * //   email: 'john.doe@example.com',
     * //   password: 'securePassword123',
     * //   first_name: 'John',
     * //   last_name: 'Doe',
     * //   username: 'john.doe@example.com'
     * // }
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
