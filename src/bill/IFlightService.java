package bill;

import Dao.IFlightDao;
import bean.ui.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight planeimformation) throws SQLException;//航班信息的录入
    Set<Flight> getAllFlight() throws SQLException;//获取所有的航班信息
    IFlightDao getFlightStartTime(String startTime);//获取出发时间
    IFlightDao getFlightStartair(String startair);//获取出发地
    IFlightDao getFlightEndAir(String endair);//获取到达地
    void updateFlight(IFlightDao Flight);//更新航班信息

}
