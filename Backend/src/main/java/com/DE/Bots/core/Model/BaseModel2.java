package com.DE.Bots.core.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class BaseModel2 {
	@Id
    private ObjectId id;

private int cc;
private int cCD;
private int abcde;
private int abcssde;

	private int ggggggggggggg;
	private int xyz;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
