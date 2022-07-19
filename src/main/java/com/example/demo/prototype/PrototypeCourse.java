package com.example.demo.prototype;

import java.util.List;

//3.1 Prototype - Shallow Clone
//Cria objetos com muitos parâmetros, quase sempre precisa da interface Cloneable ou Clone
//Shallow Copy - Copia a referência
public class PrototypeCourse implements Cloneable{
	
	private String sql;
	private List<String> parameters;
	private Record record;
	
	public PrototypeCourse(String sql, List<String> parameters,Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	public PrototypeCourse clone() {
		try {
			return (PrototypeCourse) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getSql() {
		return sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public Record getRecord() {
		return record;
	}
}
