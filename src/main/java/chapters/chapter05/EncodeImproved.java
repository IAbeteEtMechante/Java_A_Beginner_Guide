package chapters.chapter05;

// Use XOR to encode and decode a message.
class EncodeImproved {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgh";

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        int idxKey = 0;
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(idxKey % 8));
            idxKey++;
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the message
        idxKey = 0;
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(idxKey % 8));
            idxKey++;
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
