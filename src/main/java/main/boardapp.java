package main;

import java.util.Scanner;

public class boardapp {
    articleControllor articleControllor = new articleControllor();
    public void run() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("명령어: ");
            String manu = scan.nextLine();
            if (manu.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (manu.equals("add")) {
                while(true) {
                    articleControllor.add();

                    System.out.println("다시 등록하시겠습니까?  yes/no");
                    String yn = scan.nextLine();
                    if (yn.equalsIgnoreCase("no")) {
                        break;
                    }
                }
            } else if (manu.equals("list")) {
                    articleControllor.list();
            } else if (manu.equals("delete")) {
                    articleControllor.delete();
            } else if (manu.equals("update")) {
                    articleControllor.update();
            } else if (manu.equals("detail")) {
                    articleControllor.detail();
            } else if (manu.equals("search")) {
                    articleControllor.search();
            }
            else {
                System.out.println("다시 입력해주세요");
            }
        }
    }
}
