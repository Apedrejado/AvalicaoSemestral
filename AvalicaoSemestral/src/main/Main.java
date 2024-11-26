package main;

import factory.TransportFactory;
import packageinfo.PackageInfo;
import transport.TransportStrategy;

public class Main {
    public static void main(String[] args) {
        // 1. Pacote para transporte terrestre
        PackageInfo groundPackage = new PackageInfo(70, 300, false, false);
        TransportStrategy groundTransport = TransportFactory.getTransport(groundPackage);
        groundTransport.deliver(groundPackage);
        System.out.println("====================");

        // 2. Pacote para transporte aéreo
        PackageInfo airPackage = new PackageInfo(10, 50, false, false);
        TransportStrategy airTransport = TransportFactory.getTransport(airPackage);
        airTransport.deliver(airPackage);
        System.out.println("====================");

        // 3. Pacote para transporte marítimo
        PackageInfo seaPackage = new PackageInfo(100, 200, true, false);
        TransportStrategy seaTransport = TransportFactory.getTransport(seaPackage);
        seaTransport.deliver(seaPackage);
        System.out.println("====================");

        // 4. Pacote para entrega por drones
        PackageInfo dronePackage = new PackageInfo(3, 30, false, true);
        TransportStrategy droneTransport = TransportFactory.getTransport(dronePackage);
        droneTransport.deliver(dronePackage);
        System.out.println("====================");

        // 5. Pacote inválido para drones (peso > 5)
        PackageInfo invalidDronePackage = new PackageInfo(6, 30, false, true);
        TransportStrategy invalidDroneTransport = TransportFactory.getTransport(invalidDronePackage);
        invalidDroneTransport.deliver(invalidDronePackage);
        System.out.println("====================");

        // 6. Pacote pesado para transporte terrestre (fallback)
        PackageInfo heavyPackage = new PackageInfo(90, 300, false, false);
        TransportStrategy heavyTransport = TransportFactory.getTransport(heavyPackage);
        heavyTransport.deliver(heavyPackage);
        System.out.println("====================");
    }
}
