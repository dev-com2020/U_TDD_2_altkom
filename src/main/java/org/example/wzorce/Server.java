package org.example.wzorce;

// Interfejs serwera
interface Server {
    void request();
}

// Prawdziwy serwer
class RealServer implements Server {
    public void request() {
        System.out.println("Processing request on Real Server");
    }
}

// Proxy serwera (np. do kontroli dostępu)
class ProxyServer implements Server {
    private RealServer realServer;

    public void request() {
        if (realServer == null) {
            realServer = new RealServer();
        }
        System.out.println("Logging request");
        realServer.request();
    }
}

// Użycie Proxy
//public class Main {
//    public static void main(String[] args) {
//        Server proxy = new ProxyServer();
//        proxy.request(); // "Logging request" → "Processing request on Real Server"
//    }
//}
