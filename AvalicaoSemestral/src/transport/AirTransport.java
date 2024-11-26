package transport;

import packageinfo.PackageInfo;

public class AirTransport implements TransportStrategy {
    @Override
    public void deliver(PackageInfo packageInfo) {
        if (packageInfo.getWeight() > 50 || packageInfo.getDimensions() > 150) {
            System.out.println("Erro: Pacote excede os limites para transporte aéreo.");
            return;
        }
        System.out.println("Transporte aéreo selecionado.");
        System.out.println("Entrega aérea realizada considerando peso e dimensões.");
    }
}
