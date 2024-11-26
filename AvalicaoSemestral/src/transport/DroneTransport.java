package transport;

import packageinfo.PackageInfo;

public class DroneTransport implements TransportStrategy {
    @Override
    public void deliver(PackageInfo packageInfo) {
        if (!packageInfo.isMetropolitan() || packageInfo.getWeight() > 5) {
            System.out.println("Erro: Entrega por drones disponível apenas para áreas metropolitanas e pacotes pequenos.");
            return;
        }
        System.out.println("Entrega por drone selecionada.");
        System.out.println("Verificando área e peso do pacote para envio por drone.");
    }
}
