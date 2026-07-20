package io.github.thebusybiscuit.slimefun4.core.attributes;

import javax.annotation.Nonnull;

public enum MachineTier {
    BASIC("&eBásico", "&eBásica"),
    AVERAGE("&6Comum", "&6Comum"),
    MEDIUM("&aMédio", "&aMédia"),
    GOOD("&2Bom", "&2Boa"),
    ADVANCED("&6Avançado", "&6Avançada"),
    END_GAME("&4Final", "&4Final");

    private final String prefixMasculine;
    private final String prefixFeminine;

    MachineTier(@Nonnull String prefixMasculine, @Nonnull String prefixFeminine) {
        this.prefixMasculine = prefixMasculine;
        this.prefixFeminine = prefixFeminine;
    }

    public String forType(@Nonnull MachineType type) {
        return type.isFeminine() ? prefixFeminine : prefixMasculine;
    }

    @Override
    public String toString() {
        return prefixMasculine;
    }
}
