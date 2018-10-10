package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class ECTestBipartiDouble {

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
	 * <{0, 0, -0.1}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testMinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(0, 0, -0.1);});
	}
	
	/**
	 * <{1, 1, 0.0}, {Graph}>.
	 */
	@Test
	void testMin() {
		Graph graph = GraphGenerator.bipartite(1, 1, 0.0);
		assertEquals(graph.V(), 2);
	}
	
	/**
	 * <{2, 2, 0.1}, {Graph}>.
	 */
	@Test
	void testMinPlus() {
		Graph graph = GraphGenerator.bipartite(2, 2, 0.1);
		assertEquals(graph.V(), 4);
	}
	
	/**
	 * <{5, 5, 0.5}, {Graph}>.
	 */
	@Test
	void testNominal() {
		Graph graph = GraphGenerator.bipartite(5, 5, 0.5);
		assertEquals(graph.V(), 10);
	}
	
	/**
	 * <{Max - 1, Max - 1, 0.99}, {Graph}>. This throws an error so we wrap it inside the try catch block to prevent a crash.
	 */
	@Test
	void testMaxMinus() {
		try {
			GraphGenerator.bipartite((Integer.MAX_VALUE / 2) - 1, (Integer.MAX_VALUE / 2) - 1, 0.99);
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	/**
	 * <{Max, Max, 1.0}, {Graph}>. This throws an error so we wrap it inside the try catch block to prevent a crash.
	 */
	@Test
	void testMax() {
		try {
			GraphGenerator.bipartite((Integer.MAX_VALUE / 2), (Integer.MAX_VALUE / 2), 1.0);
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	/**
	 * <{Max, Max, 1.1}, {Graph}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testMaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite((Integer.MAX_VALUE / 2), (Integer.MAX_VALUE / 2), 1.1);});
	}
}
