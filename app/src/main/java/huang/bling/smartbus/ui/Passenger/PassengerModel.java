package huang.bling.smartbus.ui.Passenger;

import huang.bling.smartbus.bean.Bean;
import huang.bling.smartbus.bean.PassagerBean;

public class PassengerModel implements PassengerContract.Model{

    PassagerBean  passagerBean;
    PassengerModel(){

        passagerBean=new PassagerBean();
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
    public PassagerBean getData() {
        return passagerBean;
    }
}
