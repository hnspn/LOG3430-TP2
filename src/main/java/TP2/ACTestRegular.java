package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class ACTestRegular {

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
	void test_MinMinus_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(-1, -1);});
	}
	
	/**
	 * <{-1, 0}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void test_MinMinus_Min() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(-1, 0);});
	}
	
	/**
	 * <{-1, 2}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void test_MinMinus_Nominal() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(-1, 2);});
	}
	
	/**
	 * <{-1, Max}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void test_MinMinus_Max() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(-1, Integer.MAX_VALUE);});
	}
	
	/**
	 * <{0, -1}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void test_Min_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(0, -1);});
	}
	
	/**
	 * <{0, 0}, {Graph}>.
	 */
	@Test
	void test_Min_Min() {
		Graph g = GraphGenerator.regular(0, 0);
		assertEquals(0, g.V());
	}
	
	/**
	 * <{0, 2}, {Graph}>.
	 */
	@Test
	void test_Min_Nominal() {
		Graph g = GraphGenerator.regular(0, 2);
		assertEquals(0, g.V());
	}
	
	/**
	 * <{0, Max}, {Graph}>.
	 */
	@Test
	void test_Min_Max() {
		Graph g = GraphGenerator.regular(0, Integer.MAX_VALUE);
		assertEquals(0, g.V());
	}	
	
	/**
	 * <{3, -1}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void test_Nominal_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(3, -1);});
	}
	
	/**
	 * <{3, 0}, {Graph}>.
	 */
	@Test
	void test_Nominal_Min() {
		Graph g = GraphGenerator.regular(3, 0);
		assertEquals(3, g.V());
		assertEquals(0, g.E());
	}
	
	/**
	 * <{3, 2}, {Graph}>.
	 */
	@Test
	void test_Nominal_Nominal() {
		Graph g = GraphGenerator.regular(3, 2);
		assertEquals(3, g.V());
		assertEquals(3, g.E());
	}
	
	/**
	 * <{3, Max}, {Graph}>.
	 */
	@Test
	void test_Nominal_Max() {
		assertThrows(Exception.class, () -> {Graph g = GraphGenerator.regular(3, Integer.MAX_VALUE);});
	}
	
	/**
	 * <{Max, -1}, {Exception}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void test_Max_MinMinus() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(Integer.MAX_VALUE, -1);});
	}
	
	/**
	 * <{Max, 0}, {Graph}>.
	 */
	@Test
	void test_Max_Min() {
		try {
			Graph g = GraphGenerator.regular(Integer.MAX_VALUE, 0);
			assertEquals(Integer.MAX_VALUE, g.V());
			assertEquals(0, g.E());
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	/**
	 * <{Max, 2}, {Graph}>.
	 */
	@Test
	void test_Max_Nominal() {
		try {
			Graph g = GraphGenerator.regular(Integer.MAX_VALUE, 2);
			assertEquals(Integer.MAX_VALUE, g.V());
		} catch (Error e) {
			fail("This method should not throw an error.");
		}
	}
	
	/**
	 * <{Max, Max}, {Graph}>.
	 */
	@Test
	void test_Max_Max() {
		assertThrows(Exception.class, () -> {GraphGenerator.regular(Integer.MAX_VALUE, Integer.MAX_VALUE);});
	}
}
