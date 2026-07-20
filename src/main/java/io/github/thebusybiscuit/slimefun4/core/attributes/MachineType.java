package io.github.thebusybiscuit.slimefun4.core.attributes;

import javax.annotation.Nonnull;

public enum MachineType {
    CAPACITOR("Capacitor", false),
    GENERATOR("Gerador", false),
    MACHINE("Máquina", true);

    private final String suffix;
    private final boolean feminine;

    MachineType(@Nonnull String suffix, boolean feminine) {
        this.suffix = suffix;
        this.feminine = feminine;
    }

    public boolean isFeminine() {
        return feminine;
    }

    @Override
    public String toString() {
        return suffix;
    }
}
