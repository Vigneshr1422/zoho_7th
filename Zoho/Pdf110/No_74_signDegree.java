package Zoho.Pdf110;

public class No_74_signDegree {
        public static void main(String[] args) {
            double x = 30;
            int n = 10;

            System.out.println(explanation_method(x, n));
            // buildin();
            // optimal();
        }

        public static void optimal(){
            int n=10;
            double angle=30.0;
            double pi=3.1415;
            double radian=angle *pi /180.0;

            double current=radian;

            double ans=radian;

            for(int i=1;i<=n;i++){
                current*=-(radian * radian) / ( (2.0*i)*(2*i+1));
                ans+=current;
            }
            System.out.println(ans);

        }

        public static double explanation_method(double x, int n) {
            double r = Math.toRadians(x);
            double ans = 0;
            for (int i = 0; i < n; i++) {
                int sign = (i % 2 == 0) ? 1 : -1;
                double term = Math.pow(r, 2 * i + 1) / fact(2 * i + 1);
                ans += term * sign;   // 🔥 fix: use += instead of =
            }
            return ans;
        }

        public static int fact(int n) {
            int ans = 1;
            for (int i = 1; i <= n; i++) {
                ans *= i;
            }
            return ans;
        }

        public static void buildin(){
            double x=30;
            double rad=Math.toRadians(x);

            System.out.println(Math.sin(rad));
        }
    }
/*
 *


 3. Compiuting value of sin (x)
  Input x = 30
  n = 10
  output = 0.5 Hint
  The equation sin(x) = x - x^3 / 3! + x^5 / 5! -
 */

