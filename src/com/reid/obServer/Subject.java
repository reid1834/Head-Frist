package com.reid.obServer;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public interface Subject {
    public void regeister(Client client);
    public void unRegeister(Client client);
    public void notification();
}
