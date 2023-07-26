package twootr.examples;

import twootr.ReceiverEndPoint;
import twootr.Twoot;

// tag::PrintingEndPoint[]
public class PrintingEndPoint implements ReceiverEndPoint {
    @Override
    public void onTwoot(final Twoot twoot) {
        System.out.println(twoot.getSenderId() + ": " + twoot.getContent());
    }
}
// end::PrintingEndPoint[]
