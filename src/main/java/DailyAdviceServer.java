import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }


    String[] adiceList = {"take smaller bites", "go for the tight jeans", "just do it"};



    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {
                Socket socket = serverSocket.accept();

                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        }
        catch(Exception e){

        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adiceList.length);
        return adiceList[random];
    }
}
