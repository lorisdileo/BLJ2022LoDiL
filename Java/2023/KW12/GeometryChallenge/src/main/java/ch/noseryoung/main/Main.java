package ch.noseryoung.main;

public class Main {

  public static void main(String[] args) {

    SideCreatorUserService creatorUserService = new SideCreatorUserService();
    TriangleManager sm = new TriangleManager(creatorUserService);

    sm.run();

    sm.getAllTrianglesSortedByLongestSide();
    sm.getAllTrianglesSortedByLongestSide();
  }
}
