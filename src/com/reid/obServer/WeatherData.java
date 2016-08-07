package com.reid.obServer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class WeatherData implements Subject {
    private List<Client> mList;

    public WeatherData() {
        mList = new ArrayList<>();
    }

    @Override
    public void regeister(Client client) {
        if (client != null) {
            mList.add(client);
        }
    }

    @Override
    public void unRegeister(Client client) {
        if (mList.contains(client)) {
            mList.remove(client);
        }
    }

    @Override
    public void notification() {
        for (int i = 0; i < mList.size(); i++) {
            mList.get(i).update();
        }
    }
}
