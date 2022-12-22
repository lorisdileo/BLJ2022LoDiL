public class Main {
    public static void main(String[] args) {
        Simulation sim = new Simulation(100, true, Preset.GLIDERS_20X20);
        SimulationPanel simPanel = new SimulationPanel(sim, 40, 0.9);
        simPanel.getSimulation().start();
    }
}