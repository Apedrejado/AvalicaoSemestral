package factory;

import packageinfo.PackageInfo;
import transport.*;

public class TransportFactory {
    public static TransportStrategy getTransport(PackageInfo packageInfo) {
        // 1. Transporte por drones: Áreas metropolitanas e peso <= 5kg
        if (packageInfo.isMetropolitan() && packageInfo.getWeight() <= 5) {
            return new DroneTransport();
        }

        // 2. Transporte marítimo: Apenas para entregas internacionais
        if (packageInfo.isInternational()) {
            return new SeaTransport();
        }

        // 3. Transporte aéreo: Pacotes leves (<= 50kg) e pequenos (<= 150 dimensões)
        if (packageInfo.getWeight() <= 50 && packageInfo.getDimensions() <= 150) {
            return new AirTransport();
        }

        // 4. Transporte terrestre: Fallback para qualquer outro caso
        return new GroundTransport();
    }
}
