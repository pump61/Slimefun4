package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.utils.NumberUtils;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This class stores some startup warnings we occasionally need to print.
 * If you setup your server the recommended way, you are never going to see
 * any of these messages.
 *
 * @author TheBusyBiscuit
 *
 */
final class StartupWarnings {

    private static final String BORDER = "****************************************************";
    private static final String PREFIX = "* ";

    private StartupWarnings() {}

    @ParametersAreNonnullByDefault
    static void discourageCSCoreLib(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Parece que você instalou o CS-CoreLib.");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "O CS-CoreLib não é mais uma dependência obrigatória desde 2021/01/30");
        logger.log(Level.SEVERE, PREFIX + "Você precisa desinstalar o CS-CoreLib para que o Slimefun funcione.");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidMinecraftVersion(Logger logger, String detectedVer, String slimefunVersion) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Falha ao carregar o Slimefun!");
        logger.log(Level.SEVERE, PREFIX + "Você está usando uma versão do Minecraft não suportada!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Você está usando Minecraft {0}", detectedVer);
        logger.log(Level.SEVERE, PREFIX + "Mas o Slimefun {0} suporta apenas:", slimefunVersion);
        logger.log(Level.SEVERE, PREFIX + "Minecraft {0}", String.join(" / ", Slimefun.getSupportedVersions()));
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidServerSoftware(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Falha ao carregar o Slimefun!");
        logger.log(Level.SEVERE, PREFIX + "O CraftBukkit não é mais suportado!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Você precisa usar Paper ou um fork dele");
        logger.log(Level.SEVERE, PREFIX + "(recomendamos o Paper)");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void oldJavaVersion(Logger logger, int recommendedJavaVersion) {
        int javaVersion = NumberUtils.getJavaVersion();

        logger.log(Level.WARNING, BORDER);
        logger.log(Level.WARNING, PREFIX + "A versão do Java em uso (Java {0}) está desatualizada.", javaVersion);
        logger.log(Level.WARNING, PREFIX);
        logger.log(
                Level.WARNING, PREFIX + "Versões mais recentes do Minecraft exigem Java {0},", recommendedJavaVersion);
        logger.log(
                Level.WARNING, PREFIX + "recomendamos atualizar para Java {0} o quanto antes.", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "Além disso, para aproveitar os recursos do novo Java,");
        logger.log(Level.WARNING, PREFIX + "o Slimefun também vai exigir Java {0} em breve.", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "Para não afetar o uso futuro, atualize o quanto antes!");
        logger.log(Level.WARNING, BORDER);
    }
}
