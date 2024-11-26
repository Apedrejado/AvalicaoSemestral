package transport;

import packageinfo.PackageInfo;

public class SeaTransport implements TransportStrategy {
    @Override
    public void deliver(PackageInfo packageInfo) {
        if (!packageInfo.isInternational()) {
            System.out.println("Erro: Transporte marítimo disponível apenas para entregas internacionais.");
            return;
        }
        System.out.println("Transporte marítimo selecionado.");
        System.out.println("Preparando envio internacional via marítimo.");
    }
}
