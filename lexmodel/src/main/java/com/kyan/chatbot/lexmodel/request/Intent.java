package com.kyan.chatbot.lexmodel.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kyan on 8/26/17.
 */
@Data
@Wither
@AllArgsConstructor
@NoArgsConstructor
public class Intent {
    String name;
    Map<String, String> slots = new HashMap<>();
    String confirmationStatus;
}
