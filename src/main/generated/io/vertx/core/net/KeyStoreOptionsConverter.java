package io.vertx.core.net;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.core.net.KeyStoreOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.KeyStoreOptions} original class using Vert.x codegen.
 */
public class KeyStoreOptionsConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, KeyStoreOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "password":
          if (member.getValue() instanceof String) {
            obj.setPassword((String)member.getValue());
          }
          break;
        case "path":
          if (member.getValue() instanceof String) {
            obj.setPath((String)member.getValue());
          }
          break;
        case "provider":
          if (member.getValue() instanceof String) {
            obj.setProvider((String)member.getValue());
          }
          break;
        case "type":
          if (member.getValue() instanceof String) {
            obj.setType((String)member.getValue());
          }
          break;
        case "value":
          if (member.getValue() instanceof String) {
            obj.setValue(io.vertx.core.buffer.Buffer.buffer(java.util.Base64.getDecoder().decode((String)member.getValue())));
          }
          break;
      }
    }
  }

  public static void toJson(KeyStoreOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(KeyStoreOptions obj, java.util.Map<String, Object> json) {
    if (obj.getPassword() != null) {
      json.put("password", obj.getPassword());
    }
    if (obj.getPath() != null) {
      json.put("path", obj.getPath());
    }
    if (obj.getProvider() != null) {
      json.put("provider", obj.getProvider());
    }
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
    if (obj.getValue() != null) {
      json.put("value", java.util.Base64.getEncoder().encodeToString(obj.getValue().getBytes()));
    }
  }
}
