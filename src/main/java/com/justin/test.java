package com.justin;

import java.io.File;

import org.springframework.util.StringUtils;

public class test {

	public static void main(String[] args) {
		String a = "123";
		System.out.println(StringUtils.isEmpty(a));
		System.out.println(StringUtils.hasText(a));
		System.out.println(StringUtils.hasLength(a));
		File file= new File("C:\\uploadTest\\123"+File.separator+"987");
		System.out.println("C:\\uploadTest\\123"+File.separator+"987");

	}
}
