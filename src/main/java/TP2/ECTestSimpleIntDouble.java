package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class ECTestSimpleIntDouble {

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
	 * <{0, -0.1}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testMinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(0, -0.1);});
	}
	
	/**
	 * <{1, 0.0}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testMin() {
		Graph graph = GraphGenerator.simple(1, 0.0);
		assertEquals(1, graph.V());
	}
	
	/**
	 * <{2, 0.1}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testMinPlus() {
		Graph graph = GraphGenerator.simple(2, 0.1);
		assertEquals(2, graph.V());
	}
	
	/**
	 * <{5, 0.5}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testNominal() {
		Graph graph = GraphGenerator.simple(5, 0.5);
		assertEquals(5, graph.V());
	}
	
	/**
	 * <{Max - 1,  0.99}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testMaxMinus() {
		try {
			GraphGenerator.simple(Integer.MAX_VALUE - 1, 0.99);
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	/**
	 * <{Max,  1.0}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testMax() {
		try {
			GraphGenerator.simple(Integer.MAX_VALUE, 1.0);
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	/**
	 * <{Max,  1.1}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testMaxPlus() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(Integer.MAX_VALUE, 1.1);});
	}

}
