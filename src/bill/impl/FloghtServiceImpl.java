package bill.impl;

import Dao.IFlightDao;
import Dao.SHIXIAN.IFlightDaoIml;
import bean.ui.Planeimformation;
import bill.IFlightService;

import java.util.Set;

public class FloghtServiceImpl implements IFlightService {

    IFlightDao iFlightDao;

    @Override
    public void insertFlight(Planeimformation planeimformation) {
        System.out.println("数据从UI到达了业务层"+planeimformation);
        iFlightDao=new IFlightDaoIml();
        iFlightDao.insertFlight(planeimformation);
        System.out.println("数据从业务层到达了Dao层"+planeimformation);
    }

    @Override
    public Set<IFlightDao> getAllFlight() {
        return null;
    }

    @Override
    public IFlightDao getFlightStartTime(String startTime) {
        return null;
    }

    @Override
    public IFlightDao getFlightStartair(String startair) {
        return null;
    }

    @Override
    public IFlightDao getFlightEndAir(String endair) {
        return null;
    }

    @Override
    public void updateFlight(IFlightDao Flight) {

    }
}

