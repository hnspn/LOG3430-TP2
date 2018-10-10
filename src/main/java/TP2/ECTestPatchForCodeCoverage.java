package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class ECTestPatchForCodeCoverage {

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
	 * <{3, 3, 10}, {Graph}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testBipartiteTooManyEdgesException() {
		assertThrows(Exception.class, () -> {GraphGenerator.bipartite(3, 3, 10);});
	}
	
	/**
	 * <{3, 3, 10}, {Graph}>. This throws an exception so we wrap it inside the assertThrows to prevent a crash.
	 */
	@Test
	void testSimpleTooManyEdgesException() {
		assertThrows(Exception.class, () -> {GraphGenerator.simple(2, 2);});
	}

}
