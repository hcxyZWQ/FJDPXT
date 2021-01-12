package Dao;

import bean.ui.Planeimformation;

import java.util.Set;

public interface IFlightDao {
    void insertFlight(Planeimformation planeimformation);//航班信息的录入
    Set<IFlightDao> getAllFlight();//获取所有的航班信息
    IFlightDao getFlightStartTime(String startTime);//获取出发时间
    IFlightDao getFlightStartair(String startair);//获取出发地
    IFlightDao getFlightEndAir(String endair);//获取到达地
    void updateFlight(IFlightDao Flight);//更新航班信息
}
