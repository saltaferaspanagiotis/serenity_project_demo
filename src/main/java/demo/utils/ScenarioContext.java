package demo.utils;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ScenarioContext {
    private Map<String, Object> scenarioData;

    public ScenarioContext() {
        scenarioData = new HashMap<>();
    }

    public void set(String key, Object value) {
        scenarioData.put(key, value);
    }

    public Object get(String key) {
        return scenarioData.get(key);
    }

    public <T> T get(String key, Class<T> type) {
        return type.cast(scenarioData.get(key));
    }

    public boolean containsKey(String key) {
        return scenarioData.containsKey(key);
    }
}
