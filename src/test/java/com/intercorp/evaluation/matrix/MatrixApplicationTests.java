package com.intercorp.evaluation.matrix;

import com.intercorp.evaluation.matrix.controller.MatrixController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MatrixApplicationTests {
	@Autowired
	private MatrixController controller;

	@Test
	void rotate90AntiCW() {
		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] expected = {{3,6,9},{2,5,8},{1,4,7}};
		controller.rotate90AntiClockWise(input);
		Assert.assertTrue(Arrays.deepEquals(input,expected));
	}

}
