package com.javashitang.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author lilimin
 * @since 2021-03-10
 */
@Data
@ToString
public class User {

	private Long id;
	private String name;

	public static User createUser() {
		User user = new User();
		user.setId(1L);
		user.setName("li");
		return user;
	}
}
