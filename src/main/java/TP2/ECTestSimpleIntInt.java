package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class ECTestSimpleIntInt {

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
	 * <{0, -1}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testMinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(0, -1);});
	}
	
	/**
	 * <{1, 0}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testMin() {
		Graph graph = GraphGenerator.simple(1, 0);
		assertEquals(1, graph.V());
		assertEquals(0, graph.E());
	}
	
	/**
	 * <{2, 1}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testMinPlus() {
		Graph graph = GraphGenerator.simple(2, 1);
		assertEquals(2, graph.V());
		assertEquals(1, graph.E());
	}
	
	/**
	 * <{5, 6}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testNominal() {
		Graph graph = GraphGenerator.simple(5, 6);
		assertEquals(5, graph.V());
		assertEquals(6, graph.E());
	}
	
	/**
	 * <{Max - 1,  Max - 1}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testMaxMinus() {
		try {
			GraphGenerator.simple(Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1);
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	/**
	 * <{Max,  Max}, {Graph}>. On s'attend a recevoir un graphe avec le bon nombre de vertices et edges.
	 */
	@Test
	void testMax() {
		try {
			GraphGenerator.simple(Integer.MAX_VALUE, Integer.MAX_VALUE);
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}

}
