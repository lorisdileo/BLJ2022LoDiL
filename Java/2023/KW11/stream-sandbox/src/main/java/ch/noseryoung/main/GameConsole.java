package ch.noseryoung.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GameConsole {
    private String name;
    private List<String> otherNames;
    private String developer;
    private int generation;

    private int unitsSoldWorldwide;
    private LocalDate initialRelease;
    private String bestSellingGame;

    public GameConsole(String name, String developer, int generation, int unitsSoldWorldwide, LocalDate initialRelease, String bestSellingGame) {
        this(name, new ArrayList<>(), developer, generation, unitsSoldWorldwide, initialRelease, bestSellingGame);
    }

    public GameConsole(String name, List<String> otherNames, String developer, int generation,
                       int unitsSoldWorldwide, LocalDate initialRelease, String bestSellingGame) {
        this.name = name;
        this.otherNames = otherNames;
        this.developer = developer;
        this.generation = generation;
        this.unitsSoldWorldwide = unitsSoldWorldwide;
        this.initialRelease = initialRelease;
        this.bestSellingGame = bestSellingGame;
    }

    public String getName() {
        return name;
    }

    public List<String> getOtherNames() {
        return otherNames;
    }

    public String getDeveloper() {
        return developer;
    }

    public int getGeneration() {
        return generation;
    }

    public int getUnitsSoldWorldwide() {
        return unitsSoldWorldwide;
    }

    public LocalDate getInitialRelease() {
        return initialRelease;
    }

    public String getBestSellingGame() {
        return bestSellingGame;
    }

    @Override
    public String toString() {
        return "{" + "\n  \"name\": \"" + name + "\"," + "\n  \"otherNames\": "
                + otherNames.stream().map(n -> "\"" + n + "\"").toList() + ","
                + "\n  \"developer\": \"" + developer + "\"," + "\n  \"generation\": " + generation + ","
                + "\n  \"unitsSoldWorldwide\": " + unitsSoldWorldwide + "," + "\n  \"initialRelease\": \""
                + initialRelease + "\"," + "\n  \"bestSellingGame\": \"" + bestSellingGame + "\"" + "\n}";
    }
}
