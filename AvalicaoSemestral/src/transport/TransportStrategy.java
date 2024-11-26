package transport;

import packageinfo.PackageInfo;

public interface TransportStrategy {
    void deliver(PackageInfo packageInfo);
}
