import java.util.Scanner;

public class Foot{
   private FootShape FootShape = new FootShape();

    public void draw(int ans){
        switch (ans) {
            case 1:
                FootShape.drawAsEllipse();
                break;
            case 2:
                FootShape.drawAsRectangle();
                break;
        
            default:
                System.out.println("error");
                break;
        }
    }
     public static void main(String[] ags){
        Foot f = new Foot();
        Scanner sc = new Scanner(System.in);
        System.out.printf("What to draw?");
        int ans = sc.nextInt();
        f.draw(ans);
        sc.close();


    }
}