package GitHubQuestions;

public class chocalteQuestion {

    public static void main(String[] args) {
        int price=40;
        int perPrice=1;
        int wrapperNeed=3;
        int wrapperChoao=1;

        int vist=0;
        int max=1;

        int cho=price/perPrice;
        int wrapper=cho;
        System.out.println(cho);
        while(wrapper>=wrapperNeed && vist<max){
            vist++;
                       int totalcho=(wrapper/wrapperNeed)*wrapperChoao;
            cho+=totalcho;

            wrapper=(wrapper%wrapperNeed)+totalcho;


        }
        System.out.println(wrapper);
        System.out.println(cho);
    }
    }
