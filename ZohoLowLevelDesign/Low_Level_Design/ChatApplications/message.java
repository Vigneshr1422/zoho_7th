package ZohoLowLevelDesign.Low_Level_Design.ChatApplications;

import java.util.Date;

public class message {
    private String sender;
    private String receiver;
    private String context;
    private  String time;

    message(String sender,String receiver,String context, String time)
    {
        this .sender=sender;
        this.receiver=receiver;
        this.context=context;
        this.time=new Date().toString().substring(11,19);

    }

}
