package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.StormStaff;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedEnchantment;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * This class holds a static references to every {@link SlimefunItemStack}
 * found in Slimefun.
 */
@SuppressWarnings("java:S1192") // Suppress "duplicate string literal" warnings
public final class SlimefunItems {

    private SlimefunItems() {}

    /*		 Items 		*/
    public static final SlimefunItemStack PORTABLE_CRAFTER = new SlimefunItemStack(
            "PORTABLE_CRAFTER",
            HeadTexture.PORTABLE_CRAFTER,
            "§x§F§F§D§D§0§0Mesa de Trabalho Portátil",
            "",
            "&7Uma mesa de trabalho compacta",
            "&7que cabe no inventário.",
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭚");
    public static final SlimefunItemStack PORTABLE_DUSTBIN = new SlimefunItemStack(
            "PORTABLE_DUSTBIN",
            HeadTexture.TRASH_CAN,
            "§x§6§6§6§6§7§7Lixeira Portátil",
            "",
            "&7Destruidor de itens portátil,",
            "&7elimina qualquer item instantaneamente.",
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭚");
    public static final SlimefunItemStack ENDER_BACKPACK = new SlimefunItemStack(
            "ENDER_BACKPACK",
            HeadTexture.ENDER_BACKPACK,
            "§x§5§5§0§0§9§9Mochila do Ender",
            "",
            "&7Mochila mágica conectada ao",
            "&7baú do End — acesso de qualquer lugar.",
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭉");
    public static final SlimefunItemStack MAGIC_EYE_OF_ENDER = new SlimefunItemStack(
            "MAGIC_EYE_OF_ENDER",
            Material.ENDER_EYE,
            "§x§5§5§0§0§9§9Olho Mágico do Ender",
            "",
            "&7Um olho infundido com magia do End,",
            "&7capaz de disparar pérolas do Ender.",
            "",
            "&9Requer armadura Ender completa",
            "&9Clique direito para disparar",
            "",
            "&f𳭉");
    public static final SlimefunItemStack BROKEN_SPAWNER = new SlimefunItemStack(
            "BROKEN_SPAWNER",
            Material.SPAWNER,
            "§x§C§C§4§4§3§3Spawner Quebrado",
            "&7Tipo: &b<Tipo>",
            "",
            "&7Spawner danificado — precisa ser",
            "&7reparado no Altar Antigo.",
            "",
            "&f𳭚");
    public static final SlimefunItemStack REPAIRED_SPAWNER = new SlimefunItemStack(
            "REINFORCED_SPAWNER",
            Material.SPAWNER,
            "§x§0§0§C§C§F§FSpawner Reforçado",
            "&7Tipo: &b<Tipo>",
            "",
            "&7Spawner restaurado e reforçado,",
            "&7pronto para uso.",
            "",
            "&f𳭚");
    public static final SlimefunItemStack INFERNAL_BONEMEAL = new SlimefunItemStack(
            "INFERNAL_BONEMEAL",
            Material.BONE_MEAL,
            "§x§F§F§8§8§0§0Farinha de Osso Infernal",
            "",
            "&7Farinha de osso carbonizada pelo",
            "&7fogo do Nether, de potência elevada.",
            "",
            "&9Acelera o crescimento de plantas",
            "",
            "&f𳭚");
    public static final SlimefunItemStack TAPE_MEASURE = new SlimefunItemStack(
            "TAPE_MEASURE",
            "180d5c43a6cf5bb7769fd0c8240e1e70d2ae38ef9d78a1db401aca6a2cb36f65",
            "§x§F§F§D§D§0§0Fita Métrica",
            "",
            "&7Ferramenta de medição precisa",
            "&7para qualquer superfície.",
            "",
            "&9Agachar + Clique direito para marcar",
            "&9Clique direito para medir",
            "",
            "&f𳭚");

    /*		 Gadgets 		*/
    public static final SlimefunItemStack GOLD_PAN = new SlimefunItemStack(
            "GOLD_PAN",
            Material.BOWL,
            "§x§F§F§D§D§0§0Bateia de Ouro",
            "",
            "&7Uma tigela usada para peneirar",
            "&7cascalho e encontrar materiais valiosos.",
            "",
            "&9Clique direito sobre Cascalho",
            "",
            "&f𳭙 𝼩");
    public static final SlimefunItemStack NETHER_GOLD_PAN = new SlimefunItemStack(
            "NETHER_GOLD_PAN",
            Material.BOWL,
            "§x§F§F§8§8§0§0Bateia do Nether",
            "",
            "&7Versão reforçada para peneirar a",
            "&7areia da alma do Nether.",
            "",
            "&9Clique direito sobre Areia da Alma",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack PARACHUTE = new SlimefunItemStack(
            "PARACHUTE",
            Material.LEATHER_CHESTPLATE,
            Color.WHITE,
            "§x§F§F§F§F§F§FParaquedas",
            "",
            "&7Paraquedas de emergência que",
            "&7desacelera qualquer queda mortal.",
            "",
            "&9Agachar para usar",
            "",
            "&f𳭚");
    public static final SlimefunItemStack GRAPPLING_HOOK = new SlimefunItemStack(
            "GRAPPLING_HOOK",
            Material.LEAD,
            "§x§C§C§7§7§3§3Gancho de Escalada",
            "",
            "&7Gancho de corda para escalar",
            "&7superfícies e atravessar distâncias.",
            "",
            "&9Clique direito para usar",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack SOLAR_HELMET = new SlimefunItemStack(
            "SOLAR_HELMET",
            Material.IRON_HELMET,
            "§x§F§F§D§D§0§0Capacete Solar",
            "",
            "&7Capacete com painéis solares que",
            "&7carregam itens e armaduras usando luz.",
            "",
            "&9Carrega itens ao sol",
            "",
            "&f𳭚");
    public static final SlimefunItemStack CLOTH = new SlimefunItemStack(
            "CLOTH",
            Material.PAPER,
            "§x§C§C§C§C§B§BTecido",
            "",
            "&7Tecido básico produzido",
            "&7de fibras naturais processadas.",
            "",
            "&f𳭙",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack REINFORCED_CLOTH = new SlimefunItemStack(
            "REINFORCED_CLOTH",
            Material.PAPER,
            "§x§C§C§C§C§B§BTecido Reforçado",
            "",
            "&7Tecido tratado com chumbo para",
            "&7proteger contra substâncias radioativas.",
            "",
            "&f𳭚");
    public static final SlimefunItemStack TIN_CAN = new SlimefunItemStack(
            "CAN",
            HeadTexture.TIN_CAN,
            "§x§B§B§B§B§C§CLata de Estanho",
            "",
            "&7Recipiente metálico usado para",
            "&7armazenar comidas orgânicas.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack NIGHT_VISION_GOGGLES = new SlimefunItemStack(
            "NIGHT_VISION_GOGGLES",
            Material.LEATHER_HELMET,
            Color.BLACK,
            "§x§4§4§6§6§A§AÓculos de Visão Noturna",
            "",
            "&7Óculos de alta tecnologia com",
            "&7sensores infravermelhos embutidos.",
            "",
            "&9+ Visão Noturna",
            "",
            "&f𳭚");
    public static final SlimefunItemStack ELYTRA_CAP = new SlimefunItemStack(
            "ELYTRA_CAP",
            Material.LEATHER_HELMET,
            Color.PURPLE,
            "§x§8§8§0§0§9§9Boné de Elytra",
            "",
            "&7Capacete aerodinâmico que protege",
            "&7contra colisões durante o voo com elytra.",
            "",
            "&9Evita dano de colisão com elytra",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack FARMER_SHOES = new SlimefunItemStack(
            "FARMER_SHOES",
            Material.LEATHER_BOOTS,
            Color.YELLOW,
            "§x§F§F§D§D§0§0Sapatos do Fazendeiro",
            "",
            "&7Calçados especiais com sola suave",
            "&7que não pisoteiam plantações.",
            "",
            "&9Não destrói plantações ao pisar",
            "",
            "&f𳭙 𝼩");
    public static final SlimefunItemStack INFUSED_MAGNET = new SlimefunItemStack(
            "INFUSED_MAGNET",
            HeadTexture.MAGNET,
            "§x§4§4§6§6§C§CÍmã Infundido",
            "",
            "&7Ímã mágico que atrai itens próximos",
            "&7automaticamente para o inventário.",
            "",
            "&9Segure Shift para coletar itens próximos",
            "",
            "&f𳭉");
    public static final SlimefunItemStack RAG = new SlimefunItemStack(
            "RAG",
            Material.PAPER,
            "§x§E§0§1§B§1§BAtaduras",
            "",
            "&7Suprimento médico básico feito",
            "&7de tecido limpo e esterilizado.",
            "",
            "&9Restaura 2 corações · Apaga fogo",
            "&9Clique direito para usar",
            "",
            "&f𳭙");
    public static final SlimefunItemStack BANDAGE = new SlimefunItemStack(
            "BANDAGE",
            Material.PAPER,
            "§x§E§0§1§B§1§BAtaduras Avançadas",
            "",
            "&7Curativo mais resistente que oferece",
            "&7maior recuperação de vida.",
            "",
            "&9Restaura 4 corações · Apaga fogo",
            "&9Clique direito para usar",
            "",
            "&f𳭚");
    public static final SlimefunItemStack SPLINT = new SlimefunItemStack(
            "SPLINT",
            Material.STICK,
            "§x§E§0§1§B§1§BTala",
            "",
            "&7Ferramenta médica improvisada",
            "&7para tratar fraturas básicas.",
            "",
            "&9Restaura 2 corações",
            "&9Clique direito para usar",
            "",
            "&f𳭙");
    public static final SlimefunItemStack VITAMINS = new SlimefunItemStack(
            "VITAMINS",
            Material.NETHER_WART,
            "§x§E§0§1§B§1§BVitaminas",
            "",
            "&7Composto vitamínico avançado que",
            "&7neutraliza venenos e radiação.",
            "",
            "&9Restaura 4 corações · Apaga fogo",
            "&9Cura Veneno/Wither/Radiação",
            "&9Clique direito para usar",
            "",
            "&f𳭚");
    public static final SlimefunItemStack MEDICINE = new SlimefunItemStack(
            "MEDICINE",
            Material.POTION,
            Color.RED,
            "§x§E§0§1§B§1§BMedicamento",
            "",
            "&7Poção médica concentrada que",
            "&7cura ferimentos graves e doenças.",
            "",
            "&9Restaura 4 corações · Apaga fogo",
            "&9Cura Veneno/Wither/Radiação",
            "",
            "&f𳭚");
    public static final SlimefunItemStack MAGICAL_ZOMBIE_PILLS = new SlimefunItemStack(
            "MAGICAL_ZOMBIE_PILLS",
            Material.NETHER_WART,
            "§x§2§1§6§6§2§5Pílulas Zumbi Mágicas",
            "",
            "&7Comprimidos alquímicos capazes de",
            "&7reverter a maldição dos mortos-vivos.",
            "",
            "&9Clique direito num Zumbi Aldeão",
            "&9ou Piglin Zumbificado para curar",
            "",
            "&f𳭚");

    public static final SlimefunItemStack FLASK_OF_KNOWLEDGE = new SlimefunItemStack(
            "FLASK_OF_KNOWLEDGE",
            Material.GLASS_BOTTLE,
            "§x§A§A§D§D§F§FFrasco do Conhecimento",
            "",
            "&7Frasco mágico que armazena",
            "&7experiência em forma líquida.",
            "",
            "&9Custo: 1 nível de experiência",
            "",
            "&f𳭚");
    public static final SlimefunItemStack FILLED_FLASK_OF_KNOWLEDGE = new SlimefunItemStack(
            "FILLED_FLASK_OF_KNOWLEDGE",
            Material.EXPERIENCE_BOTTLE,
            "§x§A§A§D§D§F§FFrasco do Conhecimento (Cheio)",
            "",
            "&7Frasco repleto de experiência",
            "&7líquida pronta para ser consumida.",
            "",
            "&f𳭚");

    /*		Backpacks		*/
    public static final SlimefunItemStack BACKPACK_SMALL = new SlimefunItemStack(
            "SMALL_BACKPACK",
            HeadTexture.BACKPACK,
            "§x§F§F§D§D§0§0Mochila Pequena",
            "",
            "&7Tamanho: &e9 slots",
            PlayerBackpack.LORE_OWNER,
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭙");
    public static final SlimefunItemStack BACKPACK_MEDIUM = new SlimefunItemStack(
            "MEDIUM_BACKPACK",
            HeadTexture.BACKPACK,
            "§x§F§F§D§D§0§0Mochila",
            "",
            "&7Tamanho: &e18 slots",
            PlayerBackpack.LORE_OWNER,
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭚");
    public static final SlimefunItemStack BACKPACK_LARGE = new SlimefunItemStack(
            "LARGE_BACKPACK",
            HeadTexture.BACKPACK,
            "§x§F§F§D§D§0§0Mochila Grande",
            "",
            "&7Tamanho: &e27 slots",
            PlayerBackpack.LORE_OWNER,
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭚");
    public static final SlimefunItemStack WOVEN_BACKPACK = new SlimefunItemStack(
            "WOVEN_BACKPACK",
            HeadTexture.BACKPACK,
            "§x§F§F§D§D§0§0Mochila Trançada",
            "",
            "&7Tamanho: &e36 slots",
            PlayerBackpack.LORE_OWNER,
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭚");
    public static final SlimefunItemStack GILDED_BACKPACK = new SlimefunItemStack(
            "GILDED_BACKPACK",
            HeadTexture.BACKPACK,
            "§x§F§F§C§C§0§0Mochila Dourada",
            "",
            "&7Tamanho: &e45 slots",
            PlayerBackpack.LORE_OWNER,
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭉");
    public static final SlimefunItemStack RADIANT_BACKPACK = new SlimefunItemStack(
            "RADIANT_BACKPACK",
            HeadTexture.BACKPACK,
            "§x§F§F§C§C§0§0Mochila Radiante",
            "",
            "&7Tamanho: &e54 slots (Baú duplo)",
            PlayerBackpack.LORE_OWNER,
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭉");
    public static final SlimefunItemStack BOUND_BACKPACK = new SlimefunItemStack(
            "BOUND_BACKPACK",
            HeadTexture.ENDER_BACKPACK,
            "§x§E§0§1§B§1§BMochila Vinculada à Alma",
            "",
            "&7Tamanho: &e36 slots",
            PlayerBackpack.LORE_OWNER,
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭚");
    public static final SlimefunItemStack COOLER = new SlimefunItemStack(
            "COOLER",
            HeadTexture.COOLER,
            "§x§0§0§C§C§F§FRefrigerador Portátil",
            "",
            "&7Armazena sucos e consome automaticamente",
            "&7quando você está com fome.",
            "",
            "&7Tamanho: &e27 slots",
            PlayerBackpack.LORE_OWNER,
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭚");
    public static final SlimefunItemStack RESTORED_BACKPACK = new SlimefunItemStack(
            "RESTORED_BACKPACK",
            HeadTexture.RESTORED_BACKPACK,
            "§x§F§F§D§D§0§0Mochila Restaurada",
            "",
            "&7Recupera itens perdidos",
            "&7de mochilas anteriores.",
            PlayerBackpack.LORE_OWNER,
            "",
            "&9Clique direito para abrir",
            "",
            "&f𳭚");

    /*		 Jetpacks		*/
    public static final SlimefunItemStack DURALUMIN_JETPACK = new SlimefunItemStack(
            "DURALUMIN_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "\u00A7x\u00A7B\u00A78\u00A7C\u00A74\u00A7C\u00A7CJetpack El\u00E9trico &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7Empuxo: &c0.35",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SOLDER_JETPACK = new SlimefunItemStack(
            "SOLDER_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "\u00A7x\u00A7B\u00A78\u00A7C\u00A74\u00A7C\u00A7CJetpack El\u00E9trico &7- &eII",
            "",
            LoreBuilder.material("Solda"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7Empuxo: &c0.4",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack BILLON_JETPACK = new SlimefunItemStack(
            "BILLON_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "\u00A7x\u00A7C\u00A7C\u00A7A\u00A7A\u00A77\u00A77Jetpack El\u00E9trico &7- &eIII",
            "",
            LoreBuilder.material("Bilh\u00E3o"),
            LoreBuilder.powerCharged(0, 45),
            "&8\u21E8 &7Empuxo: &c0.45",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack STEEL_JETPACK = new SlimefunItemStack(
            "STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "\u00A7x\u00A77\u00A77\u00A78\u00A78\u00A79\u00A79Jetpack El\u00E9trico &7- &eIV",
            "",
            LoreBuilder.material("A\u00E7o"),
            LoreBuilder.powerCharged(0, 60),
            "&8\u21E8 &7Empuxo: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETPACK = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "\u00A7x\u00A74\u00A7A\u00A74\u00A7A\u00A75\u00A7AJetpack El\u00E9trico &7- &eV",
            "",
            LoreBuilder.material("A\u00E7o de Damasco"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8 &7Empuxo: &c0.55",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETPACK = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "\u00A7x\u00A7A\u00A7A\u00A78\u00A78\u00A74\u00A74Jetpack El\u00E9trico &7- &eVI",
            "",
            LoreBuilder.material("Liga Refor\u00E7ada"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7Empuxo: &c0.6",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARBONADO_JETPACK = new SlimefunItemStack(
            "CARBONADO_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.BLACK,
            "\u00A7x\u00A73\u00A73\u00A73\u00A73\u00A74\u00A74Jetpack El\u00E9trico &7- &eVII",
            "",
            LoreBuilder.material("Carbonado"),
            LoreBuilder.powerCharged(0, 150),
            "&8\u21E8 &7Empuxo: &c0.7",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ARMORED_JETPACK = new SlimefunItemStack(
            "ARMORED_JETPACK",
            Material.IRON_CHESTPLATE,
            "\u00A7x\u00A77\u00A77\u00A78\u00A78\u00A79\u00A79Jetpack Blindado",
            LoreBuilder.material("A\u00E7o"),
            "",
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Empuxo: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);

    /*		 Jetboots		*/
    public static final SlimefunItemStack DURALUMIN_JETBOOTS = new SlimefunItemStack(
            "DURALUMIN_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "\u00A7x\u00A7B\u00A78\u00A7C\u00A74\u00A7C\u00A7CJetboots &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7Velocidade: &a0.35 \u00B7 &7Precis\u00E3o: &c50%",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SOLDER_JETBOOTS = new SlimefunItemStack(
            "SOLDER_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "\u00A7x\u00A7B\u00A78\u00A7C\u00A74\u00A7C\u00A7CJetboots &7- &eII",
            "",
            LoreBuilder.material("Solda"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7Velocidade: &a0.4 \u00B7 &7Precis\u00E3o: &660%",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack BILLON_JETBOOTS = new SlimefunItemStack(
            "BILLON_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "\u00A7x\u00A7C\u00A7C\u00A7A\u00A7A\u00A77\u00A77Jetboots &7- &eIII",
            "",
            LoreBuilder.material("Bilh\u00E3o"),
            LoreBuilder.powerCharged(0, 40),
            "&8\u21E8 &7Velocidade: &a0.45 \u00B7 &7Precis\u00E3o: &665%",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack STEEL_JETBOOTS = new SlimefunItemStack(
            "STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "\u00A7x\u00A77\u00A77\u00A78\u00A78\u00A79\u00A79Jetboots &7- &eIV",
            "",
            LoreBuilder.material("A\u00E7o"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Velocidade: &a0.5 \u00B7 &7Precis\u00E3o: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETBOOTS = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "\u00A7x\u00A74\u00A7A\u00A74\u00A7A\u00A75\u00A7AJetboots &7- &eV",
            "",
            LoreBuilder.material("A\u00E7o de Damasco"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8 &7Velocidade: &a0.55 \u00B7 &7Precis\u00E3o: &a75%",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETBOOTS = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "\u00A7x\u00A7A\u00A7A\u00A78\u00A78\u00A74\u00A74Jetboots &7- &eVI",
            "",
            LoreBuilder.material("Liga Refor\u00E7ada"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7Velocidade: &a0.6 \u00B7 &7Precis\u00E3o: &c80%",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARBONADO_JETBOOTS = new SlimefunItemStack(
            "CARBONADO_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.BLACK,
            "\u00A7x\u00A73\u00A73\u00A73\u00A73\u00A74\u00A74Jetboots &7- &eVII",
            "",
            LoreBuilder.material("Carbonado"),
            LoreBuilder.powerCharged(0, 125),
            "&8\u21E8 &7Velocidade: &a0.7 \u00B7 &7Precis\u00E3o: &c99,9%",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ARMORED_JETBOOTS = new SlimefunItemStack(
            "ARMORED_JETBOOTS",
            Material.IRON_BOOTS,
            "\u00A7x\u00A77\u00A77\u00A78\u00A78\u00A79\u00A79Jetboots Blindados",
            "",
            LoreBuilder.material("A\u00E7o"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Velocidade: &a0.45 \u00B7 &7Precis\u00E3o: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE,
            "",
            LoreBuilder.TIER_RARE);

    /*		 Multi Tools		*/
    public static final SlimefunItemStack DURALUMIN_MULTI_TOOL = new SlimefunItemStack(
            "DURALUMIN_MULTI_TOOL",
            Material.SHEARS,
            "§x§B§8§C§4§C§CMulti-Ferramenta &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "",
            "&9Clique direito para usar",
            "&9Agachar + Clique direito para mudar modo",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SOLDER_MULTI_TOOL = new SlimefunItemStack(
            "SOLDER_MULTI_TOOL",
            Material.SHEARS,
            "§x§B§8§C§4§C§CMulti-Ferramenta &7- &eII",
            "",
            LoreBuilder.material("Solda"),
            LoreBuilder.powerCharged(0, 30),
            "",
            "&9Clique direito para usar",
            "&9Agachar + Clique direito para mudar modo",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack BILLON_MULTI_TOOL = new SlimefunItemStack(
            "BILLON_MULTI_TOOL",
            Material.SHEARS,
            "§x§C§C§A§A§7§7Multi-Ferramenta &7- &eIII",
            "",
            LoreBuilder.material("Bilhão"),
            LoreBuilder.powerCharged(0, 40),
            "",
            "&9Clique direito para usar",
            "&9Agachar + Clique direito para mudar modo",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack STEEL_MULTI_TOOL = new SlimefunItemStack(
            "STEEL_MULTI_TOOL",
            Material.SHEARS,
            "§x§7§7§8§8§9§9Multi-Ferramenta &7- &eIV",
            "",
            LoreBuilder.material("Aço"),
            LoreBuilder.powerCharged(0, 50),
            "",
            "&9Clique direito para usar",
            "&9Agachar + Clique direito para mudar modo",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack DAMASCUS_STEEL_MULTI_TOOL = new SlimefunItemStack(
            "DAMASCUS_STEEL_MULTI_TOOL",
            Material.SHEARS,
            "§x§4§A§4§A§5§AMulti-Ferramenta &7- &eV",
            "",
            LoreBuilder.material("Aço de Damasco"),
            LoreBuilder.powerCharged(0, 60),
            "",
            "&9Clique direito para usar",
            "&9Agachar + Clique direito para mudar modo",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack REINFORCED_ALLOY_MULTI_TOOL = new SlimefunItemStack(
            "REINFORCED_ALLOY_MULTI_TOOL",
            Material.SHEARS,
            "§x§A§A§8§8§4§4Multi-Ferramenta &7- &eVI",
            "",
            LoreBuilder.material("Liga Reforçada"),
            LoreBuilder.powerCharged(0, 75),
            "",
            "&9Clique direito para usar",
            "&9Agachar + Clique direito para mudar modo",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARBONADO_MULTI_TOOL = new SlimefunItemStack(
            "CARBONADO_MULTI_TOOL",
            Material.SHEARS,
            "§x§3§3§3§3§4§4Multi-Ferramenta &7- &eVII",
            "",
            LoreBuilder.material("Carbonado"),
            LoreBuilder.powerCharged(0, 100),
            "",
            "&9Clique direito para usar",
            "&9Agachar + Clique direito para mudar modo",
            "",
            LoreBuilder.TIER_RARE);

    static {
        ItemMeta duralumin = DURALUMIN_MULTI_TOOL.getItemMeta();
        duralumin.setUnbreakable(true);
        DURALUMIN_MULTI_TOOL.setItemMeta(duralumin);

        ItemMeta solder = SOLDER_MULTI_TOOL.getItemMeta();
        solder.setUnbreakable(true);
        SOLDER_MULTI_TOOL.setItemMeta(solder);

        ItemMeta billon = BILLON_MULTI_TOOL.getItemMeta();
        billon.setUnbreakable(true);
        BILLON_MULTI_TOOL.setItemMeta(billon);

        ItemMeta steel = STEEL_MULTI_TOOL.getItemMeta();
        steel.setUnbreakable(true);
        STEEL_MULTI_TOOL.setItemMeta(steel);

        ItemMeta damascus = DAMASCUS_STEEL_MULTI_TOOL.getItemMeta();
        damascus.setUnbreakable(true);
        DAMASCUS_STEEL_MULTI_TOOL.setItemMeta(damascus);

        ItemMeta reinforced = REINFORCED_ALLOY_MULTI_TOOL.getItemMeta();
        reinforced.setUnbreakable(true);
        REINFORCED_ALLOY_MULTI_TOOL.setItemMeta(reinforced);

        ItemMeta carbonado = CARBONADO_MULTI_TOOL.getItemMeta();
        carbonado.setUnbreakable(true);
        CARBONADO_MULTI_TOOL.setItemMeta(carbonado);
    }

    /*		 Food 		*/
    public static final SlimefunItemStack FORTUNE_COOKIE = new SlimefunItemStack(
            "FORTUNE_COOKIE",
            Material.COOKIE,
            "§x§F§F§D§D§0§0Biscoito da Sorte",
            "",
            "&7Um biscoito mágico que revela",
            "&7previsões do futuro ao ser consumido.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack DIET_COOKIE = new SlimefunItemStack(
            "DIET_COOKIE",
            Material.COOKIE,
            "§x§F§F§D§D§0§0Biscoito Diet",
            "",
            "&7Um biscoito levíssimo que",
            "&7satisfaz sem pesar.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack MAGIC_SUGAR = new SlimefunItemStack(
            "MAGIC_SUGAR",
            Material.SUGAR,
            "§x§F§F§D§D§0§0Açúcar Mágico",
            "",
            "&7Açúcar infundido com a energia",
            "&7de Hermes — velocidade instantânea.",
            "",
            "&9Concede Velocidade",
            "",
            "&f𳭚");
    public static final SlimefunItemStack MONSTER_JERKY = new SlimefunItemStack(
            "MONSTER_JERKY",
            Material.ROTTEN_FLESH,
            "§x§6§6§6§6§7§7Carne Seca de Monstro",
            "",
            "&7Carne de morto-vivo seca",
            "&7e temperada — surpreendentemente saborosa.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack APPLE_JUICE = new SlimefunItemStack(
            "APPLE_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "§x§E§0§1§B§1§BSuco de Maçã",
            "",
            LoreBuilder.hunger(3),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack MELON_JUICE = new SlimefunItemStack(
            "MELON_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "§x§E§0§1§B§1§BSuco de Melancia",
            "",
            LoreBuilder.hunger(3),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CARROT_JUICE = new SlimefunItemStack(
            "CARROT_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "§x§F§F§8§8§0§0Suco de Cenoura",
            "",
            LoreBuilder.hunger(3),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack PUMPKIN_JUICE = new SlimefunItemStack(
            "PUMPKIN_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "§x§F§F§8§8§0§0Suco de Abóbora",
            "",
            LoreBuilder.hunger(3),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SWEET_BERRY_JUICE = new SlimefunItemStack(
            "SWEET_BERRY_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "§x§E§0§1§B§1§BSuco de Fruta Doce",
            "",
            LoreBuilder.hunger(3),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack GLOW_BERRY_JUICE = new SlimefunItemStack(
            "GLOW_BERRY_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "§x§F§F§A§2§0§0Suco de Fruta Luminosa",
            "",
            LoreBuilder.hunger(3),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack GOLDEN_APPLE_JUICE = new SlimefunItemStack(
            "GOLDEN_APPLE_JUICE",
            Color.YELLOW,
            new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0),
            "§x§F§F§D§D§0§0Suco de Maçã Dourada",
            "",
            "&7Restaura vitalidade e concede",
            "&7Absorção por 20 segundos.",
            "",
            LoreBuilder.hunger(4),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack BEEF_JERKY = new SlimefunItemStack(
            "BEEF_JERKY",
            Material.COOKED_BEEF,
            "§x§F§F§8§8§0§0Carne Seca Bovina",
            "",
            "&7Carne de boi curada e temperada,",
            "&7extra nutritiva.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack PORK_JERKY = new SlimefunItemStack(
            "PORK_JERKY",
            Material.COOKED_PORKCHOP,
            "§x§F§F§8§8§0§0Carne Seca de Porco",
            "",
            "&7Costelinha curada e defumada,",
            "&7extra nutritiva.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack CHICKEN_JERKY = new SlimefunItemStack(
            "CHICKEN_JERKY",
            Material.COOKED_CHICKEN,
            "§x§F§F§8§8§0§0Frango Seco",
            "",
            "&7Peito de frango temperado e seco,",
            "&7extra nutritivo.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack MUTTON_JERKY = new SlimefunItemStack(
            "MUTTON_JERKY",
            Material.COOKED_MUTTON,
            "§x§F§F§8§8§0§0Carneiro Seco",
            "",
            "&7Carne de carneiro curada,",
            "&7extra nutritiva.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack RABBIT_JERKY = new SlimefunItemStack(
            "RABBIT_JERKY",
            Material.COOKED_RABBIT,
            "§x§F§F§8§8§0§0Coelho Seco",
            "",
            "&7Coelho curado e temperado,",
            "&7extra nutritivo.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack FISH_JERKY = new SlimefunItemStack(
            "FISH_JERKY",
            Material.COOKED_COD,
            "§x§F§F§8§8§0§0Peixe Seco",
            "",
            "&7Peixe curado no sal marinho,",
            "&7extra nutritivo.",
            "",
            "&f𳭙");
    public static final SlimefunItemStack KELP_COOKIE = new SlimefunItemStack(
            "KELP_COOKIE",
            Material.COOKIE,
            "§x§2§1§6§6§2§5Biscoito de Alga",
            "",
            "&7Biscoito feito de algas marinhas,",
            "&7saudável e reconfortante.",
            "",
            "&f𳭙");

    /*		Christmas		*/
    public static final SlimefunItemStack CHRISTMAS_MILK = new SlimefunItemStack(
            "CHRISTMAS_MILK",
            Color.WHITE,
            new PotionEffect(PotionEffectType.SATURATION, 4, 0),
            "§x§F§F§F§F§F§FCopo de Leite",
            "",
            LoreBuilder.hunger(2.5),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_MILK = new SlimefunItemStack(
            "CHRISTMAS_CHOCOLATE_MILK",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 11, 0),
            "§x§9§9§4§4§2§2Leite com Chocolate",
            "",
            LoreBuilder.hunger(3.5),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_EGG_NOG = new SlimefunItemStack(
            "CHRISTMAS_EGG_NOG",
            Color.GRAY,
            new PotionEffect(PotionEffectType.SATURATION, 6, 0),
            "§x§F§F§D§D§0§0Gemada",
            "",
            LoreBuilder.hunger(7),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_APPLE_CIDER = new SlimefunItemStack(
            "CHRISTMAS_APPLE_CIDER",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "§x§E§0§1§B§1§BSidra de Maçã",
            "",
            LoreBuilder.hunger(7),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_COOKIE = new SlimefunItemStack(
            "CHRISTMAS_COOKIE",
            Material.COOKIE,
            ChatUtils.christmas("Biscoito Natalino"),
            "",
            "&7Biscoito natalino feito com especiarias",
            "&7especiais da temporada.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_FRUIT_CAKE = new SlimefunItemStack(
            "CHRISTMAS_FRUIT_CAKE",
            Material.PUMPKIN_PIE,
            ChatUtils.christmas("Bolo de Frutas"),
            "",
            "&7Bolo macio recheado com frutas",
            "&7cristalizadas de Natal.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_APPLE_PIE = new SlimefunItemStack(
            "CHRISTMAS_APPLE_PIE",
            Material.PUMPKIN_PIE,
            "§x§F§F§D§D§0§0Torta de Maçã",
            "",
            "&7Torta de maçã com canela,",
            "&7perfeita para o Natal.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_HOT_CHOCOLATE = new SlimefunItemStack(
            "CHRISTMAS_HOT_CHOCOLATE",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "§x§9§9§4§4§2§2Chocolate Quente",
            "",
            LoreBuilder.hunger(7),
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_CAKE = new SlimefunItemStack(
            "CHRISTMAS_CAKE",
            Material.PUMPKIN_PIE,
            ChatUtils.christmas("Bolo de Natal"),
            "",
            "&7O tradicional bolo de Natal,",
            "&7decorado com glacê branco.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_CARAMEL = new SlimefunItemStack(
            "CHRISTMAS_CARAMEL",
            Material.BRICK,
            "§x§F§F§D§D§0§0Caramelo",
            "",
            "&7Caramelo artesanal derretido",
            "&7na colher — doce do Natal.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_CARAMEL_APPLE = new SlimefunItemStack(
            "CHRISTMAS_CARAMEL_APPLE",
            Material.APPLE,
            "§x§F§F§D§D§0§0Maçã Caramelada",
            "",
            "&7Maçã mergulhada em caramelo quente,",
            "&7coberta com açúcar cristal.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_APPLE = new SlimefunItemStack(
            "CHRISTMAS_CHOCOLATE_APPLE",
            Material.APPLE,
            "§x§9§9§4§4§2§2Maçã com Chocolate",
            "",
            "&7Maçã banhada em chocolate amargo,",
            "&7um clássico das festas.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHRISTMAS_PRESENT = new SlimefunItemStack(
            "CHRISTMAS_PRESENT",
            HeadTexture.CHRISTMAS_PRESENT,
            ChatUtils.christmas("Presente de Natal"),
            "&7De: &cTheBusyBiscuit",
            "&7Para: &eVocê",
            "",
            "&9Clique direito para abrir",
            "",
            LoreBuilder.TIER_RARE);

    /*		Easter			*/
    public static final SlimefunItemStack EASTER_EGG = new SlimefunItemStack(
            "EASTER_EGG",
            HeadTexture.EASTER_EGG,
            "§x§F§F§D§D§0§0Ovo de Páscoa",
            "&7Feliz Páscoa! Tem uma surpresa.",
            "",
            "&9Clique direito para abrir",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack EASTER_CARROT_PIE = new SlimefunItemStack(
            "CARROT_PIE",
            Material.PUMPKIN_PIE,
            "§x§F§F§8§8§0§0Torta de Cenoura",
            "",
            "&7Torta de cenoura levemente adocicada,",
            "&7perfeita para a Páscoa.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack EASTER_APPLE_PIE = new SlimefunItemStack(
            "EASTER_APPLE_PIE",
            Material.PUMPKIN_PIE,
            "§x§F§F§D§D§0§0Torta de Maçã",
            "",
            "&7Torta de maçã com canela,",
            "&7uma surpresa de Páscoa.",
            "",
            LoreBuilder.TIER_COMMON);

    /*		 Weapons 		*/
    public static final SlimefunItemStack GRANDMAS_WALKING_STICK = new SlimefunItemStack(
            "GRANDMAS_WALKING_STICK",
            Material.STICK,
            "§x§C§C§C§C§B§BBastão da Vovó",
            "",
            "&7Um bastão surpreendentemente poderoso",
            "&7pertencente a uma vovó muito especial.",
            "",
            "&9Arremessa inimigos para longe",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack GRANDPAS_WALKING_STICK = new SlimefunItemStack(
            "GRANDPAS_WALKING_STICK",
            Material.STICK,
            "§x§C§C§C§C§B§BBastão do Vovô",
            "",
            "&7O bastão do avô, ainda mais poderoso",
            "&7que o da vovó — ninguém sabe como.",
            "",
            "&9Arremessa inimigos muito longe",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack SWORD_OF_BEHEADING = new SlimefunItemStack(
            "SWORD_OF_BEHEADING",
            Material.IRON_SWORD,
            "§x§F§F§A§2§0§0Espada da Decapitação",
            "",
            "&7Uma espada forjada para separar",
            "&7a cabeça do corpo de qualquer criatura.",
            "",
            "&9Decapitação II — &7chance de decapitar mobs",
            "&9(maior chance contra Esqueleto Wither)",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack BLADE_OF_VAMPIRES = new SlimefunItemStack(
            "BLADE_OF_VAMPIRES",
            Material.GOLDEN_SWORD,
            "§x§E§0§1§B§1§BLâmina dos Vampiros",
            "",
            "&7Uma lâmina amaldiçoada que drena",
            "&7a força vital dos inimigos.",
            "",
            "&9Roubo de Vida I — &745% de chance de",
            "&7recuperar 2 corações ao atacar",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SEISMIC_AXE = new SlimefunItemStack(
            "SEISMIC_AXE",
            Material.IRON_AXE,
            "§x§2§1§6§6§2§5Machado Sísmico",
            "",
            "&7Um machado que concentra energia",
            "&7e libera um terremoto portátil.",
            "",
            "&9&oClique direito para usar",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);

    static {
        GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);

        BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 4);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.SHARPNESS, 2);
    }

    /*		Bows		*/
    public static final SlimefunItemStack EXPLOSIVE_BOW = new SlimefunItemStack(
            "EXPLOSIVE_BOW",
            Material.BOW,
            "§x§F§F§8§8§0§0Arco Explosivo",
            "",
            "&7Arco encantado cujas flechas",
            "&7arremessam inimigos para o ar.",
            "",
            "&9Flechas lançam inimigos para cima",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack ICY_BOW = new SlimefunItemStack(
            "ICY_BOW",
            Material.BOW,
            "§x§0§0§8§0§F§FArco Glacial",
            "",
            "&7Arco encantado com gelo eterno",
            "&7que congela inimigos ao acertar.",
            "",
            "&9Congela inimigos por 2 segundos",
            "",
            "&f𳭚 𝼩");

    /*		 Tools		*/
    public static final SlimefunItemStack SMELTERS_PICKAXE = new SlimefunItemStack(
            "SMELTERS_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "§x§F§F§D§D§0§0Picareta de Fundição",
            "",
            "&7Picareta encantada que funde",
            "&7automaticamente o minério ao extrair.",
            "",
            "&9Auto-Fundição — &7funciona com Fortune",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack LUMBER_AXE = new SlimefunItemStack(
            "LUMBER_AXE",
            Material.DIAMOND_AXE,
            "§x§C§C§7§7§4§4Machado do Lenhador",
            "",
            "&7Um machado encantado que derruba",
            "&7a árvore inteira de um só golpe.",
            "",
            "&9Corte Total — &7derruba toda a árvore",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack PICKAXE_OF_CONTAINMENT = new SlimefunItemStack(
            "PICKAXE_OF_CONTAINMENT",
            Material.IRON_PICKAXE,
            "§x§1§9§2§F§6§1Picareta de Contenção",
            "",
            "&7Uma picareta especial capaz de",
            "&7capturar e transportar geradores de mobs.",
            "",
            "&9Captura Spawners &7ao quebrá-los",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack EXPLOSIVE_PICKAXE = new SlimefunItemStack(
            "EXPLOSIVE_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "§x§F§F§8§8§0§0Picareta Explosiva",
            "",
            "&7Picareta imbuída com energia",
            "&7explosiva que minera em área.",
            "",
            "&9Mine em área — &7funciona com Fortune",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack EXPLOSIVE_SHOVEL = new SlimefunItemStack(
            "EXPLOSIVE_SHOVEL",
            Material.DIAMOND_SHOVEL,
            "§x§F§F§8§8§0§0Pá Explosiva",
            "",
            "&7Pá imbuída com energia explosiva",
            "&7que escava vários blocos de uma vez.",
            "",
            "&9Escava em área",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack PICKAXE_OF_THE_SEEKER = new SlimefunItemStack(
            "PICKAXE_OF_THE_SEEKER",
            Material.DIAMOND_PICKAXE,
            "§x§2§1§6§6§2§5Picareta de Prospecção",
            "",
            "&7Picareta mágica que sempre aponta",
            "&7para o minério mais próximo.",
            "",
            "&9Clique direito para localizar o minério mais próximo",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack COBALT_PICKAXE = new SlimefunItemStack(
            "COBALT_PICKAXE",
            Material.IRON_PICKAXE,
            "§x§3§3§5§5§A§APicareta de Cobalto",
            "",
            "&7Picareta de cobalto resistente e",
            "&7com alta eficiência de mineração.",
            "",
            "&9Alta durabilidade e eficiência",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack PICKAXE_OF_VEIN_MINING = new SlimefunItemStack(
            "PICKAXE_OF_VEIN_MINING",
            Material.DIAMOND_PICKAXE,
            "§x§F§F§D§D§0§0Picareta de Mineração em Veia",
            "",
            "&7Picareta que extrai toda a veia",
            "&7de minério de uma só vez.",
            "",
            "&9Minera toda a veia conectada",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack CLIMBING_PICK = new SlimefunItemStack(
            "CLIMBING_PICK",
            Material.IRON_PICKAXE,
            "§x§0§0§9§9§D§DPicareta de Escalada",
            "",
            "&7Uma picareta com ganchos especiais",
            "&7que permitem escalar superfícies verticais.",
            "",
            "&9Clique direito para escalar paredes",
            "&9Encante com Efficiency para subir mais rápido",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);

    static {
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.EFFICIENCY, 6);
    }

    /*		 Armor 		*/
    public static final SlimefunItemStack GLOWSTONE_HELMET = new SlimefunItemStack(
            "GLOWSTONE_HELMET",
            Material.LEATHER_HELMET,
            Color.YELLOW,
            "§x§F§F§D§D§0§0Capacete de Glow",
            "",
            "&7Capacete impregnado com pó de glowstone,",
            "&7brilha como o sol.",
            "",
            "&9+ Visão Noturna",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack GLOWSTONE_CHESTPLATE = new SlimefunItemStack(
            "GLOWSTONE_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.YELLOW,
            "§x§F§F§D§D§0§0Peitoral de Glow",
            "",
            "&7Armadura luminosa que brilha",
            "&7mesmo nas trevas mais profundas.",
            "",
            "&9+ Visão Noturna",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack GLOWSTONE_LEGGINGS = new SlimefunItemStack(
            "GLOWSTONE_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.YELLOW,
            "§x§F§F§D§D§0§0Calças de Glow",
            "",
            "&7Calças com cristais de glowstone",
            "&7bordados ao longo das pernas.",
            "",
            "&9+ Visão Noturna",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack GLOWSTONE_BOOTS = new SlimefunItemStack(
            "GLOWSTONE_BOOTS",
            Material.LEATHER_BOOTS,
            Color.YELLOW,
            "§x§F§F§D§D§0§0Botas de Glow",
            "",
            "&7Botas que iluminam o caminho",
            "&7em qualquer escuridão.",
            "",
            "&9+ Visão Noturna",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack RAINBOW_LEATHER = new SlimefunItemStack(
            "RAINBOW_LEATHER",
            Material.RABBIT_HIDE,
            Color.FUCHSIA,
            "§x§F§F§0§0§F§FCouro Arco-Íris",
            "",
            "&7Couro especial que muda de cor",
            "&7usada para criar armadura arco-íris.",
            "",
            "&f𳭚");
    public static final SlimefunItemStack RAINBOW_HELMET = new SlimefunItemStack(
            "RAINBOW_HELMET",
            Material.LEATHER_HELMET,
            Color.FUCHSIA,
            "§x§F§F§0§0§F§FCapacete Arco-Íris",
            "",
            "&7Capacete que muda de cor continuamente,",
            "&7confundindo qualquer inimigo.",
            "",
            LoreBuilder.RAINBOW,
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack RAINBOW_CHESTPLATE = new SlimefunItemStack(
            "RAINBOW_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.FUCHSIA,
            "§x§F§F§0§0§F§FPeitoral Arco-Íris",
            "",
            "&7Armadura que irradia todas as cores",
            "&7do espectro visível.",
            "",
            LoreBuilder.RAINBOW,
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack RAINBOW_LEGGINGS = new SlimefunItemStack(
            "RAINBOW_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.FUCHSIA,
            "§x§F§F§0§0§F§FCalças Arco-Íris",
            "",
            "&7Calças de couro encantado que",
            "&7emitem luz multicolorida.",
            "",
            LoreBuilder.RAINBOW,
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack RAINBOW_BOOTS = new SlimefunItemStack(
            "RAINBOW_BOOTS",
            Material.LEATHER_BOOTS,
            Color.FUCHSIA,
            "§x§F§F§0§0§F§FBotas Arco-Íris",
            "",
            "&7Botas que deixam rastros coloridos",
            "&7em todo lugar que pisam.",
            "",
            LoreBuilder.RAINBOW,
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack ENDER_HELMET = new SlimefunItemStack(
            "ENDER_HELMET",
            Material.LEATHER_HELMET,
            Color.fromRGB(28, 25, 112),
            "§x§5§5§0§0§9§9Capacete do Ender",
            "",
            "&7Capacete infundido com a energia",
            "&7caótica do End.",
            "",
            "&9Parte do set Ender",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack ENDER_CHESTPLATE = new SlimefunItemStack(
            "ENDER_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.fromRGB(28, 25, 112),
            "§x§5§5§0§0§9§9Peitoral do Ender",
            "",
            "&7Armadura do End que teletransporta",
            "&7seu usuário quando ferido.",
            "",
            "&9Parte do set Ender",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack ENDER_LEGGINGS = new SlimefunItemStack(
            "ENDER_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.fromRGB(28, 25, 112),
            "§x§5§5§0§0§9§9Calças do Ender",
            "",
            "&7Calças do End tecidas com",
            "&7energia dimensional.",
            "",
            "&9Parte do set Ender",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack ENDER_BOOTS = new SlimefunItemStack(
            "ENDER_BOOTS",
            Material.LEATHER_BOOTS,
            Color.fromRGB(28, 25, 112),
            "§x§5§5§0§0§9§9Botas do Ender",
            "",
            "&7Botas do End que neutralizam",
            "&7o dano de pérolas do Ender.",
            "",
            "&9+ Sem dano de pérolas do Ender",
            "",
            "&f𳭉 𝼩");

    public static final SlimefunItemStack SLIME_HELMET = new SlimefunItemStack(
            "SLIME_HELMET",
            Material.LEATHER_HELMET,
            Color.LIME,
            "§x§2§1§6§6§2§5Capacete de Slime",
            "",
            "&7Capacete feito de slime comprimido,",
            "&7maleável e resistente.",
            "",
            "&9Parte do set Slime",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack SLIME_CHESTPLATE = new SlimefunItemStack(
            "SLIME_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.LIME,
            "§x§2§1§6§6§2§5Peitoral de Slime",
            "",
            "&7Armadura viscosa que absorve",
            "&7impactos como gelatina.",
            "",
            "&9Parte do set Slime",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack SLIME_LEGGINGS = new SlimefunItemStack(
            "SLIME_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.LIME,
            "§x§2§1§6§6§2§5Calças de Slime",
            "",
            "&7Calças elásticas de slime",
            "&7que aumentam a velocidade.",
            "",
            "&9+ Velocidade",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack SLIME_BOOTS = new SlimefunItemStack(
            "SLIME_BOOTS",
            Material.LEATHER_BOOTS,
            Color.LIME,
            "§x§2§1§6§6§2§5Botas de Slime",
            "",
            "&7Botas de slime que amortizam",
            "&7qualquer queda e saltam alto.",
            "",
            "&9+ Salto Elevado · + Sem dano de queda",
            "",
            "&f𳭚 𝼩");

    public static final SlimefunItemStack CACTUS_HELMET = new SlimefunItemStack(
            "CACTUS_HELMET",
            Material.LEATHER_HELMET,
            Color.GREEN,
            "§x§2§1§6§6§2§5Capacete de Cacto",
            "",
            "&7Capacete de espinhos de cacto",
            "&7que reflete dano aos atacantes.",
            "",
            "&9+ Espinhos",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack CACTUS_CHESTPLATE = new SlimefunItemStack(
            "CACTUS_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.GREEN,
            "§x§2§1§6§6§2§5Peitoral de Cacto",
            "",
            "&7Armadura coberta de espinhos",
            "&7que ferem qualquer atacante.",
            "",
            "&9+ Espinhos",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack CACTUS_LEGGINGS = new SlimefunItemStack(
            "CACTUS_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.GREEN,
            "§x§2§1§6§6§2§5Calças de Cacto",
            "",
            "&7Calças com espinhos nas laterais",
            "&7para proteção defensiva.",
            "",
            "&9+ Espinhos",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack CACTUS_BOOTS = new SlimefunItemStack(
            "CACTUS_BOOTS",
            Material.LEATHER_BOOTS,
            Color.GREEN,
            "§x§2§1§6§6§2§5Botas de Cacto",
            "",
            "&7Botas com sola de espinhos",
            "&7que machucam quem pisar.",
            "",
            "&9+ Espinhos",
            "",
            "&f𳭚 𝼩");

    public static final SlimefunItemStack DAMASCUS_STEEL_HELMET = new SlimefunItemStack(
            "DAMASCUS_STEEL_HELMET",
            Material.IRON_HELMET,
            "§x§4§A§4§A§5§ACapacete de Aço de Damasco",
            "",
            "&7Forjado com padrões ondulados ancestrais,",
            "&7extremamente resistente a impactos.",
            "",
            "&7Parte do set §x§4§A§4§A§5§AAço de Damasco&7.",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack DAMASCUS_STEEL_CHESTPLATE = new SlimefunItemStack(
            "DAMASCUS_STEEL_CHESTPLATE",
            Material.IRON_CHESTPLATE,
            "§x§4§A§4§A§5§APeitoral de Aço de Damasco",
            "",
            "&7Liga ancestral forjada em temperaturas extremas,",
            "&7distribui os impactos por toda a armadura.",
            "",
            "&7Parte do set §x§4§A§4§A§5§AAço de Damasco&7.",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack DAMASCUS_STEEL_LEGGINGS = new SlimefunItemStack(
            "DAMASCUS_STEEL_LEGGINGS",
            Material.IRON_LEGGINGS,
            "§x§4§A§4§A§5§ACalças de Aço de Damasco",
            "",
            "&7Tecido metálico de padrão ondulado,",
            "&7leve e inquebrável.",
            "",
            "&7Parte do set §x§4§A§4§A§5§AAço de Damasco&7.",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack DAMASCUS_STEEL_BOOTS = new SlimefunItemStack(
            "DAMASCUS_STEEL_BOOTS",
            Material.IRON_BOOTS,
            "§x§4§A§4§A§5§ABotas de Aço de Damasco",
            "",
            "&7Botas forjadas com a mesma liga",
            "&7das espadas lendárias do Oriente.",
            "",
            "&7Parte do set §x§4§A§4§A§5§AAço de Damasco&7.",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);

    public static final SlimefunItemStack REINFORCED_ALLOY_HELMET = new SlimefunItemStack(
            "REINFORCED_ALLOY_HELMET",
            Material.IRON_HELMET,
            "§x§A§A§8§8§4§4Capacete de Liga Reforçada",
            "",
            "&7O ápice da metalurgia do Slimefun,",
            "&7forjado com os metais mais nobres.",
            "",
            "&7Parte do set §x§A§A§8§8§4§4Liga Reforçada&7.",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack REINFORCED_ALLOY_CHESTPLATE = new SlimefunItemStack(
            "REINFORCED_ALLOY_CHESTPLATE",
            Material.IRON_CHESTPLATE,
            "§x§A§A§8§8§4§4Peitoral de Liga Reforçada",
            "",
            "&7Armadura quase indestrutível, combina",
            "&7as melhores propriedades de cada metal.",
            "",
            "&7Parte do set §x§A§A§8§8§4§4Liga Reforçada&7.",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack REINFORCED_ALLOY_LEGGINGS = new SlimefunItemStack(
            "REINFORCED_ALLOY_LEGGINGS",
            Material.IRON_LEGGINGS,
            "§x§A§A§8§8§4§4Calças de Liga Reforçada",
            "",
            "&7Proteção máxima sem comprometer",
            "&7a mobilidade do portador.",
            "",
            "&7Parte do set §x§A§A§8§8§4§4Liga Reforçada&7.",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack REINFORCED_ALLOY_BOOTS = new SlimefunItemStack(
            "REINFORCED_ALLOY_BOOTS",
            Material.IRON_BOOTS,
            "§x§A§A§8§8§4§4Botas de Liga Reforçada",
            "",
            "&7Botas de proteção máxima, capazes de",
            "&7absorver qualquer impacto de queda.",
            "",
            "&7Parte do set §x§A§A§8§8§4§4Liga Reforçada&7.",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);

    private static final List<String> hazmatLore = new ArrayList<>();

    static {
        hazmatLore.add("");
        hazmatLore.add(ChatColor.GOLD + "Full set effects:");
        hazmatLore.add(ChatColor.YELLOW + "- Radiation immunity");
        hazmatLore.add(ChatColor.YELLOW + "- Bee Sting protection");
    }

    public static final SlimefunItemStack SCUBA_HELMET = new SlimefunItemStack(
            "SCUBA_HELMET",
            Material.LEATHER_HELMET,
            Color.ORANGE,
            "§x§F§F§8§8§0§0Capacete de Mergulho",
            "",
            "&7Capacete pressurizado que permite",
            "&7respirar nas profundezas dos oceanos.",
            "",
            "&9+ Respiração subaquática",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack HAZMAT_CHESTPLATE = new SlimefunItemStack(
            "HAZMAT_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.ORANGE,
            "§x§F§F§8§8§0§0Traje Hazmat",
            "",
            "&7Traje de proteção contra materiais",
            "&7perigosos e ambientes extremos.",
            "",
            "&7Permite caminhar pelo fogo e lava",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack HAZMAT_LEGGINGS = new SlimefunItemStack(
            "HAZMAT_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.ORANGE,
            "§x§F§F§8§8§0§0Calças Hazmat",
            "",
            ChatColor.GOLD + "Efeitos do set completo:",
            ChatColor.YELLOW + "- Imunidade à radiação",
            ChatColor.YELLOW + "- Proteção contra picadas de abelha",
            "",
            LoreBuilder.TIER_EPIC + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack HAZMAT_BOOTS = new SlimefunItemStack(
            "RUBBER_BOOTS",
            Material.LEATHER_BOOTS,
            Color.BLACK,
            "§x§F§F§8§8§0§0Botas Hazmat",
            "",
            ChatColor.GOLD + "Efeitos do set completo:",
            ChatColor.YELLOW + "- Imunidade à radiação",
            ChatColor.YELLOW + "- Proteção contra picadas de abelha",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);

    static {
        ItemMeta helmetMeta = SCUBA_HELMET.getItemMeta();
        List<String> helmetLore = helmetMeta.getLore();
        helmetLore.addAll(hazmatLore);
        helmetMeta.setLore(helmetLore);
        SCUBA_HELMET.setItemMeta(helmetMeta);

        ItemMeta chestplateMeta = HAZMAT_CHESTPLATE.getItemMeta();
        List<String> chestplateLore = chestplateMeta.getLore();
        chestplateLore.addAll(hazmatLore);
        chestplateMeta.setLore(chestplateLore);
        HAZMAT_CHESTPLATE.setItemMeta(chestplateMeta);
    }

    public static final SlimefunItemStack GILDED_IRON_HELMET = new SlimefunItemStack(
            "GILDED_IRON_HELMET",
            Material.GOLDEN_HELMET,
            "§x§F§F§C§C§0§0Capacete de Ferro Dourado",
            "",
            "&7Ferro banhado em ouro puro,",
            "&7une resistência com elegância.",
            "",
            "&7Parte do set §x§F§F§C§C§0§0Ferro Dourado&7.",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack GILDED_IRON_CHESTPLATE = new SlimefunItemStack(
            "GILDED_IRON_CHESTPLATE",
            Material.GOLDEN_CHESTPLATE,
            "§x§F§F§C§C§0§0Peitoral de Ferro Dourado",
            "",
            "&7Armadura que combina a dureza do ferro",
            "&7com o brilho nobre do ouro.",
            "",
            "&7Parte do set §x§F§F§C§C§0§0Ferro Dourado&7.",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack GILDED_IRON_LEGGINGS = new SlimefunItemStack(
            "GILDED_IRON_LEGGINGS",
            Material.GOLDEN_LEGGINGS,
            "§x§F§F§C§C§0§0Calças de Ferro Dourado",
            "",
            "&7Proteção reluzente forjada",
            "&7com ferro e ouro em fusão.",
            "",
            "&7Parte do set §x§F§F§C§C§0§0Ferro Dourado&7.",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack GILDED_IRON_BOOTS = new SlimefunItemStack(
            "GILDED_IRON_BOOTS",
            Material.GOLDEN_BOOTS,
            "§x§F§F§C§C§0§0Botas de Ferro Dourado",
            "",
            "&7Botas que combinam resistência e luxo,",
            "&7dignas de um artesão mestre.",
            "",
            "&7Parte do set §x§F§F§C§C§0§0Ferro Dourado&7.",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);

    public static final SlimefunItemStack GOLDEN_HELMET_12K = new SlimefunItemStack(
            "GOLD_12K_HELMET",
            Material.GOLDEN_HELMET,
            "§x§D§D§C§C§0§0Capacete de Ouro 12K",
            "",
            "&7Capacete de ouro 12 quilates,",
            "&7elegante e resistente.",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack GOLDEN_CHESTPLATE_12K = new SlimefunItemStack(
            "GOLD_12K_CHESTPLATE",
            Material.GOLDEN_CHESTPLATE,
            "§x§D§D§C§C§0§0Peitoral de Ouro 12K",
            "",
            "&7Armadura de ouro 12 quilates,",
            "&7vistosa e protetora.",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack GOLDEN_LEGGINGS_12K = new SlimefunItemStack(
            "GOLD_12K_LEGGINGS",
            Material.GOLDEN_LEGGINGS,
            "§x§D§D§C§C§0§0Calças de Ouro 12K",
            "",
            "&7Calças forjadas com ouro 12 quilates,",
            "&7reluzentes e duráveis.",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack GOLDEN_BOOTS_12K = new SlimefunItemStack(
            "GOLD_12K_BOOTS",
            Material.GOLDEN_BOOTS,
            "§x§D§D§C§C§0§0Botas de Ouro 12K",
            "",
            "&7Botas de ouro 12 quilates,",
            "&7dignas de um rei.",
            "",
            "&f𳭉 𝼩");

    public static final SlimefunItemStack SLIME_HELMET_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_HELMET",
            Material.IRON_HELMET,
            "§x§2§1§6§6§2§5Capacete de Slime Reforçado",
            "",
            "&7Slime fundido com aço para",
            "&7maior resistência.",
            "",
            "&9+ Elasticidade",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack SLIME_CHESTPLATE_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_CHESTPLATE",
            Material.IRON_CHESTPLATE,
            "§x§2§1§6§6§2§5Peitoral de Slime Reforçado",
            "",
            "&7Combinação de slime e aço que",
            "&7absorve e repele impactos.",
            "",
            "&9+ Elasticidade",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack SLIME_LEGGINGS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_LEGGINGS",
            Material.IRON_LEGGINGS,
            "§x§2§1§6§6§2§5Calças de Slime Reforçado",
            "",
            "&7Calças híbridas de slime e aço",
            "&7que aumentam velocidade.",
            "",
            "&9+ Velocidade",
            "",
            "&f𳭉 𝼩");
    public static final SlimefunItemStack SLIME_BOOTS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_BOOTS",
            Material.IRON_BOOTS,
            "§x§2§1§6§6§2§5Botas de Slime Reforçado",
            "",
            "&7Botas de slime com reforço de aço",
            "&7para máxima mobilidade.",
            "",
            "&9+ Salto Elevado · + Sem dano de queda",
            "",
            "&f𳭉 𝼩");

    public static final SlimefunItemStack BOOTS_OF_THE_STOMPER = new SlimefunItemStack(
            "BOOTS_OF_THE_STOMPER",
            Material.LEATHER_BOOTS,
            Color.AQUA,
            "§x§0§0§9§9§D§DBotas do Destruidor",
            "",
            "&7Botas que transferem todo o dano",
            "&7de queda para inimigos próximos.",
            "",
            "&9+ Sem dano de queda",
            "&9Transfere dano de queda a inimigos",
            "",
            "&f𳭉 𝼩");

    public static final SlimefunItemStack BEE_HELMET = new SlimefunItemStack(
            "BEE_HELMET",
            Material.GOLDEN_HELMET,
            "§x§F§F§D§D§0§0Capacete da Abelha",
            "",
            "&7Capacete moldado em colmeia,",
            "&7digno de uma rainha.",
            "",
            "&9Parte do set Abelha",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack BEE_WINGS = new SlimefunItemStack(
            "BEE_WINGS",
            Material.ELYTRA,
            "§x§F§F§D§D§0§0Asas de Abelha",
            "",
            "&7Asas douradas de abelha que ativam",
            "&7queda lenta ao se aproximar do chão.",
            "",
            "&9Queda lenta ao se aproximar do chão",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack BEE_LEGGINGS = new SlimefunItemStack(
            "BEE_LEGGINGS",
            Material.GOLDEN_LEGGINGS,
            "§x§F§F§D§D§0§0Calças da Abelha",
            "",
            "&7Calças listradas de abelha,",
            "&7leves como o voo.",
            "",
            "&9Parte do set Abelha",
            "",
            "&f𳭚 𝼩");
    public static final SlimefunItemStack BEE_BOOTS = new SlimefunItemStack(
            "BEE_BOOTS",
            Material.GOLDEN_BOOTS,
            "§x§F§F§D§D§0§0Botas da Abelha",
            "",
            "&7Botas com molas de colmeia",
            "&7para saltar como uma abelha.",
            "",
            "&9+ Salto Elevado · + Sem dano de queda",
            "",
            "&f𳭚 𝼩");

    static {
        Map<Enchantment, Integer> cactusEnchs = new HashMap<>();
        cactusEnchs.put(Enchantment.THORNS, 3);
        cactusEnchs.put(VersionedEnchantment.UNBREAKING, 6);

        CACTUS_HELMET.addUnsafeEnchantments(cactusEnchs);
        CACTUS_CHESTPLATE.addUnsafeEnchantments(cactusEnchs);
        CACTUS_LEGGINGS.addUnsafeEnchantments(cactusEnchs);
        CACTUS_BOOTS.addUnsafeEnchantments(cactusEnchs);

        Map<Enchantment, Integer> damascusEnchs = new HashMap<>();
        damascusEnchs.put(VersionedEnchantment.UNBREAKING, 5);
        damascusEnchs.put(VersionedEnchantment.PROTECTION, 5);

        DAMASCUS_STEEL_HELMET.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_CHESTPLATE.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_LEGGINGS.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_BOOTS.addUnsafeEnchantments(damascusEnchs);

        Map<Enchantment, Integer> reinforcedEnchs = new HashMap<>();
        reinforcedEnchs.put(VersionedEnchantment.UNBREAKING, 9);
        reinforcedEnchs.put(VersionedEnchantment.PROTECTION, 9);

        REINFORCED_ALLOY_HELMET.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_CHESTPLATE.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_LEGGINGS.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_BOOTS.addUnsafeEnchantments(reinforcedEnchs);

        Map<Enchantment, Integer> gildedEnchs = new HashMap<>();
        gildedEnchs.put(VersionedEnchantment.UNBREAKING, 6);
        gildedEnchs.put(VersionedEnchantment.PROTECTION, 8);

        GILDED_IRON_HELMET.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_CHESTPLATE.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_LEGGINGS.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_BOOTS.addUnsafeEnchantments(gildedEnchs);

        GOLDEN_HELMET_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_CHESTPLATE_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_LEGGINGS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_BOOTS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);

        Map<Enchantment, Integer> slimeEnchs = new HashMap<>();
        slimeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        slimeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        SLIME_HELMET_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_CHESTPLATE_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_LEGGINGS_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_BOOTS_STEEL.addUnsafeEnchantments(slimeEnchs);

        Map<Enchantment, Integer> beeEnchs = new HashMap<>();
        beeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        beeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        BEE_HELMET.addUnsafeEnchantments(beeEnchs);
        BEE_WINGS.addUnsafeEnchantments(beeEnchs);
        BEE_LEGGINGS.addUnsafeEnchantments(beeEnchs);
        BEE_BOOTS.addUnsafeEnchantments(beeEnchs);
    }

    /*		 Misc 		*/
    public static final SlimefunItemStack MAGIC_LUMP_1 = new SlimefunItemStack(
            "MAGIC_LUMP_1",
            Material.GOLD_NUGGET,
            "&6Fragmento Mágico &7- &eI",
            "",
            "&7Material mágico de nível I.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack MAGIC_LUMP_2 = new SlimefunItemStack(
            "MAGIC_LUMP_2",
            Material.GOLD_NUGGET,
            "&6Fragmento Mágico &7- &eII",
            "",
            "&7Material mágico de nível II.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack MAGIC_LUMP_3 = new SlimefunItemStack(
            "MAGIC_LUMP_3",
            Material.GOLD_NUGGET,
            "&6Fragmento Mágico &7- &eIII",
            "",
            "&7Material mágico de nível III.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENDER_LUMP_1 = new SlimefunItemStack(
            "ENDER_LUMP_1",
            Material.GOLD_NUGGET,
            "&5Fragmento do Ender &7- &eI",
            "",
            "&7Material mágico de nível I.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENDER_LUMP_2 = new SlimefunItemStack(
            "ENDER_LUMP_2",
            Material.GOLD_NUGGET,
            "&5Fragmento do Ender &7- &eII",
            "",
            "&7Material mágico de nível II.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENDER_LUMP_3 = new SlimefunItemStack(
            "ENDER_LUMP_3",
            Material.GOLD_NUGGET,
            "&5Fragmento do Ender &7- &eIII",
            "",
            "&7Material mágico de nível III.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack MAGICAL_BOOK_COVER = new SlimefunItemStack(
            "MAGICAL_BOOK_COVER",
            Material.PAPER,
            "&6Capa de Livro Mágico",
            "",
            "&7Usada na criação de livros mágicos.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack MAGICAL_GLASS = new SlimefunItemStack(
            "MAGICAL_GLASS",
            Material.GLASS_PANE,
            "&6Vidro Mágico",
            "",
            "&7Usado na criação de gadgets mágicos.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SYNTHETIC_SHULKER_SHELL = new SlimefunItemStack(
            "SYNTHETIC_SHULKER_SHELL",
            Material.SHULKER_SHELL,
            "&dConcha de Shulker Sintética",
            "",
            "&fThis item can be used in a",
            "&fworkbench like a normal Shulker Shell",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack BASIC_CIRCUIT_BOARD = new SlimefunItemStack(
            "BASIC_CIRCUIT_BOARD",
            Material.ACTIVATOR_RAIL,
            "&bPlaca de Circuito Básica",
            "",
            "&7Circuito eletrônico simples capaz",
            "&7de controlar funções básicas.",
            "",
            "&7Criada na Bancada Mágica",
            "&7usando Cobre, Silício e Fio.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ADVANCED_CIRCUIT_BOARD = new SlimefunItemStack(
            "ADVANCED_CIRCUIT_BOARD",
            Material.POWERED_RAIL,
            "&bPlaca de Circuito Avançada",
            "",
            "&7Circuito de alta precisão, capaz",
            "&7de controlar máquinas complexas.",
            "",
            "&7Criada combinando Placas Básicas",
            "&7com materiais raros na Mesa Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack WHEAT_FLOUR = new SlimefunItemStack(
            "WHEAT_FLOUR",
            Material.SUGAR,
            "&fFarinha de Trigo",
            "",
            "&7Farinha fina obtida moendo trigo,",
            "&7usada em receitas de comida.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack STEEL_PLATE = new SlimefunItemStack(
            "STEEL_PLATE",
            Material.PAPER,
            "&7&lPlaca de Aço",
            "",
            "&7Chapa plana de aço fundido,",
            "&7utilizada em estruturas e armaduras.",
            "",
            "&7Criada prensando Lingote de Aço",
            "&7na Prensa Elétrica.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack BATTERY = new SlimefunItemStack(
            "BATTERY",
            HeadTexture.BATTERY,
            "&6Bateria",
            "",
            "&7Célula de energia capaz de",
            "&7armazenar eletricidade.",
            "",
            "&7Usada para alimentar equipamentos",
            "&7portáteis do Slimefun.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARBON = new SlimefunItemStack(
            "CARBON",
            HeadTexture.CARBON,
            "&eCarbono",
            "",
            "&7Elemento puro na forma de carbono",
            "&7vegetal comprimido.",
            "",
            "&7Criado queimando Madeira",
            "&7na Prensa Elétrica do Slimefun.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack COMPRESSED_CARBON = new SlimefunItemStack(
            "COMPRESSED_CARBON",
            HeadTexture.COMPRESSED_CARBON,
            "&cCarbono Comprimido",
            "",
            "&7Carbono prensado sob alta pressão,",
            "&7de densidade muito superior.",
            "",
            "&7Criado prensando Carbono",
            "&7repetidamente na Prensa Elétrica.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack CARBON_CHUNK = new SlimefunItemStack(
            "CARBON_CHUNK",
            HeadTexture.CARBON,
            "&4Bloco de Carbono",
            "",
            "&7Carbono em estado máximo de",
            "&7compressão, quase cristalino.",
            "",
            "&7Criado prensando Carbono Comprimido",
            "&7na Prensa Elétrica.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack STEEL_THRUSTER = new SlimefunItemStack(
            "STEEL_THRUSTER",
            Material.BUCKET,
            "&7&lPropulsor de Aço",
            "",
            "&7Motor de propulsão construído",
            "&7com placas de aço de alta pressão.",
            "",
            "&7Criado na Bancada Mágica",
            "&7para uso em Jetpacks e voadores.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack POWER_CRYSTAL = new SlimefunItemStack(
            "POWER_CRYSTAL",
            HeadTexture.POWER_CRYSTAL,
            "&c&lCristal de Energia",
            "",
            "&7Cristal que pulsa com energia",
            "&7pura, capaz de potencializar máquinas.",
            "",
            "&7Criado na Bancada Mágica",
            "&7combinando materiais raros.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CHAIN = new SlimefunItemStack(
            "CHAIN",
            Material.STRING,
            "&bCorrente",
            "",
            "&7Corrente metálica de elos resistentes,",
            "&7forjada a partir de ferro fundido.",
            "",
            "&7Criada com Ferro e Aço",
            "&7na Bancada Mágica.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack HOOK = new SlimefunItemStack(
            "HOOK",
            Material.FLINT,
            "&bGancho",
            "",
            "&7Gancho metálico usado na fabricação",
            "&7de ferramentas especiais.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SIFTED_ORE = new SlimefunItemStack(
            "SIFTED_ORE",
            Material.GUNPOWDER,
            "&6Minério Peneirado",
            "",
            "&7Fragmentos brutos de minério",
            "&7separados por peneiramento de cascalho.",
            "",
            "&7Obtido peneirando Cascalho na",
            "&7Máquina de Peneiramento.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack STONE_CHUNK = new SlimefunItemStack(
            "STONE_CHUNK",
            HeadTexture.STONE_CHUNK,
            "&6Fragmento de Pedra",
            "",
            "&7Fragmento irregular de rocha",
            "&7separado durante o peneiramento.",
            "",
            "&7Subproduto obtido na",
            "&7Máquina de Peneiramento.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack LAVA_CRYSTAL = new SlimefunItemStack(
            "LAVA_CRYSTAL",
            HeadTexture.LAVA_CRYSTAL,
            "&4Cristal de Lava",
            "",
            "&7Cristal forjado nas profundezas",
            "&7vulcânicas, ardendo eternamente.",
            "",
            "&7Obtido no Reator Nuclear",
            "&7como subproduto de alta temperatura.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SALT = new SlimefunItemStack(
            "SALT",
            Material.SUGAR,
            "&fSal",
            "",
            "&7Cristais brancos de cloreto",
            "&7de sódio extraídos do solo.",
            "",
            "&7Obtido peneirando areia",
            "&7na Máquina de Peneiramento.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CHEESE = new SlimefunItemStack(
            "CHEESE",
            HeadTexture.CHEESE,
            "&fQueijo",
            "",
            "&7Queijo cremoso feito de",
            "&7Creme de Leite processado.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack BUTTER = new SlimefunItemStack(
            "BUTTER",
            HeadTexture.BUTTER,
            "&fManteiga",
            "",
            "&7Manteiga feita de Creme de Leite,",
            "&7usada em receitas de comida.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack DUCT_TAPE = new SlimefunItemStack(
            "DUCT_TAPE",
            HeadTexture.DUCT_TAPE,
            "&8Fita Adesiva",
            "",
            "&7Fita resistente usada para",
            "&7reparar itens na Bigorna Automática.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack HEAVY_CREAM = new SlimefunItemStack(
            "HEAVY_CREAM",
            Material.SNOWBALL,
            "&fCreme de Leite",
            "",
            "&7Creme de Leite espesso obtido",
            "&7processando leite fresco.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CRUSHED_ORE = new SlimefunItemStack(
            "CRUSHED_ORE",
            Material.GUNPOWDER,
            "&6Minério Triturado",
            "",
            "&7Minério fragmentado em pedaços",
            "&7menores para facilitar o refino.",
            "",
            "&7Produzido no Triturador de Minério",
            "&7a partir de minério bruto.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack PULVERIZED_ORE = new SlimefunItemStack(
            "PULVERIZED_ORE",
            Material.GUNPOWDER,
            "&6Minério Pulverizado",
            "",
            "&7Minério reduzido a pó fino,",
            "&7maximizando o rendimento na fundição.",
            "",
            "&7Produzido no Lavador de Minério",
            "&7a partir de minério triturado.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack PURE_ORE_CLUSTER = new SlimefunItemStack(
            "PURE_ORE_CLUSTER",
            Material.GUNPOWDER,
            "&6Cluster de Minério Puro",
            "",
            "&7Cristais de minério de altíssima",
            "&7pureza, prontos para fundição.",
            "",
            "&7Produto final da cadeia de",
            "&7processamento de minérios.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SMALL_URANIUM = new SlimefunItemStack(
            "SMALL_URANIUM",
            HeadTexture.URANIUM,
            "§x§6§6§E§E§3§3Urânio Pequeno",
            "",
            "&7Fragmento de urânio com radioatividade moderada.",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TINY_URANIUM = new SlimefunItemStack(
            "TINY_URANIUM",
            HeadTexture.URANIUM,
            "§x§8§8§F§F§4§4Urânio Mínimo",
            "",
            "&7Traço de urânio levemente radioativo,",
            "&7seguro em pequenas doses.",
            "",
            LoreBuilder.radioactive(Radioactivity.LOW),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack MAGNET = new SlimefunItemStack(
            "MAGNET",
            HeadTexture.MAGNET,
            "&cÍmã",
            "",
            "&7Barra metálica com campo magnético",
            "&7permanente de média intensidade.",
            "",
            "&7Criado com Ferro e Flint and Steel",
            "&7na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack NECROTIC_SKULL = new SlimefunItemStack(
            "NECROTIC_SKULL",
            HeadTexture.NECROTIC_SKULL,
            "&cCrânio Necrótico",
            "",
            "&7Crânio de Esqueleto Wither imbuído",
            "&7com energia necromântica.",
            "",
            "&7Obtido como drop raro do",
            "&7Esqueleto Wither.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ESSENCE_OF_AFTERLIFE = new SlimefunItemStack(
            "ESSENCE_OF_AFTERLIFE",
            Material.GUNPOWDER,
            "&4Essência da Além-Vida",
            "",
            "&7Essência etérea capturada no",
            "&7momento da morte de criaturas.",
            "",
            "&7Obtida do Crânio Necrótico na",
            "&7Bancada Mágica.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack STRANGE_NETHER_GOO = new SlimefunItemStack(
            "STRANGE_NETHER_GOO",
            Material.PURPLE_DYE,
            "&5Gosma Estranha do Nether",
            "",
            "&7Substância viscosa e roxa extraída",
            "&7das paredes do Nether.",
            "",
            "&7Obtida peneirando Cascalho do Nether",
            "&7na Máquina de Peneiramento.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRO_MAGNET = new SlimefunItemStack(
            "ELECTRO_MAGNET",
            HeadTexture.MAGNET,
            "&cEletroímã",
            "",
            "&7Ímã ativado eletricamente com",
            "&7campo magnético muito superior.",
            "",
            "&7Criado combinando Ímã e Fio de Cobre",
            "&7na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack HEATING_COIL = new SlimefunItemStack(
            "HEATING_COIL",
            HeadTexture.HEATING_COIL,
            "&cBobina de Aquecimento",
            "",
            "&7Bobina resistiva que converte energia",
            "&7elétrica em calor intenso.",
            "",
            "&7Componente essencial em máquinas",
            "&7de alta temperatura.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack COOLING_UNIT = new SlimefunItemStack(
            "COOLING_UNIT",
            HeadTexture.COOLING_UNIT,
            "&bUnidade de Resfriamento",
            "",
            "&7Módulo de resfriamento que dissipa",
            "&7calor de máquinas elétricas.",
            "",
            "&7Componente essencial em máquinas",
            "&7de alta temperatura.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_MOTOR = new SlimefunItemStack(
            "ELECTRIC_MOTOR",
            HeadTexture.MOTOR,
            "&cMotor Elétrico",
            "",
            "&7Motor que converte energia elétrica",
            "&7em movimento mecânico.",
            "",
            "&7Usado na construção de máquinas",
            "&7elétricas avançadas.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARGO_MOTOR = new SlimefunItemStack(
            "CARGO_MOTOR",
            HeadTexture.CARGO_MOTOR,
            "&3Motor de Carga",
            "",
            "&7Componente essencial para itens",
            "&7relacionados ao Sistema de Carga.",
            "",
            "&7Usado na construção de Nós de Carga.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new SlimefunItemStack(
            "SCROLL_OF_DIMENSIONAL_TELEPOSITION",
            Material.PAPER,
            "&6Pergaminho de Teleposição Dimensional",
            "",
            "&cEste Pergaminho cria um buraco negro",
            "&ctemporário que puxa entidades próximas",
            "&ce as envia para outra dimensão onde",
            "&ctudo é invertido.",
            "",
            "&fEm outras palavras: Gira entidades em 180 graus",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack TOME_OF_KNOWLEDGE_SHARING = new SlimefunItemStack(
            "TOME_OF_KNOWLEDGE_SHARING",
            Material.ENCHANTED_BOOK,
            "&6Tomo de Compartilhamento de Conhecimento",
            "&7Dono: &bNenhum",
            "",
            "&eClique Direito&7 para vincular este Tomo a si mesmo",
            "",
            "",
            "&eClique Direito&7 para obter todas as Pesquisas do",
            "&7dono previamente vinculado",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack HARDENED_GLASS = new SlimefunItemStack(
            "HARDENED_GLASS",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&7Vidro Endurecido",
            "",
            "&fResiste a Explosões",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack WITHER_PROOF_OBSIDIAN = new SlimefunItemStack(
            "WITHER_PROOF_OBSIDIAN",
            Material.OBSIDIAN,
            "&5Obsidiana Anti-Wither",
            "",
            "&fResiste a Explosões",
            "&fResiste a Bosses Wither",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack WITHER_PROOF_GLASS = new SlimefunItemStack(
            "WITHER_PROOF_GLASS",
            Material.PURPLE_STAINED_GLASS,
            "&5Vidro Anti-Wither",
            "",
            "&fResiste a Explosões",
            "&fResiste a Bosses Wither",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack REINFORCED_PLATE = new SlimefunItemStack(
            "REINFORCED_PLATE",
            Material.PAPER,
            "&7Placa Reforçada",
            "",
            "&7Chapa de liga reforçada,",
            "&7praticamente impenetrável.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ANCIENT_PEDESTAL = new SlimefunItemStack(
            "ANCIENT_PEDESTAL",
            Material.DISPENSER,
            "&dPedestal Antigo",
            "",
            "&5Parte do Altar Antigo",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ANCIENT_ALTAR = new SlimefunItemStack(
            "ANCIENT_ALTAR",
            Material.ENCHANTING_TABLE,
            "&dAltar Antigo",
            "",
            "&5Altar Multi-Bloco para",
            "&5Processos de Criação Mágica",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack COPPER_WIRE = new SlimefunItemStack(
            "COPPER_WIRE",
            Material.STRING,
            "&6Fio de Cobre",
            "",
            "&7Fio condutor feito de cobre puro,",
            "&7essencial em circuitos elétricos.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CRAFTING_MOTOR = new SlimefunItemStack(
            "CRAFTING_MOTOR",
            HeadTexture.CRAFTING_MOTOR,
            "&6Motor de Fabricação",
            "",
            "&7Componente essencial dos Auto-Fabricadores.",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack RAINBOW_WOOL = new SlimefunItemStack(
            "RAINBOW_WOOL", Material.WHITE_WOOL, "&5Lã Arco-íris", "", LoreBuilder.RAINBOW, "", LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLASS = new SlimefunItemStack(
            "RAINBOW_GLASS",
            Material.WHITE_STAINED_GLASS,
            "&5Vidro Arco-Íris",
            "",
            LoreBuilder.RAINBOW,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_CLAY = new SlimefunItemStack(
            "RAINBOW_CLAY",
            Material.WHITE_TERRACOTTA,
            "&5Terracota Arco-Íris",
            "",
            LoreBuilder.RAINBOW,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE",
            Material.WHITE_STAINED_GLASS_PANE,
            "&5Placa de Vidro Arco-Íris",
            "",
            LoreBuilder.RAINBOW,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_CONCRETE = new SlimefunItemStack(
            "RAINBOW_CONCRETE",
            Material.WHITE_CONCRETE,
            "&5Concreto Arco-Íris",
            "",
            LoreBuilder.RAINBOW,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&5Terracota Esmaltada Arco-Íris",
            "",
            LoreBuilder.RAINBOW,
            "",
            LoreBuilder.TIER_RARE);

    private static final String CHRISTMAS = ChatUtils.christmas("[Edição de Natal]");

    public static final SlimefunItemStack RAINBOW_WOOL_XMAS = new SlimefunItemStack(
            "RAINBOW_WOOL_XMAS",
            Material.WHITE_WOOL,
            "&5Lã Arco-Íris &7(Natal)",
            "",
            CHRISTMAS,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLASS_XMAS = new SlimefunItemStack(
            "RAINBOW_GLASS_XMAS",
            Material.WHITE_STAINED_GLASS,
            "&5Vidro Arco-Íris &7(Natal)",
            "",
            CHRISTMAS,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_CLAY_XMAS = new SlimefunItemStack(
            "RAINBOW_CLAY_XMAS",
            Material.WHITE_TERRACOTTA,
            "&5Terracota Arco-Íris &7(Natal)",
            "",
            CHRISTMAS,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_XMAS = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_XMAS",
            Material.WHITE_STAINED_GLASS_PANE,
            "&5Placa de Vidro Arco-Íris &7(Natal)",
            "",
            CHRISTMAS,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_CONCRETE_XMAS = new SlimefunItemStack(
            "RAINBOW_CONCRETE_XMAS",
            Material.WHITE_CONCRETE,
            "&5Concreto Arco-Íris &7(Natal)",
            "",
            CHRISTMAS,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_XMAS = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_XMAS",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&5Terracota Esmaltada Arco-Íris &7(Natal)",
            "",
            CHRISTMAS,
            "",
            LoreBuilder.TIER_RARE);

    private static final String VALENTINES_DAY = "&5[&dEdição de Dia dos Namorados&5]";

    public static final SlimefunItemStack RAINBOW_WOOL_VALENTINE = new SlimefunItemStack(
            "RAINBOW_WOOL_VALENTINE",
            Material.PINK_WOOL,
            "&5Lã Arco-Íris &7(Dia dos Namorados)",
            "",
            VALENTINES_DAY,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLASS_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_VALENTINE",
            Material.PINK_STAINED_GLASS,
            "&5Vidro Arco-Íris &7(Dia dos Namorados)",
            "",
            VALENTINES_DAY,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_CLAY_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CLAY_VALENTINE",
            Material.PINK_TERRACOTTA,
            "&5Terracota Arco-Íris &7(Dia dos Namorados)",
            "",
            VALENTINES_DAY,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_VALENTINE",
            Material.PINK_STAINED_GLASS_PANE,
            "&5Placa de Vidro Arco-Íris &7(Dia dos Namorados)",
            "",
            VALENTINES_DAY,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_CONCRETE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CONCRETE_VALENTINE",
            Material.PINK_CONCRETE,
            "&5Concreto Arco-Íris &7(Dia dos Namorados)",
            "",
            VALENTINES_DAY,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_VALENTINE",
            Material.PINK_GLAZED_TERRACOTTA,
            "&5Terracota Esmaltada Arco-Íris &7(Dia dos Namorados)",
            "",
            VALENTINES_DAY,
            "",
            LoreBuilder.TIER_RARE);

    private static final String HALLOWEEN = "&c[&6Edição de Halloween&c]";

    public static final SlimefunItemStack RAINBOW_WOOL_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_WOOL_HALLOWEEN",
            Material.ORANGE_WOOL,
            "&5Lã Arco-Íris &7(Halloween)",
            "",
            HALLOWEEN,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLASS_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_HALLOWEEN",
            Material.ORANGE_STAINED_GLASS,
            "&5Vidro Arco-Íris &7(Halloween)",
            "",
            HALLOWEEN,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_CLAY_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CLAY_HALLOWEEN",
            Material.ORANGE_TERRACOTTA,
            "&5Terracota Arco-Íris &7(Halloween)",
            "",
            HALLOWEEN,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_HALLOWEEN",
            Material.ORANGE_STAINED_GLASS_PANE,
            "&5Placa de Vidro Arco-Íris &7(Halloween)",
            "",
            HALLOWEEN,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_CONCRETE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CONCRETE_HALLOWEEN",
            Material.ORANGE_CONCRETE,
            "&5Concreto Arco-Íris &7(Halloween)",
            "",
            HALLOWEEN,
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN",
            Material.ORANGE_GLAZED_TERRACOTTA,
            "&5Terracota Esmaltada Arco-Íris &7(Halloween)",
            "",
            HALLOWEEN,
            "",
            LoreBuilder.TIER_RARE);

    /* Ingots */
    public static final SlimefunItemStack COPPER_INGOT = new SlimefunItemStack(
            "COPPER_INGOT",
            Material.BRICK,
            "&bLingote de Cobre",
            "",
            "&7Metal avermelhado de alta",
            "&7condutividade elétrica e térmica.",
            "",
            "&7Fundido a partir de Pó de Cobre",
            "&7em uma Fundição Elétrica.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack TIN_INGOT = new SlimefunItemStack(
            "TIN_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Estanho",
            "",
            "&7Metal maleável com aparência",
            "&7prateada e fosca.",
            "",
            "&7Fundido a partir de Pó de Estanho",
            "&7em uma Fundição Elétrica.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SILVER_INGOT = new SlimefunItemStack(
            "SILVER_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Prata",
            "",
            "&7Prata refinada de brilho suave",
            "&7e pureza notável.",
            "",
            "&7Obtida fundindo Pó de Prata",
            "&7em uma Fundição Elétrica.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ALUMINUM_INGOT = new SlimefunItemStack(
            "ALUMINUM_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Alumínio",
            "",
            "&7Metal leve e resistente à corrosão,",
            "&7amplamente utilizado em ligas.",
            "",
            "&7Processado a partir de Alumínio Bruto",
            "&7nas máquinas de fundição.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack LEAD_INGOT = new SlimefunItemStack(
            "LEAD_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Chumbo",
            "",
            "&7Metal denso e pesado, conhecido",
            "&7por sua resistência à radiação.",
            "",
            "&7Fundido a partir de Pó de Chumbo",
            "&7em uma Fundição Elétrica.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack ZINC_INGOT = new SlimefunItemStack(
            "ZINC_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Zinco",
            "",
            "&7Metal cinza-azulado extraído das",
            "&7entranhas da terra e refinado.",
            "",
            "&7Obtido processando Zinco Bruto",
            "&7nas máquinas de fundição.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack MAGNESIUM_INGOT = new SlimefunItemStack(
            "MAGNESIUM_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Magnésio",
            "",
            "&7Metal leve com brilho branco",
            "&7prateado e alta reatividade.",
            "",
            "&7Fundido a partir de Pó de Magnésio",
            "&7em uma Fundição Elétrica.",
            "",
            LoreBuilder.TIER_COMMON);

    /*		Alloy (Carbon + Iron)	*/
    public static final SlimefunItemStack STEEL_INGOT = new SlimefunItemStack(
            "STEEL_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Aço",
            "",
            "&7Liga robusta de ferro e carbono,",
            "&7fundamental na engenharia do Slimefun.",
            "",
            "&7Produzido fundindo Ferro e Carbono",
            "&7na Fundição ou Mesa Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Copper + Tin)	*/
    public static final SlimefunItemStack BRONZE_INGOT = new SlimefunItemStack(
            "BRONZE_INGOT",
            Material.BRICK,
            "&bLingote de Bronze",
            "",
            "&7Liga clássica de cobre e estanho,",
            "&7conhecida desde a antiguidade.",
            "",
            "&7Criado fundindo Cobre e Estanho",
            "&7na Fundição ou Mesa Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Copper + Aluminum)	*/
    public static final SlimefunItemStack DURALUMIN_INGOT = new SlimefunItemStack(
            "DURALUMIN_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Duralumin",
            "",
            "&7Liga leve de alumínio e cobre,",
            "&7tão resistente quanto o aço.",
            "",
            "&7Criado fundindo Alumínio e Cobre",
            "&7na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Copper + Silver)	*/
    public static final SlimefunItemStack BILLON_INGOT = new SlimefunItemStack(
            "BILLON_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Bilhão",
            "",
            "&7Liga histórica de prata e cobre",
            "&7com aparência dourada acinzentada.",
            "",
            "&7Criado fundindo Prata e Cobre",
            "&7na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Copper + Zinc)	*/
    public static final SlimefunItemStack BRASS_INGOT = new SlimefunItemStack(
            "BRASS_INGOT",
            Material.GOLD_INGOT,
            "&bLingote de Latão",
            "",
            "&7Liga dourada de cobre e zinco,",
            "&7dúctil e resistente à corrosão.",
            "",
            "&7Criado fundindo Cobre e Zinco",
            "&7na Fundição ou Mesa Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Aluminum + Brass)	*/
    public static final SlimefunItemStack ALUMINUM_BRASS_INGOT = new SlimefunItemStack(
            "ALUMINUM_BRASS_INGOT",
            Material.GOLD_INGOT,
            "&bLiga de Latão Aluminado",
            "",
            "&7Liga de latão enriquecida com alumínio,",
            "&7mais resistente e mais leve.",
            "",
            "&7Criado fundindo Alumínio, Cobre",
            "&7e Zinco na Mesa Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Aluminum + Bronze)	*/
    public static final SlimefunItemStack ALUMINUM_BRONZE_INGOT = new SlimefunItemStack(
            "ALUMINUM_BRONZE_INGOT",
            Material.GOLD_INGOT,
            "&bBronze de Alumínio",
            "",
            "&7Liga de bronze enriquecida com",
            "&7alumínio para maior leveza.",
            "",
            "&7Criado combinando Bronze e",
            "&7Alumínio na Mesa Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Gold + Silver + Copper)	*/
    public static final SlimefunItemStack CORINTHIAN_BRONZE_INGOT = new SlimefunItemStack(
            "CORINTHIAN_BRONZE_INGOT",
            Material.GOLD_INGOT,
            "&bBronze Coríntio",
            "",
            "&7Liga ancestral de cobre, ouro e prata,",
            "&7rara e cobiçada por artesãos lendários.",
            "",
            "&7Criado combinando Bronze, Prata",
            "&7e Ouro na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Lead + Tin)	*/
    public static final SlimefunItemStack SOLDER_INGOT = new SlimefunItemStack(
            "SOLDER_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Solda",
            "",
            "&7Liga de chumbo e estanho usada",
            "&7para unir componentes metálicos.",
            "",
            "&7Criado fundindo Chumbo e Estanho",
            "&7na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Steel + Iron + Carbon)	*/
    public static final SlimefunItemStack DAMASCUS_STEEL_INGOT = new SlimefunItemStack(
            "DAMASCUS_STEEL_INGOT",
            Material.IRON_INGOT,
            "&bAço de Damasco",
            "",
            "&7Liga ancestral de padrão ondulado,",
            "&7produzida sob temperaturas extremas.",
            "",
            "&7Fabricado combinando Aço e outros",
            "&7lingotes na Bancada Mágica.",
            "",
            LoreBuilder.TIER_EPIC);
    /* Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze) */
    public static final SlimefunItemStack HARDENED_METAL_INGOT = new SlimefunItemStack(
            "HARDENED_METAL_INGOT",
            Material.IRON_INGOT,
            "&b&lMetal Fortificado",
            "",
            "&7Liga densa forjada sob pressão",
            "&7extrema, quase indestrutível.",
            "",
            "&7Produzido na Prensa Elétrica",
            "&7combinando ligas avançadas.",
            "",
            LoreBuilder.TIER_EPIC);
    /* Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel) */
    public static final SlimefunItemStack REINFORCED_ALLOY_INGOT = new SlimefunItemStack(
            "REINFORCED_ALLOY_INGOT",
            Material.IRON_INGOT,
            "&b&lLiga Reforçada",
            "",
            "&7O ápice da metalurgia do Slimefun,",
            "&7combinando os metais mais nobres.",
            "",
            "&7Requer múltiplas ligas avançadas",
            "&7forjadas na Bancada Mágica.",
            "",
            LoreBuilder.TIER_EPIC);
    /*		Alloy (Iron + Silicon)		*/
    public static final SlimefunItemStack FERROSILICON = new SlimefunItemStack(
            "FERROSILICON",
            Material.IRON_INGOT,
            "&bFerrosilício",
            "",
            "&7Liga de ferro e silício, essencial",
            "&7na produção de aço elétrico.",
            "",
            "&7Criado combinando Ferro e Silício",
            "&7na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Iron + Gold)			*/
    public static final SlimefunItemStack GILDED_IRON = new SlimefunItemStack(
            "GILDED_IRON",
            Material.GOLD_INGOT,
            "&6&lFerro Dourado",
            "",
            "&7Ferro banhado em ouro puro,",
            "&7unindo resistência e elegância.",
            "",
            "&7Criado combinando Ferro e Ouro",
            "&7na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Redstone + Ferrosilicon)	*/
    public static final SlimefunItemStack REDSTONE_ALLOY = new SlimefunItemStack(
            "REDSTONE_ALLOY",
            Material.BRICK,
            "&cLiga de Redstone",
            "",
            "&7Liga condutora imbuída com a energia",
            "&7elétrica da Redstone.",
            "",
            "&7Criada combinando Ferro e Redstone",
            "&7na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Iron + Copper)		*/
    public static final SlimefunItemStack NICKEL_INGOT = new SlimefunItemStack(
            "NICKEL_INGOT",
            Material.IRON_INGOT,
            "&bLingote de Níquel",
            "",
            "&7Metal prateado com leve tom",
            "&7esverdeado, resistente e dúctil.",
            "",
            "&7Obtido por peneiramento e processamento",
            "&7nas máquinas do Slimefun.",
            "",
            LoreBuilder.TIER_RARE);
    /*		Alloy (Nickel + Iron + Copper)		*/
    public static final SlimefunItemStack COBALT_INGOT = new SlimefunItemStack(
            "COBALT_INGOT",
            Material.IRON_INGOT,
            "&9Lingote de Cobalto",
            "",
            "&7Metal azulado de alta dureza,",
            "&7usado em ligas de grande resistência.",
            "",
            "&7Obtido por peneiramento e processamento",
            "&7nas máquinas do Slimefun.",
            "",
            LoreBuilder.TIER_EPIC);

    /*		Gold		*/
    public static final SlimefunItemStack GOLD_4K = new SlimefunItemStack(
            "GOLD_4K",
            Material.GOLD_INGOT,
            "&fOuro &7(4 Quilates)",
            "",
            "&7Liga de ouro com 16,7% de pureza.",
            "",
            "&7Produzido fundindo Ouro na Fundição.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack GOLD_6K = new SlimefunItemStack(
            "GOLD_6K",
            Material.GOLD_INGOT,
            "&fOuro &7(6 Quilates)",
            "",
            "&7Liga de ouro com 25% de pureza.",
            "",
            "&7Produzido fundindo Ouro na Fundição.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack GOLD_8K = new SlimefunItemStack(
            "GOLD_8K",
            Material.GOLD_INGOT,
            "&fOuro &7(8 Quilates)",
            "",
            "&7Liga de ouro com 33% de pureza.",
            "",
            "&7Produzido fundindo Ouro na Fundição.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack GOLD_10K = new SlimefunItemStack(
            "GOLD_10K",
            Material.GOLD_INGOT,
            "&fOuro &7(10 Quilates)",
            "",
            "&7Liga de ouro com 41,7% de pureza.",
            "",
            "&7Produzido fundindo Ouro na Fundição.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GOLD_12K = new SlimefunItemStack(
            "GOLD_12K",
            Material.GOLD_INGOT,
            "&fOuro &7(12 Quilates)",
            "",
            "&7Ouro 12 quilates com 50% de pureza,",
            "&7valioso em joalheria básica.",
            "",
            "&7Produzido na Fundição combinando Ouro com Prata.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GOLD_14K = new SlimefunItemStack(
            "GOLD_14K",
            Material.GOLD_INGOT,
            "&fOuro &7(14 Quilates)",
            "",
            "&7Ouro 14 quilates, o mais comum",
            "&7em joalheria de qualidade.",
            "",
            "&7Produzido na Fundição do Slimefun.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GOLD_16K = new SlimefunItemStack(
            "GOLD_16K",
            Material.GOLD_INGOT,
            "&fOuro &7(16 Quilates)",
            "",
            "&7Ouro de 66,7% de pureza,",
            "&7já considerado muito precioso.",
            "",
            "&7Produzido na Fundição do Slimefun.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GOLD_18K = new SlimefunItemStack(
            "GOLD_18K",
            Material.GOLD_INGOT,
            "&fOuro &7(18 Quilates)",
            "",
            "&7Ouro 18 quilates, padrão premium",
            "&7em joias finas e equipamentos.",
            "",
            "&7Produzido na Fundição do Slimefun.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack GOLD_20K = new SlimefunItemStack(
            "GOLD_20K",
            Material.GOLD_INGOT,
            "&fOuro &7(20 Quilates)",
            "",
            "&7Ouro de 83% de pureza,",
            "&7extraordinariamente valioso.",
            "",
            "&7Produzido na Fundição do Slimefun.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack GOLD_22K = new SlimefunItemStack(
            "GOLD_22K",
            Material.GOLD_INGOT,
            "&fOuro &7(22 Quilates)",
            "",
            "&7Ouro de 91,7% de pureza,",
            "&7padrão para artesanato supremo.",
            "",
            "&7Produzido na Fundição do Slimefun.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack GOLD_24K = new SlimefunItemStack(
            "GOLD_24K",
            Material.GOLD_INGOT,
            "&fOuro &7(24 Quilates)",
            "",
            "&7Ouro em máxima pureza — 100%",
            "&7de ouro puro, sem impurezas.",
            "",
            "&7Produzido na Fundição do Slimefun",
            "&7usando apenas Ouro puro.",
            "",
            LoreBuilder.TIER_EPIC);

    /*		 Dusts 		*/
    public static final SlimefunItemStack IRON_DUST = new SlimefunItemStack(
            "IRON_DUST",
            Material.GUNPOWDER,
            "&6Pó de Ferro",
            "",
            "&7Partículas metálicas cinzas obtidas",
            "&7triturando ferro bruto.",
            "",
            "&7Processado no Triturador de Minério",
            "&7a partir de minério de ferro.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack GOLD_DUST = new SlimefunItemStack(
            "GOLD_DUST",
            Material.GLOWSTONE_DUST,
            "&6Pó de Ouro",
            "",
            "&7Partículas douradas obtidas",
            "&7triturando pepitas de ouro.",
            "",
            "&7Processado no Triturador de Minério",
            "&7a partir de ouro bruto.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack TIN_DUST = new SlimefunItemStack(
            "TIN_DUST",
            Material.SUGAR,
            "&6Pó de Estanho",
            "",
            "&7Pó prateado fosco obtido",
            "&7triturando minério de estanho.",
            "",
            "&7Processado no Triturador",
            "&7e fundido para o lingote.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack COPPER_DUST = new SlimefunItemStack(
            "COPPER_DUST",
            Material.GLOWSTONE_DUST,
            "&6Pó de Cobre",
            "",
            "&7Fino pó avermelhado obtido",
            "&7triturando minério de cobre.",
            "",
            "&7Processado no Triturador",
            "&7e fundido para obter o lingote.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SILVER_DUST = new SlimefunItemStack(
            "SILVER_DUST",
            Material.SUGAR,
            "&6Pó de Prata",
            "",
            "&7Pó prateado brilhante obtido",
            "&7triturando minério de prata.",
            "",
            "&7Processado no Triturador",
            "&7e fundido para o lingote.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack ALUMINUM_DUST = new SlimefunItemStack(
            "ALUMINUM_DUST",
            Material.SUGAR,
            "&6Pó de Alumínio",
            "",
            "&7Pó prateado levíssimo obtido",
            "&7triturando alumínio bruto.",
            "",
            "&7Processado no Triturador",
            "&7e fundido para o lingote.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack LEAD_DUST = new SlimefunItemStack(
            "LEAD_DUST",
            Material.GUNPOWDER,
            "&6Pó de Chumbo",
            "",
            "&7Pó cinza escuro obtido",
            "&7triturando minério de chumbo.",
            "",
            "&7Processado no Triturador",
            "&7e fundido para o lingote.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SULFATE = new SlimefunItemStack(
            "SULFATE",
            Material.GLOWSTONE_DUST,
            "&6Sulfato",
            "",
            "&7Composto químico obtido durante",
            "&7o peneiramento de minérios.",
            "",
            "&7Subproduto da Máquina de Peneiramento",
            "&7ao processar cascalho.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack ZINC_DUST = new SlimefunItemStack(
            "ZINC_DUST",
            Material.SUGAR,
            "&6Pó de Zinco",
            "",
            "&7Pó cinza-azulado obtido",
            "&7triturando minério de zinco.",
            "",
            "&7Processado no Triturador",
            "&7e fundido para o lingote.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack MAGNESIUM_DUST = new SlimefunItemStack(
            "MAGNESIUM_DUST",
            Material.SUGAR,
            "&6Pó de Magnésio",
            "",
            "&7Pó branco prateado altamente",
            "&7reativo ao contato com água.",
            "",
            "&7Processado no Triturador",
            "&7e fundido para o lingote.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SILICON = new SlimefunItemStack(
            "SILICON",
            Material.FIREWORK_STAR,
            "&6Silício",
            "",
            "&7Elemento semimetálico essencial",
            "&7na fabricação de circuitos.",
            "",
            "&7Obtido peneirando areia de cascalho",
            "&7na Máquina de Peneiramento.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GOLD_24K_BLOCK = new SlimefunItemStack(
            "GOLD_24K_BLOCK",
            Material.GOLD_BLOCK,
            "&fBloco de Ouro &7(24 Quilates)",
            "",
            "&7Bloco compacto de Ouro 24K",
            "&7em máxima pureza.",
            "",
            "&7Criado agrupando 9 lingotes",
            "&7de Ouro 24K.",
            "",
            LoreBuilder.TIER_RARE);

    /*		 Gems 		*/
    public static final SlimefunItemStack SYNTHETIC_DIAMOND = new SlimefunItemStack(
            "SYNTHETIC_DIAMOND",
            Material.DIAMOND,
            "&bDiamante Sintético",
            "",
            "&7Diamante produzido artificialmente,",
            "&7idêntico ao natural em estrutura.",
            "",
            "&7Criado na Bancada Mágica",
            "&7usando Carbonado comprimido.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack SYNTHETIC_EMERALD = new SlimefunItemStack(
            "SYNTHETIC_EMERALD",
            Material.EMERALD,
            "&bEsmeralda Sintética",
            "",
            "&7Esmeralda criada artificialmente",
            "&7com brilho intenso e pureza perfeita.",
            "",
            "&7Criada na Bancada Mágica",
            "&7usando Carbonado e materiais raros.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack SYNTHETIC_SAPPHIRE = new SlimefunItemStack(
            "SYNTHETIC_SAPPHIRE",
            HeadTexture.SAPPHIRE,
            "&bSafira Sintética",
            "",
            "&7Gema azul criada artificialmente",
            "&7com a mesma pureza das naturais.",
            "",
            "&7Criada na Bancada Mágica",
            "&7usando Carbonado e outros materiais.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack CARBONADO = new SlimefunItemStack(
            "CARBONADO",
            HeadTexture.CARBONADO,
            "&b&lCarbonado",
            "",
            "&7&o\"Diamante Negro\"",
            "",
            "&7Gema preciosa criada sob pressão extrema.",
            "",
            "&7Produzida com Carvão Prensado.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack RAW_CARBONADO = new SlimefunItemStack(
            "RAW_CARBONADO", HeadTexture.RAW_CARBONADO, "&bCarbonado Bruto", "", LoreBuilder.TIER_EPIC);

    public static final SlimefunItemStack URANIUM = new SlimefunItemStack(
            "URANIUM",
            HeadTexture.URANIUM,
            "§x§4§4§F§F§4§4Urânio",
            "",
            "&7Metal radioativo de alto poder energético,",
            "&7usado em reatores nucleares.",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack NEPTUNIUM = new SlimefunItemStack(
            "NEPTUNIUM",
            HeadTexture.NEPTUNIUM,
            "§x§0§0§A§A§A§ANeptúnio",
            "",
            "&7Elemento radioativo gerado no interior",
            "&7dos reatores nucleares.",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack PLUTONIUM = new SlimefunItemStack(
            "PLUTONIUM",
            HeadTexture.PLUTONIUM,
            "§x§A§A§0§0§4§4Plutônio",
            "",
            "&7Elemento transurânico de altíssima",
            "&7radioatividade e poder destrutivo.",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack BOOSTED_URANIUM = new SlimefunItemStack(
            "BOOSTED_URANIUM",
            HeadTexture.BOOSTED_URANIUM,
            "§x§9§9§F§F§0§0Urânio Potenciado",
            "",
            "&7Urânio enriquecido ao máximo,",
            "&7capaz de alimentar reatores avançados.",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_EPIC);

    /*		Talisman		*/
    public static final SlimefunItemStack COMMON_TALISMAN = new SlimefunItemStack(
            "COMMON_TALISMAN",
            Material.EMERALD,
            "&6Talismã Comum",
            "",
            "&7Talismã básico do Slimefun.",
            "&7Sem habilidades especiais.",
            "",
            "&7Obtido na Bancada Mágica.",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack ENDER_TALISMAN = new SlimefunItemStack(
            "ENDER_TALISMAN", Material.EMERALD, "&5Talismã do Ender", "", LoreBuilder.TIER_COMMON);

    public static final SlimefunItemStack TALISMAN_ANVIL = new SlimefunItemStack(
            "ANVIL_TALISMAN",
            Material.EMERALD,
            "&aTalismã da Bigorna",
            "",
            "&7Impede que uma ferramenta quebre,",
            "&7sendo consumido ao fazê-lo.",
            "",
            "&4&lATENÇÃO:",
            "&4Não funciona em ferramentas",
            "&4que são poderosas demais",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TALISMAN_MINER = new SlimefunItemStack(
            "MINER_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Minerador",
            "",
            "&7Enquanto no inventário, tem 20%",
            "&7de chance de dobrar os minérios extraídos.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TALISMAN_FARMER = new SlimefunItemStack(
            "FARMER_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Fazendeiro",
            "",
            "&7Enquanto no inventário, tem 20%",
            "&7de chance de dobrar colheitas.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TALISMAN_HUNTER = new SlimefunItemStack(
            "HUNTER_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Caçador",
            "",
            "&7Enquanto no inventário, tem 20%",
            "&7de chance de dobrar drops de mobs.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TALISMAN_LAVA = new SlimefunItemStack(
            "LAVA_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Andador de Lava",
            "",
            "&7Concede Resistência ao Fogo ao",
            "&7entrar em contato com lava.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TALISMAN_WATER = new SlimefunItemStack(
            "WATER_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Respirador Aquático",
            "",
            "&7Permite respirar debaixo d'água",
            "&7ao começar a afogar.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TALISMAN_ANGEL = new SlimefunItemStack(
            "ANGEL_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Anjo",
            "",
            "&775% de chance de prevenir",
            "&7dano de queda.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack TALISMAN_FIRE = new SlimefunItemStack(
            "FIRE_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Bombeiro",
            "",
            "&7Concede Resistência ao Fogo",
            "&7ao começar a queimar.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack TALISMAN_MAGICIAN = new SlimefunItemStack(
            "MAGICIAN_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Mágico",
            "",
            "&780% de bônus de sorte ao encantar.",
            "&7Às vezes concede encantamento extra.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack TALISMAN_TRAVELLER = new SlimefunItemStack(
            "TRAVELLER_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Viajante",
            "",
            "&760% de chance de ganhar Velocidade",
            "&7ao começar a correr.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack TALISMAN_WARRIOR = new SlimefunItemStack(
            "WARRIOR_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Guerreiro",
            "",
            "&7Concede Força III ao ser atingido.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack TALISMAN_KNIGHT = new SlimefunItemStack(
            "KNIGHT_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Cavaleiro",
            "",
            "&730% de chance de 5 segundos de",
            "&7Regeneração ao ser atingido.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack TALISMAN_WHIRLWIND = new SlimefunItemStack(
            "WHIRLWIND_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Redemoinho",
            "",
            "&7Reflete 60% de qualquer projétil",
            "&7disparado contra você.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack TALISMAN_WIZARD = new SlimefunItemStack(
            "WIZARD_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Feiticeiro",
            "",
            "&7Permite obter Fortune IV/V,",
            "&7mas pode reduzir alguns encantamentos.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack TALISMAN_CAVEMAN = new SlimefunItemStack(
            "CAVEMAN_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Homem das Cavernas",
            "",
            "&750% de chance de Haste",
            "&7ao minerar qualquer minério.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TALISMAN_WISE = new SlimefunItemStack(
            "WISE_TALISMAN",
            Material.EMERALD,
            "&aTalismã do Sábio",
            "",
            "&720% de chance de dobrar",
            "&7qualquer experiência obtida.",
            "",
            LoreBuilder.TIER_EPIC);

    /*		Staves		*/
    public static final SlimefunItemStack STAFF_ELEMENTAL = new SlimefunItemStack(
            "STAFF_ELEMENTAL",
            Material.STICK,
            "&6Cajado Elemental",
            "",
            "&7Cajado elemental básico que",
            "&7pode ser infundido com runas.",
            "",
            "&7Criado na Bancada Mágica.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack STAFF_WIND = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WIND",
            Material.STICK,
            "&6Cajado Elemental &7- &b&oVento",
            "",
            "&7Elemento: &b&oVento",
            "",
            "&eClique Direito&7 para se lançar para frente",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack STAFF_FIRE = new SlimefunItemStack(
            "STAFF_ELEMENTAL_FIRE",
            Material.STICK,
            "&6Cajado Elemental &7- &c&oFogo",
            "",
            "&7Elemento: &c&oFogo",
            "",
            "",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack STAFF_WATER = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WATER",
            Material.STICK,
            "&6Cajado Elemental &7- &1&oÁgua",
            "",
            "&7Elemento: &1&oÁgua",
            "",
            "&eClique Direito&7 para se apagar",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack STAFF_STORM = new SlimefunItemStack(
            "STAFF_ELEMENTAL_STORM",
            Material.STICK,
            "&6Cajado Elemental &7- &8&oTempestade",
            "",
            "&7Elemento: &8&oTempestade",
            "",
            "&eClique Direito&7 para invocar um raio",
            LoreBuilder.usesLeft(StormStaff.MAX_USES),
            "",
            LoreBuilder.TIER_EPIC);

    static {
        STAFF_WIND.addUnsafeEnchantment(VersionedEnchantment.LUCK_OF_THE_SEA, 1);
        STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
        STAFF_WATER.addUnsafeEnchantment(VersionedEnchantment.AQUA_AFFINITY, 1);
        STAFF_STORM.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 1);
    }

    /*		 Machines 		*/
    public static final SlimefunItemStack GRIND_STONE = new SlimefunItemStack(
            "GRIND_STONE",
            Material.DISPENSER,
            "&bMoedor de Pedra",
            "",
            "&7Mói itens em outros itens",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack ARMOR_FORGE = new SlimefunItemStack(
            "ARMOR_FORGE",
            Material.ANVIL,
            "&6Forja de Armaduras",
            "",
            "&7Permite criar armaduras poderosas",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack MAKESHIFT_SMELTERY = new SlimefunItemStack(
            "MAKESHIFT_SMELTERY",
            Material.BLAST_FURNACE,
            "&eForja Improvisada",
            "",
            "&7Versão improvisada da Fundição",
            "&7que permite apenas",
            "&7fundir pós em lingotes",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SMELTERY = new SlimefunItemStack(
            "SMELTERY",
            Material.FURNACE,
            "&6Fundição",
            "",
            "&7Fornalha de alta temperatura",
            "&7que permite fundir pós",
            "&7em lingotes e criar ligas.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack IGNITION_CHAMBER = new SlimefunItemStack(
            "IGNITION_CHAMBER",
            Material.DROPPER,
            "&4Câmara de Ignição Automática",
            "&7Impede a Fundição de consumir fogo.",
            "&7Encha com Pederneira e Aço",
            "&7e posicione ao lado do dispenser da Fundição.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ORE_CRUSHER = new SlimefunItemStack(
            "ORE_CRUSHER",
            Material.DISPENSER,
            "&bTriturador de Minérios",
            "",
            "&7Tritura minérios para dobrá-los",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack COMPRESSOR = new SlimefunItemStack(
            "COMPRESSOR", Material.PISTON, "&bCompressor", "", "&7Comprime itens", "", LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PRESSURE_CHAMBER = new SlimefunItemStack(
            "PRESSURE_CHAMBER",
            Material.GLASS,
            "&bCâmara de Pressão",
            "",
            "&7Comprime itens ainda mais",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack MAGIC_WORKBENCH = new SlimefunItemStack(
            "MAGIC_WORKBENCH",
            Material.CRAFTING_TABLE,
            "&6Bancada Mágica",
            "",
            "&7Infunde itens com energia mágica",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ORE_WASHER = new SlimefunItemStack(
            "ORE_WASHER",
            Material.CAULDRON,
            "&6Lavador de Minérios",
            "",
            "&7Lava Minérios Peneirados para filtrá-los",
            "&7e fornece Fragmentos de Pedra",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TABLE_SAW = new SlimefunItemStack(
            "TABLE_SAW",
            Material.STONECUTTER,
            "&6Serra de Mesa",
            "",
            "&7Obtém 8 tábuas de 1 tronco",
            "&7(Funciona com todos os tipos de tronco)",
            "",
            LoreBuilder.TIER_COMMON);
    ;
    public static final SlimefunItemStack COMPOSTER = new SlimefunItemStack(
            "COMPOSTER",
            Material.CAULDRON,
            "&aCompostador",
            "",
            "&7Converte vários materiais ao longo do tempo",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack ENHANCED_CRAFTING_TABLE = new SlimefunItemStack(
            "ENHANCED_CRAFTING_TABLE",
            Material.CRAFTING_TABLE,
            "&eBancada Aprimorada",
            "",
            "&7Uma Mesa de Trabalho comum não",
            "&7suporta essa quantidade de poder...",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CRUCIBLE = new SlimefunItemStack(
            "CRUCIBLE",
            Material.CAULDRON,
            "&cCadinho",
            "",
            "&7Usada para fundir itens em líquidos",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack JUICER = new SlimefunItemStack(
            "JUICER",
            Material.GLASS_BOTTLE,
            "&aEspremedor",
            "",
            "&7Permite criar sucos deliciosos",
            "",
            LoreBuilder.TIER_COMMON);

    public static final SlimefunItemStack INDUSTRIAL_MINER = new SlimefunItemStack(
            "INDUSTRIAL_MINER",
            Material.GOLDEN_PICKAXE,
            "&bMinerador Industrial",
            "",
            "&7Este multiblocos minera qualquer Minério",
            "&7em uma área 7x7 abaixo dele.",
            "&7Coloque carvão no baú",
            "&7para abastecer esta máquina.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ADVANCED_INDUSTRIAL_MINER = new SlimefunItemStack(
            "ADVANCED_INDUSTRIAL_MINER",
            Material.DIAMOND_PICKAXE,
            "&cMinerador Industrial Avançado",
            "",
            "&7Este multiblocos minera qualquer Minério",
            "&7em uma área 11x11 abaixo dele.",
            "&7Coloque um balde de combustível ou lava",
            "&7no baú para abastecer esta máquina.",
            "",
            "&a+ Seda Suave",
            "",
            LoreBuilder.TIER_RARE);

    static {
        ItemMeta meta = INDUSTRIAL_MINER.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        INDUSTRIAL_MINER.setItemMeta(meta);

        ItemMeta meta2 = ADVANCED_INDUSTRIAL_MINER.getItemMeta();
        meta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ADVANCED_INDUSTRIAL_MINER.setItemMeta(meta2);
    }

    public static final SlimefunItemStack SOLAR_PANEL = new SlimefunItemStack(
            "SOLAR_PANEL",
            Material.DAYLIGHT_DETECTOR,
            "&9Célula Fotovoltaica",
            "",
            "&7Componente importante para",
            "&7criar um &bGerador Solar",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack AUTOMATED_PANNING_MACHINE = new SlimefunItemStack(
            "AUTOMATED_PANNING_MACHINE",
            Material.BOWL,
            "&eMáquina de Peneiramento Automático",
            "",
            "&7Versão multiblocos da Bateia de Ouro",
            "&7e Bateia do Nether combinadas em uma.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack OUTPUT_CHEST = new SlimefunItemStack(
            "OUTPUT_CHEST",
            Material.CHEST,
            "&4Baú de Saída",
            "",
            "&7Uma máquina básica tentará colocar",
            "&7itens neste baú se estiver",
            "&7adjacente ao dispenser.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack HOLOGRAM_PROJECTOR = new SlimefunItemStack(
            "HOLOGRAM_PROJECTOR",
            Material.QUARTZ_SLAB,
            "&bProjetor de Holograma",
            "",
            "&7Projeta um holograma editável",
            "",
            LoreBuilder.TIER_RARE);

    /*		 Enhanced Furnaces 		*/
    public static final SlimefunItemStack ENHANCED_FURNACE = new SlimefunItemStack(
            "ENHANCED_FURNACE",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eI",
            "",
            "&7Velocidade de Processamento: &e1x",
            "&7Eficiência de Combustível: &e1x",
            "&7Multiplicador de Sorte: &e1x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENHANCED_FURNACE_2 = new SlimefunItemStack(
            "ENHANCED_FURNACE_2",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eII",
            "",
            "&7Velocidade de Processamento: &e2x",
            "&7Eficiência de Combustível: &e1x",
            "&7Multiplicador de Sorte: &e1x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENHANCED_FURNACE_3 = new SlimefunItemStack(
            "ENHANCED_FURNACE_3",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eIII",
            "",
            "&7Velocidade de Processamento: &e2x",
            "&7Eficiência de Combustível: &e2x",
            "&7Multiplicador de Sorte: &e1x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENHANCED_FURNACE_4 = new SlimefunItemStack(
            "ENHANCED_FURNACE_4",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eIV",
            "",
            "&7Velocidade de Processamento: &e3x",
            "&7Eficiência de Combustível: &e2x",
            "&7Multiplicador de Sorte: &e1x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENHANCED_FURNACE_5 = new SlimefunItemStack(
            "ENHANCED_FURNACE_5",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eV",
            "",
            "&7Velocidade de Processamento: &e3x",
            "&7Eficiência de Combustível: &e2x",
            "&7Multiplicador de Sorte: &e2x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENHANCED_FURNACE_6 = new SlimefunItemStack(
            "ENHANCED_FURNACE_6",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eVI",
            "",
            "&7Velocidade de Processamento: &e3x",
            "&7Eficiência de Combustível: &e3x",
            "&7Multiplicador de Sorte: &e2x",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ENHANCED_FURNACE_7 = new SlimefunItemStack(
            "ENHANCED_FURNACE_7",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eVII",
            "",
            "&7Velocidade de Processamento: &e4x",
            "&7Eficiência de Combustível: &e3x",
            "&7Multiplicador de Sorte: &e2x",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ENHANCED_FURNACE_8 = new SlimefunItemStack(
            "ENHANCED_FURNACE_8",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eVIII",
            "",
            "&7Velocidade de Processamento: &e4x",
            "&7Eficiência de Combustível: &e4x",
            "&7Multiplicador de Sorte: &e2x",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ENHANCED_FURNACE_9 = new SlimefunItemStack(
            "ENHANCED_FURNACE_9",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eIX",
            "",
            "&7Velocidade de Processamento: &e5x",
            "&7Eficiência de Combustível: &e4x",
            "&7Multiplicador de Sorte: &e2x",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ENHANCED_FURNACE_10 = new SlimefunItemStack(
            "ENHANCED_FURNACE_10",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eX",
            "",
            "&7Velocidade de Processamento: &e5x",
            "&7Eficiência de Combustível: &e5x",
            "&7Multiplicador de Sorte: &e2x",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ENHANCED_FURNACE_11 = new SlimefunItemStack(
            "ENHANCED_FURNACE_11",
            Material.FURNACE,
            "&7Fornalha Aprimorada - &eXI",
            "",
            "&7Velocidade de Processamento: &e5x",
            "&7Eficiência de Combustível: &e5x",
            "&7Multiplicador de Sorte: &e3x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack REINFORCED_FURNACE = new SlimefunItemStack(
            "REINFORCED_FURNACE",
            Material.FURNACE,
            "&7Fornalha Reforçada",
            "",
            "&7Velocidade de Processamento: &e10x",
            "&7Eficiência de Combustível: &e10x",
            "&7Multiplicador de Sorte: &e3x",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack CARBONADO_EDGED_FURNACE = new SlimefunItemStack(
            "CARBONADO_EDGED_FURNACE",
            Material.FURNACE,
            "&7Fornalha com Borda de Carbono",
            "",
            "&7Velocidade de Processamento: &e20x",
            "&7Eficiência de Combustível: &e10x",
            "&7Multiplicador de Sorte: &e3x",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack BLOCK_PLACER = new SlimefunItemStack(
            "BLOCK_PLACER",
            Material.DISPENSER,
            "&aColocador de Blocos",
            "",
            "&7Todos os blocos neste Dispenser",
            "&7serão colocados automaticamente",
            "",
            LoreBuilder.TIER_RARE);

    /*		Soulbound Items		*/
    public static final SlimefunItemStack SOULBOUND_SWORD = new SlimefunItemStack(
            "SOULBOUND_SWORD",
            Material.DIAMOND_SWORD,
            "&cEspada Vinculada à Alma",
            "",
            "&7Espada forjada com a alma do portador.",
            "&7Não cai ao morrer — permanece no inventário.",
            "",
            "&9Vinculada à Alma — &7não cai ao morrer",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SOULBOUND_BOW = new SlimefunItemStack(
            "SOULBOUND_BOW",
            Material.BOW,
            "&cArco Vinculado à Alma",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SOULBOUND_PICKAXE = new SlimefunItemStack(
            "SOULBOUND_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&cPicareta Vinculada à Alma",
            "",
            "&7Picareta selada com a essência da alma.",
            "&7Não cai ao morrer — permanece no inventário.",
            "",
            "&9Vinculada à Alma — &7não cai ao morrer",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SOULBOUND_AXE = new SlimefunItemStack(
            "SOULBOUND_AXE",
            Material.DIAMOND_AXE,
            "&cMachado Vinculado à Alma",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SOULBOUND_SHOVEL = new SlimefunItemStack(
            "SOULBOUND_SHOVEL",
            Material.DIAMOND_SHOVEL,
            "&cPá Vinculada à Alma",
            "",
            "&7Pá imbuída com a força da alma.",
            "&7Não cai ao morrer — permanece no inventário.",
            "",
            "&9Vinculada à Alma — &7não cai ao morrer",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SOULBOUND_HOE = new SlimefunItemStack(
            "SOULBOUND_HOE",
            Material.DIAMOND_HOE,
            "&cEnxada Vinculada à Alma",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);

    public static final SlimefunItemStack SOULBOUND_HELMET = new SlimefunItemStack(
            "SOULBOUND_HELMET",
            Material.DIAMOND_HELMET,
            "&cCapacete Vinculado à Alma",
            "",
            "&7Capacete que nunca abandona seu portador,",
            "&7nem mesmo na morte.",
            "",
            "&9Vinculado à Alma — &7não cai ao morrer",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SOULBOUND_CHESTPLATE = new SlimefunItemStack(
            "SOULBOUND_CHESTPLATE",
            Material.DIAMOND_CHESTPLATE,
            "&cPeitoral Vinculado à Alma",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SOULBOUND_LEGGINGS = new SlimefunItemStack(
            "SOULBOUND_LEGGINGS",
            Material.DIAMOND_LEGGINGS,
            "&cCalças Vinculadas à Alma",
            "",
            "&7Calças que permanecem com seu portador",
            "&7mesmo após a morte.",
            "",
            "&9Vinculadas à Alma — &7não cai ao morrer",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SOULBOUND_BOOTS = new SlimefunItemStack(
            "SOULBOUND_BOOTS",
            Material.DIAMOND_BOOTS,
            "&cBotas Vinculadas à Alma",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);
    public static final SlimefunItemStack SOULBOUND_TRIDENT = new SlimefunItemStack(
            "SOULBOUND_TRIDENT",
            Material.TRIDENT,
            "&cTridente Vinculado à Alma",
            "",
            "&7Tridente de netheritas infundido",
            "&7com a energia da alma do portador.",
            "",
            "&9Vinculado à Alma — &7não cai ao morrer",
            "",
            LoreBuilder.TIER_RARE + " " + LoreBuilder.ICON_ENCHANTABLE);

    /* Runes */
    public static final SlimefunItemStack BLANK_RUNE = new SlimefunItemStack(
            "BLANK_RUNE",
            new ColoredFireworkStar(Color.BLACK, "&8Runa em Branco", "", LoreBuilder.TIER_RARE),
            null,
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack AIR_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_AIR",
            new ColoredFireworkStar(Color.AQUA, "&7Runa Ancestral &8&l[&b&lAr&8&l]"),
            null,
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack WATER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_WATER",
            new ColoredFireworkStar(Color.BLUE, "&7Runa Ancestral &8&l[&1&lÁgua&8&l]"),
            null,
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack FIRE_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_FIRE",
            new ColoredFireworkStar(Color.RED, "&7Runa Ancestral &8&l[&4&lFogo&8&l]"),
            null,
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack EARTH_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_EARTH",
            new ColoredFireworkStar(Color.fromRGB(112, 47, 7), "&7Runa Ancestral &8&l[&c&lTerra&8&l]"),
            null,
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ENDER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENDER",
            new ColoredFireworkStar(Color.PURPLE, "&7Runa Ancestral &8&l[&5&lEnder&8&l]"),
            null,
            LoreBuilder.TIER_EPIC);

    public static final SlimefunItemStack RAINBOW_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_RAINBOW",
            new ColoredFireworkStar(Color.FUCHSIA, "&7Runa Ancestral &8&l[&d&lArco-Íris&8&l]"),
            null,
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack LIGHTNING_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_LIGHTNING",
            new ColoredFireworkStar(Color.fromRGB(255, 255, 95), "&7Runa Ancestral &8&l[&e&lRaio&8&l]"),
            null,
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack SOULBOUND_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_SOULBOUND",
            new ColoredFireworkStar(
                    Color.fromRGB(47, 0, 117),
                    "&7Runa Ancestral &8&l[&5&lVínculo da Alma&8&l]",
                    "&eJogue esta runa sobre um item no chão para",
                    "&5vincular &eesse item à sua alma.",
                    " ",
                    " ",
                    "&eRecomenda-se usar esta runa apenas",
                    " ",
                    "&eem itens &6importantes&e.",
                    " ",
                    "&eItens vinculados não caem ao morrer."),
            null,
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ENCHANTMENT_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENCHANTMENT",
            new ColoredFireworkStar(
                    Color.fromRGB(255, 217, 25),
                    "&7Runa Ancestral &8&l[&6&lEncantamento&8&l]",
                    "&eJogue esta runa sobre um item no chão para",
                    "&6encantar &eesse item com um encantamento aleatório.",
                    ""),
            null,
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack VILLAGER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_VILLAGERS",
            new ColoredFireworkStar(
                    Color.fromRGB(160, 20, 5),
                    "&7Runa Ancestral &8&l[&4&lAldeões&8&l]",
                    "&eClique com botão direito em um aldeão para",
                    "&elimpar seu trabalho e trocas atuais.",
                    "&eO aldeão começará a procurar",
                    "&eum novo trabalho após",
                    "&ealgum tempo."),
            null,
            LoreBuilder.TIER_EPIC);

    /*		Electricity			*/
    public static final SlimefunItemStack SOLAR_GENERATOR = new SlimefunItemStack(
            "SOLAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&bGerador Solar",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(4),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SOLAR_GENERATOR_2 = new SlimefunItemStack(
            "SOLAR_GENERATOR_2",
            Material.DAYLIGHT_DETECTOR,
            "&cGerador Solar Avançado",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(16),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SOLAR_GENERATOR_3 = new SlimefunItemStack(
            "SOLAR_GENERATOR_3",
            Material.DAYLIGHT_DETECTOR,
            "&4Gerador Solar de Carbonado",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(64),
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack SOLAR_GENERATOR_4 = new SlimefunItemStack(
            "SOLAR_GENERATOR_4",
            Material.DAYLIGHT_DETECTOR,
            "&eGerador Solar Energizado",
            "",
            "&9Funciona à Noite",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(256),
            " (Day)",
            LoreBuilder.powerPerSecond(128),
            " (Night)",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack COAL_GENERATOR = new SlimefunItemStack(
            "COAL_GENERATOR",
            HeadTexture.GENERATOR,
            "&cGerador a Carvão",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(16),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack COAL_GENERATOR_2 = new SlimefunItemStack(
            "COAL_GENERATOR_2",
            HeadTexture.GENERATOR,
            "&cGerador a Carvão &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack LAVA_GENERATOR = new SlimefunItemStack(
            "LAVA_GENERATOR",
            HeadTexture.GENERATOR,
            "&4Gerador de Lava",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(20),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack LAVA_GENERATOR_2 = new SlimefunItemStack(
            "LAVA_GENERATOR_2",
            HeadTexture.GENERATOR,
            "&4Gerador de Lava &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(40),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELECTRIC_FURNACE = new SlimefunItemStack(
            "ELECTRIC_FURNACE",
            Material.FURNACE,
            "&cFornalha Elétrica",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(4),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_FURNACE_2 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_2",
            Material.FURNACE,
            "&cFornalha Elétrica &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 2x",
            LoreBuilder.powerPerSecond(6),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_FURNACE_3 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_3",
            Material.FURNACE,
            "&cFornalha Elétrica &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 4x",
            LoreBuilder.powerPerSecond(10),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER",
            Material.FURNACE,
            "&cTriturador Elétrico de Minérios",
            "",
            "&7Funciona como Triturador e Moedor de Pedra",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(12),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_2 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_2",
            Material.FURNACE,
            "&cTriturador Elétrico de Minérios &7(&eII&7)",
            "",
            "&7Funciona como Triturador e Moedor de Pedra",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 4x",
            LoreBuilder.powerPerSecond(30),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_3 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_3",
            Material.FURNACE,
            "&cTriturador Elétrico de Minérios &7(&eIII&7)",
            "",
            "&7Funciona como Triturador e Moedor de Pedra",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(10),
            LoreBuilder.powerPerSecond(90),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_INGOT_PULVERIZER = new SlimefunItemStack(
            "ELECTRIC_INGOT_PULVERIZER",
            Material.FURNACE,
            "&cPulverizador Elétrico de Lingotes",
            "",
            "&7Pulveriza Lingotes em Pó",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(14),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack AUTO_DRIER = new SlimefunItemStack(
            "AUTO_DRIER",
            Material.SMOKER,
            "&6Secador Automático",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(10),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack AUTO_ENCHANTER = new SlimefunItemStack(
            "AUTO_ENCHANTER",
            Material.ENCHANTING_TABLE,
            "&5Encantador Automático",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack AUTO_ENCHANTER_2 = new SlimefunItemStack(
            "AUTO_ENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "&5Encantador Automático &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack AUTO_DISENCHANTER = new SlimefunItemStack(
            "AUTO_DISENCHANTER",
            Material.ENCHANTING_TABLE,
            "&5Desencantador Automático",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack AUTO_DISENCHANTER_2 = new SlimefunItemStack(
            "AUTO_DISENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "&5Desencantador Automático &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack AUTO_ANVIL = new SlimefunItemStack(
            "AUTO_ANVIL",
            Material.IRON_BLOCK,
            "&7Bigorna Automática",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Fator de Reparo: 10%",
            LoreBuilder.powerPerSecond(24),
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack AUTO_ANVIL_2 = new SlimefunItemStack(
            "AUTO_ANVIL_2",
            Material.IRON_BLOCK,
            "&7Bigorna Automática Mk.II",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Fator de Reparo: 25%",
            LoreBuilder.powerPerSecond(32),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack AUTO_BREWER = new SlimefunItemStack(
            "AUTO_BREWER",
            Material.SMOKER,
            "&6Destilador Automático",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(12),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack BOOK_BINDER = new SlimefunItemStack(
            "BOOK_BINDER",
            Material.BOOKSHELF,
            "&6Encadernador de Livros",
            "",
            "&7Une vários livros encantados em um só.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack BIO_REACTOR = new SlimefunItemStack(
            "BIO_REACTOR",
            Material.LIME_TERRACOTTA,
            "&2Biorreator",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &7Capacidade: 128 J",
            LoreBuilder.powerPerSecond(8),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack MULTIMETER = new SlimefunItemStack(
            "MULTIMETER",
            Material.CLOCK,
            "&eMultímetro",
            "",
            "&7Mede a quantidade de energia armazenada",
            "&7em um bloco",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack SMALL_CAPACITOR = new SlimefunItemStack(
            "SMALL_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aCapacitor de Energia Pequeno",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.CAPACITOR),
            "&8\u21E8 &e\u26A1 &7Capacidade: 128 J",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack MEDIUM_CAPACITOR = new SlimefunItemStack(
            "MEDIUM_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aCapacitor de Energia Médio",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(512),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack BIG_CAPACITOR = new SlimefunItemStack(
            "BIG_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aCapacitor de Energia Grande",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(1024),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack LARGE_CAPACITOR = new SlimefunItemStack(
            "LARGE_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aCapacitor de Energia Amplo",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.GOOD, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(8192),
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack CARBONADO_EDGED_CAPACITOR = new SlimefunItemStack(
            "CARBONADO_EDGED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aCapacitor com Borda de Carbonado",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(65536),
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ENERGIZED_CAPACITOR = new SlimefunItemStack(
            "ENERGIZED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aCapacitor Energizado",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(524288),
            "",
            LoreBuilder.TIER_RARE);

    /*		Robots				*/
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cAndroid Programável &7(Normal)",
            "",
            "&8\u21E8 &7Função: Nenhuma",
            "&8\u21E8 &7Eficiência de Combustível: 1.0x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cAndroid Programável &7(Fazendeiro)",
            "",
            "&8\u21E8 &7Função: Agricultura",
            "&8\u21E8 &7Eficiência de Combustível: 1.0x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_MINER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_MINER",
            HeadTexture.PROGRAMMABLE_ANDROID_MINER,
            "&cAndroid Programável &7(Minerador)",
            "",
            "&8\u21E8 &7Função: Mineração",
            "&8\u21E8 &7Eficiência de Combustível: 1.0x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_WOODCUTTER",
            HeadTexture.PROGRAMMABLE_ANDROID_WOODCUTTER,
            "&cAndroid Programável &7(Lenhador)",
            "",
            "&8\u21E8 &7Função: Derrubada de Árvores",
            "&8\u21E8 &7Eficiência de Combustível: 1.0x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cAndroid Programável &7(Açougueiro)",
            "",
            "&8\u21E8 &7Função: Abate",
            "&8\u21E8 &7Dano: 4",
            "&8\u21E8 &7Eficiência de Combustível: 1.0x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cAndroid Programável &7(Pescador)",
            "",
            "&8\u21E8 &7Função: Pesca",
            "&8\u21E8 &7Taxa de Sucesso: 10%",
            "&8\u21E8 &7Eficiência de Combustível: 1.0x",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cAndroid Programável Avançado &7(Normal)",
            "",
            "&8\u21E8 &7Função: Nenhuma",
            "&8\u21E8 &7Eficiência de Combustível: 1.5x",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cAndroid Programável Avançado &7(Pescador)",
            "",
            "&8\u21E8 &7Função: Pesca",
            "&8\u21E8 &7Taxa de Sucesso: 20%",
            "&8\u21E8 &7Eficiência de Combustível: 1.5x",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cAndroid Programável Avançado &7(Fazendeiro)",
            "",
            "&8\u21E8 &7Função: Agricultura",
            "&8\u21E8 &7Eficiência de Combustível: 1.5x",
            "&8\u21E8 &7Também colhe plantas do ExoticGarden",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cAndroid Programável Avançado &7(Açougueiro)",
            "",
            "&8\u21E8 &7Função: Abate",
            "&8\u21E8 &7Dano: 8",
            "&8\u21E8 &7Eficiência de Combustível: 1.5x",
            "",
            LoreBuilder.TIER_EPIC);

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&eAndroid Programável Potencializado &7(Normal)",
            "",
            "&8\u21E8 &7Função: Nenhuma",
            "&8\u21E8 &7Eficiência de Combustível: 3.0x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&eAndroid Programável Potencializado &7(Pescador)",
            "",
            "&8\u21E8 &7Função: Pesca",
            "&8\u21E8 &7Taxa de Sucesso: 30%",
            "&8\u21E8 &7Eficiência de Combustível: 8.0x",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&eAndroid Programável Potencializado &7(Açougueiro)",
            "",
            "&8\u21E8 &7Função: Abate",
            "&8\u21E8 &7Dano: 20",
            "&8\u21E8 &7Eficiência de Combustível: 8.0x",
            "",
            LoreBuilder.TIER_RARE);

    /*		       GPS		       */
    public static final SlimefunItemStack GPS_TRANSMITTER = new SlimefunItemStack(
            "GPS_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "&bTransmissor GPS",
            "",
            LoreBuilder.powerBuffer(16),
            LoreBuilder.powerPerSecond(2),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GPS_TRANSMITTER_2 = new SlimefunItemStack(
            "GPS_TRANSMITTER_2",
            HeadTexture.GPS_TRANSMITTER,
            "&cTransmissor GPS Avançado",
            "",
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(6),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GPS_TRANSMITTER_3 = new SlimefunItemStack(
            "GPS_TRANSMITTER_3",
            HeadTexture.GPS_TRANSMITTER,
            "&4Transmissor GPS de Carbonado",
            "",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(22),
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack GPS_TRANSMITTER_4 = new SlimefunItemStack(
            "GPS_TRANSMITTER_4",
            HeadTexture.GPS_TRANSMITTER,
            "&eTransmissor GPS Energizado",
            "",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(92),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack GPS_MARKER_TOOL = new SlimefunItemStack(
            "GPS_MARKER_TOOL",
            Material.REDSTONE_TORCH,
            "&bMarcador GPS",
            "",
            "&7Permite definir um Ponto de Rota em",
            "&7qualquer local onde for colocado",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GPS_CONTROL_PANEL = new SlimefunItemStack(
            "GPS_CONTROL_PANEL",
            HeadTexture.GPS_CONTROL_PANEL,
            "&bPainel de Controle GPS",
            "",
            "&7Permite rastrear seus Satélites",
            "&7e gerenciar seus Pontos de Rota",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GPS_EMERGENCY_TRANSMITTER = new SlimefunItemStack(
            "GPS_EMERGENCY_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "&cTransmissor GPS de Emergência",
            "",
            "&7Carregá-lo no inventário",
            "&7define automaticamente um Ponto de Rota",
            "&7no local onde você morreu.",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ANDROID_INTERFACE_FUEL = new SlimefunItemStack(
            "ANDROID_INTERFACE_FUEL",
            Material.DISPENSER,
            "&7Interface Android &c(Combustível)",
            "",
            "&7Itens armazenados nesta Interface",
            "&7serão inseridos no slot de combustível do Android",
            "&7quando o Script o ordenar",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ANDROID_INTERFACE_ITEMS = new SlimefunItemStack(
            "ANDROID_INTERFACE_ITEMS",
            Material.DISPENSER,
            "&7Interface Android &9(Itens)",
            "",
            "&7Itens no inventário do Android",
            "&7serão inseridos nesta Interface",
            "&7quando o Script o ordenar",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack GPS_GEO_SCANNER = new SlimefunItemStack(
            "GPS_GEO_SCANNER",
            HeadTexture.GEO_SCANNER,
            "&bGeo-Scanner GPS",
            "",
            "&7Escaneia um Chunk por Recursos naturais",
            "&7como &8Petróleo",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PORTABLE_GEO_SCANNER = new SlimefunItemStack(
            "PORTABLE_GEO_SCANNER",
            Material.CLOCK,
            "&bGeo-Scanner Portátil",
            "",
            "&7Escaneia um Chunk por Recursos naturais",
            "",
            "&eClique Direito&7 para escanear",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GEO_MINER = new SlimefunItemStack(
            "GEO_MINER",
            HeadTexture.GEO_MINER,
            "&6Minerador GEO",
            "",
            "&7Minera recursos do chunk",
            "&7Esses recursos não podem ser minerados com picareta",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(48),
            "",
            "&c&l! &cEscaneie o Chunk com Geo-Scanner primeiro",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack OIL_PUMP = new SlimefunItemStack(
            "OIL_PUMP",
            HeadTexture.OIL_PUMP,
            "&4Bomba de Petróleo",
            "",
            "&7Bombeia Petróleo e enche Baldes",
            "",
            "&c&l! &cEscaneie o Chunk com Geo-Scanner primeiro",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack OIL_BUCKET = new SlimefunItemStack(
            "BUCKET_OF_OIL",
            HeadTexture.OIL_BUCKET,
            "&fBalde de Petróleo",
            "",
            "&7Petróleo bruto extraído do solo",
            "&7com a Bomba de Óleo do Slimefun.",
            "",
            "&7Refinado na Refinaria para obter combustível.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack FUEL_BUCKET = new SlimefunItemStack(
            "BUCKET_OF_FUEL", HeadTexture.FUEL_BUCKET, "&fBalde de Combustível", "", LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack REFINERY = new SlimefunItemStack(
            "REFINERY",
            Material.PISTON,
            "&cRefinaria",
            "",
            "&7Refina Petróleo para criar Combustível",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack COMBUSTION_REACTOR = new SlimefunItemStack(
            "COMBUSTION_REACTOR",
            HeadTexture.GENERATOR,
            "&cReator de Combustão",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(24),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ANDROID_MEMORY_CORE = new SlimefunItemStack(
            "ANDROID_MEMORY_CORE",
            HeadTexture.ENERGY_REGULATOR,
            "&bNúcleo de Memória Android",
            "",
            "&7Módulo de memória que armazena as",
            "&7instruções programáveis de um Android.",
            "",
            "&7Utilizado em Androids Programáveis.",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack GPS_TELEPORTER_PYLON = new SlimefunItemStack(
            "GPS_TELEPORTER_PYLON",
            Material.PURPLE_STAINED_GLASS,
            "&5Pilar do Teleportador GPS",
            "",
            "&7Componente do Teleportador",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GPS_TELEPORTATION_MATRIX = new SlimefunItemStack(
            "GPS_TELEPORTATION_MATRIX",
            Material.IRON_BLOCK,
            "&bMatriz de Teleporte GPS",
            "",
            "&7Componente principal do Teleportador",
            "&7Permite escolher entre todos os",
            "&7Pontos de Rota definidos pelo jogador que",
            "&7instalou este dispositivo.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_SHARED = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_SHARED",
            Material.STONE_PRESSURE_PLATE,
            "&fDispositivo de Ativação GPS &3(Compartilhado)",
            "",
            "&7Posicione sobre uma Matriz de Teleporte",
            "&7e pise nesta Placa para ativar",
            "&7o Processo de Teleportação",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_PERSONAL",
            Material.STONE_PRESSURE_PLATE,
            "&fDispositivo de Ativação GPS &a(Pessoal)",
            "",
            "&7Posicione sobre uma Matriz de Teleporte",
            "&7e pise nesta Placa para ativar",
            "&7o Processo de Teleportação",
            "",
            "&7Esta versão permite apenas que a pessoa",
            "&7que instalou o dispositivo a use",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PORTABLE_TELEPORTER = new SlimefunItemStack(
            "PORTABLE_TELEPORTER",
            Material.COMPASS,
            "&bTeleportador Portátil",
            "",
            "&7Permite teleportar-se",
            "&7para seus Pontos de Rota de qualquer lugar",
            "",
            LoreBuilder.powerCharged(0, 50),
            "",
            "&eClique Direito&7 para usar",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELEVATOR_PLATE = new SlimefunItemStack(
            "ELEVATOR_PLATE",
            Material.STONE_PRESSURE_PLATE,
            "&bPlaca de Elevador",
            "",
            "&7Posicione uma Placa de Elevador em cada andar",
            "&7e você poderá se teleportar entre eles.",
            "",
            "&eClique Direito&7 neste bloco para nomeá-lo",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack INFUSED_HOPPER = new SlimefunItemStack(
            "INFUSED_HOPPER",
            Material.HOPPER,
            "&5Funil Infundido",
            "",
            "&7Coleta automaticamente itens próximos em 7x7x7",
            "&7de raio ao ser colocado.",
            "",
            LoreBuilder.TIER_EPIC);

    public static final SlimefunItemStack PLASTIC_SHEET = new SlimefunItemStack(
            "PLASTIC_SHEET",
            Material.PAPER,
            "&fChapa de Plástico",
            "",
            "&7Lâmina flexível de plástico sintético",
            "&7usada em circuitos e invólucros.",
            "",
            "&7Obtida na Câmara de Pressão Aquecida.",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cCâmara de Pressão Aquecida",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(10),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER_2 = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER_2",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cCâmara de Pressão Aquecida &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 5x",
            LoreBuilder.powerPerSecond(44),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELECTRIC_SMELTERY = new SlimefunItemStack(
            "ELECTRIC_SMELTERY",
            Material.FURNACE,
            "&cFundição Elétrica",
            "",
            "&4Apenas Ligas — não funde Pó em Lingotes",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(20),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_SMELTERY_2 = new SlimefunItemStack(
            "ELECTRIC_SMELTERY_2",
            Material.FURNACE,
            "&cFundição Elétrica &7- &eII",
            "",
            "&4Apenas Ligas — não funde Pó em Lingotes",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 3x",
            LoreBuilder.powerPerSecond(40),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELECTRIC_PRESS = new SlimefunItemStack(
            "ELECTRIC_PRESS",
            HeadTexture.ELECTRIC_PRESS,
            "&ePrensas Elétricas",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(16),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_PRESS_2 = new SlimefunItemStack(
            "ELECTRIC_PRESS_2",
            HeadTexture.ELECTRIC_PRESS,
            "&ePrensas Elétricas &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 3x",
            LoreBuilder.powerPerSecond(40),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE",
            Material.RED_TERRACOTTA,
            "&cCadinho Eletrificado",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(48),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_2 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_2",
            Material.RED_TERRACOTTA,
            "&cCadinho Eletrificado &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 2x",
            "&8\u21E8 &e\u26A1 &780 J/s",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_3 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_3",
            Material.RED_TERRACOTTA,
            "&cCadinho Eletrificado &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 4x",
            "&8\u21E8 &e\u26A1 &7120 J/s",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack CARBON_PRESS = new SlimefunItemStack(
            "CARBON_PRESS",
            Material.BLACK_STAINED_GLASS,
            "&cPrensas de Carbono",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(20),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARBON_PRESS_2 = new SlimefunItemStack(
            "CARBON_PRESS_2",
            Material.BLACK_STAINED_GLASS,
            "&cPrensas de Carbono &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 3x",
            "&8\u21E8 &e\u26A1 &750 J/s",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARBON_PRESS_3 = new SlimefunItemStack(
            "CARBON_PRESS_3",
            Material.BLACK_STAINED_GLASS,
            "&cPrensas de Carbono &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 15x",
            "&8\u21E8 &e\u26A1 &7180 J/s",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack BLISTERING_INGOT = new SlimefunItemStack(
            "BLISTERING_INGOT",
            Material.GOLD_INGOT,
            "§x§F§F§8§8§0§0Lingote Blistering &7(33%)",
            "",
            "&7Liga infernal forjada nas chamas do Nether.",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack BLISTERING_INGOT_2 = new SlimefunItemStack(
            "BLISTERING_INGOT_2",
            Material.GOLD_INGOT,
            "§x§F§F§6§6§0§0Lingote Blistering II &7(66%)",
            "",
            "&7Versão aprimorada do Lingote Blistering,",
            "&7de poder amplificado pelo fogo eterno.",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack BLISTERING_INGOT_3 = new SlimefunItemStack(
            "BLISTERING_INGOT_3",
            Material.GOLD_INGOT,
            "§x§F§F§4§4§0§0Lingote Blistering III",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_EPIC);

    public static final SlimefunItemStack ENERGY_REGULATOR = new SlimefunItemStack(
            "ENERGY_REGULATOR",
            HeadTexture.ENERGY_REGULATOR,
            "&6Regulador de Energia",
            "",
            "&7Componente central de uma Rede de Energia",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENERGY_CONNECTOR = new SlimefunItemStack(
            "ENERGY_CONNECTOR",
            HeadTexture.ENERGY_CONNECTOR,
            "&eConector de Energia",
            LoreBuilder.range(6),
            "",
            "&7Posicione entre máquinas",
            "&7e geradores para conectá-los",
            "&7ao seu regulador.",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack DEBUG_FISH = new SlimefunItemStack(
            "DEBUG_FISH",
            Material.SALMON,
            "&3Peixe de Depuração",
            "",
            "&eClique Direito &fnum Bloco para ver seus dados",
            "&eClique Esquerdo &fpara quebrar um Bloco",
            "&eShift + Clique Esquerdo &fpara apagar dados do Bloco",
            "&eShift + Clique Direito &fpara colocar Bloco Placeholder",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack NETHER_ICE = new SlimefunItemStack(
            "NETHER_ICE",
            HeadTexture.NETHER_ICE,
            "§x§0§0§A§A§C§CGelo do Nether",
            "",
            "&7Cristal de gelo do Nether com",
            "&7propriedades radioativas moderadas.",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack ENRICHED_NETHER_ICE = new SlimefunItemStack(
            "ENRICHED_NETHER_ICE",
            HeadTexture.ENRICHED_NETHER_ICE,
            "§x§0§0§8§8§C§CGelo do Nether Enriquecido",
            "",
            "&7Gelo do Nether altamente concentrado,",
            "&7usado como célula de resfriamento de reatores.",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED,
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack NETHER_ICE_COOLANT_CELL = new SlimefunItemStack(
            "NETHER_ICE_COOLANT_CELL",
            HeadTexture.NETHER_ICE_COOLANT_CELL,
            "&6Célula de Resfriamento de Gelo do Nether",
            "",
            "&7Célula criogênica infundida com",
            "&7gelo do Nether de temperatura extrema.",
            "",
            "&7Resfriamento avançado para o",
            "&7Reator Nuclear de alto nível.",
            "",
            LoreBuilder.TIER_RARE);

    // Cargo
    public static final SlimefunItemStack CARGO_MANAGER = new SlimefunItemStack(
            "CARGO_MANAGER",
            HeadTexture.CARGO_MANAGER,
            "&6Gerenciador de Carga",
            "",
            "&7Componente central de uma Rede de Transporte",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARGO_CONNECTOR_NODE = new SlimefunItemStack(
            "CARGO_NODE",
            HeadTexture.CARGO_CONNECTOR_NODE,
            "&7Nó de Carga &c(Conector)",
            "",
            "&7Tubulação Conectora de Carga",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARGO_INPUT_NODE = new SlimefunItemStack(
            "CARGO_NODE_INPUT",
            HeadTexture.CARGO_INPUT_NODE,
            "&7Nó de Carga &c(Entrada)",
            "",
            "&7Tubulação de Entrada de Carga",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARGO_OUTPUT_NODE = new SlimefunItemStack(
            "CARGO_NODE_OUTPUT",
            HeadTexture.CARGO_OUTPUT_NODE,
            "&7Nó de Carga &c(Saída)",
            "",
            "&7Tubulação de Saída de Carga",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CARGO_OUTPUT_NODE_2 = new SlimefunItemStack(
            "CARGO_NODE_OUTPUT_ADVANCED",
            HeadTexture.CARGO_OUTPUT_NODE,
            "&6Nó de Carga Avançado &c(Saída)",
            "",
            "&7Tubulação de Saída de Carga",
            "",
            LoreBuilder.TIER_RARE);

    // Animal farm
    public static final SlimefunItemStack AUTO_BREEDER = new SlimefunItemStack(
            "AUTO_BREEDER",
            Material.HAY_BLOCK,
            "&eCriador Automático",
            "",
            "&7Usa &aComida Orgânica",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/Animal",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack PRODUCE_COLLECTOR = new SlimefunItemStack(
            "PRODUCE_COLLECTOR",
            Material.HAY_BLOCK,
            "&bColetador de Produtos",
            "",
            "&7Esta máquina permite",
            "&7coletar produtos de animais próximos.",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(32),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD",
            HeadTexture.FILLED_CAN,
            "&aComida Orgânica",
            "&7Conteúdo: &9???",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack WHEAT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_WHEAT",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Trigo",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CARROT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_CARROT",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Cenouras",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack POTATO_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_POTATO",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Batatas",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SEEDS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEEDS",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Sementes",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack BEETROOT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_BEETROOT",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Beterraba",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack MELON_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_MELON",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Melancia",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack APPLE_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_APPLE",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Maçã",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SWEET_BERRIES_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SWEET_BERRIES",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Frutas Doces",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack KELP_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_KELP",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Alga Seca",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack COCOA_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_COCOA",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Cacau",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SEAGRASS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEAGRASS",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Conteúdo: &9Algas Marinhas",
            "",
            LoreBuilder.TIER_COMMON);

    public static final SlimefunItemStack FERTILIZER = new SlimefunItemStack(
            "FERTILIZER",
            HeadTexture.FILLED_CAN,
            "&aFertilizante Orgânico",
            "&7Conteúdo: &9???",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack WHEAT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_WHEAT",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Trigo",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack CARROT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_CARROT",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Cenouras",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack POTATO_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_POTATO",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Batatas",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SEEDS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEEDS",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Sementes",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack BEETROOT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_BEETROOT",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Beterraba",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack MELON_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_MELON",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Melancia",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack APPLE_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_APPLE",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Maçã",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SWEET_BERRIES_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SWEET_BERRIES",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Frutas Doces",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack KELP_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_KELP",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Alga Seca",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack COCOA_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_COCOA",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Cacau",
            "",
            LoreBuilder.TIER_COMMON);
    public static final SlimefunItemStack SEAGRASS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEAGRASS",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Conteúdo: &9Algas Marinhas",
            "",
            LoreBuilder.TIER_COMMON);

    public static final SlimefunItemStack ANIMAL_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "ANIMAL_GROWTH_ACCELERATOR",
            Material.HAY_BLOCK,
            "&bAcelerador de Crescimento Animal",
            "",
            "&7Usa &aComida Orgânica",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(28),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR",
            Material.LIME_TERRACOTTA,
            "&aAcelerador de Crescimento de Plantações",
            "",
            "&7Usa &aFertilizante Orgânico",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Raio: 7x7",
            "&8\u21E8 &7Velocidade: &a3/tempo",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &750 J/s",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR_2 = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR_2",
            Material.LIME_TERRACOTTA,
            "&aAcelerador de Crescimento de Plantações &7(&eII&7)",
            "",
            "&7Usa &aFertilizante Orgânico",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Raio: 9x9",
            "&8\u21E8 &7Velocidade: &a4/tempo",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/s",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack TREE_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "TREE_GROWTH_ACCELERATOR",
            Material.BROWN_TERRACOTTA,
            "&aAcelerador de Crescimento de Árvores",
            "",
            "&7Usa &aFertilizante Orgânico",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Raio: 9x9",
            "&8\u21E8 &7Velocidade: &a4/tempo",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(48),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack FOOD_FABRICATOR = new SlimefunItemStack(
            "FOOD_FABRICATOR",
            Material.GREEN_STAINED_GLASS,
            "&cFabricador de Comida",
            "",
            "&7Produz &aComida Orgânica",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(14),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack FOOD_FABRICATOR_2 = new SlimefunItemStack(
            "FOOD_FABRICATOR_2",
            Material.GREEN_STAINED_GLASS,
            "&cFabricador de Comida &7(&eII&7)",
            "",
            "&7Produz &aComida Orgânica",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 6x",
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(48),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack FOOD_COMPOSTER = new SlimefunItemStack(
            "FOOD_COMPOSTER",
            Material.GREEN_TERRACOTTA,
            "&cCompostador de Comida",
            "",
            "&7Produz &aFertilizante Orgânico",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(16),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack FOOD_COMPOSTER_2 = new SlimefunItemStack(
            "FOOD_COMPOSTER_2",
            Material.GREEN_TERRACOTTA,
            "&cCompostador de Comida &7(&eII&7)",
            "",
            "&7Produz &aFertilizante Orgânico",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 10x",
            LoreBuilder.powerBuffer(512),
            "&8\u21E8 &e\u26A1 &752 J/s",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack EXP_COLLECTOR = new SlimefunItemStack(
            "XP_COLLECTOR",
            HeadTexture.EXP_COLLECTOR,
            "&aColetador de Experiência",
            "",
            "&7Coleta Experiência próxima e armazena",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(20),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack REACTOR_COOLANT_CELL = new SlimefunItemStack(
            "REACTOR_COLLANT_CELL",
            HeadTexture.COOLANT_CELL,
            "&bCélula de Resfriamento do Reator",
            "",
            "&7Célula de resfriamento projetada",
            "&7para reatores nucleares.",
            "",
            "&7Usada para controlar a temperatura",
            "&7do Reator Nuclear do Slimefun.",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack NUCLEAR_REACTOR = new SlimefunItemStack(
            "NUCLEAR_REACTOR",
            HeadTexture.NUCLEAR_REACTOR,
            "&2Reator Nuclear",
            "",
            "&7Requer Resfriamento!",
            "&8\u21E8 &bDeve estar cercado de Água",
            "&8\u21E8 &bDeve ser abastecido com Células de Resfriamento",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &7Capacidade: 16384 J",
            "&8\u21E8 &e\u26A1 &7500 J/s",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack NETHER_STAR_REACTOR = new SlimefunItemStack(
            "NETHERSTAR_REACTOR",
            HeadTexture.NETHER_STAR_REACTOR,
            "&fReator de Estrela do Nether",
            "",
            "&7Usa Estrelas do Nether",
            "&8\u21E8 &bDeve estar cercado de Água",
            "&8\u21E8 &bDeve ser abastecido com Células de Gelo do Nether",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &7Capacidade: 32768 J",
            "&8\u21E8 &e\u26A1 &71024 J/s",
            "&8\u21E8 &4Causa Murcha em entidades próximas",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack REACTOR_ACCESS_PORT = new SlimefunItemStack(
            "REACTOR_ACCESS_PORT",
            Material.CYAN_TERRACOTTA,
            "&2Porta de Acesso do Reator",
            "",
            "&7Permite interagir com um Reator",
            "&7via Nós de Carga, também pode ser usado",
            "&7como Buffer",
            "",
            "&8\u21E8 &eDeve ser colocado &a3 Blocos &eacima do Reator",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack FREEZER = new SlimefunItemStack(
            "FREEZER",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bCongelador",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(18),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack FREEZER_2 = new SlimefunItemStack(
            "FREEZER_2",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bCongelador &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 2x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack FREEZER_3 = new SlimefunItemStack(
            "FREEZER_3",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bCongelador &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(42),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELECTRIC_GOLD_PAN = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN",
            Material.BROWN_TERRACOTTA,
            "&6Bateia de Ouro Elétrica",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(2),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_2 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_2",
            Material.BROWN_TERRACOTTA,
            "&6Bateia de Ouro Elétrica &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 3x",
            LoreBuilder.powerPerSecond(4),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_3 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_3",
            Material.BROWN_TERRACOTTA,
            "&6Bateia de Ouro Elétrica &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 10x",
            LoreBuilder.powerPerSecond(14),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELECTRIC_DUST_WASHER = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER",
            Material.BLUE_STAINED_GLASS,
            "&3Lavador Elétrico de Pó",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(6),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_2 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_2",
            Material.BLUE_STAINED_GLASS,
            "&3Lavador Elétrico de Pó &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 2x",
            LoreBuilder.powerPerSecond(10),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_3 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_3",
            Material.BLUE_STAINED_GLASS,
            "&3Lavador Elétrico de Pó &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 10x",
            LoreBuilder.powerPerSecond(30),
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY",
            Material.RED_TERRACOTTA,
            "&cFábrica Elétrica de Lingotes",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 1x",
            LoreBuilder.powerPerSecond(8),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_2 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_2",
            Material.RED_TERRACOTTA,
            "&cFábrica Elétrica de Lingotes &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 2x",
            LoreBuilder.powerPerSecond(14),
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_3 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_3",
            Material.RED_TERRACOTTA,
            "&cFábrica Elétrica de Lingotes &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Velocidade: 8x",
            LoreBuilder.powerPerSecond(40),
            "",
            LoreBuilder.TIER_RARE);

    // @Deprecated
    // public static final SlimefunItemStack AUTOMATED_CRAFTING_CHAMBER = new
    // SlimefunItemStack("AUTOMATED_CRAFTING_CHAMBER", Material.CRAFTING_TABLE, "&6Auto-Crafting Machine", "",
    // LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &710
    // J/Item");

    public static final SlimefunItemStack FLUID_PUMP = new SlimefunItemStack(
            "FLUID_PUMP",
            Material.BLUE_TERRACOTTA,
            "&9Bomba de Fluido",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &732 J/Block",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack CHARGING_BENCH = new SlimefunItemStack(
            "CHARGING_BENCH",
            Material.CRAFTING_TABLE,
            "&6Bancada de Carregamento",
            "",
            "&fCarrega itens como Jetpacks",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Capacidade: 128 J",
            "&8\u21E8 &e\u26A1 &7Perda de Energia: &c50%",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack VANILLA_AUTO_CRAFTER = new SlimefunItemStack(
            "VANILLA_AUTO_CRAFTER",
            HeadTexture.VANILLA_AUTO_CRAFTER,
            "&2Auto-Crafter &8(Vanilla)",
            "",
            "&fColoque esta máquina em cima de um",
            "&fbaú ou similar para que ela crafteie",
            "&fqualquer item que possa ser feito em",
            "&fuma &eMesa de Trabalho normal",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &716 J/Item",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ENHANCED_AUTO_CRAFTER = new SlimefunItemStack(
            "ENHANCED_AUTO_CRAFTER",
            HeadTexture.ENHANCED_AUTO_CRAFTER,
            "&2Auto-Crafter &8(Aprimorado)",
            "",
            "&fColoque esta máquina em cima de um",
            "&fbaú ou similar para que ela crafteie",
            "&fqualquer item que possa ser feito em",
            "&eBancada Aprimorada",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &716 J/Item",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack ARMOR_AUTO_CRAFTER = new SlimefunItemStack(
            "ARMOR_AUTO_CRAFTER",
            HeadTexture.ARMOR_AUTO_CRAFTER,
            "&2Auto-Crafter &8(Forja de Armaduras)",
            "",
            "&fColoque esta máquina em cima de um",
            "&fbaú para craftar qualquer item feito na",
            "&eForja de Armaduras",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &732 J/Item",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack IRON_GOLEM_ASSEMBLER = new SlimefunItemStack(
            "IRON_GOLEM_ASSEMBLER",
            Material.IRON_BLOCK,
            "&6Montador de Golem de Ferro",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Recarga: &b30 Segundos",
            LoreBuilder.powerBuffer(4096),
            "&8\u21E8 &e\u26A1 &72048 J/Golem",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack WITHER_ASSEMBLER = new SlimefunItemStack(
            "WITHER_ASSEMBLER",
            Material.OBSIDIAN,
            "&5Montador de Wither",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Recarga: &b30 Segundos",
            "&8\u21E8 &e\u26A1 &7Capacidade: 4096 J",
            "&8\u21E8 &e\u26A1 &74096 J/Wither",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack TRASH_CAN = new SlimefunItemStack(
            "TRASH_CAN_BLOCK",
            HeadTexture.TRASH_CAN,
            "&3Lixeira",
            "",
            "&7Destrói todos os itens colocados nela",
            "",
            LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack ELYTRA_SCALE = new SlimefunItemStack(
            "ELYTRA_SCALE",
            Material.FEATHER,
            "&bEscama de Elytra",
            "",
            "&7Fragmento de uma Elytra,",
            "&7levíssimo e aerodinâmico.",
            "",
            "&7Usado na construção de Elytras",
            "&7especiais no Slimefun.",
            "",
            LoreBuilder.TIER_EPIC);
    public static final SlimefunItemStack INFUSED_ELYTRA = new SlimefunItemStack(
            "INFUSED_ELYTRA",
            Material.ELYTRA,
            "&5Elytra Infundida",
            "",
            "&7Elytra infundida com magia elemental",
            "&7que concede poderes únicos ao voar.",
            "",
            "&9Encante com runas para desbloquear efeitos",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack SOULBOUND_ELYTRA = new SlimefunItemStack(
            "SOULBOUND_ELYTRA", Material.ELYTRA, "&cElytra Ligada à Alma", "", LoreBuilder.TIER_RARE);

    public static final SlimefunItemStack MAGNESIUM_SALT = new SlimefunItemStack(
            "MAGNESIUM_SALT",
            Material.SUGAR,
            "&cSal de Magnésio",
            "",
            "&7Um tipo especial de combustível que",
            "&7pode ser usado em um Gerador a Magnésio",
            "",
            LoreBuilder.TIER_RARE);
    public static final SlimefunItemStack MAGNESIUM_GENERATOR = new SlimefunItemStack(
            "MAGNESIUM_GENERATOR",
            HeadTexture.GENERATOR,
            "&cGerador a Magnésio",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(128),
            LoreBuilder.powerPerSecond(36),
            "",
            LoreBuilder.TIER_RARE);

    // Do not delete
    public static final SlimefunItemStack CRAFTER_SMART_PORT = new SlimefunItemStack(
            "CRAFTER_SMART_PORT",
            Material.LIME_STAINED_GLASS,
            "&aPorta Inteligente de Crafter",
            "",
            "&5Distribui as quantidades de entrada com base",
            "&5na receita e tem um slot de saída dedicado",
            "",
            LoreBuilder.TIER_RARE);

    static {
        INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
    }
}
