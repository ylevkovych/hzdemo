package levy.hazeldemo;

/**
 * Hazelcast cluster instance demo
 */

import java.util.Map;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastTester {
	
	public static void main(String[] args) {
		// configuration
		Config cfg = new Config();
		// hazelcast client instance
		HazelcastInstance hci = Hazelcast.newHazelcastInstance(cfg);
		// get "default" map
		Map<String, String> m = hci.getMap("default");
		// add new element to "default" map
		m.put(Integer.toString( m.size() ), "some element");
		
		System.out.println(m.values());
	}
}
