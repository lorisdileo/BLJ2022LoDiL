package ch.noseryoung.main;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class NintendoConsoles {

    public static final GameConsole COLOR_TV_GAME = new GameConsole("Color TV-Game", "Nintendo", 1, 3000000, LocalDate.of(1977, 6, 1), "N/A");
    public static final GameConsole NES = new GameConsole("Nintendo Entertainment System", List.of("NES", "Family Computer", "Famicom"), "Nintendo", 3, 61910000, LocalDate.of(1983, 7, 15), "Super Mario Bros.");
    public static final GameConsole SNES = new GameConsole("Super Nintendo Entertainment System", List.of("SNES", "Super NES", "Super Nintendo", "Super Famicom"), "Nintendo", 4, 49100000, LocalDate.of(1990, 11, 21), "Super Mario World");
    public static final GameConsole N64 = new GameConsole("Nintendo 64", List.of("N64"), "Nintendo", 5, 32930000, LocalDate.of(1996, 6, 23), "Super Mario 64");
    public static final GameConsole GCN = new GameConsole("GameCube", List.of("GCN", "NGC", "GC"), "Nintendo", 6, 21750000, LocalDate.of(2001, 9, 14), "Super Smash Bros. Melee");
    public static final GameConsole WII = new GameConsole("Wii", "Nintendo", 7, 101630000, LocalDate.of(2006, 11, 19), "Wii Sports");
    public static final GameConsole WII_U = new GameConsole("Wii U", "Nintendo", 8, 13560000, LocalDate.of(2012, 11, 18), "Mario Kart 8");
    public static final GameConsole SWITCH = new GameConsole("Switch", "Nintendo", 8, 107650000, LocalDate.of(2017, 3, 3), "Mario Kart 8 Deluxe");

    public static final GameConsole G_W = new GameConsole("Game & Watch", List.of("G&W"), "Nintendo", 2, 43400000, LocalDate.of(1980, 4, 28), "N/A");
    public static final GameConsole GB = new GameConsole("Game Boy", List.of("GB"), "Nintendo", 4, 59345000, LocalDate.of(1989, 4, 21), "Tetris");
    public static final GameConsole VB = new GameConsole("Virtual Boy", List.of("VB"), "Nintendo", 5, 770000, LocalDate.of(1995, 7, 21), "Wario Land");
    public static final GameConsole GBC = new GameConsole("Game Boy Color", List.of("GBC"), "Nintendo", 5, 59345000, LocalDate.of(1998, 10, 21), "Pokémon Gold and Silver");
    public static final GameConsole GBA = new GameConsole("Game Boy Advance", List.of("GBA"), "Nintendo", 6, 81510000, LocalDate.of(2001, 3, 21), "Pokémon Ruby and Sapphire");
    public static final GameConsole NDS = new GameConsole("Nintendo DS", List.of("NDS", "DS"), "Nintendo", 7, 154020000, LocalDate.of(2004, 11, 21), "New Super Mario Bros.");
    public static final GameConsole N3DS = new GameConsole("Nintendo 3DS", List.of("3DS"), "Nintendo", 8, 75940000, LocalDate.of(2011, 2, 26), "Mario Kart 7");
    public static final GameConsole N_N3DS = new GameConsole("New Nintendo 3DS", List.of("3DS"), "Nintendo", 8, 14730000, LocalDate.of(2014, 10, 11), "Mario Kart 7");

    public static final List<GameConsole> HOME_CONSOLES = List.of(COLOR_TV_GAME, NES, SNES, N64, GCN, WII, WII_U, SWITCH);
    public static final List<GameConsole> PORTABLES = List.of(G_W, GB, VB, GBC, GBA, NDS, N3DS, N_N3DS);

    public static final List<GameConsole> ALL_CONSOLES = Stream.concat(HOME_CONSOLES.stream(), PORTABLES.stream()).toList();

    private NintendoConsoles() {
    }
}