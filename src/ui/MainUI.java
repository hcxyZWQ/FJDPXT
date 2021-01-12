package ui;

import bean.ui.Planeimformation;
import bill.IFlightService;
import bill.impl.FloghtServiceImpl;

import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的选择！");

            System.out.println("按1，录入信息");
            System.out.println("按2，显示航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，预定机票");
            System.out.println("按5，退订机票");
            System.out.println("按6，退出系统");

            int Choice = sc.nextInt();
            if (Choice == 1) {
                String id = UUID.randomUUID().toString();
                System.out.println(id);
                id.replace("-","");
                System.out.print("请输入您的机型:");
                String airtype = sc.next();
                System.out.print("请输入您的航班号:");
                String airid = sc.next();
                System.out.print("请输入您的出发地:");
                String startair = sc.next();
                System.out.print("请输入您的到达地:");
                String endair = sc.next();
                System.out.print("请输入您的出发时间:");
                String starttime = sc.next();
                System.out.print("请输入您的位置总数:");
                String totalSeatNum = sc.next();
                Planeimformation flight=new Planeimformation(airid,airtype,starttime,endair,starttime,totalSeatNum);

                IFlightService iFlightService=new FloghtServiceImpl();
                iFlightService.insertFlight(flight);

            }

        }

    }
}
