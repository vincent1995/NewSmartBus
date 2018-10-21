package huang.bling.smartbus.ui.Driver;

import huang.bling.smartbus.bean.DriverBean;

public class DriverModel implements DriverContract.Model{

    DriverBean driverBean;
    DriverModel(){

        driverBean=new DriverBean();
    }
    @Override
    public void requestNewData() {
    }

    @Override
    public void connectServer() {
    }

    @Override
    public void disconnectServer() {
    }

    @Override
    public DriverBean getData() {
        return driverBean;
    }

}
