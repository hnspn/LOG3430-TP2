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
	private static HashMap<Integer, ArrayList<Integer>> map;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		map = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(-1);
		temp.add(0);
		temp.add(1);
		temp.add(6);
		temp.add(Integer.MAX_VALUE - 1);
		temp.add(Integer.MAX_VALUE);
		
		for (int i = 0; i < temp.size(); i++) {
			map.put(temp.get(i), temp);
		}
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
	void testAllCasesOfSimpleWithTwoIntegers() {
		boolean isFalse = false;
		
		for (Integer key : map.keySet()) {
			for(int i = 0; i < map.get(key).size(); i++ ) {
				try{
					GraphGenerator.simple(key, map.get(key).get(i) );
					// validate graph(key, )
				} catch(IllegalArgumentException e) {				
					if (e.getMessage().equals("Too few edges")) {
						if (key < 0) {
							assertTrue(true, "Edges: " + key + "  Vertices: " + map.get(key).get(i));
						} else {
							assertTrue(false, "Edges: " + key + "  Vertices: " + map.get(key).get(i));
						}
					}
					
					if (e.getMessage().equals("Too many edges")) {
						if (key > (long) map.get(key).get(i)/2) {
							assertTrue(true, "Edges: " + key + "  Vertices: " + map.get(key).get(i));
						} else {
							assertTrue(false, "Edges: " + key + "  Vertices: " + map.get(key).get(i));
						}
					}
				} catch (OutOfMemoryError e) {
					
				}
			}
		}
	}

}
