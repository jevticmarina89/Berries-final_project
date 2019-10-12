import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.junit.Test;

public class Fruit_methodsTest {

	@Test
	public void testConnectingAPI() throws JSONException, MalformedURLException, IOException {
		assertTrue(Fruit_methods.connectingAPI("https://pokeapi.co/api/v2/berry/").toString().contains("count"));
		assertEquals(64, Fruit_methods.connectingAPI("https://pokeapi.co/api/v2/berry/").get("count"));
	}

	@Test
	public void testCollectingBerries() throws MalformedURLException, IOException {
		assertEquals(new Berry("enigma", 155, 24).toString(),
				Fruit_methods.collectingBerries("https://pokeapi.co/api/v2/berry/", 64).get(59).toString());
	}
	
	@Test
	public void testPickBerryWithMaxGrowthRate() {
		List<Berry> testList= new ArrayList<Berry>();
		testList.add(new Berry("a", 400, 100));
		testList.add(new Berry("b", 300, 100));
		testList.add(new Berry("c", 300, 10));
		Optional<Berry> toTest = Fruit_methods.pickBerryWithMaxGrowthRate(testList);
		assertEquals(toTest, Fruit_methods.pickBerryWithMaxGrowthRate(testList));
	}

}