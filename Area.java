import java.util.*;

public class Area{
    public static void main(String[] args){
        System.out.println("Input the radius");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println(area);

    }
}