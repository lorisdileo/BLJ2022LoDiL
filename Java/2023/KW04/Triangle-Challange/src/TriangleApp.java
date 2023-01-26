import java.util.Scanner;
// import the exceptions

public class TriangleApp {

    private String company;
    private String handler;

    private boolean isRunning;

    private String sideAInput;
    private String sideBInput;
    private String sideCInput;

    private double sideA;
    private double sideB;
    private double sideC;

    private String code;

    Scanner scan = new Scanner(System.in);

    /**
     * The constructor.
     *
     * @param company of type String to print in the application header
     * @param handler of type String to print in the application header
     */
    public TriangleApp(String company, String handler) {
        // persist company and handler
        // with initialisation programm is running.
    }

    /**
     * This method starts the actual application. It will remain in a loop as long
     * as the fieunning" is true.ld "isR
     */
    public void start() {
        printHeader();
        while (isRunning) {
            System.out.println("\nTEST CASES TRIANGLE\n");
            this.katheteAInput = katheteAInput;




            try {
                // validate Input (might throw exception)
                // get triangle code and write it to field code
            } catch (TriangleException e) {
                // get error code from exception and write it to field code
            } finally {
                System.out.println("----------------------------------------------");
                System.out.println();//noch machen
                System.out.println("----------------------------------------------");
                // ask user for next step
            }
        }
    }

    /**
     * This method prints the application header.
     */
    private void printHeader() {
        System.out.println("**********************************************");
        System.out.println("             TRIANGLE EVALUATOR               ");
        System.out.println("**********************************************");
        System.out.println("Company: SIX Group AG, 2023                   ");
        System.out.println("Handler: Loris Di Leo                         ");
        System.out.println("**********************************************");

    }

    /**
     * This method prints the evaluated code in an aesthetically pleasing way.
     */
    private void printResult() {
        System.out.println(code);
    }

    /**
     * This method prompts the user to give an input for a trinalge side.
     *
     * @param side of type String to display as title for the prompt.
     * @return the input of type String.
     */
    private String promptSide(String side) {
        System.out.println("Kathete A:\t");
        Integer katheteAInput = scan.nextInt();
        System.out.println("Kathete B:\t");
        Integer katheteBInput = scan.nextInt();
        System.out.println("Hypothenuse C:\t");
        Integer hypothenuseCInput = scan.nextInt();
        return side;
    }

    /**
     * This method prompts the user to give an input.<br>
     * "q": Quits the program.<br>
     * "c": Continues the program.<br>
     * else: Keeps asking for an input until "q" or "c" is entered.
     */
    private void promptAction() {
        String action = "";
        // get valid prompt

        // check if program needs to be cancelled

        System.out.println("******************************");
    }

    /**
     * This method validates the three entered values, to be used as sides for a
     * triangle.
     *
     * @throws TriangleException if the validation fails. This means that the
     *                           entered values do not lead to a triangle.
     */
    private void validateInput() throws TriangleException {
        // validate sideAInput, sideBInput, sideCInput as double
        KatheteAInput = in.nextDouble();
        KatheteBInput = in.nextDouble();
        HypothenuseCInput = in.nextDouble();

        if (sideA == 0 || sideB == 0 || sideC == 0) {
            throw new ZeroTriangleSideException();
            // throws ZeroTriangleSideException
        }
        // validates other triangle cases
    }

    /**
     * This method determines whether the three entered values lead to a
     * equilateral, isosceles, right-angled or scalene triangle.
     *
     * @return The corresponding code for each triangle.
     */
    private String determineTriangleType() {
        // todo
        return null;
    }
}
