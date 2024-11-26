package transport;

import packageinfo.PackageInfo;

public class GroundTransport implements TransportStrategy {
    @Override
    public void deliver(PackageInfo packageInfo) {
        System.out.println("Transporte terrestre selecionado.");
        System.out.println("Selecionando transportadora local para entrega terrestre.");
    }
}
