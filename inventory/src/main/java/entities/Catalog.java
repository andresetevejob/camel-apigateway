package entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class Catalog {
    private Map<String,Item> items;
}
