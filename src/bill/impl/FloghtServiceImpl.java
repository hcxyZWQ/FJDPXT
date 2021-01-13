package bill.impl;

import Dao.IFlightDao;
import Dao.SHIXIAN.IFlightDaoIml;
import bean.ui.Flight;
import bill.IFlightService;

import java.sql.SQLException;
import java.util.Set;

public class FloghtServiceImpl implements IFlightService {

    IFlightDao iFlightDao;

    public FloghtServiceImpl()
    {
        iFlightDao=new IFlightDaoIml();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        iFlightDao.insertFlight(flight);

    }

    @Override
    public Set<Flight> getAllFlight() throws SQLException {
        return iFlightDao.getAllFlight();
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

