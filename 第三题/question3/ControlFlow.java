package question3;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("【欢迎使用多功能工具箱】");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.成绩评定 2.空心金字塔 3.递归阶乘 4.退出系统");
            System.out.print("请选择功能：");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("请输入分数：");
                int score = scanner.nextInt();
                ScoreJudgment scoreJudgment = new ScoreJudgment();
                System.out.println(scoreJudgment.judgeif(score));
                System.out.println(scoreJudgment.judgeswitch(score));
            } else if (choice == 2) {
                System.out.print("请输入金字塔层数：");
                int layers = scanner.nextInt();
                HollowPyramid hollowPyramid = new HollowPyramid();
                System.out.print(hollowPyramid.getHollowPyramid(layers));
            } else if (choice == 3) {
                System.out.print("计算阶乘：");
                int n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("输入错误，请重新输入");
                    continue;
                } else {
                    Calculation calculation = new Calculation();
                    System.out.println(calculation.calculateFactorial(n));
                }
            } else if (choice == 4) {
                System.out.println("再见");
                break;
            } else {
                System.out.println("输入错误，请重新选择功能：");
            }
        }
    }

}
