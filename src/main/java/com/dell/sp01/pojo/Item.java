package com.dell.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private Integer id;
	private String name;
	private Integer number;
//	public Item(Integer id, String name, Integer number) {
//		this.id=id;
//		this.name=name;
//		this.number=number;
//	}
}
