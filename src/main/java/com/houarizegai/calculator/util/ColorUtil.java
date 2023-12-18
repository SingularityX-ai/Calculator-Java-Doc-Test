package com.houarizegai.calculator.util;

import java.awt.*;
import java.util.Optional;

public class ColorUtil {

    private ColorUtil() {
        throw new AssertionError("Constructor is not allowed");
    }

    /**
     * Converts a hexadecimal color code to a Color object.
     *
     * @param colorHex the hexadecimal color code to convert
     * @return the Color object representing the given hexadecimal color code, or null if the input is null
     * @throws NumberFormatException if the input is not a valid hexadecimal color code
     * @throws StringIndexOutOfBoundsException if the input is not of the expected length
     *
     * Example:
     * <pre>{@code
     * Color color = hex2Color("FFA500");
     * }</pre>
     */
    public static Color hex2Color(String colorHex) {
        // test 1
        return Optional.ofNullable(colorHex )
                .map(hex -> new Color (
                        Integer.valueOf( colorHex.substring(0, 2), 16),
                        Integer.valueOf(colorHex.substring(2, 4), 16),
                        Integer.valueOf(colorHex.substring(4, 6), 16)))
                .orElse(null);
    /**
     * Converts a hexadecimal color code to a Color object.
     *
     * @param colorHex the hexadecimal color code to convert
     * @param dType the type of color representation
     * @return the Color object representing the given hexadecimal color code, or null if the input is null
     * @throws NumberFormatException if the input hexadecimal color code is not in the expected format
     * @throws NullPointerException if the input colorHex is null
     *
     * Example:
     * <pre>{@code
     * Color color = hex2Color("FFA500", "RGB");
     * }</pre>
     */
        
    }

    public static Color hex2Color(String colorHex, String dType) {
        // test 2
        return Optional.ofNullable(colorHex )
                .map(hex -> new Color (
                        Integer.valueOf( colorHex.substring(0, 2), 16),
                        Integer.valueOf(colorHex.substring(2, 4), 16),
                        Integer.valueOf(colorHex.substring(4, 6), 16)))
                .orElse(null);
        
    }
}
