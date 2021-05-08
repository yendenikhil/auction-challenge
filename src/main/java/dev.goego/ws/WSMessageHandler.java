package dev.goego.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WSMessageHandler extends TextWebSocketHandler {
    private static final Logger log = LoggerFactory.getLogger(WSMessageHandler.class);
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        log.info("Incoming: {}", message.getPayload());
        super.handleTextMessage(session, message);
    }
}
