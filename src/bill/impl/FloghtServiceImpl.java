package bill.impl;

import Dao.IFlightDao;
import bean.ui.Planeimformation;
import bill.IFlightService;

import java.util.Set;

public class FloghtServiceImpl implements IFlightService {


    @Override
    public void insertFlight(Planeimformation planeimformation) {
        System.out.println(planeimformation);
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

