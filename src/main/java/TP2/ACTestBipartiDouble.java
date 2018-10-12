package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class ACTestBipartiDouble {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_MinMinus_MinMinus_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, -1, -0.1);});
	}
	
	@Test
	void test_MinMinus_MinMinus_Minus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, -1, 0.0);});
	}
	
	@Test
	void test_MinMinus_MinMinus_Nominal() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, -1, 0.5);});
	}
	
	@Test
	void test_MinMinus_MinMinus_Max() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, -1, 1.0);});
	}
	
	@Test
	void test_MinMinus_MinMinus_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, -1, 1.1);});
	}
	
	@Test
	void test_MinMinus_Min_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 0, -1.0);});
	}
	
	@Test
	void test_MinMinus_Min_Min() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 0, 0.0);});
	}
	
	@Test
	void test_MinMinus_Min_Nominal() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 0, 0.5);});
	}
	
	@Test
	void test_MinMinus_Min_Max() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 0, 1.0);});
	}
	
	@Test
	void test_MinMinus_Min_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 0, 1.1);});
	}
	
	@Test
	void test_MinMinus_Nominal_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 7, -0.1);});
	}
	
	@Test
	void test_MinMinus_Nominal_Min() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 7, 0.0);});
	}
	
	@Test
	void test_MinMinus_Nominal_Nominal() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 7, 0.5);});
	}
	
	@Test
	void test_MinMinus_Nominal_Max() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 7, 1.0);});
	}
	
	@Test
	void test_MinMinus_Nominal_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, 7, 1.1);});
	}
	
	@Test
	void test_MinMinus_Max_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, Integer.MAX_VALUE, -0.1);});
	}
	
	@Test
	void test_MinMinus_Max_Min() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, Integer.MAX_VALUE, 0.0);});
	}
	
	@Test
	void test_MinMinus_Max_Nominal() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, Integer.MAX_VALUE, 0.5);});
	}
	
	@Test
	void test_MinMinus_Max_Max() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, Integer.MAX_VALUE, 1.0);});
	}
	
	@Test
	void test_MinMinus_Max_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(-1, Integer.MAX_VALUE, 1.1);});
	}
	

	
	@Test
	void test_Min_Min_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(0, 0, -0.1);});
	}
	
	@Test
	void test_Min_Min_Min() {
		Graph g = GraphGenerator.bipartite(0, 0, 0.0);
		assertEquals(0, g.E());
		assertEquals(0, g.V());
	}
	
	@Test
	void test_Min_Min_Nominal() {
		Graph g = GraphGenerator.bipartite(0, 0, 0.5);
		assertEquals(0, g.E());
		assertEquals(0, g.V());
	}
	
	@Test
	void test_Min_Min_Max() {
		Graph g = GraphGenerator.bipartite(0, 0, 1.0);
		assertEquals(0, g.E());
		assertEquals(0, g.V());
	}
	
	@Test
	void test_Min_Min_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(0, 0, 1.1);});
	}
	
	@Test
	void test_Min_Nominal_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(0, 7, -0.1);});
	}
	
	@Test
	void test_Min_Nominal_Min() {
		Graph g = GraphGenerator.bipartite(0, 7, 0.0);
		assertEquals(0, g.E());
		assertEquals(7, g.V());
	}
	
	@Test
	void test_Min_Nominal_Nominal() {
		Graph g = GraphGenerator.bipartite(0, 7, 0.5);
		assertEquals(0, g.E());
		assertEquals(7, g.V());
	}
	
	@Test
	void test_Min_Nominal_Max() {
		Graph g = GraphGenerator.bipartite(0, 7, 1.0);
		assertEquals(0, g.E());
		assertEquals(7, g.V());
	}
	
	@Test
	void test_Min_Nominal_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(0, 7, 1.1);});
	}
	
	@Test
	void test_Min_Max_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(0, Integer.MAX_VALUE, -0.1);});
	}
	
	@Test
	void test_Min_Max_Min() {
		try {
			Graph g = GraphGenerator.bipartite(0, Integer.MAX_VALUE, 0.0);
			assertEquals(0, g.E());
			assertEquals(Integer.MAX_VALUE, g.V());
		} catch (Error e) {
			fail("This method should not throw an error.");
		}

	}
	
	@Test
	void test_Min_Max_Nominal() {
		try {
			Graph g = GraphGenerator.bipartite(0, Integer.MAX_VALUE, 0.5);
			assertEquals(0, g.E());
			assertEquals(Integer.MAX_VALUE, g.V());
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	@Test
	void test_Min_Max_Max() {
		try {
			Graph g = GraphGenerator.bipartite(0, Integer.MAX_VALUE, 1.0);
			assertEquals(Integer.MAX_VALUE, g.V());
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	@Test
	void test_Min_Max_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(0, Integer.MAX_VALUE, 1.1);});
	}
	
	@Test
	void test_Nominal_Nominal_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(7, 7, -0.1);});
	}
	
	@Test
	void test_Nominal_Nominal_Min() {
		Graph g = GraphGenerator.bipartite(7, 7, 0.0);
		assertEquals(49, g.E());
		assertEquals(14, g.V());
	}
	
	@Test
	void test_Nominal_Nominal_Nominal() {
		Graph g = GraphGenerator.bipartite(7, 7, 0.5);
		assertEquals(14, g.V());
	}
	
	@Test
	void test_Nominal_Nominal_Max() {
		Graph g = GraphGenerator.bipartite(7, 7, 1.0);
		assertEquals(0, g.E());
		assertEquals(14, g.V());
	}
	
	@Test
	void test_Nominal_Nominal_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(7, 7, 1.1);});
	}
	
	@Test
	void test_Nominal_Max_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(7, Integer.MAX_VALUE, -0.1);});
	}
	
	@Test
	void test_Nominal_Max_Min() {
		try {
			Graph g = GraphGenerator.bipartite(7, Integer.MAX_VALUE, 0.0);
			assertEquals(Integer.MAX_VALUE + 7, g.V());
		} catch (Exception e) {
			fail("This method should not throw an error.");
		}

	}
	
	@Test
	void test_Nominal_Max_Nominal() {
		try {
			Graph g = GraphGenerator.bipartite(7, Integer.MAX_VALUE, 0.5);
			assertEquals(Integer.MAX_VALUE + 7, g.V());
		} catch (Exception e) {
			fail("This method should not throw an error.");
		}
	}
	
	@Test
	void test_Nominal_Max_Max() {
		try {
			Graph g = GraphGenerator.bipartite(7, Integer.MAX_VALUE, 1.0);
			assertEquals(0, g.E());
			assertEquals(Integer.MAX_VALUE + 7, g.V());
		} catch (Exception e) {
			fail("This method should not throw an error.");
		}
	}
	
	@Test
	void test_Nominal_Max_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(7, Integer.MAX_VALUE, 1.1);});
	}
	
	
	
	
	@Test
	void test_Max_Max_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(Integer.MAX_VALUE, Integer.MAX_VALUE, -0.1);});
	}
	
	@Test
	void test_Max_Max_Min() {
		try {
			Graph g = GraphGenerator.bipartite(Integer.MAX_VALUE, Integer.MAX_VALUE, 0.0);
			assertEquals(Integer.MAX_VALUE + Integer.MAX_VALUE, g.V());
		} catch (Exception e) {
			fail("This method should not throw an error.");
		}

	}
	
	@Test
	void test_Max_Max_Nominal() {
		try {
			Graph g = GraphGenerator.bipartite(Integer.MAX_VALUE, Integer.MAX_VALUE, 0.5);
			assertEquals(Integer.MAX_VALUE + Integer.MAX_VALUE, g.V());
		} catch (Exception e) {
			fail("This method should not throw an error.");
		}
	}
	
	@Test
	void test_Max_Max_Max() {
		try {
			Graph g = GraphGenerator.bipartite(Integer.MAX_VALUE, Integer.MAX_VALUE, 1.0);
			assertEquals(0, g.E());
			assertEquals(Integer.MAX_VALUE + Integer.MAX_VALUE, g.V());
		} catch (Exception e) {
			fail("This method should not throw an error.");
		}
	}
	
	@Test
	void test_Max_Max_MaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(Integer.MAX_VALUE, Integer.MAX_VALUE, 1.1);});
	}
	

}
