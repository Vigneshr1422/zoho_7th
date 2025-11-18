package Zoho.GitHub_pradeep;

public class No_10_ChocolateQuestion {
        public static void main(String[] args) {
            int price = 40;
            int perPrice = 1;
            int wrapperNeed = 3;
            int wrapperChoco = 1;

            // Initial chocolates bought
            int chocolates = price / perPrice;
            int wrappers = chocolates;

            // Keep exchanging wrappers
            while (wrappers >= wrapperNeed) {
                int extra = (wrappers / wrapperNeed) * wrapperChoco;
                chocolates += extra;
                wrappers = (wrappers % wrapperNeed) + extra;
            }

            System.out.println("Total chocolates: " + chocolates);
            System.out.println("Remaining wrappers: " + wrappers);
        }
    }