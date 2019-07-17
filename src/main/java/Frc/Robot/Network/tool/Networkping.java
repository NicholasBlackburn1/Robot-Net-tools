package Frc.Robot.Network.tool;

import org.icmp4j.IcmpPingRequest;
import org.icmp4j.IcmpPingResponse;
import org.icmp4j.IcmpPingUtil;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Networkping {
    public static void Ping() {
        final IcmpPingRequest request = IcmpPingUtil.createIcmpPingRequest();
        request.setHost("roborio-5740-FRC.local");

        final IcmpPingResponse response = IcmpPingUtil.executePingRequest(request);

        final String formattedResponse = IcmpPingUtil.formatResponse(response);
        
    }
    
}