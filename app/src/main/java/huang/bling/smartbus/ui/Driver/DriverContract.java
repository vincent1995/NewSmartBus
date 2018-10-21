package huang.bling.smartbus.ui.Driver;

import huang.bling.smartbus.bean.DriverBean;

public interface DriverContract {
    interface Model{
        void requestNewData();
        void connectServer();
        void disconnectServer();
        DriverBean getData();
    }

    interface View{
        void updateUi(DriverBean data);
    }

    interface Presenter{
        void startWork();
        void endWork();
        void requestNewData();
        void setVM(DriverContract.View v,DriverContract.Model m);
    }
}
