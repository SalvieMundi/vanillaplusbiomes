package supercoder79.vanillaplusbiomes.util;

import java.util.regex.*;

import net.minecraft.util.math.MathHelper;

public class BiomeHelper {
    public static int getSkyColor(float temperature) {
        float scaledTemperature = temperature / 3.0F;
        scaledTemperature = MathHelper.clamp(scaledTemperature, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - scaledTemperature * 0.05F, 0.5F + scaledTemperature * 0.1F, 1.0F);
    }
    
    public static int parseHex(final String color) {
        final Matcher mx = Pattern.compile("^#([0-9a-z]{6})$", Pattern.CASE_INSENSITIVE).matcher(color);
        if(!mx.find())
            throw new IllegalArgumentException("invalid color value");
        return Integer.parseInt(mx.group(1), 16);
    }
}
