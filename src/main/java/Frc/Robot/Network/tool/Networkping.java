package Frc.Robot.Network.tool;

import org.icmp4j.IcmpPingRequest;
import org.icmp4j.IcmpPingResponse;
import org.icmp4j.IcmpPingUtil;

public class Networkping {
    public static void Ping() {
    final IcmpPingRequest request = IcmpPingUtil.createIcmpPingRequest ();
	request.setHost ("");
	
	final IcmpPingResponse response = IcmpPingUtil.executePingRequest (request);
	
	final String formattedResponse = IcmpPingUtil.formatResponse (response);

	SmartDashboard.putString("firstResponse",formattedResponse);
    }
}