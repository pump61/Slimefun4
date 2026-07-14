package io.github.thebusybiscuit.slimefun4.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.annotation.Nonnull;

/**
 * This utility class provides a few handy methods and constants to build the lore of any
 * {@link SlimefunItemStack}. It is mostly used directly inside the class {@link SlimefunItems}.
 *
 * @author TheBusyBiscuit
 *
 * @see SlimefunItems
 *
 */
public final class LoreBuilder {

    public static final String HAZMAT_SUIT_REQUIRED = "&8\u21E8 &4Traje Hazmat necess\u00E1rio!";
    public static final String RAINBOW = "&dMuda de cor durante o arco-\u00EDris!";
    public static final String RIGHT_CLICK_TO_USE = "&eClique Direito&7 para usar";
    public static final String RIGHT_CLICK_TO_OPEN = "&eClique Direito&7 para abrir";
    public static final String CROUCH_TO_USE = "&eAgachar&7 para usar";

    // Tiers \u2014 pares surrogados UTF-16 id\u00EAnticos ao item-tiers.yml do MMOItems
    public static final String TIER_COMMON = "&f\uD88E\uDF59"; // \uD88E\uDF59 COMMON
    public static final String TIER_RARE = "&f\uD88E\uDF5A"; // \uD88E\uDF5A RARE
    public static final String TIER_EPIC = "&f\uD88E\uDF49"; // \uD88E\uDF49 EPIC
    public static final String TIER_LEGENDARY = "&f\uD88E\uDF4B"; // \uD88E\uDF4B LEGENDARY
    public static final String TIER_EXCLUSIVE = "&f\uD88E\uDF4A"; // \uD88E\uDF4A EXCLUSIVE
    public static final String TIER_LIMITED = "&f\uD88E\uDF4D"; // \uD88E\uDF4D LIMITED

    // Selo de equipamento (armas, armaduras e ferramentas que aceitam encantamento)
    public static final String ICON_ENCHANTABLE = "&f𝼩"; // 𝼩 ENCHANTABLE
    private static final DecimalFormat hungerFormat =
            new DecimalFormat("#.0", DecimalFormatSymbols.getInstance(Locale.ROOT));

    private LoreBuilder() {}

    public static @Nonnull String radioactive(@Nonnull Radioactivity radioactivity) {
        return radioactivity.getLore();
    }

    public static @Nonnull String machine(@Nonnull MachineTier tier, @Nonnull MachineType type) {
        return tier + " " + type;
    }

    public static @Nonnull String speed(float speed) {
        return "&8\u21E8 &b\u26A1 &7Velocidade: &b" + speed + 'x';
    }

    public static @Nonnull String powerBuffer(int power) {
        return power(power, " Buffer");
    }

    public static @Nonnull String powerPerSecond(int power) {
        return power(power, "/s");
    }

    public static @Nonnull String power(int power, @Nonnull String suffix) {
        return "&8\u21E8 &e\u26A1 &7" + power + " J" + suffix;
    }

    public static @Nonnull String powerCharged(int charge, int capacity) {
        return "&8\u21E8 &e\u26A1 &7" + charge + " / " + capacity + " J";
    }

    public static @Nonnull String material(String material) {
        return "&8\u21E8 &7Material: &b" + material;
    }

    public static @Nonnull String hunger(double value) {
        return "&7&oRestora &b&o" + hungerFormat.format(value) + " &7&ode Fome";
    }

    public static @Nonnull String range(int blocks) {
        return "&7Alcance: &c" + blocks + " blocos";
    }

    public static @Nonnull String usesLeft(int usesLeft) {
        return "&e" + usesLeft + (usesLeft > 1 ? " Usos" : " Uso") + " &7restante" + (usesLeft > 1 ? "s" : "");
    }
}
