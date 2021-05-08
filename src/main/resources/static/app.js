const ws = new WebSocket('ws://localhost:8080/ws')
ws.onopen = function() {
    ws.send("Hello from client");
}