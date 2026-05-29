//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    int intOperandA = 1;
    int intOperandB = 2;
    int intSum;
    int intProduct;
    int intDifference;
    int intQuotient;
    int intModulo;

    double doubleOperandA = 1.0;
    double doubleOperandB = 2.0;
    double doubleSum;
    double doubleProduct;
    double doubleDifference;
    double doubleQuotient;

    intSum = intOperandA + intOperandB;
    intDifference = intOperandA - intOperandB;
    intProduct = intOperandA * intOperandB;
    intQuotient = intOperandA / intOperandB;
    intModulo = intOperandA % intOperandB;

    doubleSum = doubleOperandA + doubleOperandB;
    doubleDifference = doubleOperandA - doubleOperandB;
    doubleProduct = doubleOperandA * doubleOperandB;
    doubleQuotient = doubleOperandA / doubleOperandB;

    System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
    System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
    System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
    System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
    System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
    System.out.println(" ");
    System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
    System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
    System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
    System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

    // I know variables are usually declared at the top, but for the sake of homework readability, I am putting them together the output.

    double myLunchCost = 8.78;
    double myKids = 4.0;
    String rainCheck = "No!";
    double gasPrice = 3.99;
    int favNumber = 3;
    double shoeSize = 10.5;
    int birthMonth = 1;
    String myName = "Trevor Kirtman";
}
