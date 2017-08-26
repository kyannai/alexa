package com.kyan.chatbot.lexmodel;

import com.kyan.chatbot.lexmodel.response.DialogAction;
import com.kyan.chatbot.lexmodel.response.LexResponse;
import com.kyan.chatbot.lexmodel.response.Message;

import java.util.Map;

/**
 * Created by kyan on 8/26/17.
 */
public class UtilLex {

    public static LexResponse elicitSlot(String message, Map<String, Object> sessionAttributes) {
        LexResponse response = new LexResponse();
        DialogAction dialogAction = new DialogAction();
        dialogAction.setType(DialogAction.TYPE_ELICIT_INTENT);
        dialogAction.setMessage(new Message(message, Message.TYPE_PLAIN_TEXT));
        dialogAction.setFulfillmentState(DialogAction.FULFILLMENT_FULFILLED);
        response.setSessionAttributes(sessionAttributes);
        response.setDialogAction(dialogAction);
        return response;
    }

    public static LexResponse close(String message, Map<String, Object> sessionAttributes) {
        LexResponse response = new LexResponse();
        DialogAction dialogAction = new DialogAction();
        dialogAction.setType(DialogAction.TYPE_CLOSE);
        dialogAction.setMessage(new Message(message, Message.TYPE_PLAIN_TEXT));
        dialogAction.setFulfillmentState(DialogAction.FULFILLMENT_FULFILLED);
        response.setSessionAttributes(sessionAttributes);
        response.setDialogAction(dialogAction);
        return response;
    }

    public static LexResponse failed(String message, Map<String, Object> sessionAttributes) {
        LexResponse response = new LexResponse();
        DialogAction dialogAction = new DialogAction();
        dialogAction.setType(DialogAction.TYPE_CLOSE);
        dialogAction.setMessage(new Message(message, Message.TYPE_PLAIN_TEXT));
        dialogAction.setFulfillmentState(DialogAction.FULFILLMENT_FAILED);
        response.setSessionAttributes(sessionAttributes);
        response.setDialogAction(dialogAction);
        return response;
    }


}
