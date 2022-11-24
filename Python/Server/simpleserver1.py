import socket
s = socket.socket()
host = socket.gethostname()
port = 12345
s.bind((host,port))
s.listen(6)
while(True):
    c,addr = s.accept()
    print("Got acceptance from ",addr," successfully")
    c.send("Message received thanks for connecting")
    c.close()
    #uff
    
