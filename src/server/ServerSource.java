package server;

import server.ServerData;

public class ServerSource {

    private ServerData serverData;

    public synchronized ServerData getLast() {
        return serverData;
    }

    public synchronized void update(ServerData serverData) {
        this.serverData = serverData;
    }
}
