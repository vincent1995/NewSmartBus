package huang.bling.smartbus.ui.Passenger;

import huang.bling.smartbus.bean.PassagerBean;

public interface PassengerContract {
    interface Model{
        void requestNewData();
        void connectServer();
        void disconnectServer();
        PassagerBean getData();
    }

    interface View{
        void updateUi(PassagerBean data);
    }

    interface Presenter{
        void startWork();
        void endWork();
        void requestNewData();
        void setVM(PassengerContract.View v,PassengerContract.Model m);
    }
}

