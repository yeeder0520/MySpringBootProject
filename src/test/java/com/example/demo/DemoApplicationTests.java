package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

//@ExtendWith(MockitoExtension.class)
//@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplicationTests.class)
class DemoApplicationTests {


	@Mock
	private List mockList;

	@Spy
	private List spyList = new ArrayList();

	@Test
	public void testMockList() {
		// mock物件是假的, 所以呼叫方法時其實並不會做任何事
		mockList.add("test"); // 並沒有真的把"test"字串加入mockList,
		Assert.assertNull(mockList.get(0));// 如果原方法有返回值, 則mock物件的方法僅返回null
	}

	@Test
	public void testSpyList() {
		// spy物件會呼叫真正的原方法
		spyList.add("test"); // 真的把"test"加入spyList
		Assert.assertEquals("test", spyList.get(0)); // spy物件的方法會返回值
	}

	@Test
	public void testMockWithStub() {
		String expected = "Mock 100";
		// stub mock物件的get(100)方法
		Mockito.when(mockList.get(100)).thenReturn(expected);
		Assert.assertEquals("Mock 100", mockList.get(100));
	}

	@Test
	public void testSpyWithStub() {
		String expected = "Spy 100";
		// stub spy物件的get(100)方法
		// spy物件使用doReturn()來stub方法的返回值
		Mockito.doReturn(expected).when(spyList).get(100);
		Assert.assertEquals("Spy 100", spyList.get(100));
	}


}
