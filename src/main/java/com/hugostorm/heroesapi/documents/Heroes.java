package com.hugostorm.heroesapi.documents;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Heroes_Table")
public class Heroes implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@DynamoDBHashKey(attributeName = "id")
	private String id;

	@DynamoDBAttribute(attributeName = "name")
	private String name;

	@DynamoDBAttribute(attributeName = "universe")
	private String universe;

	@DynamoDBAttribute(attributeName = "movies")
	private int movies;

	public Heroes() {
	}

	public Heroes(String id, String name, String universe, int movies) {
		this.id = id;
		this.name = name;
		this.universe = universe;
		this.movies = movies;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniverse() {
		return universe;
	}

	public void setUniverse(String universe) {
		this.universe = universe;
	}

	public int getMovies() {
		return movies;
	}

	public void setMovies(int movies) {
		this.movies = movies;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, movies, name, universe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Heroes other = (Heroes) obj;
		return Objects.equals(id, other.id) && movies == other.movies && Objects.equals(name, other.name)
				&& Objects.equals(universe, other.universe);
	}

}
