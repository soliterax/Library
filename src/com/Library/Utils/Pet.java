package com.Library.Utils;

import java.io.Serializable;

public abstract class Pet extends Entity implements Serializable {
    private static final long serialVersionUID = 1000;

    public Pet(String name) {
        super.setName(name);
    }

    public void Chatch(Entity[] entity) {

    }

    public void Chatch(Entity entity) {



    }

}
