package levy.hazeldemo;

/**
 * Hazelcat client instance demo
 */

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class HazelcastClientTester {
	
	public static void main (String[] args) {
		// configuration 		
		ClientConfig cfg = new ClientConfig();
		// hazelcast client instance
		HazelcastInstance hzc = HazelcastClient.newHazelcastClient(cfg);
		// get "default" map
		IMap<String, String> m = hzc.getMap("default");
		// add new element to "default" map
		m.put(Integer.toString( m.size() ), "one more element");
		
		System.out.println(m.values());
	}

}
