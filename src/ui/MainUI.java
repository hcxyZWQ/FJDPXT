package ui;

import bean.ui.Flight;
import bill.IFlightService;
import bill.impl.FloghtServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                id=id.replace("-","");
                System.out.println(id);

                System.out.print("请输入您的航班号:");
                String airid = sc.next();
                System.out.print("请输入您的机型:");
                String airtype = sc.next();
                System.out.print("请输入您的位置总数:");
                int totalSeatNum = sc.nextInt();
                System.out.print("请输入您的出发地:");
                String startair = sc.next();
                System.out.print("请输入您的到达地:");
                String endair = sc.next();
                System.out.print("请输入您的出发时间:");
                String starttime = sc.next();

                Flight flight = new Flight(id, airid, airtype, totalSeatNum, starttime, endair, starttime);

                IFlightService iFlightService = new FloghtServiceImpl();
                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e) {

                    String s = e.getMessage().substring(0, 9);
                    String errorMessage = e.getMessage();
                    System.out.println(e.getMessage());
                    if (errorMessage.startsWith("ORA-12899")) {
                        //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                        // 按指定模式在字符串查找
                        String pattern="(\\W)+(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        // 创建 Pattern 对象
                        Pattern r = Pattern.compile(pattern);
                        // 现在创建 matcher 对象
                        Matcher m = r.matcher(errorMessage);
                        if (m.find()) {
                            String tableName = m.group(4);
                            String columnName = m.group(5);
                            System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
                        } else {
                            System.out.println("NO MATCH");
                        }

                    }

                }

            }
            else if (Choice==2)
            {
                IFlightService iFlightService=new FloghtServiceImpl();
                try {
                    Set<Flight> allFlight=iFlightService.getAllFlight();
                    for (Flight flight:allFlight)
                    {
                        System.out.println(flight);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
