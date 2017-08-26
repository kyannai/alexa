package com.kyan.chatbot.lexmodel.response;

import lombok.Data;

/**
 * Created by kyan on 8/26/17.
 */
@Data
public class DialogAction {
    public static final String TYPE_ELICIT_SLOT = "ElicitSlot";
    public static final String TYPE_ELICIT_INTENT = "ElicitIntent";
    public static final String TYPE_CONFIRM_INTENT = "ConfirmIntent";
    public static final String TYPE_CLOSE = "Close";
    public static final String TYPE_DELEGATE = "Delegate";

    public static final String FULFILLMENT_FULFILLED = "Fulfilled";
    public static final String FULFILLMENT_FAILED = "Failed";

    String type;
    String fulfillmentState;
    Message message;

    public DialogAction() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFulfillmentState() {
        return fulfillmentState;
    }

    public void setFulfillmentState(String fulfillmentState) {
        this.fulfillmentState = fulfillmentState;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
