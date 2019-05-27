package nc.util;

import nc.ModCheck;
import nc.config.NCConfig;

public class EnergyHelper {
	
	public static int getEUTier(double powerRF) {
		double euPerTick = powerRF / NCConfig.rf_per_eu;
		if (euPerTick <= 32D) return 1;
		int maxTier = ModCheck.gregtechLoaded() ? 10 : 4;
		return (int) Math.min(Math.ceil(((Math.log(euPerTick)/Math.log(2D)) - 3D) / 2D), maxTier);
	}
	
	public static int getMaxEUFromTier(int tier) {
		return (int) Math.pow(2, 2*tier + 3);
	}
}
