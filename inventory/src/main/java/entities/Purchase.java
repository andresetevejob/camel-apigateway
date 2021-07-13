package entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
@RequiredArgsConstructor
@Getter
@Setter
public class Purchase {
    private String id;
    private boolean active = true;
    private Map<String,Integer> items = new ConcurrentHashMap<String, Integer>();
}
