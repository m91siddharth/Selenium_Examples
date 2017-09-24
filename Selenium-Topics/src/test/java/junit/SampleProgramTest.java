package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import webdriver.SampleProgram;

public class SampleProgramTest {
	SampleProgram sob = new SampleProgram();
	@Test
	public void test() {
		sob.sum();
	}

}
