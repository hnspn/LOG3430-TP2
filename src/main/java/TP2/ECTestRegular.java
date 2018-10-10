package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class ECTestRegular {

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

	/**
	 * <{-1, -1}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testMinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(-1, -1);});
	}
	
	/**
	 * <{0, 0}, {Graph}>.
	 */
	@Test
	void testMin() {
		Graph graph = GraphGenerator.regular(0, 0);
		assertEquals(0, graph.V());
		assertEquals(0, graph.E());
	}
	
	/**
	 * <{1, 1}, {Graph}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testMinPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(1, 1);});
	}
	
	/**
	 * <{3, 2}, {Graph}>. 
	 */
	@Test
	void testNominal() {
		Graph graph = GraphGenerator.regular(3, 2);
		assertEquals(graph.V(), 3);
		assertEquals(graph.E(), 3);
	}
	
	/**
	 * <{Max - 1, Max - 1}, {Graph}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testMaxMinus() {
		try {
			GraphGenerator.regular(Integer.MAX_VALUE - 1, Integer.MAX_VALUE);
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	/**
	 * <{Max, Max}, {Graph}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testMax() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(Integer.MAX_VALUE, Integer.MAX_VALUE);});
	}
}
