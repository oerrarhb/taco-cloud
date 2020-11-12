package com.othmane.oertacocloud.data;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tacos")
@Data
@RequiredArgsConstructor
public class Taco {

    @Id
    private String Id;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "You must choose at least one ingredient")
    private List<Ingredient> ingredients;
}
