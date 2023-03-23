package ch.noseryoung.main;

import java.util.Random;

public class SideCreatorService implements ShapeSideCreator{
  private double roundToHalf(double d) {
    return Math.round(d * 2) / 2.0;
  }

  /**
   * This method generates a random <code>double</code>, rounded to .0 or .5.
   *
   * @return the generated value, to be used as a side for a shape
   */
  @Override
  public double createSide() {

    Random rand = new Random();
    double var = roundToHalf(rand.nextDouble());

    return var;
  }
}
