package ch.noseryoung.main;

public class Main {

  public static void main(String[] args) {

    SideCreatorService creatorService = new SideCreatorService();
    TriangleManager sm = new TriangleManager(creatorService);
    sm.run();

    // todo: print all sorted Triangles
    // ... = sm.getAllTrianglesSortedByLongestSide();
    // ... = sm.getAllTrianglesSortedByLongestSide();

  }
}
