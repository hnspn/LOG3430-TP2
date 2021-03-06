package TP2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;


class ACTestSimpleInt {

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
	void testMinMinusWithMinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(-1,  -1);});
	}
	
	@Test
	void testMinMinusWithMin() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(-1,  0);});
	}
	
	@Test
	void testMinMinusWithNominal() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(-1,  7);});
	}
	
	@Test
	void testMinMinusWithMax() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(-1,  Integer.MAX_VALUE);});
	}
	
	@Test
	void testMinWithMinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(0,  -1);});
	}
	
	@Test
	void testMinWithMin() {
		Graph g = GraphGenerator.simple(0,  0);
		assertEquals(0, g.E());
		assertEquals(0, g.V());
	}
	
	@Test
	void testMinWithNominal() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(0, 7);});
	}
	
	@Test
	void testMinWithMax() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(0,  Integer.MAX_VALUE);});
	}
	
	@Test
	void testNominalWithMinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(7,  -1);});
	}
	
	@Test
	void testNominalWithMin() {
		Graph g = GraphGenerator.simple(7,  0);
		assertEquals(0, g.E());
		assertEquals(7, g.V());
	}
	
	@Test
	void testNominalWithNominal() {
		Graph g = GraphGenerator.simple(7, 7);
		assertEquals(7, g.E());
		assertEquals(7, g.V());
	}
	
	@Test
	void testNominalWithMax() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(7,  Integer.MAX_VALUE);});
	}
	
	@Test
	void testMaxWithMinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(Integer.MAX_VALUE,  -1);});
	}
	
	@Test
	void testMaxWithMin() {
		try {
			Graph g = GraphGenerator.simple(Integer.MAX_VALUE,  0);
			assertEquals(0, g.E());
			assertEquals(Integer.MAX_VALUE, g.V());
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	@Test
	void testMaxWithNominal() {
		try {
			Graph g = GraphGenerator.simple(Integer.MAX_VALUE, 7);
			assertEquals(7, g.E());
			assertEquals(Integer.MAX_VALUE, g.V());
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	@Test
	void testMaxWithMax() {
		try {
			Graph g = GraphGenerator.simple(Integer.MAX_VALUE,  Integer.MAX_VALUE);
			assertEquals(Integer.MAX_VALUE, g.E());
			assertEquals(Integer.MAX_VALUE, g.V());
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
}
