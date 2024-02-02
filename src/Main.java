public class Main
{
    public static void main(String[] args)
    {
        //declarations

        double cardBalance = 5000;
        double interestRate = 0.17;

        double interestOneMonth = cardBalance * interestRate;
        double cardBalanceOneMonth = cardBalance + interestOneMonth;
        double interestTwoMonth = cardBalanceOneMonth * interestRate;

        System.out.println("Your interest after one month is " + interestOneMonth + "and your interest after two months is " + interestTwoMonth);
    }
}