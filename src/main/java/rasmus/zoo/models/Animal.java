package rasmus.zoo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Animal {
    private Integer id;
    private String name;
    private String type;

    public Animal(@JsonProperty("id") Integer id,
                    @JsonProperty("name") String name,
                    @JsonProperty("type") String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
